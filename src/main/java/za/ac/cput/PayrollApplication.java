/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput;

import za.ac.cput.domain.Employee;
import za.ac.cput.service.PayrollService;

import java.util.ArrayList;
import java.util.List;

public class PayrollApplication {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        String[] names = {
                "Sibusiso Kubalo", "Sibaphiwe Yimpi", "Ncebakazi JoJa",
                "John Smith", "Amahle Kubalo", "Bulungisa Mgweba",
                "Sonwabiso Moni", "Chad Adams", "Janco Kreil", "Mathew Hobbs"
        };

        for (int i = 0; i < names.length; i++) {
            Employee employee = new Employee();
            employee.setEmployeeNumber("E00" + (i + 1));
            employee.setName(names[i]);
            employee.setEmploymentType(i % 2 == 0 ? "permanent" : "contract");
            employee.setHoursWorked(160 + i * 2);
            employee.setPayRate(50 + i * 5);
            employees.add(employee);
        }

        PayrollService payrollService = new PayrollService();

        for (Employee employee : employees) {
            double salary = payrollService.calculateSalary(employee);
            System.out.println("Salary for " + employee.getName() + ": " + salary);
        }
    }
}
