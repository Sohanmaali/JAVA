import java.util.Scanner;
class Hfactorial
{
	//not complide
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a[] = new double [100];
	
		double fact =1;
		a[0]=1;
		for(int i = 1; i<=100; i++)
		{
			a[0]*=i;
		}
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}