class MyThrowable extends Throwable 
{
   
    public MyThrowable() 
	{
        super();
    }

    public MyThrowable(String message) 
	{
        super(message);
    }

    public MyThrowable(Throwable cause) 
	{
        super(cause);
    }
}

class MyThrowable1 
{
    public void test() throws MyThrowable 
	{
        throw new MyThrowable("Custom throwable message");
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