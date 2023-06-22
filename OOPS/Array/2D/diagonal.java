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
	public void leftDiagonal()
	{
		if(this.relement == this.celement)
		{
			this.printElement();
			System.out.println("leftDiagonal");
			for(int i = 0;i<this.relement;i++)
			{
				for(int j = 0;j<this.celement;j++)
				{
					if(i==j)
					{
						System.out.print(a[i][j]+"\t");
					}
					else
					{
						System.out.print("\t");
					}
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Transpose not posibal");
		}
	}
	public void rightDiagonal()
	{
		if(this.relement == this.celement)
		{
			this.printElement();
			System.out.println("leftDiagonal");
			for(int i = 0;i<this.relement;i++)
			{
				for(int j = 0;j<this.celement;j++)
				{
					if(i+j==this.relement-1)
					{
						System.out.print(a[i][j]+"\t");
					}
					else
					{
						System.out.print("\t");
					}
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Transpose not posibal");
		}
	}
	public void centerDiagonal()
	{
		this.printElement();
		System.out.println("centerDiagonal");
		if(this.celement%2!=0)
		{
			int j,x;
			for(int i = 0;i<this.relement;i++)
			{
				for(j = 0,x=1;j<this.celement;j++)
				{
					if(x==this.celement/2+1)
					{
						System.out.print(a[i][j]+"\t");
					}
					else
					{
						System.out.print("\t");
					}
					x++;
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("Transpose not posibal");
		}
	}

}

class Diagonal
{
	public static void main(String args[])
	{
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
		int r,c,n,m,res,choice;
		System.out.println("Enter length of row array");
		r= sc.nextInt();
		System.out.println("Enter length of colom array");
		c = sc.nextInt();

		do
		{
			System.out.println("How many element you want to enter row and colom");
			n = sc.nextInt();
			m = sc.nextInt();
			ob.setData(r,c,n,m);
			ob.takeElement();
				System.out.println("your choice are");
			System.out.println("\t\t1 For Left Diagonal\n\t2 For Right Diagonal");
			System.out.println("\t3 Center Diagonal");
			System.out.println("\t4 For Exit");
		
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					ob.leftDiagonal();
				break;
				
				case 2:	
					ob.rightDiagonal();
				break; 
			case 3:	
					ob.centerDiagonal();
				break; 
			}
		}while(choice!=4);
	}
}