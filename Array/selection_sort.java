import java.util.Scanner;

class Short1
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[]= new int[20];
		
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int i,j;
		
		for( i=0;i<n;i++)
		{
			System.out.print("Enter "+(i+1) +" Element of array : ");
			a[i]= sc.nextInt();
		}
		int pos,min;
		for( i=0;i<n;i++)
		{
			min =a[i];
			pos=i;
			for( j = i+1; j<n; j++)
			{
				if(min>a[j])
				{
					min = a[j];
					pos = j;
				}
			}
			a[pos] = a[i];
			a[i] = min;
		}
		for( i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}