package introexceptionthrow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdultTest {

    @Test
    void TestAdult(){

        assertThrows(IllegalArgumentException.class, () -> new Adult("John",17));
    }

}