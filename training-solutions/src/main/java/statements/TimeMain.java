package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add a time, first the hour, then minutes and finally the seconds");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int second = scanner.nextInt();

        Time time = new Time(hour, minute, second);
        System.out.println(time.getHour() + " " + "hours" + " " + time.getMinute() + " " + "minutes" + " " + time.getSecond() + " " + "seconds");

        System.out.println(time.getInMinutes()+" minutes");

        System.out.println("Please add a second time, first the hour, then minutes and finally the seconds");
        hour = scanner.nextInt();
        minute = scanner.nextInt();
        second = scanner.nextInt();
        Time time2 = new Time(hour, minute, second);
        System.out.println(time2.getInSeconds()+" seconds");
        System.out.println("First time is earlier than second time: "+time.earlierThan(time, time2));

        System.out.println(time.toString());
    }
}
