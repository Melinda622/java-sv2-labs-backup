package inheritancemethods.car;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        double consumption = getFuelRate()/100.0 * km;
        double remainingConsumption=consumption-extraFuel;
        if (consumption <= extraFuel) {
            extraFuel = -consumption;
        } else {
            this.extraFuel = 0;
            modifyFuelAmount(-remainingConsumption);
        }
        if (isValid()) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
    }

    private boolean isValid() {
        return this.getFuel() <= 0;
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + extraCapacity - extraFuel;

    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
