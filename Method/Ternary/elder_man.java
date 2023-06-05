import java.util.Scanner; 

class AgeCri
{
	public void ageCri()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Age");
		int age = sc.nextInt();
		
		String str = (age<0?"Invalide Age":(age<13?"Child":age<20?"Teen":(age<60?"Young":"Old")));
		
		System.out.println(str);
	}
	public static void main(String args[])
	{
		AgeCri ob = new AgeCri();
		ob.ageCri();
	}
}