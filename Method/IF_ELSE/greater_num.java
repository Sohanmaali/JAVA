import java.util.Scanner; 

class Greater
{
	public void greater()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		if(num>num1)
		{
			System.out.println("First num "+num+" is greater");
		}
		else
		{
			System.out.println("Second num "+num1+"is greater");
		}
	}
	public static void main(String args[])
	{
		Greater ob = new Greater();
		ob.greater();
	}
}
