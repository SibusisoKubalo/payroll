package za.ac.cput.model;

public class Address {
    private String streetAddress;
    private String postalAddress;

    public Address(String streetAddress, String postalAddress) {
        this.streetAddress = streetAddress;
        this.postalAddress = postalAddress;
    }

    // Getters and Setters
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                '}';
    }
}
