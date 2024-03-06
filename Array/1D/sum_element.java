import java.util.Scanner;
class SumElement
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int sum=0;
		
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),sum+=a[i],i++);
		
		System.out.println("Sum of Array Elements = "+sum);
	}
}