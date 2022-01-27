package algorithmsmax;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    public int getLongestOcean(String map) {
        int count = 0;
        List<Integer> oceans = new ArrayList<>();
        int lengthOfOcean=0;
        int max = 0;

        for (int i = 0; i < map.length() - 1; i++) {
            if (map.charAt(i) == '0' && map.charAt(i + 1) == '0') {
                count++;
            }else if (map.charAt(i + 1) != '0' && count > 0) {
                oceans.add(count + 1);
                lengthOfOcean=count+1;
                count = 0;
            }else if(lengthOfOcean>max){
                max=lengthOfOcean;
            }
        }
        return max;
    }
}
