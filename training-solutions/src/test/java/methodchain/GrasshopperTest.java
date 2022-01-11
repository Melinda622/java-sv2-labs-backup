package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrasshopperTest {

    @Test
    void TestMoveFromZeroToThreeWithFiveHops(){
        Grasshopper grasshopper=new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3,grasshopper.getPosition());
    }
}