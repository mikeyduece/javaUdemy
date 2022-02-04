package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Branch addBranch(String branchName) {
        if(findBranchByName(branchName) == null) {
            Branch newBranch = new Branch(branchName);
            branches.add(newBranch);
            int pos = branches.indexOf(newBranch);

            return branches.get(pos);
        }

        return null;
    }

    public boolean addCustomerToBranch(Customer customer, String branchName) {
        Branch branch = findBranchByName(branchName);
        if (branch == null) {
            addBranch(branchName);

        }
        return branch.addCustomer(customer);
    }

    public void addCustomerTransaction(Branch branch, Customer customer, double transaction) {
        branch.addCustomerTransaction(customer, transaction);
    }

    public void printCustomersForBranch(Branch branch) {
        System.out.println("Enter '1' to see a list of customers" + "\n" + "Enter '2' to see a list of customers with their transactions");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.close();
        switch (option) {
            case 1:
                printCustomers(branch, false);
                break;
            case 2:
                printCustomers(branch, true);
                break;
        }
    }

    private ArrayList<Customer> printCustomers(Branch branch, boolean showTransactions) {
        branch = findBranch(branch);
        if(branch == null) return null;

        ArrayList<Customer> customers = branch.getCustomers();
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            System.out.println(i + ". " + customer);
            if (showTransactions) {
                System.out.println("  Transactions: ");
                ArrayList<Double> transactions = customer.getTransactions();
                for(int j=0;j< transactions.size();j++) {
                    System.out.println("[" + (j+1) + "] Amount: " + transactions.get(j));
                }
            }
        }
        return customers;
    }

    private Branch findBranchByName(String branchName) {
        return branches.stream()
                .filter(b -> b.getName()
                        .equals(branchName))
                .findFirst()
                .orElse(null);
    }

    public Branch findBranch(Branch branch) {
        return findBranchByName(branch.getName());
    }

}
