package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void countChildrenWithHeightGreaterThanTest(){
        List<Integer> heights= Arrays.asList(160,152,140, 151, 155, 145, 165);
        Height height=new Height();
        assertEquals(5,height.countChildrenWithHeightGreaterThan(heights,150));
    }
}