package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void testInit(){
        ship=new Ship("Milady",2016,5.5);
    }

    @Test
    void testName(){
        assertEquals("Milady",ship.getName());
        assertNotEquals("Titanic",ship.getName());
    }

    @Test
    void testYearOfConstruction(){
        assertEquals(2016,ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction()==2016);
        assertFalse(ship.getYearOfConstruction()==2020);
    }

    @Test
    void testLength(){
        assertEquals(5.5,ship.getLength(),0.01);
    }

    @Test
    void testNull(){
        Ship ship2=null;
        assertNull(ship2);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects(){
        Ship ship3=ship;
        assertSame(ship,ship3);
    }

    @Test
    void testNotSameObjects(){
        Ship ship4=new Ship("Milady",2016,5.5);
        assertNotSame(ship,ship4);
    }
}
