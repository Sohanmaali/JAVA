import java.util.Scanner; 

class Test
{
	public int add(int x,int y)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Adition = "+(x+y));
		return x+y;
		/* 
		System.out.println("Do you want to parform more operation");
		char ch = sc.next().charAt(0);
		if(ch=='y') this.sub(x,y);
		*/
	}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction = "+(a-b));
	}
	public static void main(String args[])
	{
		Test ob = new Test();
		//int x=0;
		int x = ob.add(4,3);
		System.out.println("Addition = "+x);
	}
}