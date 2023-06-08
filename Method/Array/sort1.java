import java.util.Scanner; 

class Sort
{
	public void bubbleSort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order of Array element using Bubble sort");
		for(int i =0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void selectionSort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int min =a[i];
			int pos =i;
			for(int j=i+1;j<n;j++)
			{
				if(min>a[j])
				{
					min=a[j];
					pos =j;
				}
			}
			a[pos] = a[i];
			a[i]=min;
		}
		System.out.println("Ascending Order of Array element using Selectio sort");
		for(int i =0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void insetionsort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int min =a[i];
			for(int j=i;j>0&&min<a[j-1];j--)
			{
				a[j]=a[j-1];
				a[j-1]=min;
			}
		}
		System.out.println("Ascending Order of Array element using Insetion sort");
		for(int i =0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
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
		choice(a,n);
	}
	public void choice(int a[],int n)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("\n\t1 For bubble Sort\n\t2 For selection Sort\n\t3 For Insetion sort");
		int choice = sc.nextInt();
		switch (choice)
		{
			case 1:
				bubbleSort(a,n);
				break;
			case 2:
				selectionSort(a,n);
			case 3 :
				insetionsort(a,n);
				break;			
		}
	}
	public static void main(String args[])
	{
		Sort ob = new Sort();
		ob.takeElement();
	}
} 