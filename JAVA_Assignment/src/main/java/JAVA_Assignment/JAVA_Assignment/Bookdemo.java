package JAVA_Assignment.JAVA_Assignment;

public class Bookdemo {
	
	Books book[];
	
	Bookdemo()
	{
		book=new Books[12];
	}
	public void createbook()
	{
        book[0]=new Books();
		book[0].setname("ABCD-Literature");
		book[0].setprice(550);
		book[1]=new Books();
		book[1].setname("XYZ-Literature");
		book[1].setprice(1250);
	}
	
	public void showbook()
	{
		for(int i=0;i<book.length;i++)
		{
			if (i==2)
			{
				break;
			}
			System.out.println("Book name is :" + book[i].getname());
			System.out.println("Book price is :" + book[i].getprice());
		}
	}

	public static void main(String[] args) {
		
		Bookdemo test=new Bookdemo();
		test.createbook();	
		test.showbook();
		

	}

}
