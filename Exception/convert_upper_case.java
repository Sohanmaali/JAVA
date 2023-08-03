class ConvertUpperCaseException extends Exception
{
	ConvertUpperCaseException()
	{}
	ConvertUpperCaseException(String msg)
	{
		super(msg);
	}
}

class ConvertLowerCase
{
	char ch ;
	ConvertLowerCase()
	{}
	ConvertLowerCase(char ch)
	{
		this.ch = ch;
	}
	public void convertLowerCase()
	{
		try
		{
			if(this.ch<97||this.ch>122)
			{
				throw new ConvertUpperCaseException ("Please Enter Lower Case Alfabate");
			}
			else 
			{
				int c = ((int)ch)-32;
				System.out.println("Upper case of "+this.ch+" = "+(char)c);
			}
		}
		catch(ConvertUpperCaseException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Main
{
	public static void main(String[]args)                                  
	{
		try 
		{
			String str = args[0];
			char ch = str.charAt(0);
			ConvertLowerCase ob = new ConvertLowerCase(ch);
			ob.convertLowerCase();
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}