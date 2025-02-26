/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.repository;
import za.ac.cput.config.DatabaseConfig;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public void save(Employee employee) {
        String sql = "INSERT INTO Employee (employeeNumber, name, employmentType, nationality, cellPhoneNumber, email, homeNumber, streetAddress, postalAddress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, employee.getEmployeeNumber());
            pstmt.setString(2, employee.getName());
            pstmt.setString(3, employee.getEmploymentType());
            pstmt.setString(4, employee.getNationality());
            pstmt.setString(5, employee.getContactDetails().getCellPhoneNumber());
            pstmt.setString(6, employee.getContactDetails().getEmail());
            pstmt.setString(7, employee.getContactDetails().getHomeNumber());
            pstmt.setString(8, employee.getAddress().getStreetAddress());
            pstmt.setString(9, employee.getAddress().getPostalAddress());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee findByEmployeeNumber(String employeeNumber) {
        String sql = "SELECT * FROM Employee WHERE employeeNumber = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, employeeNumber);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeNumber(rs.getString("employeeNumber"));
                employee.setName(rs.getString("name"));
                employee.setEmploymentType(rs.getString("employmentType"));
                employee.setNationality(rs.getString("nationality"));
                ContactDetails contactDetails = new ContactDetails();
                employee.getContactDetails().setCellPhoneNumber(rs.getString("cellPhoneNumber"));
                employee.getContactDetails().setEmail(rs.getString("email"));
                employee.getContactDetails().setHomeNumber(rs.getString("homeNumber"));
                employee.getAddress().setStreetAddress(rs.getString("streetAddress"));
                employee.getAddress().setPostalAddress(rs.getString("postalAddress"));

                return employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM Employee";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeNumber(rs.getString("employeeNumber"));
                employee.setName(rs.getString("name"));
                employee.setEmploymentType(rs.getString("employmentType"));
                employee.setNationality(rs.getString("nationality"));
                employee.getContactDetails().setCellPhoneNumber(rs.getString("cellPhoneNumber"));
                employee.getContactDetails().setEmail(rs.getString("email"));
                employee.getContactDetails().setHomeNumber(rs.getString("homeNumber"));
                employee.getAddress().setStreetAddress(rs.getString("streetAddress"));
                employee.getAddress().setPostalAddress(rs.getString("postalAddress"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
