package immutable;

import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    private final int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {
        if(isBrandValid(brand)==true){
            this.brand = brand;
        }else{
            throw new IllegalStateException("Brand cannot be empty!");
        }
        this.model = type;
        if(isYearValid(yearOfProduction)==true){
            this.yearOfProduction = yearOfProduction;
        }else{
            throw new IllegalStateException("Year has to be earlier than current year!");
        }
    }

    public boolean isYearValid(int year){
        if(year>LocalDate.now().getYear()){
            return false;
        }else{
            return true;
        }
    }

    public boolean isBrandValid(String brand){
        if(brand==""||brand==null){
            return false;
        }else{
            return true;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
