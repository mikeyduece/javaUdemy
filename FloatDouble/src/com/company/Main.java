package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Max Float = " + myMaxFloat);
        System.out.println("Min Float = " + myMinFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Max Double = " + myMaxDouble);
        System.out.println("Min Double = " + myMinDouble);

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println(Math.round(myDoubleValue / 3));

    }
}
