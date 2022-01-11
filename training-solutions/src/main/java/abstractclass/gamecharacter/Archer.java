package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow=100;

    public Archer(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return new Random().nextInt(1, 5);
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        int damage = getActualPrimaryDamage();
        enemy.hit(enemy, damage);
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public static void main(String[] args) {

        System.out.println(new Random(123).nextInt(1,5));
        System.out.println(new Random(123).nextInt(1,10));

    }
}
