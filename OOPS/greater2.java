import java.util.Scanner;
class Largest
{
	private int n1,n2;
	
	public void setData(int n1,int n2)
	{
		
		this.n1=n1;
		this.n2=n2;
	}
	public void getData()
	{
		System.out.println("n1="+this.n1+" n2="+this.n2);
	}
	public int greater()
	{
		if (this.n1>this.n2)
		{	
			return n1;
		}
		else if(this.n2>this.n1) 
		{
			return n2;
		}
		else
		{	
			System.out.println("n1="+this.n1+" n2="+this.n2);
			return n2;
		}
		
			
	}
}
class Test
{
	public static void main(String srgs[])
	{
		Largest ob=new Largest();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		ob.setData(n1,n2);
		ob.getData();
		int res=ob.greater();
		System.out.println("Greater="+res);
	}

}