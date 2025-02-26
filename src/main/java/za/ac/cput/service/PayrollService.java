/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.service;

import za.ac.cput.domain.Employee;

public class PayrollService {

    public double calculateSalary(Employee employee) {
        double salary = 0.0;
        if ("permanent".equalsIgnoreCase(employee.getEmploymentType())) {
            salary = employee.getHoursWorked() * employee.getPayRate();
        } else if ("contract".equalsIgnoreCase(employee.getEmploymentType())) {
            salary = employee.getHoursWorked() * employee.getPayRate();
        }
        return salary;
    }
}

