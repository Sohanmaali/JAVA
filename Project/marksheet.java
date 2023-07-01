
import java.util.Scanner;
class Marksheet
{
	public static void main(String[]args)
	{
		int physics,chemistry,math,hindi,english,total,year,roll,n,i=1;
		double per;

		String corse, name, sem, fname, mname, branch;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		n = sc.nextInt();
		sc.nextLine();
		while(i<=n)
		{
			System.out.println("Enter Your name");
			name = sc.nextLine();

			System.out.println("Enter Your Father name");
			fname = sc.nextLine();

			System.out.println("Enter Your Mother Name");
			mname = sc.nextLine();

			System.out.println("Enter Course name");
			corse = sc.next();

			System.out.println("Enter Roll number");
			roll = sc.nextInt();

			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();

			System.out.println("Enter Your Year");
			year = sc.nextInt();
			
			do
			{
				System.out.println("Enter marks of phycics");
				physics = sc.nextInt();
				if(physics<0||physics>100)
				{
				System.out.println("Invalide marks of phycics !");
				}
			}while (physics<0||physics>100);  
			do
			{
				System.out.println("Enter marks of chemistry");
				chemistry = sc.nextInt();
				if(chemistry<0||chemistry>100)
				{
					System.out.println("Invalide marks of chemistry !");
				}
			}while (chemistry<0||chemistry>100);
			do
			{
		
				System.out.println("Enter marks of mathes");
				math = sc.nextInt();
				if(math<0||math>100)
				{
				System.out.println("Invalide marks of mathes !");
				}
			}while (math<0||math>100);
			do
			{
			
				System.out.println("Enter marks of Hindi");
				hindi = sc.nextInt();
				if(hindi<0||hindi>100)
				{
					System.out.println("Invalide marks of Hindi !");
				}	
			}while (hindi<0||hindi>100);
			do
			{
				
				System.out.println("Enter marks of English");
				english = sc.nextInt();
				if(english<0||english>100)
				{
					System.out.println("Invalide marks of English !");
				}	
			}while (english<0||english>100);
				total = physics + chemistry + math + hindi + english;
				System.out.println("    _______________________________________________________________________");
				System.out.println("   |");

				System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
				System.out.println("   |\tName  : " + name + "\t\t\t\t\tBranch : " + branch + "   "            );
				System.out.println("   |\tFName : " + fname + "\t\t\t\t\tSem    : " + sem + "      "        );
				System.out.println(  "   |\tMName : " + mname + "\t\t\t\t\tYear   : " + year  );
				System.out.println("   |\tRoll  : " + roll + "\t\t\t\t\tCourse : " + corse +  "   \n   |"  );
				System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
				System.out.println( "   |\tBCA100       Physics        100            33            " + physics );
				System.out.println( "   |\tBCA101       Chemistry      100            33            " + chemistry );
				System.out.println( "   |\tBCA102       Mathes         100            33            " + math);
				System.out.println("   |\tBCA103       Hindi          100            33            " + hindi );
				System.out.println( "   |\tBCA104       English        100            33            " + english +"\n   |\n   |\n   |" );
				System.out.println("   |\tTotal      : " + total);
				if (physics < 33 && chemistry < 33 &&math < 33 &&hindi < 33 &&english < 33) 
				{
				System.out.println("   |\tFail in All sub");
				} 
				else if ((physics < 33 && chemistry < 33 && math < 33 && hindi < 33) ||(physics < 33 && chemistry < 33 && math < 33 & english < 33) ||(physics < 33 && math < 33 && hindi < 33 && english < 33) ||(physics < 33 && chemistry < 33 && hindi < 33 && english < 33) ||(chemistry < 33 && math < 33 && hindi < 33 && english < 33))
				{
					System.out.println("   |\tStatus     : Fail");
				if (physics < 33 && chemistry < 33 && math < 33 && hindi < 33) 
				{
					System.out.println("   |\tFail in phycics,chemistry,mathes,Hindi");
				} 
					else if (physics < 33 && chemistry < 33 && math < 33 & english < 33)
					{
						System.out.println("   |\tFail in phycics,chemistry,mathes,enlish");
					} 
					else if (physics < 33 && math < 33 && hindi < 33 && english < 33)
					{
						System.out.println("   |\tFail in phycics,mathes,hindi,enlish");
					} 
					else if (physics < 33 && chemistry < 33 && hindi < 33 && english < 33)
					{
					System.out.println("   |\tFail in phycics,chemistry,hindi,enlish");
					}
					else if (chemistry < 33 && math < 33 && hindi < 33 && english < 33)
					{
					System.out.println("   |\tFail in chemistry,mathes,hindi,enlish");
					}
				}
				else if ((physics < 33 && chemistry < 33 && math < 33) ||
					(physics < 33 && chemistry < 33 && hindi < 33) ||
					(physics < 33 && math < 33 && hindi < 33) ||
					(chemistry < 33 && math < 33 && hindi < 33) ||
					(physics < 33 && chemistry < 33 && english < 33) ||
					(math < 33 && hindi < 33 && english < 33) ||
					(chemistry < 33 && hindi < 33 && english < 33) ||
					(physics < 33 && hindi < 33 && english < 33) ||
					(english < 33 && math < 33 && chemistry < 33) ||
					(physics < 33 && math < 33 && english < 33))
				{
					System.out.println("   |\tStatus     : Fail");
					if (physics < 33 && chemistry < 33 && math < 33) 
					{
						System.out.println("   |\tFail in physics,chemistry,mathes");
					}
					else if (physics < 33 && chemistry < 33 && hindi < 33) 
					{
						System.out.println("   |\tFail in physics,chemistry,Hindi");
					}
					else if (physics < 33 && math < 33 && hindi < 33) 
					{
						System.out.println("   |\tFail in physics,mathes,hindi");
					} 
					else if (chemistry < 33 && math < 33 && hindi < 33)
					{
						System.out.println("   |\tFail in chemistry,mathes,hindi");
					}
					else if (physics < 33 && chemistry < 33 && english < 33) 
					{
						System.out.println("   |\tFail in physics,chemistry,enlish");
					}
					else if (chemistry < 33 && hindi < 33 && english < 33)
					{
						System.out.println("   |\tFail in chemistry,Hindi,enlish");
					}
					else if (math < 33 && hindi < 33 && english < 33)
						{
						System.out.println("   |\tFail in mathes,Hindi,enlish");
					} 
					else if (physics < 33 && hindi < 33 && english < 33)
					{
						System.out.println("   |\tFail in physics,Hindi,english");
					}
					else if (chemistry < 33 && math < 33 && english < 33)
					{
						System.out.println("   |\tFail in chemistry,mathes,enlish");
					}
					else if (physics < 33 && math < 33 && english < 33) 
					{
						System.out.println("   |\tFail in physics,mathes,enlish");
					}
				}
				else if ((physics < 33 && chemistry < 33) ||(physics < 33 && math < 33) ||
					(physics < 33 && hindi < 33) ||(physics < 33 && english < 33) ||
					(chemistry < 33 && math < 33) ||(chemistry < 33 && hindi < 33) ||
					(chemistry < 33 && english < 33) ||(math < 33 && english < 33) ||
					(math < 33 && hindi < 33) ||(hindi < 33 && english < 33))
				{
					System.out.println("   |\tStatus     : Supply in two Subject");
					if (physics < 33 && chemistry < 33)
					{
					System.out.println("   |\tFail in physics,chemistry");
					}
					else if (physics < 33 && math < 33)
					{
						System.out.println("   |\tFail in physics,mathes");
					} 
					else if (physics < 33 && hindi < 33) 
					{
					System.out.println("   |\tFail in physics,Hindi");
					} 
					else if (physics < 33 && english < 33)
					{
						System.out.println("   |\tFail in physics,english");
					}
					else if (chemistry < 33 && math < 33) 
					{
						System.out.println("   |\tFail in chemistry,mathes");
					}
					else if (chemistry < 33 && hindi < 33) 
					{
						System.out.println("   |\tFail in chemistry,Hindi");
					}
					else if (chemistry < 33 && english < 33)
					{
						System.out.println("   |\tFail in chemistry,english");
					}
					else if (math < 33 && english < 33) 
					{
						System.out.println("   |\tFail in Mathes,English");
					} 
					else if (math < 33 && hindi < 33)
					{
						System.out.println("   |\tFail in Mathes,Hindi");
					} 
					else if (hindi < 33 && english < 33)
					{
						System.out.println("   |\tFail in Hindi,English");
					}
				}
				else if (physics < 33 ||chemistry < 33 ||math < 33 ||hindi < 33 ||english < 33 )
				{
					System.out.println("   |\tStatus     : Supply in Subject");
					if (physics < 33) 
					{
						System.out.println("   |\tFail in physics");
					} 
					else if (chemistry < 33)
						{
						System.out.println("   |\tFail in chemistry");
					} 
					else if (math < 33)
						{
						System.out.println("   |\tFail in mathes");
					}
					else if (hindi < 33) 
						{
						System.out.println("   |\tFail in hindi");
					} else if (english < 33) 
					{
						System.out.println("   |\tFail in English");
					}
				} 
				else 
				{
					per = total / 5.0;
					//System.out.println("   |Total = "+total);
					System.out.println("   |\tPercentage : " + per);
					if (per >= 60) 
					{
						System.out.println("   |\tStatuse    : Pass");
						System.out.println("   |\tPass in first division");
					} 
					else if (per >= 45) 
					{
						System.out.println("   |\tStatuse : Pass");
						System.out.println("   |\tPass in Second division");
					}
					else 
					{
						System.out.println("   |\tStatuse : Pass");
						System.out.println("   |\tPass in Third division");
					}
				}
				System.out.println("   |_______________________________________________________________________");
			i++;
			sc.nextLine();
			System.out.println("\n\n");
		}
	}
}
