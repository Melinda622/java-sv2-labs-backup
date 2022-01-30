package nestedclasses.dns;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class ClassNotebookTest {


    @Test
    void test(){

        Map<Student,Integer> notebook=new TreeMap<>();
        notebook.put(new Student("John",34),0);
        notebook.put(new Student("Jack",35),0);
        notebook.put(new Student("Jane",36),0);
        ClassNotebook classNotebook=new ClassNotebook(notebook);
        classNotebook.addMark(34,5);
        assertEquals(5,classNotebook.notebook.get(new Student("John",34)));

    }

}