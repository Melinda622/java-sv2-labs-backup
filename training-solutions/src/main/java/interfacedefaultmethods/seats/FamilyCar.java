package interfacedefaultmethods.seats;

public class FamilyCar implements Seat{

    @Override
    public int getNumberOfSeats() {
        return Seat.super.getNumberOfSeats();
    }
}
