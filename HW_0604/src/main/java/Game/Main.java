package Game;

public class Main {
    public static void main(String[] args) {
        LeagueList leagueList = TournamentCreator.createLeagues();
        leagueList.print();
        GameCore.playOneRoundAllLeagues(leagueList);
        leagueList.print();
    }
}
