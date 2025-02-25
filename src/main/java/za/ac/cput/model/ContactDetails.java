package za.ac.cput.model;

public class ContactDetails {
    private String cellPhoneNumber;
    private String email;
    private String homeNumber;

    public ContactDetails(String cellPhoneNumber, String email, String homeNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        this.email = email;
        this.homeNumber = homeNumber;
    }

    // Getters and Setters
    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
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
                "cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }
}
