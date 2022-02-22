package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {

  @org.junit.BeforeClass // RSpec before(:all)
  public static void beforeClass() { System.out.println("BEFORE ANY EXPECTATIONS"); }

  private BankAccount account;
  @org.junit.Before // RSpec before(:each)
  public void setup(){ account = new BankAccount("Mike", "Heft", 1000, BankAccount.CHECKING); }

  @org.junit.Test
  public void deposit() throws Exception {
    double balance = account.deposit(2000, true);
    assertEquals(3000.0, balance,0);
  }

  @org.junit.Test
  public void withdrawl_branch() throws Exception {
    double balance = account.withdrawl(600, true);
    assertEquals(400.0, balance,0);
  }

  @org.junit.Test(expected = IllegalArgumentException.class)
  public void withdrawl_notBranch() throws Exception {
    account.withdrawl(600, false);
    fail("Should have thrown an IllegalArgumentException");
// Earlier versions of junit would require a try/catch block where nothing is done in the catch.
//    try {
//      account.withdrawl(600, false);
//      fail("Should have thrown an IllegalArgumentException");
//    } catch(IllegalArgumentException e) {
//
//    }
  }

  @org.junit.Test
  public void getBalance_deposit() throws Exception {
    account.deposit(200, true);
    assertEquals(1200.0, account.getBalance(),0);
  }

  @org.junit.Test
  public void getBalance_withdrawl() throws Exception {
    account.withdrawl(200, true);
    assertEquals(800.0, account.getBalance(),0);
  }

  @org.junit.Test
  public void isChecking() {
    assertTrue("Not checking",account.isChecking());
  }

  @org.junit.AfterClass // RSpec after(:all)
  public static void afterClass() { System.out.println("AFTER ANY EXPECTATIONS"); }

}