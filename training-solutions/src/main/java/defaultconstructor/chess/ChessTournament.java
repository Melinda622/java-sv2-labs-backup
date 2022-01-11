package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {

   private List<Team> teams;

    public ChessTournament() {
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        teams = Arrays.asList(team1, team2, team3);
    }


    public List<Team> getTeams() {
        return teams;
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        for (int i = 0; i < (teams.size() * 2); i++) {
            setPlayers(i, playersRegistrated);
        }
    }

    private void setPlayers(int i, List<Player> playersRegistrated) {
        if (playersRegistrated.size() >= i + 1) {
            if (i % 2 == 0) {
                teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            } else {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i));
            }
        }
    }
}
