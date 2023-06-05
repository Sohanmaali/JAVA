import java.util.Scanner; 

class CheckNumAgeCri
{
	public void checkNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int num = sc.nextInt();
		
		String str = (num<0?"Negetie Num":(num>0?"Positive num":"Zero"));
		
		System.out.println(str);
	}
	public void ageCri()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Age");
		int age = sc.nextInt();
		
		String str = (age<0?"Invalide Age":(age<13?"Child":age<20?"Teen":(age<60?"Young":"Old")));
		
		System.out.println(str);
	}
	
	public void alfabate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Char");
		char ch = sc.next().charAt(0);
		
		String str = (ch<0?"Invalide Age":(ch>=65&&ch<=90?"Upper case Alfabate":(ch>=97&&ch<=122?"Lower case Alfabate":"Not a char")));
		
		System.out.println(str);
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Check Negetive Positive\n\t2 For Age Criteria\n\t3 For check Alfabate or not");
		int choice = sc.nextInt();
		
		CheckNumAgeCri ob = new CheckNumAgeCri();
		
		switch(choice)
		{
			case 1:
				ob.checkNum();
				break;
			case 2:
				ob.ageCri();
				break;
			case 3:
				ob.alfabate();
				break;
		}
	}
}