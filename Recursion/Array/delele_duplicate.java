
import java.util.Scanner;
class DeleteDupli
{
	int a[] = new int [20];
	int j=0;
	public void delete(int a[],int n)
	{
		if(n>=1)
		{
			delete(a,n-1);
			if(a[j]==a[n-1])
			{
				for(int i=0;i<n;i++)
				{
					a[j]=a[j-1];
				}
				j--;
				n--;
			}
		}
	}
	public void takeElement()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		j=n-1;
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		this.delete(a,n-1);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		DeleteDupli ob = new DeleteDupli();
		ob.takeElement();	
	}
}		
