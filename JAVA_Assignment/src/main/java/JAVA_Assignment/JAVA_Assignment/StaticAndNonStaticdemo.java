package JAVA_Assignment.JAVA_Assignment;

public class StaticAndNonStaticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating object");
		StaticAndNonStatic.displaycount();
		
		System.out.println("After creating object");
		StaticAndNonStatic test=new StaticAndNonStatic('A');
		
		test.userchoice();
		test.displaycount();
		
	}

}
