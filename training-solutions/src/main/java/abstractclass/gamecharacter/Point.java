package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public final long getDistance(Point otherPoint) {
        double sum =
                Math.pow(this.x - otherPoint.getX(), 2) +
                        Math.pow(this.y - otherPoint.getY(), 2);
        return (long) Math.sqrt(sum);
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public static void main(String[] args) {

        System.out.println(Math.pow(6, 2));

    }
}
