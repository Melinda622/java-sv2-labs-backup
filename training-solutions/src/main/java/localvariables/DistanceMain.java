package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(330.65, true);
        System.out.println(distance.getDistanceInKm());
        System.out.println(distance.isExact());

        int newDistance = (int) distance.getDistanceInKm();
        System.out.println(newDistance);
    }
}
