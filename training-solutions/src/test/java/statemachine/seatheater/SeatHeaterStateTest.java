package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    SeatHeaterState seatHeaterState;

    @Test
    void testNextOFF(){
        seatHeaterState=SeatHeaterState.OFF;
        assertEquals(SeatHeaterState.THREE,seatHeaterState.next());
    }

    @Test
    void testNextTHREE(){
        seatHeaterState=SeatHeaterState.THREE;
        assertEquals(SeatHeaterState.TWO,seatHeaterState.next());
    }

    @Test
    void testNextTWO(){
        seatHeaterState=SeatHeaterState.TWO;
        assertEquals(SeatHeaterState.ONE,seatHeaterState.next());
    }


    @Test
    void testNextONE(){
        seatHeaterState=SeatHeaterState.ONE;
        assertEquals(SeatHeaterState.OFF,seatHeaterState.next());
    }
}