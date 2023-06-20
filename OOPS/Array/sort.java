import java.util.Scanner; 

class DataClass
{
	private int a[];
	private int length;
	private int element;
	
	public void setData(int length,int element)
	{
		//DataClass ob = new DataClass();
		this.a = new int [length];
		this.element = element;
		this.takeElement();
	}
	public void takeElement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Element ");
		for(int i = 0;i<this.element;i++)
		{
			a[i] = sc.nextInt();
		}
	}
	public void printElement()
	{
		for(int i = 0;i<this.element;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void bubbleSort()
	{
		for(int i = 0;i<this.element-1;i++)
		{
			for(int j = 0;j<this.element-i-1;j++)
			{
				if(a[j]>this.a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public void selectionSort()
	{
		for(int i = 0;i<this.element;i++)
		{
			int pos =i;
			int min = this.a[i];
			for(int j = i+1;j<this.element;j++)
			{
				if(min>this.a[j])
				{
					pos=j;
					min = this.a[j];
				}
			}
			this.a[pos] = this.a[i];
			this.a[i] = min;
		}
		
	}
	public void insectionSort()
	{
		for(int i = 0;i<this.element;i++)
		{
			int min = this.a[i];
			for(int j=i;j>0&&min<this.a[j-1];j--)
			{
				this.a[j] = this.a[j-1];
				this.a[j-1] = min;
			}
		}
	}
}

class Sort
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int l = sc.nextInt();
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		ob.setData(l,n);
		
		System.out.println("your choice are");
		System.out.println("\t1 For Bubble Sort\n\t2 For Selection Sort\n\t3 For Insection sort");

		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				ob.printElement();
				ob.bubbleSort();
				System.out.println("\nSort Array using Bubble Sort = ");
				ob.printElement();
				break;
			 case 2:
				ob.printElement();
				ob.selectionSort();
				System.out.println("\nSort Array using Selection Sort = ");
				ob.printElement();
				break;
			case 3:
				ob.printElement();
				res = ob.insectionsort();
				System.out.println("\nSort Array using Insection Sort = ");
				ob.printElement();
		}
	}
}