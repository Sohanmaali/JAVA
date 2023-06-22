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
		this.takeElement();
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
	/* public void rowAscending()
	{
		for(int i = 0;i<this.relement;i++)
		{
			
			for(int k = 0;k<this.celement;k++)
			{
				if(this.a[i][j]==this.relement||this.a[i][j]==this.celement)
				{
					
				}
			}
		}
	} */
	public void lowerTrangular()
	{
		if(this.relement==this.celement)
		{
			System.out.println("Lower trangular of matrix");
			for(int i = 0;i<this.relement;i++)
			{
				for(int j = 0;j<=i;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
		else
		{
			System.out.println("Lower trangular not posibal");
		}
	}
	public void upperTrangular()
	{
		if(this.relement==this.celement)
		{
			System.out.println("Upper trangular of matrix");
			for(int i = 0;i<this.relement;i++)
			{
				for(int j = 0;j<this.celement;j++)
				{
					if(j>=i&&j<=this.celement)
					{
						System.out.print(a[i][j]+" ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println(" ");
			}
		}
		else
		{
			System.out.println("Upper trangular not posibal");
		}
	}
	public void cornarprint()
	{
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				if(i==0||j==0||i==this.relement-1||j==celement-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
	public void cornarinprint()
	{
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				if(i>0||j>0||i==this.relement-2||j==celement-2)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}
}

class Array2
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of row array");
		int r= sc.nextInt();
		System.out.println("Enter length of colom array");
		int c = sc.nextInt();
		int res,choice;
		System.out.println("How many element you want to enter row and colom");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		ob.setData(r,c,n,m);
		do{
		System.out.println("your choice are");
		System.out.println("\t\t1 For Lower trangular\n\t2 For Upper trangular");
		System.out.println("\t3 For cornar print\n\t4 For cornar in side print");
		System.out.println("\t5 For Exit");
		
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				ob.printElement();
				
				ob.lowerTrangular();
				break;
			case 2:
				ob.printElement();
				ob.upperTrangular();
				
				break; 
			case 3:
				ob.printElement();
				ob.colomAscending();
				break; 
			case 4:
				ob.printElement();
				ob.cornarinprint();
				break; 
		}
		}while(choice!=5);
	}
}