package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class Postman {

    List<String> addresses=new LinkedList<>();

    public void addAddress(String address){
        addresses.add(address);
    }

    public void removeAddress(String address){
        addresses.remove(addresses.indexOf(address));
    }

    public List<String> getAddresses() {
        return addresses;
    }
}
