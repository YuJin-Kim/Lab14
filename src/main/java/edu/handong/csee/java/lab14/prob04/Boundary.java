package edu.handong.csee.java.lab14.prob04;

public class Boundary {
	private int []arr = new int [5];
	private static int count = 0;
	
	public void putValue(int n) throws ArrayIndexOutOfBoundsException {
		arr[count] = n;
		System.out.println("arr["+count+"] <- "+arr[count]);
		count++;
	}
	
}
