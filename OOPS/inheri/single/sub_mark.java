import java.util.Scanner; 
class SubMarkTenth 
{
	int so_since,shanshkrat,math,hindi,english;
	public void setData(int so_since, int shanshkrat, int math, int hindi, int english)	
	{
		this.so_since = so_since;
		this.shanshkrat = shanshkrat;
		this.math = math;
		this.hindi = hindi;
		this.english = english;		
	}
	public void printMarks1()
	{
		System.out.println("so_since :"+so_since);
		System.out.println("shanshkrat :"+this.shanshkrat);
		System.out.println("math :"+math);
		System.out.println("hindi :"+this.hindi);
		System.out.println("english :"+this.english);
	}
}    
class twelve extends SubMarkTenth
{
	private int physics,chemistry;
	public void setData(int math, int hindi, int english,int so_since,int shanshkrat,int physics, int chemistry)
	{
		this.setData(so_since,shanshkrat,math,hindi,english);
		this.physics= physics;
		this.chemistry = chemistry;
	}
	public void printMarks()
	{
		this.printMarks1();
		System.out.println("physics :"+this.physics);
		System.out.println("chemistry :"+this.chemistry);
	}
}
class Mark
{
	public static void main(String t[])
	{	Scanner sc = new Scanner(System.in);
		int physics,chemistry,math,hindi,english,so_since,shanshkrat;
		System.out.println("Enter all sub marks");
		
		math = sc.nextInt();
		
		hindi = sc.nextInt();
		english = sc.nextInt();
		so_since = sc.nextInt();
		shanshkrat = sc.nextInt();
		physics = sc.nextInt();
		chemistry = sc.nextInt();
		twelve ob = new twelve();
		System.out.println("Marks of tenth");
		ob.setData(math,hindi,english,so_since,shanshkrat);
		ob.printMarks1();
		
		ob.setData(math,hindi,english,so_since,shanshkrat,physics,chemistry);
		System.out.println("Marks of twelveth");
		ob.printMarks();
	}
}