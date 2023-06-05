import java.util.Scanner;
class DeletDuplicate
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int j,i,x;
		
		System.out.println("Enter element of array");
		
		for( i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		for(i=0,x=0;i<n;i++)
		{
			if (a[i] != -1)
			{
				for (j = i + 1; j < n; j++)
				{
					if (a[i] == a[j])
					{
						a[j] = -1;
					}
				}
				a[x] = a[i];
				x++;
			}
		}
		
		System.out.println("New value of array");
		for( i = 0; i<x;System.out.println(i+" "+a[i]),i++);
	}
}