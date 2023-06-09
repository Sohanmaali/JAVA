import java.util.Scanner; 

class First
{
	public int first(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return n*first(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		First ob = new First();
		System.out.println(ob.first(5));
	}
}0