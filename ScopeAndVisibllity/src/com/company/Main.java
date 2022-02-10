package com.company;

public class Main {

    public static void main(String[] args) {
	    String privateVar = "this is private to main";

        ScopeCheck instance = new ScopeCheck();
        System.out.println("SC privatevar= " + instance.getPrivateVar());
        System.out.println("Main= " + privateVar);
        instance.timesTwo();
    }
}
