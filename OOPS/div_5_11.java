import java.util.Scanner;
class Div
{
	private int n;
	public void setData(int n)
	{
		this.n=n;
	}
	public int getData()
	{
		return this.n;
	}
	public void isDivisible()
	{
		if(n<0)
		{
			System.out.println(" Invalid number");
		}
		
	   else if(n%5==0 && n%11==0)
		{ 
			System.out.println(n+"  is divisible by 5 and 11");
		}
		else 
		{ 
			System.out.println(n+ " is not divisible by 5 and 11");
		}
	}
}

class Test
{
	public static void main(String []arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int n = sc.nextInt();	
		Div ob =  new Div();
		ob.setData(n);
		ob.isDivisible();
	}
}