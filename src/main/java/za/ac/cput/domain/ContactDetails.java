package za.ac.cput.domain;

public class ContactDetails {
    private String cellPhone;
    private String email;
    private String homeNumber;

    // Constructor, Getters & Setters
    public ContactDetails(String cellPhone, String email, String homeNumber) {
        this.cellPhone = cellPhone;
        this.email = email;
        this.homeNumber = homeNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }
}
