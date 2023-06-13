import java.util.Scanner; 

class Reverse
{
	int rev = 0;
	public int reverse(int n)
	{
		if(n>0)
		{
			rev = (rev*10)+(n%10);
			reverse(n/10);
		}
		return rev;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		Reverse ob = new Reverse();
		
		System.out.println("Enter any num");
		int n = sc.nextInt();
		
		System.out.println("Reverse of given number = "+ob.reverse(n));
	}
}