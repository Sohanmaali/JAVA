
import java.util.Scanner;
class DataClass
{
	private String name;
	private String fname;
	private String mname;
	private String sem;
	private String branch;
	private int year;
	private int total;
	private double per;
	private String corse;
	private static int roll;	
	private int phycics;
	private int chemistry;
	private int math;
	private int hindi;
	private int english;
	
	public DataClass(int roll,String name,String fname,String mname,String corse,String branch,String sem,int year,int phycics,int chemistry,int math,int hindi,int english)
	{
		this.name  = name;
		this.fname = fname;
		this.mname = mname;
		this.sem   = sem;	
		this.branch = branch;
		this.year  = year;
		this.corse = corse;
		this.roll  = roll;
		this.phycics = phycics;
		this.chemistry = chemistry;
		this.math = math;
		this.hindi = hindi;
		this.english = english;		
	}
	public static int getRollNumber()
	{
		return roll;
	}
	public void printMarksheet()
	{
		System.out.println("    _______________________________________________________________________");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		// System.out.println("   |\tName  : " + this.name[n] + "\t\t\t\t\tBranch : " + this.branch[n]");
		// System.out.println("   |\tFName : " + this.fname[n] + "\t\t\t\t\tSem    : " + this.sem[n]");
		System.out.println(  "   |\tMName : " + this.mname + "\t\t\t\t\tYear   : " + this.year);
		System.out.println("   |\tRoll  : " + this.roll + "\t\t\t\t\tCourse : " + corse + "\n");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println( "   |\tBCA100       Physics        100            33            " + this.phycics );
		System.out.println( "   |\tBCA101       chemistry      100            33            " + this.chemistry );
		System.out.println( "   |\tBCA102       math           100            33            " + this.math);
		System.out.println( "   |\tBCA103       hindi          100            33            " + this.hindi );
		System.out.println( "   |\tBCA104       english        100            33            " + this.english +"\n   |\n   |\n   |" );
		
		
	}
}

class Mark
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		String corse, name, sem, fname, mname, branch;
		
		int physics,chemistry,math,hindi,english,year,roll,n,i=0,choice;
		
		DataClass []student = new DataClass[100];
		
		System.out.println("Enter number of student");
		
		n = sc.nextInt();
		
		sc.nextLine();
		
		while(i<n)
		{
			System.out.println("Enter Roll number");
			boolean flag;
			do
			{
				roll= sc.nextInt();
				flag = false;
				for(int j = 0;i>0&&j<i;j++)
				{
					if(student[j].getRollNumber()==roll)
					{
						System.out.println("Duplicate Roll Number");
						flag = true;
					}
				}				
			}while(flag);
			
			System.out.println("Enter Your name");
			name = sc.nextLine();

			System.out.println("Enter Your Father name");
			fname = sc.nextLine();

			System.out.println("Enter Your Mother Name");
			mname = sc.nextLine();
			
			System.out.println("Enter Course name");
			corse = sc.next();

			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();
			
			System.out.println("Enter Your year");
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
			
			student[i] = new DataClass(roll,name,fname,mname,corse,branch,sem,year,physics,chemistry,math,hindi,english);
			i++;
			sc.nextLine();
		}
		int serchRoll,count =0;
		String serchName;
		System.out.println("Your choices are");
		System.out.println("\t1 For Search by Roll Number");
		System.out.println("\t2 For Search by Name");
		System.out.println("\t3 For Search by Topper");
		System.out.println("\tEnter Your choice");
		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter your Roll Number");
				serchRoll = sc.nextInt();
				for(int x=0;x<n;x++)
				{
					if(student[x].getRollNumber()==serchRoll)
					{
						System.out.println("HYYYYY");
						
						count++;
						student[x].printMarksheet();
					}
				}
				if(count==0)
				{
					System.out.println("Roll Number Not Exist");
				}
			break;
		}
	}
}