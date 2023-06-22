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
	public void printElement1()
	{
		for(int i = 0;i<=this.element;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public void insertElement(int index,int value)
	{
		for(int i = this.element;i>=index;i--)
		{
			this.a[i+1]=this.a[i];
			if(index==i)
			{
				this.a[index] = value;
			}
		}
	}
	public int sumElement()
	{
		int sum = 0;
		for(int i=0;i<this.element;i++)
		{
			sum+=this.a[i];
		}
		return sum;
	}
	public void searchEle(int value)
	{
		boolean flag = false;
		for(int i=0;i<this.element;i++)
		{
			if(this.a[i]==value)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("\nelement found in array");
		}
		else
		{
			System.out.println("\nelement Not found in array");
		} 
	}
	public void reverseElesum()
	{
		int a[] = new int [this.element];
		int b[] = new int [this.element];
		int n=this.element;
		for(int i=0;i<this.element;a[i]=this.a[n-1],i++,n--);
		
		System.out.println("\nreverse of array");
		for(int i = 0;i<this.element;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<this.element;i++)
		{
			b[i]= a[i]+this.a[i];
		}
		System.out.println("\nsum of array");
		for(int i = 0;i<this.element;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}

class Array1
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array");
		int res, l = sc.nextInt();
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		ob.setData(l,n);
		
		System.out.println("your choice are");
		System.out.println("\t1 For insert Element\n\t2 For Array Element sum");
		System.out.println("\t3 For Search element\n\t4 For Reverse of array sum");
		System.out.println("\t7 For Exit");
		//System.out.println("\t5 For Delete duplicate\n\t6 For Reverse of array\n\t7 For Reverse of array sum\n\t7 For Exit");

		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter position");
				int pos = sc.nextInt();
		
				System.out.println("Enter value");
				int value = sc.nextInt();
				
				ob.printElement();
				
				ob.insertElement(pos,value);
				System.out.println("\nAfter insert Array element ");
				ob.printElement1();
				break;
			case 2:
				ob.printElement();
				res = ob.sumElement();
				System.out.println("\nSum of Array element = "+res);
				break; 
			case 3:
				System.out.println("Enter Searching element");
				value = sc.nextInt();
				ob.printElement();
				ob.searchEle(value);
				break; 
			case 4:
				ob.printElement();
				ob.reverseElesum();
				break; 
		}
	}
}