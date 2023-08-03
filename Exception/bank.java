class BankException extends Exception
{
	public BankException()
	{}
	public BankException(String msg)
	{
		super(msg);
	}
}
class Bank
{
	double amount,wdAmount;
	public Bank(){}

	public Bank(double amount,double wdAmount){
		this.amount = amount;
		this.wdAmount = wdAmount;
	}
	public void amoutWithdrawal()
	{
		try
		{
			if(this.wdAmount<=0)
			{
				throw new BankException("Please Enter Valide amount");
			}
			else if(this.wdAmount>this.amount)
			{
				throw new BankException("Efficient Amount not available");
			}
			else
			{
				System.out.println("Amout Withdrawal succesfull ");
				System.out.println("Your Curent Amount is : "+(amount-wdAmount));
			}
		}
		catch(BankException e)
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
			double amount = Double.parseDouble(args[0]);
			double wdAmount = Double.parseDouble(args[1]);
			Bank ob = new Bank(amount,wdAmount);	
			ob.amoutWithdrawal();
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e )
		{
			System.out.println(e.getMessage());
		}
		/* catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		} */
	}
}