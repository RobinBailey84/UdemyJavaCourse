package com.RobinBailey;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);


        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);


        int score1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Robin", score1);
        int score2 = calculateHighScorePosition(900);
        displayHighScorePosition("Arran", score2);
        int score3 = calculateHighScorePosition(400);
        displayHighScorePosition("Tom", score3);
        int score4 = calculateHighScorePosition(50);
        displayHighScorePosition("Jen", score4);
        int score5 = calculateHighScorePosition(1000);
        displayHighScorePosition("Andy", score5);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;

        if(playerScore >= 1000){
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100);{
            position = 3;
        }
        return position;
    }
}
