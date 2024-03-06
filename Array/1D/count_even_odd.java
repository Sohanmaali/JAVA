import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int even=0,odd=0;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("even Element of Array "+even+"\n"+"Odd Element of Array "+odd);
	}
}