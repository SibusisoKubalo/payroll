package za.ac.cput.model;

import java.util.List;

public class Employee {
    private String employeeNumber;
    private String name;
    private EmploymentType employmentType;
    private String nationality;
    private ContactDetails contactDetails;
    private Address address;
    private List<Identity> identities;

    public Employee(String employeeNumber, String name, EmploymentType employmentType, String nationality,
                    ContactDetails contactDetails, Address address, List<Identity> identities) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.employmentType = employmentType;
        this.nationality = nationality;
        this.contactDetails = contactDetails;
        this.address = address;
        this.identities = identities;
    }

    // Getters and Setters

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

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Identity> getIdentities() {
        return identities;
    }

    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", employmentType=" + employmentType +
                ", nationality='" + nationality + '\'' +
                ", contactDetails=" + contactDetails +
                ", address=" + address +
                ", identities=" + identities +
                '}';
    }
}
