package JAVA_Assignment.JAVA_Assignment;

public class StaticAndNonStatic {
	
	static int  istatic;
	char ch;
	
	public StaticAndNonStatic(char choice)
	{
		istatic++;
		ch=choice;
	}
	
	public static void displaycount()
	{
		System.out.println("Static variable "+ istatic );
	}
	
	public void userchoice()
	{
		System.out.println("NonStatic variable "+ ch );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
