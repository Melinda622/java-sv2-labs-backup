package statemachine.typewriter;

public enum TypeWriterState {

    LOWERCASE {
        TypeWriterState capsLock() {
            return TypeWriterState.UPPERCASE;
        }
    },

    UPPERCASE {
        TypeWriterState capsLock() {
            return TypeWriterState.LOWERCASE;
        }
    };

    abstract TypeWriterState capsLock();
}
