package edu.handong.csee.java.lab14.prob05;

import java.util.Scanner;

public class Prob05 { // Class Prob05

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str; // create String type variable str
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		try { // execute following command
			str = keyboard.nextLine(); // put the str's value
			Prob05.myTest(str); // execute the method that consider str equals "null"
			System.out.println("String val is Hello, mate"); // print out "String val is Hello, mate"
		}
		catch(MyException e) { // if MyException happens during execute command in try, stop and
			System.out.println("Inside catch block: "+e); // print out "Inside catch block" and the e value
		}
		
	}
	
	public static void myTest(String str) throws MyException { // method that consider str equals "null"
		if (str.equals("null")) { // if str equals null
			throw new MyException("String val is null"); // define MyException and their message
		}
	}

}
