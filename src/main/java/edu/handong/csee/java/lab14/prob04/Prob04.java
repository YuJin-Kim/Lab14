package edu.handong.csee.java.lab14.prob04;

import java.util.Scanner;

public class Prob04 { // Class Prob04

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n; // create int type variable n
		Boundary boundary = new Boundary(); // create Boundary type object boundary
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		try { // execute following command
			while ( true ) { // while true(repeat infinitely)
				System.out.print("Enter an interger: "); // print out "Enter an interger: "
				n = keyboard.nextInt(); // put the n's value
				boundary.putValue(n); // execute the method that put the value and print out the information
			}
		}
		catch (ArrayIndexOutOfBoundsException e) { // // if ArrayIndexOutOfBoundsException happens during execute command in try, stop and
			System.out.println("Invalid array index access!"); // print out "Invalid array index access!"
		}
		
	}

}
