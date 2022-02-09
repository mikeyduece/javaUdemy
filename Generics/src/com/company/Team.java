package com.company;

import java.util.ArrayList;
// Team's type is based on the 'type' of player, in the case of what's currently written in Main.java, the team if FootballPlayer type
// represented here by the 'T' which itself extends player, which can be viewed in the FootballPlayer class.
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if(members.contains(player)) return false;

        members.add(player);
        return true;
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) won++;
        if(ourScore == theirScore) tied++;
        if(ourScore < theirScore) lost++;
    }

    @Override
    public int compareTo(Team<T> team) {
        return Integer.compare(team.ranking(), this.ranking());

    }
}
