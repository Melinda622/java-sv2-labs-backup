package interfaces.figure;

public class Circle implements Area {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }
}
