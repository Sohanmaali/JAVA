
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
			int a = Integer.parseInt(args[0]);
			if (a>7)
			{
				throw new MyException ("Day number most be less then Seven or equal");
			}
			else if(a<0)
			{
				throw new MyException ("Day number most be greater then Zero");
			}
			else
			{
				switch(a)
				{
					case 1:
						System.out.println("Monday");  
						break;
					case 2:
						System.out.println("Tuesday");  
						break;
					case 3:
						System.out.println("Wednasday");  
						break;
					case 4:
						System.out.println("Thrasday");  
						break;
					case 5:
						System.out.println("Friday");  
						break;
					case 6:
						System.out.println("Saturday");  
						break;
					case 7:
						System.out.println("Sunday");  
						break;
				}
			}
		}    
		catch(MyException e)
		{  
			System.out.println(e.getMessage());  
		}   
    }    
}