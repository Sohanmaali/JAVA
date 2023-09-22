//Sum of Array
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
		int sum=0;
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	    for(int i=0;i<n;i++)
		sum =sum+a[i];
		System.out.print(sum);
	}
}