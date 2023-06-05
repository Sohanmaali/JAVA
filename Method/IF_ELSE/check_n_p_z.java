import java.util.Scanner; 

class NpZ
{
	public void negPos()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int num = sc.nextInt();
		
		if(num<0)
		{
			System.out.println("Enter num is negative ");
		}
		else if(num>0)
		{
			System.out.println("Enter num is Positive ");
		}
		else
		{
			System.out.println("Enter num is Zero");
		}
	}
	public static void main(String args[])
	{
		NpZ ob = new NpZ();
		ob.negPos();
	}
}
