package za.ac.cput.domain;

public class Address {
    private String streetAddress;
    private String postalAddress;

    // Constructor, Getters & Setters
    public Address(String streetAddress, String postalAddress) {
        this.streetAddress = streetAddress;
        this.postalAddress = postalAddress;
    }

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
