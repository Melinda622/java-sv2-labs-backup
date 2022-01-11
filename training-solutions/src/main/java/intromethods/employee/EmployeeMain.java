package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 2021, 500000);
        System.out.println(employee);

        employee.raiseSalary(200000);
        System.out.println("Employee's new salary:");
        System.out.println(employee.getSalary() + " Ft");
    }
}
