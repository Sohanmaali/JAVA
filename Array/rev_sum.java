import java.util.Scanner;
class RevSum
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int j,i,x;
		System.out.println("Enter element of array");
		
		for( i = 0; i<n; a[i]= sc.nextInt(),b[i]=a[i],i++);
		
		for( i=0;i<n;c[i] = a[i]+b[i],i++)
		{
			b[i]=a[n-i-1];
		}
		
		System.out.println("New value of array");
		for( i = 0; i<n;System.out.println(a[i]+" + "+b[i]+" = "+c[i]),i++);
	}
}