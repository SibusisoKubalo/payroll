package za.ac.cput.repository;

import za.ac.cput.entity.Employee;
import java.util.List;

public interface EmployeeRepository {
    void save(Employee employee);
    Employee findByEmployeeNumber(String employeeNumber);
    List<Employee> findAll();
}
