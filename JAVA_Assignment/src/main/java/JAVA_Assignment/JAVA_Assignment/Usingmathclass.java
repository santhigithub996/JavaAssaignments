package JAVA_Assignment.JAVA_Assignment;

import java.util.Random;

public class Usingmathclass {
	

	public static void main(String[] args) {
		
		//using if-else
		
		for(int i=0 ; i<=1;i++)
		{	
			if(Math.random()>0.5)
			    {
				System.out.println("The value is less than 0.5");
				}
				else if(Math.random()>=0.5)
				{
					System.out.println("The value is greater than 0.5");
				}			    
			}			
		
		//using ternary operator
		for(int i=0;i<=1;i++)
		{
			double num=Math.random();
			
			String num1=(num<0.5) ? "Value is lessthan 0.5": "Value is greater than 0.5" ;
			System.out.println(num1);
			
		}
		
	}
}

	
