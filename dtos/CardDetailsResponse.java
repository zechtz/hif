package tz.go.mohz.hfr.nhif.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardDetailsResponse {

    @JsonProperty("CardExistence")
    private String cardExistence;

    @JsonProperty("RequiresBiometricVerification")
    private boolean requiresBiometricVerification;

    @JsonProperty("RequiresFacialRecognition")
    private boolean requiresFacialRecognition;

    @JsonProperty("PackageID")
    private int packageId;

    @JsonProperty("CardNo")
    private String cardNo;

    @JsonProperty("MembershipNo")
    private String membershipNo;

    @JsonProperty("EmployerNo")
    private String employerNo;

    @JsonProperty("SchemeID")
    private int schemeId;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("MiddleName")
    private String middleName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("FullName")
    private String fullName;

    @JsonProperty("PFNumber")
    private String pfNumber;

    @JsonProperty("Gender")
    private String gender;

    @JsonProperty("DateOfBirth")
    private String dateOfBirth;

    @JsonProperty("Age")
    private int age;

    @JsonProperty("CHNationalID")
    private String chNationalId;

    @JsonProperty("ExpiryDate")
    private String expiryDate;

    @JsonProperty("CardStatusID")
    private int cardStatusId;

    @JsonProperty("CardStatus")
    private String cardStatus;

    @JsonProperty("StatusDescription")
    private String statusDescription;

    @JsonProperty("IsActive")
    private int isActive;

    @JsonProperty("IsValidCard")
    private int isValidCard;

    @JsonProperty("LatestContribution")
    private String latestContribution;

    @JsonProperty("AuthorizationStatus")
    private String authorizationStatus;

    @JsonProperty("AuthorizationNo")
    private String authorizationNo;

    @JsonProperty("Remarks")
    private String remarks;

    @JsonProperty("LatestAuthorization")
    private String latestAuthorization;

    @JsonProperty("ProductName")
    private String productName;

    @JsonProperty("ProductCode")
    private String productCode;

    @JsonProperty("MemberCategoryID")
    private int memberCategoryId;

    public CardDetailsResponse() {
    }

    /**
     * Parameterized constructor for all fields.
     */
    public CardDetailsResponse(String cardExistence, boolean requiresBiometricVerification,
            boolean requiresFacialRecognition,
            int packageId, String cardNo, String membershipNo, String employerNo, int schemeId,
            String firstName, String middleName, String lastName, String fullName, String pfNumber,
            String gender, String dateOfBirth, int age, String chNationalId, String expiryDate,
            int cardStatusId, String cardStatus, String statusDescription, int isActive, int isValidCard,
            String latestContribution, String authorizationStatus, String authorizationNo, String remarks,
            String latestAuthorization, String productName, String productCode, int memberCategoryId) {
        this.cardExistence = cardExistence;
        this.requiresBiometricVerification = requiresBiometricVerification;
        this.requiresFacialRecognition = requiresFacialRecognition;
        this.packageId = packageId;
        this.cardNo = cardNo;
        this.membershipNo = membershipNo;
        this.employerNo = employerNo;
        this.schemeId = schemeId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.pfNumber = pfNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.chNationalId = chNationalId;
        this.expiryDate = expiryDate;
        this.cardStatusId = cardStatusId;
        this.cardStatus = cardStatus;
        this.statusDescription = statusDescription;
        this.isActive = isActive;
        this.isValidCard = isValidCard;
        this.latestContribution = latestContribution;
        this.authorizationStatus = authorizationStatus;
        this.authorizationNo = authorizationNo;
        this.remarks = remarks;
        this.latestAuthorization = latestAuthorization;
        this.productName = productName;
        this.productCode = productCode;
        this.memberCategoryId = memberCategoryId;
    }

    // Getters and Setters for all fields

    public String getCardExistence() {
        return cardExistence;
    }

    public void setCardExistence(String cardExistence) {
        this.cardExistence = cardExistence;
    }

    public boolean isRequiresBiometricVerification() {
        return requiresBiometricVerification;
    }

    public void setRequiresBiometricVerification(boolean requiresBiometricVerification) {
        this.requiresBiometricVerification = requiresBiometricVerification;
    }

    public boolean isRequiresFacialRecognition() {
        return requiresFacialRecognition;
    }

    public void setRequiresFacialRecognition(boolean requiresFacialRecognition) {
        this.requiresFacialRecognition = requiresFacialRecognition;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMembershipNo() {
        return membershipNo;
    }

    public void setMembershipNo(String membershipNo) {
        this.membershipNo = membershipNo;
    }

    public String getEmployerNo() {
        return employerNo;
    }

    public void setEmployerNo(String employerNo) {
        this.employerNo = employerNo;
    }

    public int getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(int schemeId) {
        this.schemeId = schemeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPfNumber() {
        return pfNumber;
    }

    public void setPfNumber(String pfNumber) {
        this.pfNumber = pfNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChNationalId() {
        return chNationalId;
    }

    public void setChNationalId(String chNationalId) {
        this.chNationalId = chNationalId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCardStatusId() {
        return cardStatusId;
    }

    public void setCardStatusId(int cardStatusId) {
        this.cardStatusId = cardStatusId;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsValidCard() {
        return isValidCard;
    }

    public void setIsValidCard(int isValidCard) {
        this.isValidCard = isValidCard;
    }

    public String getLatestContribution() {
        return latestContribution;
    }

    public void setLatestContribution(String latestContribution) {
        this.latestContribution = latestContribution;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }

    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public String getAuthorizationNo() {
        return authorizationNo;
    }

    public void setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLatestAuthorization() {
        return latestAuthorization;
    }

    public void setLatestAuthorization(String latestAuthorization) {
        this.latestAuthorization = latestAuthorization;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getMemberCategoryId() {
        return memberCategoryId;
    }

    public void setMemberCategoryId(int memberCategoryId) {
        this.memberCategoryId = memberCategoryId;
    }
}
