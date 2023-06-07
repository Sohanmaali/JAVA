import java.util.Scanner;
class Pascal
{
	// not complide
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int l=n-1,k=1,x=1;
		/* for(int i=0;i<n;i++)
		{
			a[n-i]=1;
			for(int j=0;j<=n;j++)
			{
				if(j>=n-i&&j<=n)
				{
					
					System.out.print(a[j]+" ");
					a[j]*=(i-j)/(j+1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		} */
		/* for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		} */
		
		for(int i=1;i<=(n<<1);i++)
		{
			for(int j=1;j<=(n<<1);j++)
			{
				if(((i<=n)&&(j>n-i+1&&j<=(n<<1)-l))||((i>n)&&(j>k+1&&j<=(n<<1)-x)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			l--;
			if(i>n)
			{
				k++;
				x++;
			}
			System.out.println("");
		}
	}
}