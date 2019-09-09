package JAVA_Assignment.JAVA_Assignment;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>2 ||args.length<2)
		{
			System.out.println("Invaid no.of aruments-supply two arguments");
			System.exit(0);
		}
		System.out.println(args[0]+""+args[1]);

	}

}
