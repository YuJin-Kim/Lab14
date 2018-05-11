package edu.handong.csee.java.lab14.prob01;

public class SpeedLimiter { // Class SpeedLimter
	private int speed = 0; // create private int type member speed and initialize to 0
	private int limit = 0; // create private int type member limit and initialize to 0
	
	public SpeedLimiter(int limit, int speed) { // SpeedLimiter constructor
		this.limit = limit; // limit put to this SpeedLimiter member limit
		this.speed = speed; // speed put to this SpeedLimiter member speed
	}
	
	public void warnSpeedLimit() { // method that handles Exception which is defined own
		try { // execute following command
			if ( speed > limit ) { // if speed larger than limit
				throw new Exception ("Speed Limit " + limit + "km exceeded!\nYou are being fined."); // define Exception and their message
			}
			System.out.println("You are a law abiding citizen!"); // print out "You are a law abiding citizen!"
		}
		catch(Exception e) { // if Exception happens during execute command in try, stop and
			System.out.println(e.getMessage()); // print out about error message e
		}
		System.out.println("Your current speed: "+speed); // print out "Your current speed: " and speed value
	}
	
}
