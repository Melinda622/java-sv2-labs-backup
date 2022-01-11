package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testCreate() {
        Gentleman gentleman = new Gentleman();

        String greeting = gentleman.sayHello("John Doe");

        assertEquals("Hello John Doe", greeting);
    }

    @Test
    void TestCreate2(){
         Gentleman gentleman2 = new Gentleman();

         String greeting2=gentleman2.sayHello(null);

         assertEquals("Hello Anonymous", greeting2);
    }
}
