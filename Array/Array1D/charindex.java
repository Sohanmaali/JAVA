import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter your Name:");
	 String n = sc.nextLine();
	 System.out.println("Enter letter");
	 int m = sc.nextInt();
	 System.out.println(n.charAt(m));
	}

}