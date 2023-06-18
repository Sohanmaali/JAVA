import java.util.Scanner;
class Pattern
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public void triangle1()
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
	public void triangle2()
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}
	
	public void triangle3()
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<n; j++)
			{	
				System.out.print("  ");
			}	
			for(int k=i; k>=1; k--)
			{
				System.out.print(k+" ");
			}			
			System.out.println("");
		}
	}
	public void triangle4()
	{
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j<n; j++)
				System.out.print("  ");
			
			for(int k=i; k>=1; k--)
				System.out.print("* ");
			
			System.out.println("");
		}
	}
	
	
}
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		Pattern ob = new Pattern();
		ob.setData(n);
		//ob.triangle1();
		// ob.triangle2();
		// ob.triangle3();
		ob.triangle4();
	}
}