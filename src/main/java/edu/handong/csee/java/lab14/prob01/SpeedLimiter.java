package edu.handong.csee.java.lab14.prob01;

public class SpeedLimiter {
	private int speed = 0;
	private int limit = 0;
	
	public SpeedLimiter(int limit, int speed) {
		this.limit = limit;
		this.speed = speed;
	}
	
	public void warnSpeedLimit() {
		try {
			if ( speed > limit ) {
				throw new Exception ("Speed Limit " + limit + "km exceeded!\nYou are being fined.");
			}
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Your current speed: "+speed);
	}
	
}
