package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest{

    @Test
    void TestGetTrainerWithMaxAge(){

        MaxAgeCalculator maxAgeCalculator=new MaxAgeCalculator();

        Trainer trainer1=new Trainer("Jack",58);
        Trainer trainer2=new Trainer("James",28);
        Trainer trainer3=new Trainer("Jill",65);

        List<Trainer> trainers= Arrays.asList(trainer1,trainer2,trainer3);

        assertEquals(trainer3,maxAgeCalculator.getTrainerWithMaxAge(trainers));

    }
}