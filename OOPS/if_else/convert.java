import java.util.Scanner;
class DataClass
{
	private char ch;
	public void convert()
	{	
		if(this.ch>='A'||this.ch<='Z')
		{			
	char ch = (char)(this.ch+32);
			System.out.println("lower case of "+this.ch+" = "+ch);
		}
		else 
		{
			System.out.println("Please Enter Upper Case Alfabate");
		}
	}
	public void setData(char ch)
	{
		this.ch = ch;
	}
}
class Convert
{
	public void run()
	{
		char ch;
		DataClass ob = new DataClass();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter any charector");
		ch = sc.next().charAt(0);
		ob.setData(ch);
		ob.convert();
	}
	public static void main(String[]args)                                  
	{
		Convert ob = new Convert();
		ob.run();
	}
}