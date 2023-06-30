import java.util.Scanner; 

class DataClass
{
	private static DataClass ob = new DataClass();
	private DataClass()
	{
		System.out.println("hello Sohan");
	}
	
	public static DataClass getInstance()
	{
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