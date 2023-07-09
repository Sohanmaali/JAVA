// Fectorial
import java.util.Scanner;
class Power
{
	int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int square()
	{
		return this.n*this.n;
	}
}
class cube extends Power
{
	public int cube(int n)
	{
		this.setData(n);
		return (this.square()*this.n);
	}
	public int sum(int n)
	{
		this.setData(n);
		return this.square()+this.cube(n);
	}
}

class Sum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		cube ob = new cube();
		int n;
		System.out.println("Enter first num");
		n = sc.nextInt();
		ob.setData(n);
		//System.out.println("Square = "+ob.fact());
		System.out.println("Square = "+ob.square());
		System.out.println("cube = "+ob.cube(n));
		System.out.println("Power sum = "+ob.sum(n));	
	}
}