package isahasa.inhabitant;

public class Inhabitant extends Person {

    ParkingPlace parkingPlace;

    public Inhabitant(String name, ParkingPlace parkingPlace) {
        super(name);
        this.parkingPlace = parkingPlace;
    }

    public ParkingPlace changeParkingPlace(int newNumber){
        this.parkingPlace=new ParkingPlace(newNumber);
        return parkingPlace;
    }

    public ParkingPlace getParkingPlace() {
        return parkingPlace;
    }
}
