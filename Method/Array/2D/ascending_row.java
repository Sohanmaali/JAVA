import java.util.Scanner;
class AscengingOrder
{
	public static void main(String []args)
	{
		AscengingOrder ob = new SumElement();
		ob.takeElement();
	}
	public void takeElement()
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int [10][10];
		
		System.out.println("Enter size of rew");
		int n = sc.nextInt();
		
		System.out.println("Enter size of colo ");
		int m = sc.nextInt();
		
		System.out.println("Enter element of Matrix");
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j<m;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		choice(a,n,m);
	}
	public void rowascending(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j = 0;j = n;j++)
			{
				for(int k = j;k<m;k++)
				{
					
				}
			}
		}
	}
	public void choice(int a[],int n)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t1 For Row Ascending Order\n\t2 For Colom Ascending Order\n\t3 For Row Ascending colom Discending
		\n\t4 For colom Ascenging row Discending");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				rowascending(a,n,m);
				break;
			case 2:
				selectionSort(a,n,m);
			case 3 :
				insetionsort(a,n,m);
				break;			
		}
	}
	
}