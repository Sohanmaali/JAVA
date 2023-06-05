import java.util.Scanner;
class SearchElement
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		boolean flage = false;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; i++)
			a[i]= sc.nextInt();
		
		System.out.println("Enter element of array");
		int x = sc.nextInt();
		 
		for(int i=0;i<n;i++)
		{
			if(x==a[i])
				flage = true;
		}
		if(flage)
			System.out.println("Element found in Array");
		else
			System.out.println("Element Not found in Array");
	}
}