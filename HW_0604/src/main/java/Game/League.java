package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {
    private final LeagueName name;
    private List<Team> teams = new ArrayList<>();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public League(LeagueName name) {
        this.name = name;
    }

    public LeagueName getName() {
        return name;
    }


    public void printTable() {
        Collections.sort(teams);
        boolean beforeGames = teams.get(0).getMainScore() == 0;
        System.out.println("Лига " + name + ". Турнирная таблица");
        for (int i = 0; i < teams.size(); i++) {
            String color = (i == 0 || i == 1) ? ANSI_RED : ANSI_RESET;
            if (beforeGames) color = ANSI_RESET;
            System.out.printf("%s%d. %-20s%s : %d (%d)%n",color, i + 1,
                    teams.get(i).getName(), ANSI_RESET, teams.get(i).getMainScore(), teams.get(i).getAdditionalScore() );
        }
    }
}
