import java.util.Scanner;
class FreqencyArry
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		int b[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int count;
		System.out.println("Enter element of array");
		
		for(int i = 0; i<n; a[i]= sc.nextInt(),i++);
		
		for(int i=0;i<n;i++)
		{
			count=1;
			if(a[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=-1;
						count++;
					}
				}
			}
			b[i]=count;
		}
		System.out.println("repetetion of array element ");
		
		for(int i = 0; i<n;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]+" = "+b[i]);
			}
		}
		
	}
}