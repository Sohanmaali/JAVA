//Even Odd 
import java.util.Scanner;
class DataClass
{
	private int n;
	
	public void setData(int n)
	{
		this.n = n;
	}
	public void checEvenOdd()
	{
		//logic
		if(this.n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd number");
		}	
	}
}
class EvenOdd
{
	public void getInput()
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		System.out.println("Enter a num");
		int n = sc.nextInt();
		ob.setData(n);
		ob.checEvenOdd();
	}
	
	public static void main(String []args)
	{	
		EvenOdd ob = new EvenOdd();
		ob.getInput();
	}
}
