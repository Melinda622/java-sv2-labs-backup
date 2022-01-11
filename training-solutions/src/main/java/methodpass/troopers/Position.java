package methodpass.troopers;

public class Position {

    private double posX;
    private double posY;

    public double distanceFrom(Position position) {
        return Math.sqrt(x1MinusX2Squared(position) + y1MinusY2Squared(position));
    }

    private double x1MinusX2Squared(Position position) {
        return (getPosX() - position.getPosX()) * (getPosX() - position.getPosX());
    }

    private double y1MinusY2Squared(Position position) {
        return (getPosY() - position.getPosY()) * (getPosY() - position.getPosY());
    }

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

}
