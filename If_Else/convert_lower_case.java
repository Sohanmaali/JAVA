import java.util.Scanner;
class ConvertLower
{
	public static void main(String[]args)                                  
	{
		char ch;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter any charector");
		ch = sc.next().charAt(0);
		int num = (int) ch;
	
		if(num>=65||num<=90)
		{
			num=num+32;
			char al = (char) num;
			System.out.println("lower case of "+ch+" = "+al);
		else 
		{
			System.out.println("Please Enter Upper Case Alfabate");
		}
	}
}