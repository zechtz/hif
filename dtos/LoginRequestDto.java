package tz.go.mohz.hfr.nhif.dtos;

/**
 * DTO for the login request payload.
 */
public class LoginRequestDto {

    private String grant_type;
    private String username;
    private String password;
    private String client_id;
    private String client_secret;
    private String scope;

    public LoginRequestDto() {
    }

    // Parameterized constructor
    public LoginRequestDto(String grant_type, String username, String password, String client_id, String client_secret,
            String scope) {
        this.grant_type = grant_type;
        this.username = username;
        this.password = password;
        this.client_id = client_id;
        this.client_secret = client_secret;
        this.scope = scope;
    }

    // Getters and setters

    public String getGrantType() {
        return grant_type;
    }

    public void setGrantType(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return client_id;
    }

    public void setClientId(String client_id) {
        this.client_id = client_id;
    }

    public String getClientSecret() {
        return client_secret;
    }

    public void setClientSecret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
