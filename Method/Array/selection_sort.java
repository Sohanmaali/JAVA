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
	}
	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		ob.selectionSort();
	}
}