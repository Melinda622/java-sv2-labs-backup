package finalmodifier;

public class CylinderCalculatorBasedOnCircle {
    CircleCalculator circle = new CircleCalculator();

    public double calculateVolumes(double r, double h) {
        return circle.calculateArea(r) * h;
    }

    public double calculateSurfaceAreas(double r, double h) {
        return circle.calculatePerimeter(r) * h + circle.calculatePerimeter(r) * r;
    }
}
