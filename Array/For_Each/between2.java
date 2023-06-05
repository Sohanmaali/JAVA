import java.util.Scanner;
class Between2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		System.out.println("Array element less then 100");
		
		for(int i:a)
		{
			if(i<100)
			{
				System.out.println(i +" ");
			}
		}
	}
}