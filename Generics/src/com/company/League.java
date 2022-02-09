package com.company;

import java.util.ArrayList;
import java.util.Collections;

// The type for the league ('T') is dictated by the type of player that is added to the team. As it stands os of writing this,
// that means the leaage is a football player league.
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) return false;

        league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t:league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
