package edu.handong.csee.java.lab14.prob03;

import java.util.Scanner;

public class Prob03 { // Class Prob03

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, p; // create int type variable n and p
		Powercalc my_calculator = new Powercalc(); // create Powercalc type object my_calculator
		Scanner keyboard = new Scanner(System.in); // declare for using Scanner
		
		n = keyboard.nextInt(); // put the n's value
		p = keyboard.nextInt(); // put the p's value
		
		try { // execute following command
			System.out.println(my_calculator.power(n, p)); // print out the value, n to the pth
		}
		catch (Exception e) { // if Exception happens during execute command in try, stop and
			System.out.println(e); // print out about error message e
		}
	}

}
