package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private static final int maxDamage=10;
    private static final int minDefence=5;

    private int hitPoint = 100;
    private Point position;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, maxDamage);
    }

    private int getActualDefence() {
        return random.nextInt(0, minDefence);
    }

    protected void hit(Character enemy, int damage) {
        int defence = enemy.getActualDefence();
        if (defence < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        int damage = getActualPrimaryDamage();
        hit(enemy, damage);
    }


    private void decreaseHitPoint(int diff) {
        this.hitPoint -= diff;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }

    public abstract void secondaryAttack(Character enemy);
}
