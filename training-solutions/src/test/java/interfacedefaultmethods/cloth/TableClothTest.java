package interfacedefaultmethods.cloth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableClothTest {

    TableCloth tableCloth = new TableCloth(5);

    @Test
    void testGetSide() {
        assertEquals(5, tableCloth.getSide());
    }

    @Test
    void testGetArea() {
        assertEquals(25, tableCloth.getArea());
    }

    @Test
    void testGetPerimeter() {
        assertEquals(20, tableCloth.getPerimeter());
    }

    @Test
    void testLengthOfDiagonal() {
        assertEquals(Math.sqrt(50), tableCloth.getLengthOfDiagonal());
    }

    @Test
    void testGetNumberOfSides() {
        assertEquals(4, tableCloth.getNumberOfSides());
    }

}