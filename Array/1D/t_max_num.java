
//not complid
import java.util.Scanner;
class Tmax
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int max,tmin=0,min,smin;
		
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
		for(int i = 0;i<n;i++)
		{
			if(a[i]>min&&a[i]<max)
			{
				max=a[i];
			}
		}
		int smax = max;
		max=temp;
		System.out.println(max+" "+min);
		
		for(int i = 0;i<n;i++)
		{
			if(a[i]>smax&&a[i]<max)
			{
				max=a[i];
			}
		}
		System.out.println("Third min Element of the array "+max);
	}
}