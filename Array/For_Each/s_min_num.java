import java.util.Scanner;
class Smin
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int max,min;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		max = a[0];
		min = a[0];
		for(int i:a)
		{
			if(max<i)
			{
				max=i;
			}
		}
		for(int i:a)
		{
			if(min>i)
			{
				min=i;
			}
		}
		
		System.out.println("");
		
		for(int i :a)
		{
			if(min<i&&max>i)
			{
				max=i;
			}
			//System.out.println(smin);
		}
		System.out.println("Second min Element of the array "+max);
	}
}