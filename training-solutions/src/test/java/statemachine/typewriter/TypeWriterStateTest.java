package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testCapsLock(){
        assertEquals(TypeWriterState.UPPERCASE,TypeWriterState.LOWERCASE.capsLock());
        assertEquals(TypeWriterState.LOWERCASE,TypeWriterState.UPPERCASE.capsLock());
    }
}