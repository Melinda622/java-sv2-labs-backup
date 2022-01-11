package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingsTest2 {
    @Test
    void testGreet(){
        Greetings greetings=new Greetings();
        assertEquals("Jó reggelt!",greetings.greet(9,0));
        assertEquals("Jó napot!",greetings.greet(9,1));
        assertEquals("Jó estét!",greetings.greet(18,30));
    }
}
