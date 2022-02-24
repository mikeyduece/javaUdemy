package com.example.series.test;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
  public static void main(String[] args) {
    int result = divide();
    System.out.println(result);
  }

  private static int divide() {
    int x = getInt();
    int y = getInt();
    try {
      return x / y;
    } catch(ArithmeticException e) {
      return 0;
    }
  }

  private static int getInt() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter int");

    while(true) {
      try {
        return s.nextInt();
      } catch(NoSuchElementException e) {
        s.nextLine();
        System.out.println("Enter number, IDIOT!!!");
      }
    }
  }
}
