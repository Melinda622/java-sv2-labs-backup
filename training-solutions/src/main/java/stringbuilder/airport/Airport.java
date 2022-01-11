package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Törölt járatok: ");
        for (Flight f : flights) {
            if (f.getStatus().equals(Status.DELETED)) {
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.addFlight(new Flight("B-2346", Status.DELETED));
        airport.addFlight(new Flight("N-32162", Status.DELETED));
        airport.addFlight(new Flight("S-56588", Status.ACTIVE));

        System.out.println(airport.flights.get(0).toString());
        System.out.println(airport.getDeletedFlights());
    }
}
