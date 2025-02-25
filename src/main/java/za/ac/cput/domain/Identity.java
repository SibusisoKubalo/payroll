package za.ac.cput.domain;

public class Identity {
    private String identityType;
    private String identityValue;

    // Constructor, Getters & Setters
    public Identity(String identityType, String identityValue) {
        this.identityType = identityType;
        this.identityValue = identityValue;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityValue() {
        return identityValue;
    }

    public void setIdentityValue(String identityValue) {
        this.identityValue = identityValue;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "identityType='" + identityType + '\'' +
                ", identityValue='" + identityValue + '\'' +
                '}';
    }

}
