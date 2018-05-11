package edu.handong.csee.java.lab14.prob02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception { // Class In_exception
	private int x, y; // create private int member x and y
	
	public void exception() { // method that set the value, x and y, and print out the result of x divided from y
		try { // execute following command
			Scanner keyboard = new Scanner(System.in); // declare for using scanner
			
			System.out.print("x: "); // print out "x: "
			x = keyboard.nextInt(); // put the x's value
			System.out.print("y: "); // print out "y: "
			y = keyboard.nextInt(); // put the y's value
			System.out.println(x/y); // print out the value of x divided from y
		}
		catch (InputMismatchException e) { // if InputMismatchException happens during execute command in try, stop and
			System.out.println("java.util.InputMismatchException"); // print out "java.util.InputMismatchException"
		}
		catch (ArithmeticException e) { // if ArithmeticException happens during execute command in try, stop and
			System.out.println("java.lang.ArithmeticException: "+e.getMessage()); // print out "java.lang.ArithmeticException: " and message about error e
		}
	}
	
}
