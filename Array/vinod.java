import java.util.Scanner;
class Vinod
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		for(int i = 0;i<n;i++)
		{
			for(int j = i+1;j<n;j++)
			{
				if(a[i] == a[j])
				{
					for(int x = j;x<n;x++)
					{
						a[x] = a[j+1];
					}
					n--;
					j--;
				}
			}
		}
		System.out.println(" DELETE ");
		for(int i = 0; i<n; System.out.print(a[i]+" "),i++);
	}
}