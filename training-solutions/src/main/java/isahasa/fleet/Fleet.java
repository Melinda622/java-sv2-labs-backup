package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private int waitingPeople;
    private int waitingCargo;

    private List<Ship> ships=new ArrayList<>();

    public void addShip(Ship newShip){
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight){
        for (Ship s:ships) {
            waitingPeople=0;
            waitingCargo=0;
            if(s instanceof Liner) {
               ((Liner) s).loadPassenger(passengers);
               passengers-=((Liner) s).getPassengers();
            }else if(s instanceof CargoShip){
                ((CargoShip) s).loadCargo(cargoWeight);
                cargoWeight-=((CargoShip) s).getCargoWeight();
            }else if(s instanceof FerryBoat){
                ((FerryBoat) s).loadCargo(cargoWeight);
                cargoWeight-=((FerryBoat) s).getCargoWeight();
                ((FerryBoat) s).loadPassenger(passengers);
                passengers-=((FerryBoat) s).getPassengers();
            }
        }
        waitingPeople=passengers;
        waitingCargo=cargoWeight;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
