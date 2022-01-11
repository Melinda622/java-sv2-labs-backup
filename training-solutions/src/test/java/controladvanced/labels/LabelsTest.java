package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabelsTest {

    @Test
    void testLabel(){
        Labels label=new Labels();

        int[][] table=label.getTableOfNumbers(3);

        assertEquals(2,table[0][0]);
    }
}
