package edu.handong.csee.java.lab14.prob05;

import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner keyboard = new Scanner(System.in);
		
		try {
			str = keyboard.next();
			MyException myException = new MyException(str);
		}
		catch (MyException mae) {
			System.out.println("Inside catch block: " + str);
		}
		
	}
	
	public static void myTest(String str) {
		
	}

}
