
class MyException extends Exception
{
	MyException ()
	{
		
	}
	MyException(String msg)
	{
		super(msg);
	}
}

class Main{
	
    public static void main(String args[])
	{
		try 
		{
			int a= Integer.parseInt(args[0]);
			if (a>100)
			{
				throw new MyException ("value not 100");
			}
			else if(a<0)
			{
				throw new MyException ("value not 0");
			}
			else
			{
				System.out.println("Value"+a);
			}
		}    
		catch(MyException e)
		{  
			// System.out.println(e);  
			System.out.println(e.getMessage());  
		}   
    }    
}