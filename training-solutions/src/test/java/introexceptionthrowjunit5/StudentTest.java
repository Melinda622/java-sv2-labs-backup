package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void addGradeTest(){
        Student student=new Student();
        student.addGrade(5);
        student.addGrade(4);
        assertEquals(2,student.getGrades().size());
        assertEquals(5, student.getGrades().get(0).intValue());
    }

    @Test
    void addGradeTestwithException(){
        Student student=new Student();
        IllegalArgumentException exception=assertThrows(IllegalArgumentException.class,
        () -> student.addGrade(6));
        assertEquals("Grade must be between 1 and 5!", exception.getMessage());
    }
}