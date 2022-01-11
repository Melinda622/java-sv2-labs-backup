package algorithmsmax.trainer;

import java.util.Arrays;
import java.util.List;

public class MaxAgeCalculator {

   public Trainer getTrainerWithMaxAge(List<Trainer> trainers){
       Trainer trainer=null;
       int oldest=0;
       oldest =trainers.get(0).getAge();
       for (int i = 0; i < trainers.size(); i++) {
           if(trainers.get(i).getAge()>oldest){
               oldest=trainers.get(i).getAge();
           }
       }
       for (Trainer t:trainers){
           if(oldest==t.getAge()){
               trainer=t;
           }
       }return trainer;
   }

    public static void main(String[] args) {
       MaxAgeCalculator maxAgeCalculator=new MaxAgeCalculator();
        List<Trainer> trainers= Arrays.asList(new Trainer("Jack",58),
                new Trainer("James",28),new Trainer("Jill",65));

        System.out.println(maxAgeCalculator.getTrainerWithMaxAge(trainers));

    }
}
