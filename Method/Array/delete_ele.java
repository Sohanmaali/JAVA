import java.util.Scanner; 

class DeleteEle
{
	public void takeElement()
	{
		Scanner sc = new Scanner (System.in);
		int a[] = new int [10];
		
		System.out.println("How many element you want to eneter");
		int n = sc.nextInt();
		
		System.out.println("Enter element of array");
		for(int i = 0; i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Actual array Element are ");
		for(int i = 0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		deleteEle(a,n);
	}
	public void deleteEle(int a[],int n)
	{
		int x=0;
		for(int i = 0;i<n;i++)
		{
			if(a[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j] = -1;
					}
				}
				a[x]=a[i];
				x++;
			}
		}
		System.out.println("\nAfter delete duplicate element");
		for(int i = 0; i<x;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		DeleteEle ob = new DeleteEle();
		ob.takeElement();
	}
}