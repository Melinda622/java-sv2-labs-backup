package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private List<TeamStatistics> leagueTable = new ArrayList<>();

    public void addGame(GameResult result) {
        leagueTable.add(new TeamStatistics(result.teamHome));
        if (!leagueTable.contains(result.teamGuest)) {
            leagueTable.add(new TeamStatistics(result.teamGuest));
        }
        for (TeamStatistics t : leagueTable) {
            if (result.teamHome.equals(t.getTeamName())) {
                t.played(result.goalHome, result.goalGuest);
            } else if (result.teamGuest.equals(t.getTeamName())) {
                t.played(result.goalGuest, result.goalHome);
            }
        }
    }

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }

    public static class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }

    public static void main(String[] args) {
        Championship championship = new Championship();

    }
}
