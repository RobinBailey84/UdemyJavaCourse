package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score >1000){
//            System.out.println("Your score was 5000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver == true){
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Player 2 scored " + finalScore);
        }

    }
}
