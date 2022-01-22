package searching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LostAndFoundOffice {

    private List<LostProperty> lostItems=new LinkedList<>();

    public void addProperty(LostProperty lostProperty){
        lostItems.add(lostProperty);
    }

    public LostProperty findLostProperty(LostProperty searched){

        int i=Collections.binarySearch(lostItems,searched);

        if(i<0){
            throw new IllegalArgumentException("Property not found.");
        }
        return lostItems.get(i);
    }
}
