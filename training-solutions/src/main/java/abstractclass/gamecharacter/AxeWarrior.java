package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    private static final int SECONDARY_DAMAGE_MULTIPLIER = 2;

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return new Random().nextInt(1, getActualPrimaryDamage() * 2);
    }

    public void secondaryAttack(Character enemy){
        Point point=new Point(enemy.getPosition().getX(),enemy.getPosition().getY());
        Point point2=new Point(this.getPosition().getX(),this.getPosition().getY());

        if(point.getDistance(point2)<2){
            this.hit(enemy,getActualSecondaryDamage());
        }
    }
}
