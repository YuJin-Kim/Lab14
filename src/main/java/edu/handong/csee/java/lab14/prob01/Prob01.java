package edu.handong.csee.java.lab14.prob01;

import java.util.Scanner;
import java.util.Random;

public class Prob01 { // Class Prob01

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 0, speed = 0; // create int type variable limit and speed, and initialize to 0
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		Random random = new Random(); // declare for using random
		
		System.out.print("Set the speed limit, officer: "); // print out "Set the speed limit, officer"
		limit = keyboard.nextInt(); // put the limit's value
		speed = random.nextInt(101); // put the speed value which is a randomly generated number from 0 to 100
		
		SpeedLimiter speedLimiter = new SpeedLimiter(limit, speed); // create SpeedLimiter type object speedLimiter
		
		speedLimiter.warnSpeedLimit(); // execute the method that print out error message when errors happened
	}

}
