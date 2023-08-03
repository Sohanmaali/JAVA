class EligibalForVotingException extends Exception
{
	EligibalForVotingException ()
	{
		
	}
	EligibalForVotingException(String msg)
	{
		super(msg);
	}
}
class Voting
{
	int age;
	Voting ()
	{
		
	}
	Voting (int age)
	{
		this.age = age;
	}
	public void voting ()
	{
		try 
		{
			if(this.age<=0)
			{
				throw new EligibalForVotingException("Invalid Age !");
			}
			else if(this.age<18)
			{
				throw new EligibalForVotingException("Not Eligibal for voting");
			}
			else
			{
				System.out.println("Eligibal for voting");
			}
		}
		catch (EligibalForVotingException ref)
		{
			System.out.println(ref.getMessage());
		}
	}
}
class Main
{
	public static void main(String[]args)                                  
	{
		// int a = 0;
		try
		{
			// a = Integer.parseInt(args[0]);
			int a = Integer.parseInt(args[0]);
			Voting ob = new Voting(a);
			ob.voting();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


