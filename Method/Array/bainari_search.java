import java.util.Scanner; 

class SelectionSort
{
	public void selectionSort()
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
		System.out.println("Enter element of array");
		int m = sc.nextInt();
		
		for(int i = 0; i<n;i++)
		{
			int max = a[i];
			int x = i;
			for(int j = i+1;j<n;j++)
			{
				if(max >a[j])
				{
					max=a[j];
					x=j;
				}
			}
			a[x] = a[i];
			a[i] = max;
		}
		for(int i = 0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		search(a,n,m);
	}
	public void search(int a[],int n,int m)
	{
		int mid, high=n,low=0;
		while(low<=high)
		{
			mid = (high+low)/2;
			if(a[mid]==m)
			{
				System.out.println("\nElement found in arrays index number "+mid);
				break;
			}
			else if(m<a[mid])
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
	}
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		ob.selectionSort();
	}
}