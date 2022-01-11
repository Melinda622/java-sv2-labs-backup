package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        List<String> iceCreams=new ArrayList<>();
        iceCreams.add("csoki");
        iceCreams.add("vanília");
        iceCreams.add("eper");
        iceCreams.add("citrom");
        iceCreams.add("puncs");

        StringBuilder sb=new StringBuilder("Ma kapható: ");
        for(int i=0;i< iceCreams.size();i++){
            sb.append(iceCreams.get(i));
          if(i!= iceCreams.size()-1){
              sb.append(", ");
          }
        }
        System.out.println(sb.append("\n").append("Gyerekeknek féláron"));
    }
}
