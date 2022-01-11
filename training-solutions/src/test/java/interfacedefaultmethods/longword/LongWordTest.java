package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LongWordTest {

    @Test
    void testGetLongWord(){
        LongWord longword=new LongWord();
        Path path=Path.of("src/test/resources/longword.txt");
        longword.readFromFile(path);
        assertEquals("LONGWORD",longword.getLongWord());
    }
}