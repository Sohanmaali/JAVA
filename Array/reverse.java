import java.util.Scanner;
class Reverse
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int temp;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		System.out.print("\nActual Array Elements = ");
		for(int i = 0; i<n; System.out.print(a[i]+" "),i++);
		
		for(int i = 0; i<n/2;i++)
		{
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		System.out.print("\n\nReverse of Array's Elements = ");
		for(int i = 0; i<n; i++)
		System.out.print(a[i]+" ");
	}
}