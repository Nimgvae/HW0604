package Game;

import java.util.ArrayList;
import java.util.List;

public class LeagueList <T extends League>{
    private List<T> leagues = new ArrayList<>();

    public List<T> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<T> leagues) {
        this.leagues = leagues;
    }

    public void print(){
        for (League league : leagues){
            league.printTable();
        }
    }

}
