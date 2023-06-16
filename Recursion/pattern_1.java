import java.util.Scanner; 

class Pattern
{
	int rev = 0;
	public void pattern(int n)
	{ 
		if(n>0)
		{
			System.out.print("* ");
			pattern(n-1);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		Pattern ob = new Pattern();
		
		System.out.println("Enter any num");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
			ob.pattern(i);
			System.out.println("");
		}
	}
}