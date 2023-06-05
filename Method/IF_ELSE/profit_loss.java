import java.util.Scanner; 

class LossProfit
{
	public void lossProfit()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Purchesing Amount");
		int pur = sc.nextInt();
		
		System.out.println("Enter Shelling Amount");
		int shell = sc.nextInt();		
		
		if(pur>shell)
		{
			System.out.println("loss "+(pur-shell));
		}
		else if(shell>pur)
		{
			System.out.println("Profit "+(shell-pur));
		}
		else
		{
			System.out.println("No loss no profit");
		}
	}
	public static void main(String args[])
	{
		LossProfit ob = new LossProfit();
		ob.lossProfit();
	}
}