package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    @Test
    void readWordsTest(){
        Path path= Paths.get("src/main/java/introexceptionreadfiletestjunit5/words.txt");
        assertEquals("alma",new Words().getFirstWordWithA(path));
    }

    @Test
    void readWordsTest2(){
        Path path= Paths.get("src/main/java/introexceptionreadfiletestjunit5/szinek.txt");
        assertEquals("A",new Words().getFirstWordWithA(path));
    }
}