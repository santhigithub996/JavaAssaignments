package JAVA_Assignment.JAVA_Assignment;

public class GetterAndSetterMethods {
	
	int subject1, subject2, subject3;
	
	public GetterAndSetterMethods(int subject1, int subject2, int subject3)
	{
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
	public int getmethod1()
	{
		return this.subject1;	
	}
	public int getmethod2()
	{
		return this.subject2;	
	}
	public int getmethod3()
	{
		return this.subject3;	
	}
	
	public void getresults()
	{	
		int average =(int) ((subject1+subject2+subject3)/3.0);
		if (average>=85 && average<=100)
		    System.out.print("The grade of student is: A");
		else if( average>=73 && average<=79)
			System.out.print("The grade of student is: B+");		
		else if( average>=65 && average<=72)
			System.out.print("The grade of student is: B");
		else if( average>=55 && average<=64)
			System.out.print("The grade of student is: C");
		else if ( average>0 && average<=54)
			System.out.print("The grade of student is: D");
	
		}
	}
	
