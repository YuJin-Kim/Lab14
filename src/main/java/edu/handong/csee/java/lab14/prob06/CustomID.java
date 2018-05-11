package edu.handong.csee.java.lab14.prob06;

import java.util.Scanner;

public class CustomID {
	private String name;
	private int age;
	private String race;
	
	public void getName() throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = keyboard.next();
	}
	
	public void getAge() throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
	}
	
	public void getRace() throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter your race: ");
		race = keyboard.next();
	}
	
}
