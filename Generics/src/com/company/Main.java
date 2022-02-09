package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");
        Team<FootballPlayer> niners = new Team<>("49ers");
        Team<FootballPlayer> iggles = new Team<>("Eagles");
        Team<FootballPlayer> daBears = new Team<>("Bears");

        Team<BaseballPlayer> phillies = new Team<>("Phillies");

        footballLeague.add(niners);
        footballLeague.add(iggles);
        footballLeague.add(daBears);
//        footballLeague.add(phillies);

        iggles.matchResult(daBears, 1, 0);
        iggles.matchResult(niners, 3, 0);
        daBears.matchResult(niners, 2,1);

        footballLeague.showLeagueTable();

        FootballPlayer colin = new FootballPlayer("Colin Kapernick");
        FootballPlayer reggieWhite = new FootballPlayer("Reggie White");
        FootballPlayer fridge = new FootballPlayer("William Perry");

        niners.addPlayer(colin);
        iggles.addPlayer(reggieWhite);
        iggles.addPlayer(fridge);

//        Don't use raw types when using generics
//        Can cause errors in production
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(colin); // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(phillies); // No warning
        rawLeague.add(iggles); // No warning

        League reallyRaw = new League("Really Raw");
        reallyRaw.add(phillies); // unchecked warning
        reallyRaw.add(iggles); //unchecked warning

    }
}
