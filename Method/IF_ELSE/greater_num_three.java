import java.util.Scanner; 

class GreaterThree
{
	public void greater()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num>num1)
		{
			if(num>num2)
			System.out.println("First num "+num+" is greater");
			else
			{
				System.out.println("third num "+num2+" is greater");
			}
		}
		else if(num1>num2)
		{
			System.out.println("Second num "+num1+" is greater");
		}
		else
		{
			System.out.println("third num "+num2+" is greater");
		}
	}
	public static void main(String args[])
	{
		GreaterThree ob = new GreaterThree();
		ob.greater();
	}
}
