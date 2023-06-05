import java.util.Scanner;
class Division
{
public static void main(String[]args)                                  
{
	int py,ch,math,hindi,eng,total;
	double per;
  	Scanner sc = new Scanner(System.in);

	System.out.println("Enter marks of phycis");
  	 py = sc.nextInt();
	 
	 System.out.println("Enter marks of chemistry");
  	 ch = sc.nextInt();
	 
	 System.out.println("Enter marks of mathes");
  	 math = sc.nextInt();
	 
	 System.out.println("Enter marks of hindi");
  	 hindi = sc.nextInt();
	 
	 System.out.println("Enter marks of english");
  	 eng = sc.nextInt();
	 
		if(physics<33&&chemistry<33&&math<33&&hindi<33&&english<33)
		{
			System.out.println("|\tFail in All sub");
		}
		else if((physics<33&&chemistry<33&&math<33&&hindi<33)||(physics<))
		{
			if(physics<33&&chemistry<33&&)
			{
				
			}
			System.out.println("|\tFail in physics,chemistry,math,hindi");
		}
		else
		{
			System.out.println("|\tFail in physics,chemistry,math,");
		}
		else if(hindi<33)
				{
					if(english<33)
					{
						System.out.println("|\tFail in in physics,chemistry,hindi,englishlish");
					}
					else
					{
						System.out.println("|\tail in physics,chemistry,hindi");
					}
				}
				else if(english<33)
				{
					System.out.println("|\tFail in physics,chemistry,englishlish");
				}
				else
				{
					System.out.println("|\tFail in physics,chemistry");
				}	
			
			else if(math<33)
			{
				if(hindi<33)
				{
					if(english<33)
					{
						System.out.println("|\tFail in physics,math,hindi,englishlish");
					}
					else
					{
						System.out.println("|\tFail in physics,math,hindi");
					}
				}
					else if(english<33)
					{
						System.out.println("|\tFail in physics,math,englishlish");
					}
					else 
					{
						System.out.println("|\tFail in physics,math");
					}
				}
				else
				{
					if(hindi<33)
					{
						if(english<33)
						{
							System.out.println("|\tFail in physics,hindi,englishlish");
						}
						else
						{
							System.out.println("|\tFail in physics,hindi,");
						}
					}
					else
					{
						if(english<33)
						{
							System.out.println("|\tFail in physics,englishlish");
						}
						else
						{
							System.out.println("|\tFail in physics");
						}
					}
				}
				
		}
		else if(chemistry<33)
		{
			System.out.println("|\tStatuse : Fail");
			if(math<33)
			{
				if(hindi<33)
				{
					if(english<33)
					{
						System.out.println("|\tFail in chemistry, mathes,hindi,englishlish");
					}
					else
					{
						System.out.println("|\tFail in chemistry,math,hindi");
					}
				}
				else if(english<33)
				{
					System.out.println("|\tFail in chemistry,math,englishlish");
				}
				else
				{
					System.out.println("|\tFail in chemistry,math,");
				}
			}
				else
				{
					if(hindi<33)
					{
						if(english<33)
						{
							System.out.println("|\tFail in chemistry,hindi,englishlish");
						}
						else
						{
							System.out.println("|\tFail in chemistry,hindi");
						}
					}
					else if(english<33)
						{
							System.out.println("|\tFail in chemistry, englishlish");
						}
					else
					{
						System.out.println("|\tFail in chemistry");
					}
				}	
		}
		else if(math<33)
		{
			System.out.println("|\tStatuse : Fail");
			if(hindi<33)
			{
				if(english<33)
				{
					System.out.println("|\tFail in math,hindi,englishlish");
				}
				else
				{
					System.out.println("|\tFail in math,hindi");
				}
			}
			else if(english<33)
			{
				System.out.println("|\tFail in math,englishlish");
			}
			else 
			{
				System.out.println("|\tFail in math");
			}
		}
		else if(hindi<33)
		{
			System.out.println("|\tStatuse : Fail");
			if(english<33)
			{
				System.out.println("|\tFail in hindi,englishlish");
			}
			else
			{
				System.out.println("|\tFail in hindi,");
			}
		}
		else if(english<33)
		{
			System.out.println("|\tStatuse : Fail");
			System.out.println("|\tFail in englishlish");
		}
		else
		{
			per= total/5.0;
			//System.out.println("|Total = "+total);
			System.out.println("|\tPercentage : "+per);
			if(per>=60)
			{
				System.out.println("|\t Statuse : Pass");
				System.out.println("|\tPass in first division");
			}
			else if(per>=45)
			{
				System.out.println("|\t Statuse : Pass");
				System.out.println("|\tPass in Second division");
			}
			else if(per>=33)
			{
				System.out.println("|\t Statuse : Pass");
				System.out.println("|\tPass in Third division");
			}
			else
			{
				System.out.println("|\t.........FAIL.........");
			}
		}
	}
}