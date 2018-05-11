package edu.handong.csee.java.lab14.prob03;

public class Powercalc {

	public long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception ("java.lang.Exceptoin: n and p should not be negative.");
		}
		else if (n == 0 && p == 0) {
			throw  new Exception ("java.lang.Exceptoin: n and p should not be zero.");
		}
		
		long power=1;
			
		power = (long)Math.pow(n,  p);	
		
		return power;
	}
}
