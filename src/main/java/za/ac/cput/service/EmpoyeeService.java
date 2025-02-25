package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;
import java.util.List;

class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void registerEmployee(Employee employee) {
        Employee Employee = null;
        repository.save(Employee);
    }

    public Employee findEmployee(String employeeNumber) {
        return repository.findByEmployeeNumber(employeeNumber);
    }

    public List<Employee> listAllEmployees() {
        return repository.findAll();
    }
}
