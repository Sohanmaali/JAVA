import java.util.Scanner;
class Alpha
{
	private char ch;
	public void setData(char ch)
	{
		this.ch = ch;
	}
	public char getData()
	{
		return this.ch;
	}
	
	public char upLower()
	{
		if(this.ch>=65&&this.ch<=90)
		{
			char lc =(char)(this.ch+32);
			return lc;
		}
		else if(this.ch>=97&&this.ch<=122)
		{
			char uc=(char)(this.ch-32);
			return uc;
		}
		return this.ch;
	}

}
class Test
{
	public static void main(String args[])
	{
		Alpha ob=new Alpha();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		ob.setData(ch);
		char c = ob.upLower();
		System.out.println(c);
	}
}