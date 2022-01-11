package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {

    @Test
    void testGetEvenNumbers() {
        Numbers number = new Numbers();
        int[] a = {2, 8, 5, 6, 2, 3, 9};
        int[] b = {2, 8, 0, 6, 2, 0, 0};
        number.getEvenNumbers(a);
        assertArrayEquals(b, number.getEvenNumbers(a));
    }
}
