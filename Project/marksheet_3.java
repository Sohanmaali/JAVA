
import java.util.Scanner;
class DataClass
{
	private String name[] = new String[100];
	private String fname[]= new String[100];
	private String mname[]= new String[100];
	private String sem[]= new String[100];
	private String branch[]= new String[100];
	private int year[] = new int[100];
	private String corse[]= new String[100];
	private int roll[]= new int [100];
	
	private int total[];
	private int mark[][] = new int [100][5];
	public void setData(int i,String name,String fname,String mname,String corse,String branch,String sem,int roll)
	{
		this.name[i]=name;
		this.fname[i]=fname;
		this.mname[i]=mname;
		this.corse[i]=corse;
		this.branch[i]=branch;
		this.sem[i]=sem;
		this.roll[i]=roll;
		this.mark[i][i] = 0;
	}
	public void takeRoll()
	{
		boolean flag;
		do
		{
			System.out.println("Enter roll number ");
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
	public void printMarksheet(int n)
	{
		System.out.println("    _______________________________________________________________________");
		System.out.println("   |");

		System.out.println("   |\t\t\t\tBU BHOPAL   \n   |                                                   ");
		// System.out.println("   |\tName  : " + this.name[n] + "\t\t\t\t\tBranch : " + this.branch[n]");
		// System.out.println("   |\tFName : " + this.fname[n] + "\t\t\t\t\tSem    : " + this.sem[n]");
		System.out.println(  "   |\tMName : " + this.mname[n] + "\t\t\t\t\tYear   : " + this.year[n]);
		System.out.println("   |\tRoll  : " + this.roll[n] + "\t\t\t\t\tCourse : " + corse + "\n");
		System.out.println( "   |\tSubCode      SubName       MaxMarks      MinMarks      ObtMark" );
		System.out.println( "   |\tBCA100       Physics        100            33            " + mark[n][0] );
		System.out.println( "   |\tBCA101       chemistry      100            33            " + mark[n][1] );
		System.out.println( "   |\tBCA102       math           100            33            " + mark[n][2]);
		System.out.println( "   |\tBCA103       hindi          100            33            " + mark[n][3] );
		System.out.println( "   |\tBCA104       english        100            33            " + mark[n][4] +"\n   |\n   |\n   |" );
		//System.out.println("   |\tTotal      : " + total);
	}
}

class Mark
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		DataClass ob = new DataClass();
		String corse, name, sem, fname, mname, branch;
		int physics,chemistry,math,hindi,english,total,year,roll,n,i=1;
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
			ob.takeRoll();

			System.out.println("Enter Your Branch name");
			branch = sc.next();

			System.out.println("Enter Your Sem");
			sem = sc.next();
			ob.setData(i,name,fname,mname,corse,branch,sem,roll);
			ob.printMarksheet(i);
			i++;
		}
	}
}

