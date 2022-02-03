package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Map.entry;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(42);
    }

    public static void message(int num) {
        System.out.println("Value was " + num);
    }

    public static void checkLetter(char letter) {
        switch(letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Char was " + letter);
                break;
            default:
                System.out.println("Not Found");
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = dayOfWeek(day);
        if (dayOfWeek != null) {
            System.out.println(dayOfWeek);
        } else {
            System.out.println("Not Found");
        }
    }
    public static String dayOfWeek(int day) {
        Map<Integer, String> daysOfWeek = Map.of(
                0, "Sunday",
                1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday"
        );

        return daysOfWeek.get(day);
    }

    public static void printNumberInWord(int number) {
        Map<Integer, String> numInWord = Map.ofEntries(
                entry(0, "ZERO"),
                entry(1, "ONE"),
                entry(2, "TWO"),
                entry(3, "THREE"),
                entry(4, "FOUR"),
                entry(5, "FIVE"),
                entry(6, "SIX"),
                entry(7, "SEVEN"),
                entry(8, "EIGHT"),
                entry(9, "NINE")

        );
        String numberInWord = numInWord.get(number);
        System.out.println(Objects.requireNonNullElse(numberInWord, "OTHER"));
    }

    public static boolean isLepYear(int year) {
        
    }

}
