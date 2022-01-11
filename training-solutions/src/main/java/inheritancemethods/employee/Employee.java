package inheritancemethods.employee;

public class Employee extends Person {

    private double salary;

    public Employee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double raiseSalary(int percent) {
        return salary *= (100 + percent) / 100.0;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        System.out.println((100 + 10) / 100.0);
    }
}
