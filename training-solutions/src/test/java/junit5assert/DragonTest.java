package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    void testName() {
        Dragon dragon = new Dragon("Süsü", 1, 2);
        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Ord", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü", 1, 2);
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 2);
    }

    @Test
    void testHeight() {
        Dragon dragon = new Dragon("Süsü", 1, 2);
        assertEquals(2, dragon.getHeight(), 0.001);
    }

    @Test
    void testNull() {
        Dragon dragon2 = new Dragon("Ord", 1, 3);
        Dragon dragon3 = null;
        assertNull(dragon3);
        assertNotNull(dragon2);
    }

    @Test
    void testSameObjects() {
        Dragon dragon4 = new Dragon("Cassie", 1, 1);
        Dragon dragon5 = dragon4;
        assertSame(dragon4, dragon5);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon6 = new Dragon("Draco", 3, 3.5);
        Dragon dragon7 = new Dragon("Draco", 3, 3.5);
        assertNotSame(dragon6, dragon7);
    }
}
