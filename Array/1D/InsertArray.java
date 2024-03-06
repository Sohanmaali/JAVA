//how many number less than 100
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] =new int[10];
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.print("Array Element");
		int i;
    		for(i=0;i<n;i++)
		{
		 a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		System.out.print("Enter the Index:");
		int index = sc.nextInt();
		System.out.print("Enter element:");
		int value = sc.nextInt();
		for(i=n;i>=index;i++)
		{
			a[i+1]=a[i];
			if(index==i)
			{
				a[i]=value;
			}
		}
		System.out.print(" After Index:");
		for(i=0;i<=n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		
		
		
	}
}