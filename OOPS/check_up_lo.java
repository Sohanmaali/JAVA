import java.util.Scanner;
class Alpha
{
	private char ch;
	public void setData(char ch)
	{
		this.ch=ch;
	}
	public char getData()
	{
		return this.ch;
	}
	public void upLower()
	{
		if(this.ch>=65&&this.ch<=90)
			System.out.println("character is uppercase");
		if(this.ch>=97&&this.ch<=122)
			System.out.println("character is lowercase");
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
		ob.upLower();	
	}
}