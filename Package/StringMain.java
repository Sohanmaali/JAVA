import java.util.Scanner;
import package1.StringOperation;

class StringMain
 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		
		System.out.println("Enter 2 String");
		String str1 = sc.nextLine();
	
		StringOperation ob = new StringOperation();
		
		/* if(ob.equal(str,str1))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are differante");
		} */
		
		System.out.println(ob.length1(str));
	}
}