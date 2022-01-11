package statements;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes() {
        return (hour * 60) + minute + (second / 60);
    }

    public int getInSeconds() {
        return (hour * 60 * 60) + (minute * 60) + second;
    }

    public boolean earlierThan(Time time, Time time2) {
        return time.getInMinutes() < time2.getInMinutes();
    }

    public String toString() {
        return "Óra: " + hour + " " + "Perc: " + minute + " " + "Másodperc: " + second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
