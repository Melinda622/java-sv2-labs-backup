package optional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BucketList {

    List<Destination> destinations=new LinkedList<>();

    public void addDestination(Destination destination){
        destinations.add(destination);
    }

    public List<Destination> getDestinations() {
        return new ArrayList<>(destinations);
    }

    public Optional<Destination> getDestinationWithKeyword(String keyword){
        Optional<Destination> place=Optional.empty();
        for (Destination d:destinations) {
            if(d.getDescription().contains(keyword)){
               return place=Optional.of(d);
            }

        }return Optional.empty();
    }

    public Optional<Destination> getDestinationNearerThanGiven(int maxKm){
        Optional<Destination> place=Optional.empty();
        for (Destination d:destinations) {
            if(d.getKmFromHome()<maxKm){
               return place=Optional.of(d);
            }

        }return Optional.empty();
    }
}
