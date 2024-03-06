import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array length:");
		int n = sc.nextInt();
		int a[] =new int[10];
		System.out.print("Enter the element ");
		int i,j,num=0,temp=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			for(j=0;j<n;j++)
			{
				if(j>0)
				{
					if(a[j-1]>a[j])
					{
						a[i]= a[j-1];
						a[j-1] =a[j];
						a[j] = a[i];
					}
				}
			}
			
		}
		System.out.println("After swaping");
		for(i=0;i<n;i++)
		{
		  System.out.println(a[i]); 		 
		}

	}
}