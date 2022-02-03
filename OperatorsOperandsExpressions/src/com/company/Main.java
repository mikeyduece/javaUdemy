package com.company;

public class Main {
    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) return INVALID_MESSAGE;

        long hours = minutes / 60;
        minutes %= 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) return INVALID_MESSAGE;

        long minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    public static double area(double radius) {
        if (radius < 0) return -1;

        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1;

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600; // minutes in a year
            long days = (minutes % 525600) / 1440 ; // minutes in a day

            System.out.println(minutes + " min = " + years + " y and " + days + "d");
        }
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int seasonalUpperLimitTemp = summer ? 45 : 35;
        return temperature >= 25 && temperature <= seasonalUpperLimitTemp;
    }
}