package com.RobinBailey;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public BankAccount(){
        this(5678, 2, "Default Name", "Default Email Address", 0);
        System.out.println("Empty Constructor Called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String emailAddress, int phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(int fundsDeposited) {
        this.balance += fundsDeposited;
    }

    public void withdrawFunds(int fundsWithdrawn) {
        if (this.balance - fundsWithdrawn < 0) {
            System.out.println("only " + balance + " available. Withdrawal not processed");
        }else{
            this.balance -= fundsWithdrawn;
            System.out.println("Withdrawal of " + fundsWithdrawn + " processed. Remaining balance = " + this.balance);
        }

    }

}
