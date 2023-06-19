/*product/factorial*/
import java.util.Scanner;
class DataClass
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int getData()
	{
		return this. n;
	}
	public void factSum()
	{
		int i=1,pro=1,sum=0;
		while(i<=n)
		{
			pro *=i;
			sum+=pro;		
			if(i<n)
			{
			System.out.print(pro+" + ");
			}
			i++;
		}
		System.out.println(pro+" = "+sum);
	}
}

class FactSum
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:   ");
		int n = sc.nextInt();
		DataClass ob = new DataClass();
		ob.setData(n);
		ob.factSum();
	}		
}