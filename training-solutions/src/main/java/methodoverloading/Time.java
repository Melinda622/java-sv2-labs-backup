package methodoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEqual(Time time){
        return this.hours==time.getHours()&&this.minutes== time.getMinutes()&&this.seconds==time.getSeconds();
    }

    public boolean isEqual(int hours, int minutes, int seconds){
        return this.hours==hours&&this.minutes==minutes&&this.seconds==seconds;
    }

    public boolean isEarlier(Time time){
        if(this.hours!= time.getHours()&&this.hours<time.getHours()) {
            return true;
        }else if(this.hours==time.getHours()&&this.minutes!=time.getMinutes()&&this.minutes<time.getMinutes()){
            return true;
        }else if(this.hours==time.getHours()&&this.minutes==time.getMinutes()&&this.seconds!=time.getSeconds()&&this.seconds<time.getSeconds()){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEarlier(int hours, int minutes, int seconds){
        if(this.hours!=hours&&this.hours<hours) {
            return true;
        }else if(this.hours==hours&&this.minutes!=minutes&&this.minutes<minutes){
            return true;
        }else if(this.hours==hours&&this.minutes==minutes&&this.seconds!=seconds&&this.seconds<seconds){
            return true;
        }else{
            return false;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
