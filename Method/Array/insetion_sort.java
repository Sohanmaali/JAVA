import java.util.Scanner; 

class Insetion_sort
{
	public void insetion_sort()
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [10];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
			int min =a[i];
			for(int j=i;(j>0&&min<a[j-1]);j--)
			{
				a[j]=a[j-1];
				a[j-1] = min;
			}
		}
		
		for(int i = 0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Insetion_sort ob = new Insetion_sort();
		ob.insetion_sort();
	}
}