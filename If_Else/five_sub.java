import java.util.Scanner;
class FiveDivision
{
public static void main(String[]args)                                  
	{
		int py,ch,math,hindi,eng,total;
		double per;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter marks of phycics");
  	 py = sc.nextInt();
	 if(py<0||py>100)
	 {
		 System.out.println("Invalide Mark of phycics");
	 }
	 else
	 {
		System.out.println("Enter marks of chemistry");
		ch = sc.nextInt();
		if(ch<0||ch>100)
		{
			System.out.println("Invalide Mark of chemistry");
		}
		else
		{
			System.out.println("Enter marks of mathes");
			math = sc.nextInt();
			if(math<0||math>100)
			{
				System.out.println("Invalide Mark of Mathes");
			}
			else
			{
				System.out.println("Enter marks of Hindi");
				hindi = sc.nextInt();
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalide Mark of Hindi");
				}
				else
				{
					System.out.println("Enter marks of English");
					eng = sc.nextInt();
					if(eng<0||eng>100)
					{
						System.out.println("Invalide Mark of English");
					}
					
					if(py<33&&ch<33&&math<33&&hindi<33&&eng<33)
					{		
						System.out.println("Fail in All sub");
					}
					else if((py<33&&ch<33&&math<33&&hindi<33)||(py<33&&ch<33&&math<33&eng<33)||(py<33&&math<33&&hindi<33&&eng<33)
							||(py<33&&ch<33&&hindi<33&&eng<33)||(ch<33&&math<33&&hindi<33&&eng<33))
					{
						if(py<33&&ch<33&&math<33&&hindi<33)
						{
							System.out.println("Fail in phycics,chemistry,mathes,Hindi");
						}
						else if(py<33&&ch<33&&math<33&eng<33)
						{
							System.out.println("Fail in phycics,chemistry,mathes,enlish");
						}
						else if(py<33&&math<33&&hindi<33&&eng<33)
						{
							System.out.println("Fail in phycics,mathes,hindi,enlish");
						}
						else if(py<33&&ch<33&&hindi<33&&eng<33)
						{
							System.out.println("Fail in phycics,chemistry,hindi,enlish");
						}
						else if(ch<33&&math<33&&hindi<33&&eng<33)
						{
							System.out.println("Fail in chemistry,mathes,hindi,enlish");
						}
					}
					else if((py<33&&ch<33&&math<33)||(py<33&&ch<33&&hindi<33)||(py<33&&math<33&&hindi<33)
							||(ch<33&&math<33&&hindi<33)||(py<33&&ch<33&&eng<33)||(math<33&&hindi<33&&eng<33)
							||(ch<33&&hindi<33&&eng<33)||(py<33&&hindi<33&&eng<33)||(eng<33&&math<33&&ch<33)
							||(py<33&&math<33&&eng<33))
					{
						if(py<33&&ch<33&&math<33)
						{
							System.out.println("Fail in physics,chemistry,mathes");
						}
						else if(py<33&&ch<33&&hindi<33)
						{
							System.out.println("Fail in physics,chemistry,Hindi");
						}
						else if(py<33&&math<33&&hindi<33)
						{
							System.out.println("Fail in physics,mathes,hindi");	
						}
						else if(ch<33&&math<33&&hindi<33)
						{
							System.out.println("Fail in chemistry,mathes,hindi");
						}
						else if(py<33&&ch<33&&eng<33)
						{
							System.out.println("Fail in physics,chemistry,enlish");
						}
						else if(ch<33&&hindi<33&&eng<33)
						{
						System.out.println("Fail in chemistry,Hindi,enlish");
						}
						else if(math<33&&hindi<33&&eng<33)
						{
							System.out.println("Fail in mathes,Hindi,enlish");
						}
						else if(py<33&&hindi<33&&eng<33)
						{
							System.out.println("Fail in physics,Hindi,English");
						}
						else if(ch<33&&math<33&&eng<33)
						{
							System.out.println("Fail in chemistry,mathes,enlish");
						}			
						else if(py<33&&math<33&&eng<33)
						{
							System.out.println("Fail in physics,mathes,enlish");	
						}
					}		
					else if((py<33&&ch<33)||(py<33&&math<33)||(py<33&&hindi<33)||(py<33&&eng<33)||
							(ch<33&&math<33)||(ch<33&&hindi<33)||(ch<33&&eng<33)||(math<33&&eng<33)
							||(math<33&&hindi<33)||(hindi<33&&eng<33))
					{		
						if(py<33&&ch<33)
					{
						System.out.println("Fail in physics,chemistry");
					}
					else if(py<33&&math<33)
					{
						System.out.println("Fail in physics,mathes");
					}
					else if(py<33&&hindi<33)
					{
						System.out.println("Fail in physics,Hindi");
					}
					else if(py<33&&eng<33)
					{
						System.out.println("Fail in physics,English");
					}
					else if(ch<33&&math<33)
					{
						System.out.println("Fail in chemistry,mathes");
					}
					else if (ch<33&&hindi<33)
					{
						System.out.println("Fail in chemistry,Hindi");
					}
					else if(ch<33&&eng<33)
					{
						System.out.println("Fail in chemistry,English");
					}
					else if(math<33&&eng<33)
					{
						System.out.println("Fail in Mathes,English");
					}
					else if(math<33&&hindi<33)
					{
						System.out.println("Fail in Mathes,Hindi");
					}
					else if(hindi<33&&eng<33)
					{
					System.out.println("Fail in Hindi,English");
					}
				}
				else if(py<33||ch<33||math<33||hindi<33||eng<33)
				{
					if(py<33)
					{
						System.out.println("Fail in physics");
					}
					else if(ch<33)
					{
						System.out.println("Fail in chemistry");
					}
					else if(math<33)
					{
						System.out.println("Fail in mathes");
					}
					else if(hindi<33)
					{
						System.out.println("Fail in hindi");
					}
					else if(eng<33)
					{
						System.out.println("Fail in English");
					}
				}
			}
		}
	}
 }	
}
}