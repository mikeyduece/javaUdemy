package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

//    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        Contact contact = new Contact("Mike", "5555555");
        phone.findContact(contact);
        phone.addContact(contact);
        System.out.println(phone.getContacts().get(0).getName());
        phone.updateContact(contact, new Contact("Mikey", "5559945"));
        System.out.println(phone.getContacts().get(0).getName());
    }

//    public static int readInterger() {
//        System.out.println("Enter count:");
//        int count = sc.nextInt();
//
//        return count;
//    }
//
//    public static int[] readElements(int num) {
//        int[] array = new int[num];
//        System.out.println("Enter a number:");
//        for(int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        return array;
//    }
//
//    public static int findMin(int[] array) {
//        return Arrays.stream(array).min().getAsInt();
//    }
//
//    private static void reverse(int[] array) {
//        System.out.println(Arrays.toString(array));
//
//        int maxIndex = array.length - 1;
//        int halfLength = (array.length / 2);
//
//        for(int i =0;i < halfLength;i++) {
//            int tmp = array[i];
//            array[i] = array[maxIndex - i];
//            array[maxIndex - 1] = tmp;
//        }
//    }
}
