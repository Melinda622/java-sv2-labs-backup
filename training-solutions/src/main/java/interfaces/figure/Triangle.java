package interfaces.figure;

public class Triangle implements Area {

    private double lengthOfSide;
    private double height;

    public Triangle(double lengthOfSide, double height) {
        this.lengthOfSide = lengthOfSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*lengthOfSide/2;
    }

    public double getLengthOfSide() {
        return lengthOfSide;
    }

    public double getHeight() {
        return height;
    }
}
