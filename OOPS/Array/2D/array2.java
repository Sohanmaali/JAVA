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
	public void rowAscending()
	{
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement-1;j++)
			{
				for(int k = 0;k<this.celement-i-1;k++)	//bubbule sort
				{
					if(this.a[j][k]>this.a[j][k+1])
					{
						int temp = a[j][k];
						a[j][k] = a[j][k+1];
						a[j][k+1] = temp;
					}
				}
			}
		}
	}
	public void rowDiscending()
	{
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement-1;j++)
			{
				for(int k = 0;k<this.celement-i-1;k++)	//bubbule sort
				{
					if(this.a[j][k]<this.a[j][k+1])
					{
						int temp = a[j][k];
						a[j][k] = a[j][k+1];
						a[j][k+1] = temp;
					}
				}
			}
		}
	}
	public void colomAscending()
	{
		for(int i = 0;i<this.celement;i++)
		{
			for(int j = 0;j<this.relement-1;j++)
			{
				for(int k = 0;k<this.relement-i-1;k++)	//bubbule sort
				{
					if(this.a[k][j]>this.a[k+1][j])
					{
						int temp = a[k][j];
						a[k][j] = a[k+1][j];
						a[k+1][j] = temp;
					}
				}
			}
		}
	}
	public void colomDiscending()
	{
		for(int i = 0;i<this.celement;i++)
		{
			for(int j = 0;j<this.relement-1;j++)
			{
				for(int k = 0;k<this.relement-i-1;k++)	//bubbule sort
				{
					if(this.a[k][j]<this.a[k+1][j])
					{
						int temp = a[k][j];
						a[k][j] = a[k+1][j];
						a[k+1][j] = temp;
					}
				}
			}
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
		System.out.println("\t\t1 For Ascending Order of row\n\t2 For Discending Order of row");
		System.out.println("\t3 For Ascending Order of Colom\n\t4 For Discending Order of Colom");
		System.out.println("\t5 For Ascending Order of row and Discending Order of Colom\n\t");
		System.out.println("\t5 For Discending Order of row and Ascending Order of Colom\n\t");
		System.out.println("\t6 For Discending Order of row and Ascending Order of Colom\n\t");
		System.out.println("\t7 For Exit");
		
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				ob.printElement();
				System.out.println("Ascending Order of row ");
				ob.rowAscending();
				ob.printElement();
				break;
			case 2:
				ob.printElement();
				System.out.println("Discending Order of row ");
				ob.rowDiscending();
				ob.printElement();
				break; 
			case 3:
				ob.printElement();
				System.out.println("Ascending Order of Colom ");
				ob.colomAscending();
				ob.printElement();
				break; 
			case 4:
				ob.printElement();
				System.out.println("Discending Order of Colom ");
				ob.colomDiscending();
				ob.printElement();
				break; 
			case 5:
				ob.printElement();
				System.out.println("Ascending Order of Row ");
				ob.rowDiscending();
				ob.printElement();
				System.out.println("Discending Order of Colom ");
				ob.colomDiscending();
				ob.printElement();
				break; 
			case 6:
				ob.printElement();
				System.out.println("Discending Order of Colom ");
				ob.colomDiscending();
				ob.printElement();
				System.out.println("Ascending Order of Row ");
				ob.rowDiscending();
				ob.printElement();
				break; 
		}
		}while(choice!=7);
	}
}