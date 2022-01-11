package inheritancemethods.employee;

public class Boss extends Employee {

    static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public double getSalary() {
        double extra = LEADERSHIP_FACTOR * numberOfEmployees;
        return super.getSalary() * extra;
    }
}
