package tz.go.mohz.hfr.nhif;

import com.fasterxml.jackson.databind.ObjectMapper;

import tz.go.mohz.hfr.nhif.dtos.CardDetailsResponse;
import tz.go.mohz.hfr.nhif.dtos.LoginResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A client to interact with NHIF API for login and card details retrieval.
 */
public class NhifClient {
    private static final Logger logger = LoggerFactory.getLogger(NhifClient.class);

    private static final String LOGIN_ENDPOINT = "/externalouth/connect/token";
    private static final String CARD_DETAILS_ENDPOINT = "/AuthorizationService/api/Verification/GetCardDetailsExt?CardNo=101803757442&CardType=CardNo";
    private static final String baseURL = "https://verification.nhif.or.tz";

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Logs in the user with the provided username and password to obtain an access
     * token.
     *
     * @param username the user's username
     * @param password the user's password
     * @return a {@link LoginResponse} containing the access token and other OAuth
     *         details
     * @throws IOException if there is an issue making the HTTP request
     */
    public LoginResponse login(String username, String password) throws IOException {

        String loginUrl = baseURL + LOGIN_ENDPOINT;

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create the login payload as key-value pairs for URL encoding
            List<BasicNameValuePair> urlParameters = new ArrayList<>();
            urlParameters.add(new BasicNameValuePair("grant_type", "password"));
            urlParameters.add(new BasicNameValuePair("username", username));
            urlParameters.add(new BasicNameValuePair("password", password));
            urlParameters.add(new BasicNameValuePair("client_id", "serviceportal"));
            urlParameters.add(new BasicNameValuePair("client_secret", "serviceportal"));
            urlParameters.add(new BasicNameValuePair("scope", "MedicalService"));

            // Create an HTTP POST request
            HttpPost postRequest = new HttpPost(loginUrl);
            postRequest.setHeader("Content-Type", "application/x-www-form-urlencoded");
            postRequest.setEntity(new UrlEncodedFormEntity(urlParameters));

            // Execute the request
            HttpResponse response = httpClient.execute(postRequest);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode != 200) {
                String errorMessage = String.format("Login failed: HTTP status code %d. Response: %s",
                        statusCode, EntityUtils.toString(response.getEntity()));
                logger.error(errorMessage);
                throw new IOException(errorMessage);
            }

            // Parse the response body to LoginResponse
            String jsonResponse = EntityUtils.toString(response.getEntity());
            return objectMapper.readValue(jsonResponse, LoginResponse.class);

        } catch (IOException e) {
            logger.error("An error occurred during the login process: {}", e.getMessage(), e);
            throw e;
        }
    }

    /**
     * Fetches the card details using the card number.
     *
     * @param username the user's username
     * @param password the user's password
     * @param cardNo   the card number to fetch details for
     * @return a {@link CardDetailsResponse} containing the card information
     * @throws IOException if there is an issue making the HTTP request
     */
    public CardDetailsResponse getCardDetails(String username, String password, String cardNo) throws IOException {
        String _cardDetailsUrl = baseURL + CARD_DETAILS_ENDPOINT;
        // Step 1: Login to get the access token

        LoginResponse loginResponse = login(username, password);
        String token = loginResponse.getAccessToken();

        // Step 2: Build the request URL with query parameters
        String cardDetailsUrl = String.format("%s?CardNo=%s&CardType=CardNo", _cardDetailsUrl, cardNo);

        // Step 3: Make a GET request to fetch card details
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet getRequest = new HttpGet(cardDetailsUrl);
            getRequest.setHeader("Authorization", "Bearer " + token);

            // Execute the request
            HttpResponse response = httpClient.execute(getRequest);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode != 200) {
                throw new IOException("Failed to get card details: HTTP status code " + statusCode);
            }

            // Parse the response body to CardDetailsResponse
            String jsonResponse = EntityUtils.toString(response.getEntity());
            return objectMapper.readValue(jsonResponse, CardDetailsResponse.class);
        }
    }
}
