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
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println("");
		
		for(int i = 0;i<n;i++)
		{
			if(min<a[i]&&max>a[i])
			{
				max=a[i];
			}
			//System.out.println(smin);
		}
		System.out.println("Second min Element of the array "+max);
	}
}