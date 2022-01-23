package sorting;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private List<Car> carsToSell = new ArrayList<>();

    public List<Car> getCarsToSell() {
        return carsToSell;
    }

    public void addCar(Car car) {
        carsToSell.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> carsToSellOrdered = new ArrayList<>(carsToSell);

        carsToSellOrdered.sort(new CarConstructionComparator());

        return carsToSellOrdered;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> carsToSellOrdered = new ArrayList<>(carsToSell);

        carsToSellOrdered.sort(new CarPriceComparator());

        return carsToSellOrdered;
    }
}
