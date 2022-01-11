package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

   public int getMin(List<Integer> temperatures){
       int smallest=0;
       smallest =temperatures.get(0);
       for (int i = 0; i < temperatures.size(); i++) {
           if(temperatures.get(i)<smallest){
               smallest=temperatures.get(i);
           }
       } return smallest;
   }
}
