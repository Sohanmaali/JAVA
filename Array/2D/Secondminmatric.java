import java.util.Scanner;
class Array
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. colume");
		int c=sc.nextInt();
		System.out.println("Enter no. row");
		int r=sc.nextInt();
		int sec=0,min=0;
		int a[][]=new int[5][5];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				
				a[i][j]=sc.nextInt();
				 min=a[i][j];
				if(a[i][j]<min)
				{
					sec=min;
					min=a[i][j];
				}
				else if(a[i][j]>min&&sec>a[i][j])
				{
					sec=a[i][j];
				}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("   "+a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("Smallest no. in Element is:-"+min);
		System.out.println("Second Smallest no. in Element is:-"+sec);
	}
}