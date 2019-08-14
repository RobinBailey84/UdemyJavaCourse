package com.RobinBailey;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Robin";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//		int damage2 = 11;
//		player.health = 200;
//		player.loseHealth(damage2);
//		System.out.println("Remaining health = " + player.healthRemaining());
		EnhancedPlayer player = new EnhancedPlayer("Robin", 200, "Sword");
		System.out.println("initial health is " + player.getHealth());

    }
}
