import java.util.Scanner;
class Maximam
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int max;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		max = a[0];
		
		for(int i:a)
		{
			if(max<i)
			{
				max=i;
			}
		}
		System.out.println("maximam Element of the array "+max);
	}
}