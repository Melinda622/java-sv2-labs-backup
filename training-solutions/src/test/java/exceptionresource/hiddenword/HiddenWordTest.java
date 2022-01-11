package exceptionresource.hiddenword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class HiddenWordTest {

    HiddenWord hiddenWord=new HiddenWord();
    Path path= Paths.get("src/test/resources/hiddenword.txt");
    Path path2= Paths.get("src/test/resource/hiddenword.txt");

    @Test
    void testgetHiddenWord(){
        assertEquals("ALMA KÖRTE",hiddenWord.getHiddenWord(path));
    }

    @Test
    void testException(){
        IllegalStateException ise=assertThrows(IllegalStateException.class,()->hiddenWord.getHiddenWord(path2));
        assertEquals("Can not read file",ise.getMessage());
    }
}