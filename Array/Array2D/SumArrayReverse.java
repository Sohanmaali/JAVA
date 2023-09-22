//Reverse Array
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.println("Array Element");
		int a[] =new int[5];
		int a1[] =new int[5];
		int sum[]=new int[5];
		int i;
		for( i=0;i<n;i++)
		a[i]=sc.nextInt();
		System.out.println("Actual Array:");
		for(i=0;i<n;i++)
	        System.out.println("\ta["+i+"]="+a[i]);
		for(i=0;i<n;i++)
		 a1[i] = a[i];
		System.out.println("Reverse Array:");
	    for(i=0;i<n/2;i++)
		{
			int tem =a[i];
			a[i] = a[n-i-1];
			a[n-i-1]=tem;
		}
		for(i=0;i<n;i++)
		{
	      System.out.println("\ta["+i+"]="+a[i]);
		}
		 System.out.println("sum of reverse and actual array is");
		for(i=0;i<n;i++)
		{
			sum[i] = a1[i]+a[i];
		}
		for(i=0;i<n;i++)
		{
	      System.out.println("\ta["+i+"]="+sum[i]);
		}
	   
		
	}
}