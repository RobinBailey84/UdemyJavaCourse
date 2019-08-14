package com.company;

public class Main {

    public static void main(String[] args) {

        //data type is important as each one uses up a certain amount of memory space

        //Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;
        int myTotal = myMinValue / 2;
        System.out.println("my total = " + myTotal);

        // Byte has a width of 8
        byte myByteValue = 10;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("my new byte value = " + myNewByteValue);

        // Short has a width of 16
        short myShortValue = 32767;

        //long has a width of 64
        long myLongValue = 100L;

        long totalValues = 50000 + 10 * ( myByteValue + myShortValue + myMaxValue);
        System.out.println("Total Value " + totalValues);
    }
}
