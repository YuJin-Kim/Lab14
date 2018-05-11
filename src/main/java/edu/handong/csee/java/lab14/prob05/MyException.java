package edu.handong.csee.java.lab14.prob05;

public class MyException extends Exception { // MyException class inherits Exception class
	private String str;
	
	public MyException() {
		super();
	}
	
	public MyException(String str) {
		super(str);
		this.str = str;
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}
	
	public String toString() {
		return str;
	}
	
}
