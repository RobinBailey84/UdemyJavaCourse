package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount(1234, 500, "Robin", "robin@gmail.com", 01412212222);
//        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(200);
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawFunds(100);

        VipCustomer tomsAccount = new VipCustomer("Tom Bailey", 250.00);
        System.out.println(tomsAccount.getCreditLimit());
        System.out.println(tomsAccount.getCustomerEmail());
    }
}
