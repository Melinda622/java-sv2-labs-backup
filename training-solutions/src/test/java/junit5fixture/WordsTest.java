package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsTest {
    Words word;

    @BeforeEach
    void testinit(){
        word=new Words();
        word.addWord("geimpft");
        word.addWord("genesen");
        word.addWord("getestet");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> a = new ArrayList<>(Arrays.asList("geimpft", "genesen", "getestet"));
        word.getWordsStartWith("ge");
        assertEquals(a, word.words);
    }

    @Test
    void testGetWordsWithLength(){
        List<String> b = new ArrayList<>(Arrays.asList("geimpft", "genesen"));
        word.getWordsWithLength(7);
        assertEquals(b, word.words);
    }
}
