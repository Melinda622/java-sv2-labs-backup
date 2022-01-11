package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void TestGetMax() {
        Hill hill = new Hill();
        List<Integer> peaks = Arrays.asList(4274, 4158, 4357, 4122, 4049, 3842, 3798);
        assertEquals(4357, hill.getMax(peaks));
    }
}