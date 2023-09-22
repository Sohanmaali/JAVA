import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.println("Array Element");
		int a[] =new int[n];
		int i,sum=0;
		System.out.println("Actual Array:");
		for( i=0;i<n;i++)
		{
	     a[i]=sc.nextInt();
		System.out.println("\ta["+i+"]="+a[i]+"\n");
		}
	    for(i=0;i<n/2;i++)
		{
			int tem =a[i];
			a[i] = a[n-i-1];
			a[n-i-1]=tem;
		}
			for(i=0;i<n;i++)
	        System.out.println("\ta["+i+"]="+a[i]);
	   
		
	}
}