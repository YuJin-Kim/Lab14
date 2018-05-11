package edu.handong.csee.java.lab14.prob06;

import java.util.Scanner;

public class CustomID { // Class CustomID
	private String name; // create private String type member name
	private int age; // create private int type member age
	private String race; // create private String type member race
	private int state = 1; // create private int type member state and initialize to 1
	
	public void receiveName() throws Exception { // method that set customID's name value and this method throws Exception
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.print("Enter your name: "); // print out "Enter your name: "
		name = keyboard.nextLine(); // put the name's value
		
		if (name.length() < 5) { // if name's length less than 5
			state = 1; // put 1 to state
			throw new Exception ("Your name is short! Try again!"); // define Exception and their message
		}
		
		System.out.println("Name is valid"); // print out "Name is valid"
		System.out.println("Name: "+name); // print out "Name: " and name value
		state = 2; // put 2 to state
	}
	
	public void receiveAge() throws Exception { // method that set customID's age value and this method throws Exception
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.print("Enter your age: "); // print out "Enter your age: "
		age = keyboard.nextInt(); // put the age's value
		
		if (age < 18) { // if age less than 18
			state = 2; // put 2 to state
			throw new Exception ("You are too young! Try again!"); // define Exception and their message
		}
		
		System.out.println("Age is valid"); // print out "Age is valid"
		System.out.println("Age: "+age); // print out "Age: " and age value
		
		state =3; // put 3 to state
	}
	
	public void receiveRace() throws Exception { // method that set customID's race value and this method throws Exception
		Scanner keyboard = new Scanner(System.in); // declare for using scanner
		
		System.out.print("Enter your race: "); // print out "Enter your race: "
		race = keyboard.nextLine(); // put the race's value
		
		if (!race.equals("Vulcans") &&!race.equals("Romulan") && !race.equals("Klingons")) { // if race is not equal to "Vulcans", "Romulan", and "Klingons"
			state = 3; // put 3 to state
			throw new Exception ("Human! Try again."); // define Exception and their message
		}
		
		System.out.println("Race is valid"); // print out "Race is valid"
		System.out.println("Race: "+race); // print out "Race: " and race value
		
		state = 0; // put 0 to state
	}
	
	public int getState() { // method for getting current state's value
		return state; // return the state's value
	}
	
}
