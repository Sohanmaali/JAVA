//import java.lang.System;
import java.util.Scanner;
class MarksheetPOJO
{
	
		private int Roll;
		private String Branch;
		private String MName;
		private String FName;
		private int Year;
		private int p ;
		private int c ;
		private int m ;
		private int h ;
		private int e ;
		private int n;
		private int total;
		private double per;
		private String Name;
		private String Course;
		private int Sem;
		private String Gmail;
		private String Password;
		public void setGmail(String Gmail){
			this.Gmail=Gmail;
		}
		public void setPassword(String Password){
			this.Password=Password;
		}
		public void setName(String Name){
			this.Name=Name;
		}
		public void setCourse(String Course){
			this.Course=Course;
		}
		public void setBranch(String Branch){
			this.Branch=Branch;
		}
		public void setMName(String MName){
			this.MName=MName;
			
		}
		public void setFName(String FName){
			this.FName=FName;
			
		}
		public void setYear(int Year){
			this.Year=Year;
			
		}
		public void setSem(int Sem){
			this.Sem=Sem;
		}public void setPhysics(int p){
			this.p=p;
			
		}public void setChemistry(int c){
			this.c=c;
			
		}
		public void setMaths(int m)	{
			this.m=m;
			
		}
		public void setHindi(int h){
			this.h=h;
			
		}
		public void setEnglish(int e){
			this.e=e;
		}
		public void setTotal(int total)	{
			this.total=total;
		}
		public void setPer(double per)	{
			this.per=per;
		}
		
		public void setRoll(int Roll){
			this.Roll=Roll;
		}
		public String getGmail()	{
			return Gmail;
		}
		public String getPassword(){
			return Password;
		}
		public String getName(){
			return Name;
		}
		public String getCourse(){
			 return Course;
		}
		public String getBranch(){
			return Branch;
		}
		public String getMName(){
			return MName;
			
		}
		public String getFName(){
			return FName;
			
		}
		public int getYear(){
			return Year;
			
		}
		public int getSem(){
			return Sem;
		}
		public int  getPhysics(){
			return p;
			
		}
		public int getChemistry(){
			return c;
			
		}
		public int getMaths(){
			return m;
			
		}
		public int getHindi(){
			return h;
			
		}
		public int getEnglish()	{
			return e;
		}
		public int getRoll(){
			return Roll;
		}
		public int getTotal(){
			return total;
		}
		public double getPer(){
			return  per;
		}
}
class MarksheetOperation
{
	public static void printMarksheet(MarksheetPOJO[] a,int i)
	{
        System.out.println("The Value of i inside Marksheet : "+i);
		
		System.out.println("\n\n\t ___________________________________________________________________________________________________");
		System.out.println("\t                                                                                                   ");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                          RGPV - BHOPAL                                            ");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                     Student's Personal Info                                       ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t| Student Name  : "+a[i].getName() +"                                                                         ");
       System.out.println("\t| Roll Number   : "+a[i].getRoll() +"                                                                         ");
       System.out.println("\t| Father Name   : Mr." +a[i].getFName()+"                                                                     ");
       System.out.println("\t| Mother Name   : Mrs."+a[i].getMName()+"                                                                     ");
       System.out.println("\t| Course        : "+a[i].getCourse()+"                                                                        ");
       System.out.println("\t| Branch        : "+a[i].getBranch()+"\t                                                                      ");
       System.out.println("\t| Year          : "+a[i].getYear()+"\t                                                                        ");
       System.out.println("\t| Sem           : "+a[i].getSem()+"\t                                                                         ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                     Marks Gained By Student                                       ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                 |                 |                    |                     |                    ");
       System.out.println("\t|     SubCode     |     SubName     |      MaxMarks      |      MinMarks       |      ObtMarks      ");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________");
       System.out.println("\t|                 |                 |                    |                     |                    ");
       System.out.println("\t|     CSE-501     |     Physics     |        100         |        33           |        "+a[i].getPhysics()+"       ");
       System.out.println("\t|     CSE-502     |     Chemistry   |        100         |        33           |        "+a[i].getChemistry()+"       ");
       System.out.println("\t|     CSE-503     |     Maths       |        100         |        33           |        "+a[i].getMaths()+"       ");
       System.out.println("\t|     CSE-504     |     Hindi       |        100         |        33           |        "+a[i].getHindi()+"       ");
       System.out.println("\t|     CSE-505     |     English     |        100         |        33           |        "+a[i].getEnglish()+"       ");
       System.out.println("\t|_________________|_________________|____________________|_____________________|____________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t|                                    Student's Promotion Status                                     ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
       System.out.println("\t| Precentage  :"+a[i].getPer()+ " %                                                                           ");
       System.out.println("\t| Grand Total :"+a[i].getTotal()+"                                                                            ");
       System.out.println("\t|___________________________________________________________________________________________________");
       System.out.println("\t|                                                                                                   ");
		System.out.println("\t| Status With Subjects :                                                                            "); 
		
		
		if(a[i]. getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 && a[i].getEnglish()<33)
			System.out.print("\t|\t\t\tFail in all Subjects.                                                       ");
       else if((a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 )||(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)||(a[i].getPhysics()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)||(a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33))
       {
       if(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,Hindi.                                             ");
       else if(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");       
       else if(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi,English.                                           ");    
       else if(a[i].getPhysics()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi,English.                                           ");
       else if(a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths,English.                                           ");    
       }
       
       else if((a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 )||(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getHindi()<33)||(a[i].getPhysics()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33)||(a[i].getPhysics()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33)||(a[i].getPhysics()<33 && a[i].getMaths()<33 && a[i].getHindi()<33)||(a[i].getChemistry()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33)||(a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33)||(a[i].getChemistry()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)||(a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33))
       {
       if(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getMaths()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Maths.                                                   ");
       else if(a[i].getPhysics()<33 && a[i].getChemistry()<33 && a[i].getHindi()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,Hindi.                                                   ");
       else if(a[i].getPhysics()<33 && a[i].getChemistry()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Chem.,English.                                                 ");   
       else if(a[i].getPhysics()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33) 
           System.out.print("\t|\t\t\tFail in Phy.,Maths,English.                                                 ");
       else if(a[i].getPhysics()<33 && a[i].getMaths()<33 && a[i].getHindi()<33)
           System.out.print("\t|\t\t\tFail in Phy.,Maths,Hindi.                                                   ");  
       else if(a[i].getChemistry()<33 && a[i].getMaths()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,English.                                                ");      
       else if(a[i].getChemistry()<33 && a[i].getMaths()<33 && a[i].getHindi()<33)
           System.out.print("\t|\t\t\tFail in Chem.,Maths,Hindi.                                                  ");      
       else if(a[i].getChemistry()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Chem.,Hindi,English.                                                ");      
       else if(a[i].getMaths()<33 && a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Maths,Maths,English.                                                ");      
       }
       
       else if((a[i].getPhysics()<33 && a[i].getChemistry()<33 )||(a[i].getPhysics()<33 && a[i].getMaths()<33 )||(a[i].getPhysics()<33 && a[i].getHindi()<33 )||(a[i].getPhysics()<33 &&  a[i].getEnglish()<33 )||(a[i].getChemistry()<33 && a[i].getMaths()<33 )||(a[i].getChemistry()<33 && a[i].getHindi()<33 )||(a[i].getChemistry()<33 &&  a[i].getEnglish()<33 )||(a[i].getMaths()<33 && a[i].getHindi()<33)||(a[i].getMaths()<33 &&  a[i].getEnglish()<33)||(a[i].getHindi()<33 &&  a[i].getEnglish()<33))
       {
       if(a[i].getPhysics()<33 && a[i].getChemistry()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Chem..                                                         ");    
       else if(a[i].getPhysics()<33 && a[i].getMaths()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Maths.                                                         ");      
       else if(a[i].getPhysics()<33 && a[i].getHindi()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,Hindi.                                                         ");    
       else if(a[i].getPhysics()<33 &&  a[i].getEnglish()<33 )
           System.out.print("\t|\t\t\tFail in Phy.,English.                                                       "); 
       else if(a[i].getChemistry()<33 && a[i].getMaths()<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Maths.                                                        ");  
       else if(a[i].getChemistry()<33 && a[i].getHindi()<33 )
           System.out.print("\t|\t\t\tFail in Chem.,Hindi.                                                        "); 
       else if(a[i].getChemistry()<33 &&  a[i].getEnglish()<33 )
           System.out.print("\t|\t\t\tFail in Chem.,English.                                                      "); 
       else if(a[i].getMaths()<33 && a[i].getHindi()<33)
           System.out.print("\t|\t\t\tFail in Maths,Hindi.                                                        ");     
       else if(a[i].getMaths()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Maths,English.                                                      ");
       else if(a[i].getHindi()<33 &&  a[i].getEnglish()<33)
           System.out.print("\t|\t\t\tFail in Hindi.English                                                       ");
        }   
       
       else if(a[i].getPhysics()<33 || a[i].getChemistry()<33 || a[i].getMaths()<33 || a[i].getHindi()<33 ||  a[i].getEnglish()<33)
       {
       if(a[i].getPhysics()<33)
       	  System.out.print("\t|\t\t\tFail in Phy..                                                               ");
       else if(a[i].getChemistry()<33)
       	  System.out.print("\t|\t\t\tFail in Chem..                                                              ");
       else if(a[i].getMaths()<33)
       	  System.out.print("\t|\t\t\tFail in Maths.                                                              ");
       else if(a[i].getHindi()<33)
       	  System.out.print("\t|\t\t\tFail in Hindi.                                                              ");
       else if( a[i].getEnglish()<33)
       	  System.out.print("\t|\t\t\tFail in English.                                                            ");
       }
	   else
			System.out.print("\t|\t\t\tPass in all Subjects.                                                                          "); 
			System.out.println("\n\t| Status               :                                                                            ");
      
	if(a[i].getPer()>=33 && a[i].getPer()<100)
		{
           System.out.print("\t|\t\t\tPASS                                                                        ");
         System.out.println("\n\t| Division             :                                                         ");
       if(a[i].getPer()>=60)
      {
           System.out.print("\t|\t\t\tFirst Division                                                            ");
      }
      else if(a[i].getPer()>=45)
      {
           System.out.print("\t|\t\t\tSecond Division                                                           ");
      }
      else if(a[i].getPer()>=33)
      {
           System.out.print("\t|\t\t\tThird Division                                                            ");
      }
      }
		else
           System.out.print("\t|\t\t\tFAIL                                                                      "); 
					
					
	   
        System.out.println("\n\t|___________________________________________________________________________________________________");
						
	
	}
	
	
	
}
class Client
{
	public static int count1;
	private static int passwordLogin; 
	private int i,n;
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Client ob=new Client();
		passwordLogin=1234;
		boolean flage=false;
		do{
			System.out.println("Enter the Password for Login:");
			int newpassword=sc.nextInt();
			if(passwordLogin==newpassword)
			{
				ob.menuHolder(sc);
				flage =true;
				break;
			}
			else
			{
				System.out.println("Password Is Wrrong :  Please Re-Enter :");
				
			}				
				
			}while(!flage);
		
	}
	public  void menuHolder(Scanner sc)
	{
			Client ob=new Client();
			MarksheetPOJO marksheet[]=new MarksheetPOJO[100];
			
			int choice;
			do{
				System.out.println(" =============================================================================================");
				System.out.println("|                                                                                             |");
				System.out.println("|                                                                                             |");
				System.out.println("|\t\t\t <<<< WELCOME IN RGPV UNIVERSITY >>>>> \t\t\t\t      |");
				System.out.println("|                                                                                             |");
				System.out.println("|                                                                                             |");
				System.out.println("|=============================================================================================|");
				System.out.println("|                              ___________                                                    |");
				System.out.println("|                             | HOME MENU |                                                   |");
				System.out.println("|                             |___________|                                                   |");
				System.out.println("|                                                                                             |");
				System.out.println("|    Press 1 for Inserted  Data in Marksheet  :                                               |");
				System.out.println("|    Press 2 for Show   Marksheet             :                                               |");
				System.out.println("|                                                                                             |");
				System.out.println("|    Enter Choice   :                                                                         |");
				System.out.println("|_____________________________________________________________________________________________|");
				choice =sc.nextInt();
				switch(choice)
				{
					case 1:
									System.out.println("<<<<  How many Marksheet You Want    >>>>");
									 n=sc.nextInt();
									for( i=0;i<n;i++)
									{
									
										start(marksheet,count1);
										count1++;
										System.out.println("The COunt IS : "+count1);
									}
									break;
					case 2:
									System.out.println("The count : "+count1);
									ob.Choice(marksheet,count1,sc);
									break;
									
				}
				
				
			}while(choice!=10);
	}
	public static void start(MarksheetPOJO marksheet[],int i){
		Client ob=new Client();
		Scanner sc=new Scanner(System.in);
		
		String Name,FName,MName,Branch,Course,Gmail,Password;
		int roll,Year,Sem,p,c,m,h,e,Total;
		double Per;
			// for( i=0;i<n;i++)
			// {
				marksheet[i]=new MarksheetPOJO();
				System.out.println("\n\t<<<<  Enter the person details: >>>>");
				sc.nextLine();
				System.out.println("\nEnter Gmail Id   :");
				Gmail=sc.nextLine();
				marksheet[i].setGmail(Gmail);
				System.out.println("Creat Password  :");
				Password=sc.nextLine();
				marksheet[i].setPassword(Password);
	
				System.out.println("\nEnter the name ");
				Name = sc.nextLine();
				marksheet[i].setName(Name);
				System.out.println("Enter The Roll Number   :");
				roll=ob.takeRoll(marksheet,i,sc);
				marksheet[i].setRoll(roll);	
				System.out.println("Enter the name of Course");
				Course = sc.nextLine();
				marksheet[i].setCourse(Course);
				sc.nextLine();
			 	System.out.println("Enter the Branch");
				Branch = sc.next();
				marksheet[i].setBranch(Branch);
				sc.nextLine();
				System.out.println("Enter the mother name Mrs.   : ");
				 MName =sc.nextLine();
				 marksheet[i].setMName(MName);
				System.out.println("Enter the fahers name Mr.    : ");
				FName =sc.nextLine();
				 marksheet[i].setFName(FName);
				System.out.println("Enter the year : (--Integer--)");
				Year= ob.cheakYear(sc);
				marksheet[i].setYear(Year);
				System.out.println("Enter the sem  : (--Integer--)");
				Sem =ob.checkSem(sc,Year);
				marksheet[i].setSem(Sem);
				System.out.print("Enter the physics Marks    :   ");
				p=ob.cheakMarks(sc);
				marksheet[i].setPhysics(p);
				System.out.print("Enter the chemistry marks  :   ");
				c=ob.cheakMarks(sc);
				marksheet[i].setChemistry(c);
				System.out.print("Enter the Maths marks      :   ");
				m=ob.cheakMarks(sc);
				marksheet[i].setMaths(m);
				System.out.print("Enter hindi marks          :   ");
				h=ob.cheakMarks(sc);
				marksheet[i].setHindi(h);
				System.out.print("Enter the english marks    :   ");
				e =ob.cheakMarks(sc);
				marksheet[i].setEnglish(e);
				Total=(p+c+m+h+e);
				marksheet[i].setTotal(Total);
				Per=Total/5;
				marksheet[i].setPer(Per);
			
	}
		
		public  int takeRoll(MarksheetPOJO marksheet[],int i,Scanner sc)
		{
			int roll;
			boolean flage;
			do
			{
				flage=false;
				roll=sc.nextInt();
				for(int j=0;i>0&&j<i;j++)
				{
					//System.out.println("Roll"+marksheet[j].getRoll());
					if(marksheet[j].getRoll()==roll)
					{
						System.out.println("The Roll Number is already Exist:");
						flage= true;
					}
				}
			}while(flage);
			return roll;	
		}  
		public static int cheakYear(Scanner sc)
		{
			
			int year=sc.nextInt();
			while(year<0|| year>5)
			{
				System.out.println("Invalid  Marks");
				System.out.println("Please Re-Enter The Year:");
				year=sc.nextInt();
			}
			return year;
		}
		public static int checkSem(Scanner sc,int year)
		{
			int sem = sc.nextInt();
			if(year==1)
			{	
				while(sem!=1 && sem!=2)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   sem = sc.nextInt();
			    }
			}
			
			else if(year==2)
			{
				while(sem!=3 && sem!=4)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   sem = sc.nextInt();
			    }
			}
			
			else if(year==3)
			{
				while(sem!=5 && sem!=6)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   sem = sc.nextInt();
			    }
			}
			
			else if(year==4)
			{
				while(sem!=7 && sem!=8)
			    {
				   System.out.println(" Invalid Semester...");
				   System.out.print("\n Re-Enter Semester         : ");
				   sem = sc.nextInt();
			    }
			}
			
			return sem;
		}
		public static int cheakMarks(Scanner sc)
		{
			int marks=sc.nextInt();
			while(marks < 0||marks>100)
			{
				System.out.println("Invalid  Marks");
				System.out.println("Please Re-Enter The Marks:");
				marks=sc.nextInt();
			}
			return marks;
		}
		public void Choice(MarksheetPOJO marksheet [],int n,Scanner sc)
		{
			
			  
			int ch,c,searchRoll;
			String name1,pass,gmail;
			do
			{
				System.out.println(" _____________________________________________________________________________________________");
				System.out.println(" _____________________________________________________________________________________________");
				System.out.println("|            <<<<< Your Choices Are:  >>>>>                                                   |");
				System.out.println("|_____________________________________________________________________________________________|");
				System.out.println("|    Press 1 for Show All Marksheet  :                                                        |");
				System.out.println("|    Press 2 for Search By Name      :                                                        |");
				System.out.println("|    Press 3 for Search By Roll      :                                                        |");
				System.out.println("|    Press 4 for Search By Divion    :                                                        |");
				System.out.println("|    Press 10 for Goto Home Page     :                                                        |");
				System.out.println("|                                                                                             |");
				System.out.println("|Enter the Choice:                                                                            |");
				System.out.println("|_____________________________________________________________________________________________|");
				ch=sc.nextInt();
				sc.nextLine();
				System.out.println("Firts Fill Data Of Student  :");
				switch(ch)
				{
					
					
					case 1:
							for(int i=0;i<n;i++)
							{
								System.out.println("Value of count : "+n);
								MarksheetOperation.printMarksheet(marksheet,i);
							}
							break;
					case 2:
								c=0;
								System.out.println("Enter Name : ");
								name1 = sc.nextLine();
								System.out.println("Enter Name Gmail : ");
								gmail = sc.nextLine();
								System.out.println("Enter Name Password : ");
								pass = sc.nextLine();
								for(int i=0;i<n;i++)
								{
						
									if(marksheet[i].getName().equalsIgnoreCase(name1)&&marksheet[i].getGmail().equalsIgnoreCase(gmail)&&marksheet[i].getPassword().equalsIgnoreCase(pass))
									{
										MarksheetOperation.printMarksheet(marksheet,i);
										c++;
									}
								}
								if(c==0)
								{
									System.out.println("Password and gmail Is not match:");
								}
								break;
					case 3:
								c=0;
								System.out.println("Enter Roll Number  : ");
								searchRoll = sc.nextInt();
								System.out.println("Enter Name Gmail : ");
								gmail = sc.nextLine();
								System.out.println("Enter Name Password : ");
								pass = sc.nextLine();	
								for(int i=0;i<n;i++)
								{
									if(marksheet[i].getRoll()==searchRoll&&marksheet[i].getGmail().equalsIgnoreCase(gmail)&&marksheet[i].getPassword().equalsIgnoreCase(pass))
									{
										MarksheetOperation.printMarksheet(marksheet,i);
										c++;
										break;
									}
								}
								if(c==0)
								{
									System.out.println("Password and gmail Is not match::");
								}
								break;
					case 4: 
							int choice;
							do
							{
								System.out.println("\n\t<<<<< Your Choices Are:  >>>>> ");
								System.out.println("\t press 1 for First Divison    :");
								System.out.println("\t press 2 for Second Divison   :");
								System.out.println("\t press 3 for Third Divison    :");
								System.out.println("\t press 4 for Fail             :");
								System.out.println("\t press 5 for Exit The Choices  :");
								System.out.println("Enter the Choice:");
								choice=sc.nextInt();
								switch(choice)
								{
									case 1:
											c=0;
											for(int i=0;i<n;i++)
											{
												if(marksheet[i].getPer()>60 && marksheet[i].getPer()<=100)
												{
													MarksheetOperation.printMarksheet(marksheet,i);
													c++;
												}
											}
											if(c==0)
											{
												System.out.println("No Available of first Division Student :");
											}
											break;
								case 2:
											c=0;
											for(int i=0;i<n;i++)
											{
												if(marksheet[i].getPer()>=45 && marksheet[i].getPer()<60)
												{
													MarksheetOperation.printMarksheet(marksheet,i);
													c++;
												}
											}
											if(c==0)
											{
												System.out.println("No Available of Second Division Student :");
											}
											break;
							case 3:
											c=0;
											for(int i=0;i<n;i++)
											{
												if(marksheet[i].getPer()>=33 && marksheet[i].getPer()<45)
												{
													MarksheetOperation.printMarksheet(marksheet,i);
													c++;
												}
											}
											if(c==0)
											{
												System.out.println("No Available of Third Division Student :");
											}
											break;
							case 4:
											c=0;
											for(int i=0;i<n;i++)
											{
												if(marksheet[i].getPer()<33)
												{
													MarksheetOperation.printMarksheet(marksheet,i);
													c++;
												}
											}
											if(c==0)
											{
												System.out.println("No Available Fail Student :");
											}
											break;
								}
							}while(choice!=5);
				case 10:
						
						menuHolder(sc);
						break;
				}			
			}while(ch!=10);
			
		}
}