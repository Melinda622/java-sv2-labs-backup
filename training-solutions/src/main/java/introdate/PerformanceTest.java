package introdate;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance(2021, 11, 21, "Ed Sheeran", 20, 0, 22, 30);

        System.out.println(performance.getDate());
        System.out.println(performance.getArtist());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());

        System.out.println(performance.getInfo());
    }
}
