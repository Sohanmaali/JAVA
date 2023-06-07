import java.util.Scanner; 

class Large
{
	public int max(int a[],int n)
	{
		int max =a[0];
		for(int i = 0; i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public int min(int a[],int n)
	{
		int min =a[0];
		for(int i = 0; i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	public int sMax(int a[],int n,Large ob)
	{
		int max =ob.max(a,n);
		int min = 0;
		for(int i = 0; i<n;i++)
		{
			if(min<a[i]&&a[i]<max)
			{
				min=a[i];
			}
		}
		return min;
	}
	public int sMin(int a[],int n,Large ob)
	{
		int max = max(a,n);
		int min = min(a,n);
		for(int i = 0; i<n;i++)
		{
			if(min<a[i]&&max>a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public void takeElement(Large k)
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [10];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Actual array Element are ");
		for(int i = 0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		k.choice(a,n,k);
	}
	public void choice(int a[],int n,Large ob)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t1 For max Value of Array\n\t2 For min value of Array\n\t3 For second max value of Array\n\t4 For second min value of Array");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				System.out.println("max Value = "+ob.max(a,n));
				break;
			case 2:
				System.out.println("max Value = "+ob.min(a,n));
			case 3:
				System.out.println("Smax Value = "+ob.sMax(a,n,ob));
				break;
			case 4:
				System.out.println("Smin Value = "+ob.sMin(a,n,ob));
				
		}
	}
	public static void main(String args[])
	{
		Large ob = new Large();
		ob.takeElement(ob);
	}
}