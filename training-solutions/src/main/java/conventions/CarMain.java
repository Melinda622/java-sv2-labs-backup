package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Volvo", "v30", 4, 5);
        System.out.println(car.getPersons());

        car.addModelName("sedan");
        System.out.println(car.getCarType());

        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());

        car.setCarType("BMW");
        System.out.println(car.getCarType());
    }
}
