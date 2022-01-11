package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getNumberOfStudentsTest(){
        School school=new School();
        List<Integer> headcounts= Arrays.asList(34,30,28,20,25,23);
        assertEquals(160,school.getNumberOfStudents(headcounts));
    }
}