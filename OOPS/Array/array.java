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
	public int minArray()
	{
		int min= this.a[0];
		for(int i=0;i<this.element;i++)
		{
			if(min>a[i])
			{
				min = this.a[i];
			}
		}
		return min;
	}
	public int maxArray()
	{
		int max=0;
		for(int i=0;i<this.element;i++)
		{
			if(max<a[i])
			{
				max = this.a[i];
			}
		}
		return max;
	}
	public int sMinArray()
	{
		int smin=this.maxArray();
		int min=this.minArray();
		for(int i=0;i<this.element;i++)
		{
			if(min<a[i]&&smin>a[i])
			{
				smin=a[i];
			}
		}
		return smin;
	}
	public int sMaxArray()
	{
		int smax=0,max=this.maxArray();
		for(int i=0;i<this.element;i++)
		{
			if(max>a[i]&&smax<a[i])
			{
				smax = this.a[i];
			}
		}
		return smax;
	}
	public void deleteDupArray()
	{
		for(int i=0;i<this.element;i++)
		{
			for (int j = i + 1; j<this.element; j++)
			{
				if (a[i] == a[j])
				{
					for(int k = j; k<this.element-1; k++)
					{
						a[k] = a[k+1];
					}
					this.element--;
					j--;
				}
			}
		}
	}
	public void reverseArray()
	{
		for(int i=0;i<this.element/2;i++)
		{
			int temp = a[i];
			a[i]=a[this.element-i-1];
			a[this.element-i-1]=temp;
		}
	}
	public void evenElement()
	{
		for(int i=0;i<this.element;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
		}
	}
	public void oddElement()
	{
		for(int i=0;i<this.element;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}
	}
}

class Array
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int res, l = sc.nextInt();
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int choice;
		ob.setData(l,n);
		
		System.out.println("your choice are");
		do
		{
			System.out.println("\t1 For min\n\t2 For Max\n\t3 For Second Min\n\t4 For Second Max");
			System.out.println("\t5 For Delete duplicate\n\t6 For Reverse of array\n\t7 For print even odd element of array\n\t8 For Exit");
	
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					ob.printElement();
					res = ob.minArray();
					System.out.println("\nMinimum element of array = "+res);
					break;
				case 2:
					ob.printElement();
					res = ob.maxArray();
					System.out.println("\nMaximum element of array = "+res);
					break;
				case 3:
					ob.printElement();
					res = ob.sMinArray();
					System.out.println("\nSecond Minimum element of array = "+res);
					break;
				case 4:
					ob.printElement();
					res = ob.sMaxArray();
					System.out.println("\nSecond Maximum element of array = "+res);
					break;
				case 5:
					System.out.println("\nActual Array element");
					ob.printElement();
					ob.deleteDupArray();
					System.out.println("\nAfter delete duplicate element");
					ob.printElement();
					break;
				case 6:
					System.out.println("\nActual Array element");
					ob.printElement();
					ob.reverseArray();
					System.out.println("\nAfter Reverse array");
					ob.printElement();
					break;
				case 7:
					System.out.println("\ta For even Element \n\t2 For Odd Element");
	
					choice = sc.nextInt();
					switch(choice)
					{
						case 1:
							ob.evenElement();
							break;
						case 2:
							ob.oddElement();
					}
					break;
			}
		}while(choice!=8);
	}
}