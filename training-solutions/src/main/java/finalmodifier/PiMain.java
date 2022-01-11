package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator();
        System.out.println(circle.calculatePerimeter(5));
        System.out.println(circle.calculateArea(5));

        CylinderCalculator cylinder = new CylinderCalculator();
        System.out.println(cylinder.calculateVolume(5, 8));
        System.out.println(cylinder.calculateSurfaceArea(5, 8));

        CylinderCalculatorBasedOnCircle test = new CylinderCalculatorBasedOnCircle();
        System.out.println(test.calculateVolumes(5, 8));
        System.out.println(test.calculateSurfaceAreas(5, 8));
    }
}

