package introexceptionthrowjunit5;

public class Tank {

    private int angle;

    public void modifyAngle(int angleNumber){
        angle+=angleNumber;
        if (angle>80||angle<-80) {
            throw new IllegalArgumentException("The canon can only turn maximum 80° left and right!");
        }

    }

    public int getAngle() {
        return angle;
    }

    public static void main(String[] args) {
        Tank tank=new Tank();
        tank.modifyAngle(-30);
        tank.modifyAngle(-50);
    }
}
