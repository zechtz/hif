package tz.go.mohz.hfr.nhif.dtos;

/**
 * DTO to capture the request body for card details.
 */
public class CardDetailsRequestDto {
    private String username;
    private String password;
    private String cardNo;

    public CardDetailsRequestDto() {
    }

    // Getters and setters
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
