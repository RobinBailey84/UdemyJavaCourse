package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " and this is more";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
