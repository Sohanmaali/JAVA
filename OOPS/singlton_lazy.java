import java.util.Scanner; 

class DataClass
{
	private static DataClass ob = null;
	private DataClass()
	{
		System.out.println("hello Sohan");
	}
	
	public static   synchroni DataClass getData()
	{
		if(ob == null)
		{
			ob = new DataClass()
		}
		return ob;
	}
}

class Lazy
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