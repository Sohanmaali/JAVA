import java.util.Scanner;
class Minimam
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int min;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		min = a[0];
		
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimam Element of the array "+min);
	}
}