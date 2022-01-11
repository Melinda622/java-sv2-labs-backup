package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;

    private String hourMinute;

    public SimpleTime(int hour, int minute) {
        if (!hourIsValid(hour)) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        } else if (!minuteIsValid(minute)) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        } else {
            this.hour = hour;
            this.minute = minute;
        }
    }

    public SimpleTime(String hourMinute) {
        if (hourMinuteIsInValid(hourMinute)) {
            throw new InvalidTimeException("Time is null");
        }

        if(!delimiterIsValid(hourMinute)){
            throw new InvalidTimeException("Time is not hh:mm");
        }

        String hourString = hourMinute.substring(0, 2).trim();
        try {
            int hour = Integer.parseInt(hourString);
            if (!hourIsValid(hour)) {
                throw new InvalidTimeException("Hour is invalid (0-23)");
            }else{
                this.hour = hour;
            }
        } catch (NumberFormatException e) {
            throw new InvalidTimeException("Time is not hh:mm");
        }

        String minuteString = hourMinute.substring(3).trim();

        try {
            int minute = Integer.parseInt(minuteString);
            this.minute = minute;
        } catch (
                NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    private boolean delimiterIsValid(String hourMinute) {
        return hourMinute.substring(2,2).equals(":");
    }

    private boolean hourMinuteIsInValid(String hourMinute) {
        return hourMinute == null;
    }

    private boolean hourIsValid(int hour) {
        return hour >= 0 && hour <= 23;
    }

    private boolean minuteIsValid(int minute) {
        return minute >= 0 && minute <= 59;
    }

    @Override
    public String toString() {
        if (minute < 10) {
            return hour + ":" + "0" + minute;
        } else if (hour < 10) {
            return "0" + hour + ":" + minute;
        } else {
            return hour + ":" + minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
