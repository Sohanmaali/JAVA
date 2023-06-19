//uncomplet
import java.util.Scanner;
class DataClass
{
	private int n1,n2,n3;
	
	public void setData(int n1,int n2,int n3)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public void checkMax()
	{
		if(this.n1==this.n2 && this.n2==this.n3)
			System.out.println("all number are equal");
		else if(this.n1==this.n2 || this.n1==this.n3 || this.n2==this.n3)
			System.out.println("two number are equal");
		else if(this.n1>this.n2 && this.n1>this.n3)
			System.out.println("Number 1 is Greater...........");
		else if(this.n2>this.n3)
			System.out.println("Number 2 is Greater...........");
		else 
			System.out.println("Number 3 is Greater...........");
	}	
}
class Greater
{
	public static void main(String []args)
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		ob.setData(n1,n2,n3);
		ob.checkMax();
	}
}                