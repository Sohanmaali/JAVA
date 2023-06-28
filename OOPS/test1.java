import java.util.Scanner; 

class DataClass
{
	// private static int feet,inch; 
	private static DataClass ob;
	//ob = new DataClass();
	private DataClass()
	{
		
	}
	
	public static DataClass getData()
	{
		if(ob==null)
			ob	= new DataClass(); 
		return ob;
	}
}

class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		DataClass  ob = DataClass.getData();
		DataClass  ob1 = DataClass.getData();
		
		System.out.println(ob.hashCode());
		System.out.println(ob1.hashCode());
	}
}