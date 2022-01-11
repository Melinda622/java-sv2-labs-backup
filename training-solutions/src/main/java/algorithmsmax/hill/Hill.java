package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> peaks){
        int highest=0;
        highest =peaks.get(0);
        for (int i = 0; i < peaks.size(); i++) {
            if(peaks.get(i)>highest){
                highest=peaks.get(i);
            }
        } return highest;
    }
}
