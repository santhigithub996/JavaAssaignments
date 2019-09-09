package JAVA_Assignment.JAVA_Assignment;

public class Arrayclass {
	
	int intarr[];
	
	public Arrayclass()
	{
		intarr=new int[12];
	}
	public void arrayvalues()
	{
		for( int i=0;i<intarr.length;i++)
		{
			intarr[i]=i+1;
		}
	}
	public void arraydisplay()
	{
		for( int i=0;i<intarr.length;i++)
		{
			System.out.println("array of indexvalue array[i] is :"+ intarr[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
