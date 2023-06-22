
import java.util.Scanner;
class DataClass
{
	private String name;
	private String fname;
	private String mname;
	private String sem;
	private String branch;
	private int year;
	private String corse;
	private static int roll[]= new int [100];
	
	private int total;
	private static int mark[][] = new int [100][5];
	
	public static void takeRoll(int i)
	{
		Scanner sc = new Scanner(System.in);

		boolean flag;
		do
		{
			roll[i] = sc.nextInt();
			flag = false;
			for(int j = 0;i>0&&j<i;j++)
			{
				if(roll[j]==roll[i])
				{
					System.out.println("Duplicate Roll Number");
					flag = true;
				}
			}				
		}while(flag);
	}	
	public DataClass(String name,String fname,String mname,String corse,String branch,String sem,int year)
	{
		this.name= name;
		this.fname= fname;
		this.mname= mname;
		this.corse =corse;	
		this.branch= branch;
		this.sem= sem;
		this.year = year;
	}
	
	public static void takeMark(int i)
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter marks of phycics");
			mark[i][0] = sc.nextInt();
			if(mark[i][0]<0||mark[i][0]>100)
			{
				System.out.println("Invalide marks of phycics !");
			}
		}while (mark[i][0]<0||mark[i][0]>100);  
		do
		{
			System.out.println("Enter marks of chemistry");
			mark[i][1] = sc.nextInt();
			if(mark[i][1]<0||mark[i][1]>100)
			{
				System.out.println("Invalide marks of chemistry !");
			}
		}while (mark[i][1]<0||mark[i][1]>100);
		do
		{
		
			System.out.println("Enter marks of math");
			mark[i][2] = sc.nextInt();
			if(mark[i][2]<0||mark[i][2]>100)
			{
			System.out.println("Invalide marks of math !");
			}
		}while (mark[i][2]<0||mark[i][2]>100);
		do
		{
		
			System.out.println("Enter marks of hindi");
			mark[i][3] = sc.nextInt();
			if(mark[i][3]<0||mark[i][3]>100)
			{
				System.out.println("Invalide marks of hindi !");
			}	
		}while (mark[i][3]<0||mark[i][3]>100);
		do
		{
			
			System.out.println("Enter marks of english");
			mark[i][4] = sc.nextInt();
			if(mark[i][4]<0||mark[i][4]>100)
			{
				System.out.println("Invalide marks of english !");
			}	
		}while (mark[i][4]<0||mark[i][4]>100);
	}
	public void printMarksheet(int i)
	{
		int mark = 5;
		System.out.println("    _______________________________________________________________________");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		// System.out.println("   |\tName  : " + this.name[n] + "\t\t\t\t\tBranch : " + this.branch[n]");
		// System.out.println("   |\tFName : " + this.fname[n] + "\t\t\t\t\tSem    : " + this.sem[n]");
		System.out.println(  "   |\tMName : " + this.mname + "\t\t\t\t\tYear   : " + this.year);
		System.out.println("   |\tRoll  : " + this.roll + "\t\t\t\t\tCourse : " + corse + "\n");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println( "   |\tBCA100       Physics        100            33            " + this.mark[i][0] );
		System.out.println( "   |\tBCA101       chemistry      100            33            " + this.mark[i][1] );
		System.out.println( "   |\tBCA102       math           100            33            " + this.mark[i][2]);
		System.out.println( "   |\tBCA103       hindi          100            33            " + this.mark[i][3] );
		System.out.println( "   |\tBCA104       english        100            33            " + this.mark[i][4] +"\n   |\n   |\n   |" );
		//System.out.println("   |\tTotal      : " + total);
	}

	public static void division(int i)
	{
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
	}
}

class Mark
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String corse, name, sem, fname, mname, branch;
		int year,roll,n,i=0;
		System.out.println("Enter number of student");
		n = sc.nextInt();
		DataClass []student = new DataClass[n];
		sc.nextLine();
		while(i<n)
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
			DataClass.takeRoll(i);

			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();
			
			System.out.println("Enter Your year");
			year = sc.nextInt();
			
			student[i] = new DataClass(name,fname,mname,corse,branch,sem,year);
	
			DataClass.takeMark(i);
			student[i].printMarksheet(i);
			i++;
			sc.nextLine();
		}
	}
}