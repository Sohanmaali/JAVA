import java.util.Scanner; 

class StDivision
{
	public void stDivision()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your per ");
		int par = sc.nextInt();		
		
		if(par<0&&par>100)
		{
			System.out.println("Invalide par");
		}
		else if(age>=90)
		{
			System.out.println("A gread");
		}
		else if(age>=80)
		{
			System.out.println("B Gread");
		}
		else if(age>=70)
		{
			System.out.println("C Gread");
		}
		else if(age>=60)
		{
			System.out.println("D Gread");
		}
		else if(age>=40)
		{
			System.out.println("E Gread");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String args[])
	{
		StDivision ob = new StDivision();
		ob.stDivision();
	}
}
