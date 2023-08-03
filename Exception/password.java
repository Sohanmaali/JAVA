import java.util.Scanner;
class PasswordException extends Exception
{
	public PasswordException(){}
	
	public PasswordException(String msg)
	{
		super(msg);
	}
}
class Password
{
	String num;
	
	public Password(){}
	
	
	public Password(String num)
	{
		this.num = num; 
	}
	public void password(Scanner sc)throws PasswordException
	{
		
		if (this.num.length()< 8)
		{
			throw new PasswordException ("Your Password short");
		}
		else if(this.num.equals("12345678"))
		{
			throw new PasswordException ("Password is very Easy");
		}
		
		System.out.println("Do you want to show Password y/n");
		char ch = sc.next().charAt(0);
		if(ch =='y')
		{
			System.out.println("Your Password is : "+this.num);
		}
		else
		{
			System.out.println("Your Password is : xxxxxxxx");
		}	
	}
}

class Main
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			String num = args[0];	
			Password ob = new Password(num);
			ob.password(sc);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException |PasswordException e)
		{
			System.out.println(e.getMessage());
		}
	}
}