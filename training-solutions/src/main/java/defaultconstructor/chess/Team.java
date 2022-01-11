package defaultconstructor.chess;

public class Team {

    Player playerOne;
    Player playerTwo;

    @Override
    public String toString() {
        return "Team{" +
                "playerOne=" + playerOne +
                ", playerTwo=" + playerTwo +
                '}';
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }
}
