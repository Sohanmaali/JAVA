import java.util.Scanner; 

class Equal
{
	public void equal()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		
		if(num==num1)
		{
			System.out.println("Both are Equal);
		}
		else if(num>num1)
		{
			System.out.println("num first is greater");
		}
		else
		{
			System.out.println("num second is greater");
		}
	}
	public static void main(String args[])
	{
		Equal ob = new Equal();
		ob.equal();
	}
}
