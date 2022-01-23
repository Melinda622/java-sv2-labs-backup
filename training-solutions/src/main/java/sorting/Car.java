package sorting;

public class Car {

    private String brand;
    private int yearOfConstruction;
    private int price;

    public Car(String brand, int yearOfManufacture, int price) {
        this.brand = brand;
        this.yearOfConstruction = yearOfManufacture;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public int getPrice() {
        return price;
    }
}
