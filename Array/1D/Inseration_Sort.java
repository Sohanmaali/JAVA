//program of insertion sort 
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		int temp=0,i,j;
		int a[]=new int[20];  
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("array elements are");
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			 temp=a[i];
			 
			for( j=i-1;j>=0&&a[j]>temp;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		 for( i=0;i<n;i++)
		 System.out.println("a["+i+"]="+a[i]);
	}
}