
import java.util.Scanner;
class Minimum
{
	
	public int min(int a[],int n)
	{
		int min=a[n];
		if(n==1)
		{
			return a[0];
		}
		else 
		{
			min = this.min(a,n-1);
			if (min<a[n-1])
				return min;
			else
				return a[n-1];
		}
		
	}
	public void takeElement()
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [20];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("minimum element of array "+this.min(a,n));
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		Minimum ob = new Minimum();
		ob.takeElement();	
	}
}		
