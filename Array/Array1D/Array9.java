//how time same value
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		int a[] =new int[n];
		System.out.print("Enter the element of the occur");
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
       // System.out.print("Array Element");
		//int b = sc.nextInt();
		int count=0,sam=a[0];
		for(int i=0;i<n;i++)
		{
			if(sam==a[i])
			{
				count++;
			}
		}
		System.out.println("count="+count);
		
	}
}
		