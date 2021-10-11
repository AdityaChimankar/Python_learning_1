package com.basic;

public class Point2D {
	
	private int x,y; //3:parameterized constructor to accept x & y co-ords.
	
	public Point2D(int a,int b)     //3.1:Create a parameterized constructor to accept x & y co-ords
	{
	x=a;
	y=b;
	}
	
	public void getDetails()     //3.2:getDetails()) --to return string form point's x & y co-ords
	{
	   System.out.println("x_value:"+x+" "+"y_value:"+y);
	}

	public boolean isEqual()  //3.3
	{
		
		if(x==y)
			return true;
		
		else 
			return false;
							
	}
	
	
	public void createNewPoint(int xOff,int yOff) //3.4
	{
		x=x+xOff;
		y=y+yOff;
		
		//System.out.println("x:"+x+" "+"y:"+y);
		
	}
	
	
		
}
