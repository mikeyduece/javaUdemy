package com.example.series.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
//    int x = 98;
//    int y = 0;
//    System.out.println(divideLBYL(x,y));
//    System.out.println(divideEAFP(x,y));
    System.out.println("Enter int");
    int x = getIntEAFP();
    System.out.println("x is " + x);

  }

  private static int getInt() {
    Scanner sc = new Scanner(System.in);
    return sc.nextInt();
  }

  private static int getIntLBYL() {
    Scanner sc = new Scanner(System.in);
    boolean isValid = true;
    String input = sc.next();
    for(int i = 0; i < input.length(); i++) {
      if(!Character.isDigit(input.charAt(i))) {
        isValid = false;
        break;
      }
    }
    sc.close();
    if(isValid) return Integer.parseInt(input);

    return 0;
  }

  private static int getIntEAFP() {
    Scanner sc = new Scanner(System.in);
    try {
      sc.close();
      return sc.nextInt();
    } catch(InputMismatchException e) {
      sc.close();
      return 0;
    }
  }

  //  Look before you leap
  private static int divideLBYL(int x, int y) {
    if(y != 0) return x / y;
    return 0;
  }

  // Easier to ask forgiveness that permission
  private static int divideEAFP(int x, int y) {
    try {
      return x / y;
    } catch(ArithmeticException e) {
      return 0;
    }
  }

}
