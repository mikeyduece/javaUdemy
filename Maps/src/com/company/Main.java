package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(0, new Location(0, "First location"));
        locations.put(1, new Location(1, "Second location"));
        locations.put(2, new Location(2, "Third location"));
        locations.put(3, new Location(3, "Fourth location"));
        locations.put(4, new Location(4, "Fifth location"));
        locations.put(5, new Location(5, "Sixth location"));

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) break;
            loc = sc.nextInt();
            if(!locations.containsKey(loc)) {
                System.out.println("Cannot got that way");
            }
        }
    }
}
