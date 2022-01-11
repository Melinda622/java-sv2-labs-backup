package stringconcat.employee;

import stringconcat.employee.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "IT manager", 700_000);

        System.out.println(employee.getName());
        System.out.println(employee.getOccupation());
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
