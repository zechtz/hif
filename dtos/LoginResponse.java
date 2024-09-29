package tz.go.mohz.hfr.nhif.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO for the response received from the NHIF login API.
 */
public class LoginResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("expires_in")
    private int expiresIn;

    @JsonProperty("scope")
    private String scope;

    @JsonProperty("token_type")
    private String tokenType;

    /**
     * Default constructor for Jackson deserialization.
     */
    public LoginResponse() {
    }

    /**
     * Parameterized constructor.
     *
     * @param accessToken the OAuth access token
     * @param expiresIn   the expiry time in seconds
     * @param scope       the OAuth scope
     * @param tokenType   the type of token (e.g., Bearer)
     */
    public LoginResponse(String accessToken, int expiresIn, String scope, String tokenType) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.scope = scope;
        this.tokenType = tokenType;
    }

    // Getters and Setters

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
