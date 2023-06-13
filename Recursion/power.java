import java.util.Scanner; 

class Power
{
	public int power(int n,int m)
	{
		int pow;
		if(m==1)
		{
			return n;
		}
		else
		{
			pow = n*power(n,m-1);
		}
		return pow;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		Power ob = new Power();
		
		System.out.println("Enter Base");
		int n = sc.nextInt();
		
		System.out.println("Enter Expond");
		int m = sc.nextInt();
		
		System.out.println("power of given number = "+ob.power(n,m));
	}
}