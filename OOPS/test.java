import java.util.Scanner; 

class DataClass
{
	private int feet;
	
	
	public void setData(int feet)
	{
		this.feet = feet++;
	}
	public int getData()
	{
		return this.feet;
	}
	
}

class Hight
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Feet And inch");
		int feet = sc.nextInt();
		ob.setData(feet);
		
		System.out.println(ob.getData());	
	}
} 