package edu.handong.csee.java.lab14.prob03;

public class Powercalc { // Class Powercalc

	public long power(int n, int p) throws Exception { // method that calculate the result of n to the pth value and this method throws Exception
		if (n < 0 || p < 0) { // if n or p less than 0
			throw new Exception ("java.lang.Exceptoin: n and p should not be negative."); // define Exception and their message
		}
		else if (n == 0 && p == 0) { // if n and p both are 0
			throw  new Exception ("java.lang.Exceptoin: n and p should not be zero."); // define Exception and their message
		}
		
		long power=1; // create long type variable power and initialize to 1
			
		power = (long)Math.pow(n,  p); // put the n to the pth long type value to power
		
		return power; // return the power value
	}
}
