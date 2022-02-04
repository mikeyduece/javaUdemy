package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(Customer customer) {
        Customer foundCustomer = findCustomer(customer);
        if(foundCustomer == null) {
            customers.add(customer);
            return true;
        }

        return false;
    }

    public void addCustomerTransaction(Customer customer, double transaction) {
        customer.addTransaction(transaction);
    }

    private Customer findCustomer(Customer customer) {
        return customers.stream()
                .filter(customer1 -> customer1.getName()
                        .equals(customer.getName()))
                .findFirst()
                .orElse(null);
    }
}
