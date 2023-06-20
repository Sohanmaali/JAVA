import java.util.Scanner;
class DataClass
{
	private int n=100;
	public	void setData(int n)
	{
		this.n = n;
	}
	public void armstrongNum(int n)
	{
		int digit=0;
		for(;;this.n++)
		{
			int temp = this.n,count=0,sum = 0;
			for(;temp>0;temp/=10)
			{
				count++;
			}
			temp = this.n;
			for(; temp>0; temp/=10)
			{
				int i,power;
				for(i = 1,power = 1;i<=count;i++)
				{
					power*=temp%10;
				}
				sum+=power;
			}
			if(sum==this.n)
			{
				System.out.print(this.n+" ");
				digit++;
			}
			if(n==digit)
			{
				return;
			}
		}
	}
}
class PrintNnum
{
	public static void main(String[]args)
	{
		DataClass ob = new DataClass();
		//case 1:
			ob.armstrongNum(5);
			//break;
	}
}