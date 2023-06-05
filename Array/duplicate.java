import java.util.Scanner;
class Duplicate
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		System.out.println("Enter element of array ");
		//for(int i=0;i<a.length;a[i] = sc.nextInt(),i++);
		int n=5;
		int roll;
		int roll1[] = new int [5];
		int x=0;
		for(int i=0;i<n;i++)
		{
			
			do
			{
				System.out.println("Enter roll number ");
				roll = sc.nextInt();
				roll1[i]=roll;
				 x=0;
				for(int j = 0;j<i;j++)
				{
					if(roll==roll1[j])
					{
						System.out.println("Duplicate Element");
						x=1;
					}
				}				
			}while(x==1);
		}
	}
}