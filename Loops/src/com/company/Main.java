package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.Map.entry;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }

    public static void printSquareStar(int number) {
        if(number < 5) System.out.println("Invalid Value");


    }

    public static int getLargestPrime(int number) {
        if(number < 2) return -1;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                number /= i;
                i--;
            }
        }

        return number;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        double x = goal % 5;
        System.out.println(x);
        boolean result = false;
        if(bigCount < 0 || smallCount < 0 || goal < 0) return result;
        if(((bigCount * 5) + smallCount >= goal) && goal % 5 <= smallCount) result = true;

        return result;
    }

    public static int reverse(int number) {
        int result = 0;
        while (number > 1) {
            result *= 10;
            int temp = number % 10;
            result += temp;
            number /= 10;
        }

        return result;
    }

    public static StringBuilder numberToWords(int number) {
        number = reverse(number);
        Map<Integer, String> numInWord = Map.ofEntries(
                entry(0, "Zero"),
                entry(1, "One"),
                entry(2, "Two"),
                entry(3, "Three"),
                entry(4, "Four"),
                entry(5, "Five"),
                entry(6, "Six"),
                entry(7, "Seven"),
                entry(8, "Eight"),
                entry(9, "Nine")

        );
        StringBuilder message = new StringBuilder();
        while (number > 1) {
            number %= 10;
            message.append(" ").append(numInWord.get(number));
            number--;
        }

        return message;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;

        return String.valueOf(number).length();
    }

    public static boolean isPerfectNumber(int number) {
        boolean result = false;
        if (number < 1) return result;

        int factor = 1;
        List<Integer> factors = new ArrayList<Integer>();

        while (factor < number) {
            if (number % factor == 0) factors.add(factor);
            factor++;
        }

        int summedFactors = factors.stream().mapToInt(Integer::intValue).sum();
        if (summedFactors == number) result = true;

        return result;
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Value");
        int factor = 1;
        StringBuilder message = new StringBuilder();

        while (factor <= number) {
            if (number % factor == 0) {
                message.append(" ").append(factor);
            }
            factor++;
        }

        System.out.println(message);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int GCD=1;
        if(first<10 || second <10)
            return -1;
        else {
            for(int i=1;i<=first && i<=second;++i) {
                if(first%i==0 && second%i==0) GCD=i;
            }
            return GCD;
        }
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!(isValid(a) && isValid(b) && isValid(c))) return false;
        a %= 10;
        b %= 10;
        c %= 10;

        return a == b || b == c || a == c;
    }

    public static int getLastDigit(int num) {
        return num % 10;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static int digit(String charString, int digitIndex) {
        return Integer.parseInt(String.valueOf(charString.toCharArray()[charString.length() - digitIndex]));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int originalNumber = number;

        while (number >= 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse == originalNumber;
    }

    public static int sumDigits(int num) {
        if (num < 10) return -1;

        IntStream chars = String.valueOf(num).chars().map(Character::getNumericValue);
        return chars.sum();
    }

    private static int sumUpTo(int upperLimit) {
        int sum = 0;
        int numLimit = 0;
        for (int i=1; i <= upperLimit; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                sum += i;
                numLimit++;
                System.out.println(i);
            }

            if (numLimit == 5) break;
        }

        return sum;
    }

    public static boolean isOdd(int number) {
        if (number < 0) return false;

        return !(number % 2 == 0);
    }

    public static int sumOdd(int start, int end) {
        if((start < 0 || end < 0) || (end < start)) return -1;

        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)) sum += i;
        }

        return sum;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
