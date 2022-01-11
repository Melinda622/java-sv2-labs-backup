package methodchain;

public class Grasshopper {

    private int position;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction){
        if(direction.equals(Direction.POSITIVE)){
            position++;
        }else if(direction.equals(Direction.NEGATIVE)){
            position--;
        } return this;
    }

    public void moveFromZeroToThreeWithFiveHops(){
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE). hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE);
    }
}
