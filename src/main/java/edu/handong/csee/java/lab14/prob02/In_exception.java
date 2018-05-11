package edu.handong.csee.java.lab14.prob02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class In_exception {
	private int x, y;
	
	public void exception() {
		try {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			System.out.println(x/y);
		}
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: "+e.getMessage());
		}
	}
	
}
