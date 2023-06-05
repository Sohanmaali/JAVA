import java.util.Scanner;
class Pascal
{
	// not complide
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i]*=(i-j)/(j+1);
			}
		}
	}
}