
class MobileNumberException extends Exception
{
	public MobileNumberException(){}
	
	public MobileNumberException(String msg)
	{
		super(msg);
	}
}
class MobileNumber
{
	String num;
	
	public MobileNumber(){}
	
	
	public MobileNumber(String num)
	{
		this.num = num; 
	}
	public void mobileNumber()throws MobileNumberException
	{
		
		if (this.num.length()!=10)
		{
			throw new MobileNumberException ("Invalide Mobile number");
		}
		
		for(int i=0;i<this.num.length();i++)
		{
			if(num.charAt(i)<48||num.charAt(i)>58)
				throw new MobileNumberException ("Invalide Mobile number");
		}
		System.out.println("Your Mobile Number is : "+this.num);
	}
}

class Main
{
	public static void main(String[]args)                                  
	{
		try
		{
			String num = args[0];	
			MobileNumber ob = new MobileNumber(num);
			ob.mobileNumber();
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException |MobileNumberException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}