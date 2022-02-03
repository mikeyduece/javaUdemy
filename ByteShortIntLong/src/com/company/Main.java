package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Max Value= " + myMaxIntValue);
        System.out.println("Int Min Value= " + myMinIntValue);
        System.out.println("Busted Max Value= " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min= " + myMinByteValue);
        System.out.println("Byte Max= " + myMaxByteValue);

        byte myMinBteValue = (byte) (myMinByteValue / 2);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min= " + myMinShortValue);
        System.out.println("Short Max= " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min= " + myMinLongValue);
        System.out.println("Long Max= " + myMaxLongValue);

//        Challenge
        int intValue = 50;
        byte byteValue = 10;
        short shortValue = 20;
        long longValue = (long) (50000L + (100000L * (byteValue + shortValue + intValue)));
        System.out.println("Challenge= " + longValue);
    }
}
