package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(result);

        result = result % 1;
        System.out.println(result);

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("you got the highest score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100));
        System.out.println("Greater than the 2nd top score and less than 100");

        if((topScore > 90) || (secondTopScore <= 90));
        System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = true;
        if(isCar)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        double firstNumber = 20;
        double secondNumber = 80;
        double totalValue = (firstNumber + secondNumber) * 25;
        System.out.println("totalValue = " + totalValue);
        double remainder = totalValue % 40;
        System.out.println(remainder);
        if (remainder <= 20)
            System.out.println("Total was over the limit");





    }
}
