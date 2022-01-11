package controlselection.greetings;

import java.time.LocalTime;

public class Greetings {

    public String greet(int hour, int minute) {
        String greeting = "jó napot";
        LocalTime time = LocalTime.of(hour, minute);
        if (time.isBefore(LocalTime.of(5, 01))) {
            greeting = "jó éjt";
        }
        if (time.isAfter(LocalTime.of(5, 0)) && time.isBefore(LocalTime.of(9, 01))) {
            greeting = "jó reggelt";
        }
        if (time.isBefore(LocalTime.of(18, 31)) && time.isAfter(LocalTime.of(9, 0))) {
            greeting = "jó napot";
        }
        if (time.isBefore(LocalTime.of(20, 01)) && time.isAfter(LocalTime.of(18, 30))) {
            greeting = "jó estét";
        }
        if (time.isAfter(LocalTime.of(20, 0))) {
            greeting = "jó éjt";
        }
        return greeting;
    }
}
