import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.print("Array Element");
		int a[] =new int[n];
		int i;
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(i =0;i<n;i++)
	    System.out.println("\ta["+i+"]="+a[i]);
		int min=a[0];
		for(i=1;i<n-1;i++)
		{
			if(a[i]>min)
			{
				min=a[i];
			}
		}
		System.out.println("second smaller value is :"+min);
	}
}