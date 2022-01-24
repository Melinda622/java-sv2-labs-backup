package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    private String teamName;
    private int played;
    private int points;
    private GameStatistics gameStatistics;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.gameStatistics=new GameStatistics();
    }

    public class GameStatistics {
        private int won;
        private int tied;
        private int lost;
        private int goalsFor;
        private int goalsAgainst;

    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        played++;
        gameStatistics.goalsFor += plusGoalsFor;
        gameStatistics.goalsAgainst += plusGoalsAgainst;
        switch (checkGoals(plusGoalsFor, plusGoalsAgainst)) {
            case 1:
                gameStatistics.won++;
                points+=3;
                break;
            case -1:
                gameStatistics.lost++;
                break;
            default:
                gameStatistics.tied++;
                points+=1;
        }
    }

    private int checkGoals(int plusGoalsFor, int plusGoalsAgainst) {
        if (plusGoalsFor == plusGoalsAgainst) {
            return 0;
        } else if (plusGoalsFor > plusGoalsAgainst) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return teamName.equals(that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return played;
    }

    public int getPoints() {
        return points;
    }

    public int getWon() {
        return gameStatistics.won;
    }

    public int getTied() {
        return gameStatistics.tied;
    }

    public int getLost() {
        return gameStatistics.lost;
    }

    public int getGoalsFor() {
        return gameStatistics.goalsFor;
    }

    public int getGoalsAgainst() {
        return gameStatistics.goalsAgainst;
    }

    public GameStatistics getGameStatistics() {
        return gameStatistics;
    }
}
