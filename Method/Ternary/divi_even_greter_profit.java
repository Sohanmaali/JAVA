import java.util.Scanner; 

class Method
{
	public void divisivalOr()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int num = sc.nextInt();
		
		String str = ((num%5==0&&num%11==0)?"Divisibal by 5 and 11":"Not Divisibal by 5 and 11");
		
		System.out.println(str);
	}
	public void evenOdd()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any num");
		int num = sc.nextInt();
		
		String str = (num%2==0?"Even num":"Odd num");
		
		System.out.println(str);
	}
	
	public void greaterNum()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two num");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		String str = (num>num1?"First Number is greater ":"Second Number is greater");
		
		System.out.println(str);
	}
	
	public void lossProfit()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Purchesing Amount");
		int pur = sc.nextInt();
		
		System.out.println("Enter Shelling Amount");
		int shell = sc.nextInt();		
		
		String str = (pur>shell?"Loss":(shell>pur?"Profit":"No loss no profit"));
		
		System.out.println(str);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Your choice are");
		System.out.println("\t1 For Check A num is divisival or not by 5 and 11\n\t2 Check even Odd\n\t3 For check Greater  num or not\n\t4 For calculate profit loss");
		int choice = sc.nextInt();
		
		Method ob = new Method();
		
		switch(choice)
		{
			case 1:
				ob.divisivalOr();
				break;
			case 2:
				ob.evenOdd();
				break;
			case 3:
				ob.greaterNum();
				break;
			case 4:
				ob.lossProfit();
				break;
		}
	}
}