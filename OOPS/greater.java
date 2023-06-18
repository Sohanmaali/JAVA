//uncomplet
import java.util.Scanner;
class Greater
{
	private int num,num2,num3;
	
	public void setData(int n)
	{
		this.num = n1;
		this.num = n2;
		this.num = n3;
	}
	// public int getData()
	// {
		// return this.num;
	// }
	checkMax()
	{
		if(n1==n2 && n2==n3)
			System.out.println("all numbe are equal");
		
		else if(n1==n2 || n1==n3 || n2==n3)
			System.out.println("two numbe rare equal");
		
		else if(this.n1>this.n2 && this.n1>this.n3)
			return n1;
		else if(this.n2>this.n1 && this.n2>this.n3)
			return n2;
		else if(this.n3>this.n1 && this.n3>this.n2)
			return n3;		
	return 0;
	}	
}
class Test
{
	public static void main(string []args)
	{
		Greater ob = new Greater();
		System.out.println("Enter 3 number ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		ob.setDat(n1,n2,n3);
		
	}
}