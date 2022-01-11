package exceptionresource.siblings;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SiblingsTest {

    Siblings siblings=new Siblings();
    Path path= Paths.get("src/test/resources/siblings.txt");
    Path path2= Paths.get("src/test/resource/siblings.txt");

    @Test
    void testGetFullNames(){
        List<String> fullNames= Arrays.asList("Szabó Emese","Szabó Ferenc");
        assertEquals(fullNames,siblings.getFullNames("Szabó",path));
    }

    @Test
    void testException(){
        IllegalStateException ise=assertThrows(IllegalStateException.class,()->siblings.getFullNames("Szabó",path2));
        assertEquals("Can not read file",ise.getMessage());
    }
}