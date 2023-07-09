
// Fectorial
import java.util.Scanner;
class Perent
{
	int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int fact()
	{
		int fact = 1,i;
		for( i=1,fact=1; i<=this.n;fact*=i,i++);
		return fact;
	}
}
class Fact extends Perent
{
	public int power(int n, int m)
	{
		int power = 1;
		this.setData(n);
		for(int i = 1;i<=m;power*=this.n,i++);
		return this.fact()+power;
	}
}		

class Factoriyal
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		Fact ob = new Fact();
		int n,m;
		System.out.println("Enter first num");
		n = sc.nextInt();
		System.out.println("Enter second num");
		m = sc.nextInt();
		//ob.setData(n);
		//System.out.println("Factorial = "+ob.fact());
		System.out.println("Power sum = "+ob.power(n,m));
		
	}
}		
