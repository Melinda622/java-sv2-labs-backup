package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test
    void TestGetMin(){
        Temperature temperature=new Temperature();
        List<Integer> temperatures= Arrays.asList(3,5,4,6,2,1,9,7);
        assertEquals(1,temperature.getMin(temperatures));
    }
}