package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        System.out.println("Empty constructor called!");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("9999", 100,customerName, customerEmailAddress, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
