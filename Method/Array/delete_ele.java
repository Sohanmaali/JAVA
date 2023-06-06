import java.util.Scanner; 

class DeleteEle
{
	public void deleteEle()
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
		int x,i;
		for(i = 0,x=0;i<n;i++)
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
		System.out.println("Element of Array");
		for(i = 0; i<x;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String args[])
	{
		DeleteEle ob = new DeleteEle();
		ob.deleteEle();
	}
}