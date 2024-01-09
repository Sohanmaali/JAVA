
class LeapYearException extends Exception
{
	LeapYearException ()
	{
		
	}
	LeapYearException(String msg)
	{
		super(msg);
	}
}

class Main{
	
    public static void main(String args[])
	{
		try 
		{
			int a = Integer.parseInt(args[0]);
			if (a<0||a<999)
			{
				throw new LeapYearException ("Invalide number");
			}
			else if((a%4==0&&a%100!=0)||a%400==0)
			{
				System.out.println("Enter year is Leap Year");  	
			}
			else
			{
				throw new LeapYearException ("Normal Year");
			}
		}    
		catch(LeapYearException e)
		{  
			System.out.println(e.getMessage());  
		}   
		
    }    
}