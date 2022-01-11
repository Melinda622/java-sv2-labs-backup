package abstractclass.gamecharacter;

public class BattleField {

    private int round;

    private boolean oneHit(Character attacker, Character defender) {
        if (attacker.isAlive() && defender.isAlive()) {
            attacker.primaryAttack(attacker);
            attacker.secondaryAttack(defender);
            return true;
        }
        return false;
    }

    public Character fight(Character one, Character other) {
        while (one.isAlive() && other.isAlive()) {
            oneHit(one, other);
            oneHit(other, one);
            round++;
        }
        if (one.isAlive()) {
            return one;
        } else if (other.isAlive()) {
            return other;
        }
        return null;
    }

    public int getRound() {
        return round;
    }
}
