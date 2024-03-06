//After second value inculde 5
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Array Element");
		int a[] =new int[100];
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		System.out.print("Enter Array length:");
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int sum;
		for(i=2,sum=0;i<n;)
		{
			sum =5+a[i];
			System.out.println("sum="+sum);
			i=i+3;
		}
	}
}