package za.ac.cput.service;

import za.ac.cput.model.Employee;
import za.ac.cput.repository.EmployeeRepository;
import java.util.List;

public class EmpoyeeService {
    private EmployeeRepository repository;

    public void EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public EmpoyeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void addEmployee(Employee employee) {
        repository.save(employee);
    }

    public Employee getEmployee(String employeeNumber) {
        return repository.findByEmployeeNumber(employeeNumber);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
