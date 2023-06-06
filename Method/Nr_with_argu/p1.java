import java.util.Scanner; 

class Test
{
	public int add(int x,int y)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Adition = "+(x+y));
		return x+y;
	}
	public int sub(int x,int y)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Subtraction = "+(x+y));
		return x-y;
	}
	public int multi(int x,int y)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("multiplaction = "+(x+y));
		return x*y;
	}
	public static void main(String args[])
	{
		Test ob = new Test();
		do
		{
			switch ()
			{
				case 1:
				switch ()
				{
					
				}
			}
		}
		int x = ob.add(4,3);
		System.out.println("Addition = "+x);
	}
}