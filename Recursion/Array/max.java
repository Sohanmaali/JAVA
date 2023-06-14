
import java.util.Scanner;
class maximum
{
	public int max(int a[],int n)
	{
		int max=0;
		if(n==0)
		{
			return max;
		}
		else 
		{
			max = this.max(a,n-1);
			if (max>a[n-1])
				return max;
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
		System.out.println("maximum element of array "+this.max(a,n-1));
	}
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		maximum ob = new maximum();
		ob.takeElement();	
	}
}		
