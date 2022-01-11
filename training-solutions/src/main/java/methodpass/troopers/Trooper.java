package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position=new Position(0,0);

    public Trooper(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        } else {
            this.name = name;
        }
    }

    public void changePosition(Position position) {
        this.position = position;
        if (position==null) {
            throw new IllegalArgumentException("The new position cannot be null");
        }
    }

    public double distanceFrom(Position target) {
        return getPosition().distanceFrom(target);
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
