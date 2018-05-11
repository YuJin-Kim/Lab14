package edu.handong.csee.java.lab14.prob06;

public class Prob06 { // Class Prob06

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomID customID = new CustomID(); // create CustomID object customID
		
		do { // do following command
			try { // execute following command
				if (customID.getState() == 1 ) { // if customID's state value is 1
					customID.receiveName(); // execute method that set customID's name value
				}
				else if (customID.getState() == 2 ) { // if customID's state value is 2
					customID.receiveAge(); // execute method that set customID's age value
				}
				else if (customID.getState() == 3 ) { // if customID's state value is 3
					customID.receiveRace(); // execute method that set customID's race value
				}
			}
			catch (Exception e) { // if Exception happens during execute command in try, stop and
				System.out.println(e.getMessage()); // print out about error message e
				continue; // continue this loop
			}
		} while (customID.getState()!=0); // repeat this while do-while loop during customID's state value isn't 0
		
	}

}
