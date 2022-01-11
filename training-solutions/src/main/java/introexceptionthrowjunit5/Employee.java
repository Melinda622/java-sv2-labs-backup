package introexceptionthrowjunit5;

public class Employee {
    private String name;

    public Employee(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name can not be empty!");
        }
        this.name = name;
    }

    public static void main(String[] args) {
        int x=2;
        if(x>1&&x<5){
            System.out.println("ok");
        }
    }
}

