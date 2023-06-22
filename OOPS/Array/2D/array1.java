import java.util.Scanner; 

class DataClass
{
	private int a[][];
	private int rLength,cLength;
	private int relement,celement;
	
	public void setData(int rlength,int clength,int relement,int celement)
	{
		//DataClass ob = new DataClass();
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
	public int sumElement()
	{
		int sum=0;
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				sum+= this.a[i][j];
			}
		}
		return sum;
	}
	public int maxElement()
	{
		int max=0;
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				if(max<this.a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		return max;
	}
	public int minElement()
	{
		int min = this.a[0][0];
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				if(min>this.a[i][j])
				{
					min = this.a[i][j];
				}
			}
		}
		return min;
	}
	public int secondminElement()
	{
		int max=maxElement();
		int min = minElement();
		for(int i = 0;i<this.relement;i++)
		{
			for(int j =  0;j<this.celement;j++)
			{
				if(min<this.a[i][j]&&max>this.a[i][j])
				{
					max = a[i][j];
				}
			}
		}
		return max;
	}
	public int secondmaxElement()
	{
		int max=this.maxElement();
		int min = this.minElement();
		for(int i = 0;i<this.relement;i++)
		{
			for(int j = 0;j<this.celement;j++)
			{
				if(min<this.a[i][j]&&max>this.a[i][j])
				{
					min = this.a[i][j];
				}
			}
		}
		return min;
	}
	public void transpose()
	{
		int temp;
		if(this.relement>this.celement)
		{
			temp = this.relement;
		}
		else
		{
			temp = this.celement;
		}
		for(int i=0; i<this.relement; i++)
		{
			for(int j = i; j<temp; j++)
			{
				int temp1 = this.a[i][j];
				this.a[i][j] = this.a[j][i];
				this.a[j][i]= temp1;
			}
		}
		System.out.println("Transpose of Matrix");
		for(int i=0; i<this.celement; i++)
		{
			for(int j = 0; j<this.relement; j++)
			{
				System.out.print(this.a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}

class Array1
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
		System.out.println("\t\t1 For Sum of Matrix Element\n\t2 For Maximum Element of Matrix");
		System.out.println("\t3 For Minimum Element of Matrix\n\t4 For Second Maximum Element of Matrix");
		System.out.println("\t5 For second Minimum Element of Matrix");
		System.out.println("\t6 For Transpose of matrix");
		System.out.println("\t6 For Exit");
		
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				ob.printElement();
				res = ob.sumElement();
				System.out.println("Sum of matrix element = "+res);
				break;
			case 2:
				ob.printElement();
				res = ob.maxElement();
				System.out.println("Maximum element of matrix = "+res);
				break; 
			case 3:
				ob.printElement();
				res = ob.minElement();
				System.out.println("Minimum element of matrix = "+res);
				
				break; 
			case 4:
				ob.printElement();
				res = ob.secondmaxElement();
				System.out.println("Second Maximum element of matrix "+res);
				break; 
			case 5:
				ob.printElement();
				res = ob.secondminElement();
				System.out.println("Second Minimum element of matrix "+res);
				break; 
			case 6:
				System.out.println("Actual Matrix");
				ob.printElement();
				ob.transpose();
				break; 
		}
		}while(choice!=6);
	}
}