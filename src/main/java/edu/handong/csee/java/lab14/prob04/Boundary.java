package edu.handong.csee.java.lab14.prob04;

public class Boundary { // Class Boundary
	private int []arr = new int [5]; // create private int array member arr and allocate size of int*5
	private static int count = 0; // create private static int member count and initialize to 0
	
	public void putValue(int n) throws ArrayIndexOutOfBoundsException { // method that put the value and print out the information
		arr[count] = n; // put the n's value to arr[count]
		System.out.println("arr["+count+"] <- "+arr[count]); // print out information about arr[count]'s value
		count++; // count value increase 1
	}
	
}
