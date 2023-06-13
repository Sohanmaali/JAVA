import java.util.Scanner; 

class Hcf
{

	public int hcf(int n,int m)
	{
		int ans;
		if(n==m)
		{
			return n;
		}
		else 
		{
			if(n>m)
			{
				ans=n-hcf(n-m,m);	
			}
			else
			{
				ans=m-hcf(n-m,m);
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		Hcf ob = new Hcf();
		
		System.out.println("Enter any num");
		int n = sc.nextInt();
		System.out.println("Enter any num");
		int m = sc.nextInt();
		
		System.out.println("Reverse of given number = "+ob.hcf(n,m));
	}
}