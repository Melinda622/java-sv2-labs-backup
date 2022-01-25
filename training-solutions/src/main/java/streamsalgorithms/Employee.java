package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1980));
        employees.add(new Employee("Jane Doe", 1990));
        employees.add(new Employee("Jill Doe", 1970));

        int sumOfYearOfBirths = employees.stream().mapToInt(employee -> employee.getYearOfBirth()).sum();
        System.out.println(sumOfYearOfBirths);

        int sumOfAges = employees.stream().mapToInt(employee -> (LocalDate.now().getYear() - employee.getYearOfBirth())).sum();
        System.out.println(sumOfAges);

        long numberOfEmployees = employees.stream().count();
        System.out.println(numberOfEmployees);

        long numberOfEmployeesBornBefore = employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).count();
        System.out.println(numberOfEmployeesBornBefore);

        OptionalInt earliestYearOfBirth = employees.stream().mapToInt(employee -> employee.getYearOfBirth()).min();
        System.out.println(earliestYearOfBirth);

        String name = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getYearOfBirth() - o2.getYearOfBirth();
            }
        }).findFirst().get().name;
        System.out.println(name);

        boolean born = employees.stream().filter(employee -> employee.getYearOfBirth() < 1980).collect(Collectors.toList()).size() == employees.size();
        System.out.println(born);

        List<Employee> employeesBornBefore =
                employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).collect(Collectors.toList());
        System.out.println(employeesBornBefore);

        List<String> employeeNames =
                employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());
        System.out.println(employeeNames);

        List<String> employeeNamesBornBefore =
                employees.stream().filter(employee -> employee.getYearOfBirth() < 1990).map(employee -> employee.getName()).collect(Collectors.toList());
        System.out.println(employeeNamesBornBefore);
    }
}
