import java.util.Scanner;
class Between
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		System.out.println("Array element between 150 & 250");
		
		for(int i:a)
		{
			if(i>150&&i<250)
			{
				System.out.println(i+" ");
			}
		}
	}
}