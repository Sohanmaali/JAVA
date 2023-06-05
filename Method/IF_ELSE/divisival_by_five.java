import java.util.Scanner; 

class Divisival
{
	public void divisival()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		int num = sc.nextInt();		
		
		if(num%5==0&&num%11==0)
		{
			System.out.println("Divisival by 5 and 11");
		}
		else
		{
			System.out.println("Not Divisival by 5 and 11);
		}			
	}
	public static void main(String args[])
	{
		Divisival ob = new Divisival();
		ob.equal();
	}
}
