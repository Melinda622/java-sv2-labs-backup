package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private LocalDate date;
    private String artist;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(int year, int month, int day, String artist, int hour1, int minute1, int hour2, int minute2) {
        this.date = LocalDate.of(year, month, day);
        this.artist = artist;
        this.startTime = LocalTime.of(hour1, minute1);
        this.endTime = LocalTime.of(hour2, minute2);
    }

    public String getInfo() {
        return artist + ":" + " " + date + " " + startTime + "-" + endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getArtist() {
        return artist;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
