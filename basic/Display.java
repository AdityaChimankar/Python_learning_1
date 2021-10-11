package com.basic;

public class Display {

	public static void main(String[] args) {
		
		
		Point2D P1=new Point2D(10,20);
		
		P1.getDetails();

		boolean match=P1.isEqual();
		
		System.out.println(match);
		
		P1.createNewPoint(5,-2);
		
		P1.getDetails();

	}

}
