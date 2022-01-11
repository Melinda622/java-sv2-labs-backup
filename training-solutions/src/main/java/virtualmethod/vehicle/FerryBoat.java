package virtualmethod.vehicle;

public class FerryBoat extends Vehicle{

    private Car car;

    public static final int MAX_CARRY_WEIGHT=100;

    public FerryBoat(int vehicleWeight) {
        super(vehicleWeight);
    }

    public boolean canCarry(Car car){
        if(car.getVehicleWeight()<MAX_CARRY_WEIGHT){
            return true;
        }else{
            return false;
        }
    }

    public boolean load(Car car){
        if(canCarry(car)){
            this.car=car;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad()+car.getVehicleWeight();
    }

    @Override
    public String toString() {
        if(car instanceof Van){
            return "FerryBoat{car=Van{cargoWeight=" +((Van) car).cargoWeight+", numberOfPassenger="+ ((Van) car).numberOfPassenger+", vehicleWeight=" +getVehicleWeight()+
                    '}';
        }else {
            return "FerryBoat{" +
                    "car=Car{numberOfPassenger=" + car.numberOfPassenger + ", vehicleWeight=" + getVehicleWeight() +
                    '}';

        }
    }
}
