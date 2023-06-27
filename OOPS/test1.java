import java.util.Scanner; 

class DataClass
{
	int feet; 
	
	private DataClass()
	{
		this.feet = 25;
	}
	static DataClass ob = new DataClass();
	
	public static DataClass getData()
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
		System.out.println(ob.feet);	
	}
} 