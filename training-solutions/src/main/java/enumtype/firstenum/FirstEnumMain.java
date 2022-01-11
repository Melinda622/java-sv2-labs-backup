package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {

        for(Continent i:Continent.values()){
            System.out.println(i);
        }

        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("ARCTIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("SOUTHERN"));
        System.out.println(Ocean.valueOf("ARCTIC"));

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.DEFENDER.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.FORWARD.name());
    }
}
