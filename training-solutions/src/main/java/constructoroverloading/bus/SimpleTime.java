package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
    }

    private int getInMinutes(SimpleTime time) {
        return time.hours * 60 + time.minutes;
    }

    public int getDifference(SimpleTime time) {
        int minutes = this.hours * 60 + this.minutes;
        int result = minutes - time.getInMinutes(time);
        return result;
    }

    @Override
    public String toString() {
        return hours + ":" +
                minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
