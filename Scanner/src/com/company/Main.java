package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double area = width * height;
        double requiredBuckets = Math.ceil((area / areaPerBucket) - extraBuckets);
        
        return (int) requiredBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double area = width * height;
        double requiredBuckets = Math.ceil(area / areaPerBucket);

        return (int) requiredBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <= 0) return -1;

        return (int) Math.ceil(area / areaPerBucket);
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double count = 0;

        while (true) {
            System.out.print("Enter number: ");
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                int number = sc.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            sc.nextLine();
        }
        double avg = sum / count;
        avg = Math.round(avg);
        System.out.println("SUM = " + (int) sum + " " + "AVG = " + (int) avg);
    }

    private static void mixMaxChallenge() {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.print("Enter number: ");
            boolean isInt = sc.hasNextInt();
            if (isInt) {
                int number = sc.nextInt();
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            sc.nextLine();
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    private static void userInputChallenge() {
        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.print("Enter number #" + order + ":");
            boolean isInt = sc.hasNextInt();

            if (isInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;

                if (counter == 10) break;
            } else {
                System.out.println("Invalid Number");
            }

            sc.nextLine();
        }

        System.out.println("sum = " + sum);
        sc.close();
    }

    public static int getAge(Scanner scanner) {
        System.out.print("Enter your year of birth: ");
        boolean isInt = scanner.hasNextInt();
        int year = 0;

        if (isInt) {
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Invalid Year. Please enter a positive/real number");
                return getAge(scanner);
            }
        } else {
            System.out.println("Invalid Year. Please enter a positive/real number");
            scanner.next();
            return getAge(scanner);
        }

        return 2022 - year;
    }

    private static void calcAge() {
        Scanner scanner = new Scanner(System.in);

        int age = getAge(scanner);
        scanner.nextLine();
        if (age < 0) System.out.println("Invalid year");

        String name = getName(scanner);
        System.out.println("Your name is " + name + ", and you are " + age);

        scanner.close();
    }


    private static String getName(Scanner scanner) {
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
}