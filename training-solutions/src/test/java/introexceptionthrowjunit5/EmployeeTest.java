package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void Testexception(){
        assertThrows(IllegalArgumentException.class,
                ()->new Employee(""));
    }

}