import java.util.Scanner; 
class Reverse 
{
	int num;
	public void setData(int num)	
	{
		this.num = num;
	}
	public int reverse()	
	{
		int rev = 0;
		for(;num>0;num/=10)
		{
			rev = rev*10+num%10;
		}
		System.out.println(" "+rev);
		return rev;    
	}
}    
class Palindrome extends Reverse
{
	public void palindrome()
	{
		int temp = this.num;
		if(temp == this.reverse())
		{
			System.out.println("Enter num is palindrome");
		}
		else
		{
			System.out.println("Enter num is not palindrome");
		}
	}
}
class Palin
{
	public static void main(String t[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();
		Palindrome ob = new Palindrome();
		ob.setData(n);
		ob.palindrome();
	}
}