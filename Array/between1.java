import java.util.Scanner;
class Between1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		System.out.println("Array element greater then 200");
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>200)
			{
				System.out.println(a[i]);
			}
		}
	}
}