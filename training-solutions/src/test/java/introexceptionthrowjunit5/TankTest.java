package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    @Test
    void modifyAngleTest() {
        Tank tank = new Tank();
        tank.modifyAngle(80);
        tank.modifyAngle(-70);
        assertEquals(10, tank.getAngle());
    }

    @Test
    void modifyAngleTestWithException() {
        Tank tank = new Tank();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-81));
        assertEquals("The canon can only turn maximum 80° left and right!", exception.getMessage());
    }
}