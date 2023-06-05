import java.util.Scanner;
class Slarg
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int max,slarg=0,min;
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
		slarg = min;
		for(int i:a)
		{
			if (i > slarg && i < max)
			{
				slarg = i;
			}
		}		
		System.out.println("Second largrst Element of the array " +slarg);
	}
}