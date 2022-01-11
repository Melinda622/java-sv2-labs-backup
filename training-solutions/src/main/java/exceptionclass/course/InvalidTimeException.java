package exceptionclass.course;

public class InvalidTimeException extends RuntimeException{

    private int hour;
    private int minute;

    public InvalidTimeException(String message, int hour, int minute) {
        super(message);
        this.hour = hour;
        this.minute = minute;
    }

    public InvalidTimeException(String message) {
        super(message);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
