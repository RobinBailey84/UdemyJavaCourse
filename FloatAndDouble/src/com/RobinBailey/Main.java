package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int myIntValue = 5 / 3;
	    //width of float =32
	    float myFloatValue = 5f / 3f;
	    //width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double numberOfKilogramsPerPound = 0.45359237d * numberOfPounds;
        System.out.println(numberOfKilogramsPerPound);
    }
}
