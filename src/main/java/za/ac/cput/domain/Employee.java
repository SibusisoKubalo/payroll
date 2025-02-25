package za.ac.cput.domain;

import java.util.List;

public class Employee {
    private String employeeNumber;
    private String name;
    private za.ac.cput.domain.EmploymentType employmentType;
    private String nationality;
    private String contactDetails;
    private String address;
    private List<Identity> identityDocuments;
    private Position position;

    // Constructor, Getters & Setters
    public Employee(String employeeNumber, String name, EmploymentType employmentType, String nationality, ContactDetails contactDetails, String address, List Identity) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.employmentType = employmentType;
        this.nationality = nationality;
        this.contactDetails = contactDetails.toString();
        this.address = address;
        this.identityDocuments = Identity;

    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public za.ac.cput.domain.EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(za.ac.cput.domain.EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Identity> getIdentityDocuments() {
        return identityDocuments;
    }

    public void setIdentityDocuments(List<Identity> identityDocuments) {
        this.identityDocuments = identityDocuments;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", employmentType=" + employmentType +
                ", nationality='" + nationality + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", address='" + address + '\'' +
                ", identityDocuments=" + identityDocuments +
                ", position=" + position +
                '}';
    }


}
