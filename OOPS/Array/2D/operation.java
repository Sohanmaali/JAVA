import java.util.Scanner; 

class DataClass
{
	private int a[][];
	private int rLength,cLength;
	private int relement,celement;	
	public void setData(int rlength,int clength,int relement,int celement)
	{
		this.a = new int [rlength][clength];
		this.relement = relement;
		this.celement = celement;
	}
	public void takeElement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Element ");
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void printElement()
	{
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public void sum(DataClass ob,DataClass ob1)
	{
		if(ob.relement==ob1.relement&&ob.celement==ob1.celement)
		{
			System.out.println("Sum");
			
			for(int i=0; i<ob.relement; i++)
			{
				for(int j = 0; j<ob.celement; j++)
				{
					this.a[i][j] = ob.a[i][j]+ob1.a[i][j];
				}
			}
			this.printElement();
		}
		else
		{
			System.out.print("Addition not posibal");
		}
	}
	public void multi(DataClass ob,DataClass ob1)
	{
		if(ob.relement==ob1.celement)
		{
			System.out.println("Multi");
			for (int i = 0; i < ob.relement; i++)
			{
				for (int j = 0; j < ob1.celement; j++)
				{
					for (int k = 0; k < ob.celement; k++)
					{
						this.a[i][j] += ob.a[i][k] * ob1.a[k][j];
					}
				}
			}
			this.printElement();
		}
		else
		{
			System.out.print("Multplactio not posibal");
		}
	}
}

class Operation
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		DataClass ob1 = new DataClass();
		DataClass ob2 = new DataClass();
		Scanner sc = new Scanner(System.in);
		int r,c,n,m,res,choice;
		System.out.println("Enter length of row array");
		r= sc.nextInt();
		System.out.println("Enter length of colom array");
		c = sc.nextInt();

		System.out.println("How many element you want to enter row and colom");
		n = sc.nextInt();
		m = sc.nextInt();
		ob.setData(r,c,n,m);
		ob.takeElement();
		System.out.println("Enter length of row array");
		r = sc.nextInt();
		System.out.println("Enter length of colom array");
		c = sc.nextInt();
		
		System.out.println("How many element you want to enter row and colom");
		n = sc.nextInt();
		m = sc.nextInt();
		ob1.setData(r,c,n,m);
		ob1.takeElement();
		do
		{
			System.out.println("your choice are");
			System.out.println("\t\t1 For Sum of two matrix\n\t2 For Multiplication of two Matrix");
			System.out.println("\t3 For Exit");
		
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("First actual Array");
				ob.printElement();
				System.out.println("Second actual Array");
				ob1.printElement();
				ob2.setData(r,c,n,m);
				ob2.sum(ob,ob1);
				break;
				
				case 2:	
				System.out.println("First actual Array");
				ob.printElement();
				System.out.println("Second actual Array");
				ob1.printElement();
				ob2.setData(r,c,n,m);
				ob2.multi(ob,ob1);
				break; 
			}
		}while(choice!=3);
	}
}