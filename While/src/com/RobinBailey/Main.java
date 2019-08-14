package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
////        while (count != 5) {
////            System.out.println("Count value us " + count);
////            count++;
////        }
////
////        while (true) {
////            if (count == 5) {
////                break;
////            }
////            System.out.println("Count value is " + count);
////            count++;
////        }
//
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//        }
//      while(count != 6);
        int evenNumbers = 0;
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

            evenNumbers++;
            if (evenNumbers >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbers);

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        //125 -> 125 / 10 = 12 12 * 10 = 120 125-120 = 5
        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;
            //drop the least significant digit
            number /= 10;
        }
        return sum;
    }
}
