import java.util.Scanner; 

class CharCase
{
	public void charCase()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any char number ");
		char ch = sc.next()charAt(0);		
		
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Upper case");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("lower case");
		}
		else
		{
			System.out.println("Invalide char");
		}
	}
	public static void main(String args[])
	{
		CharCase ob = new CharCase();
		ob.charCase();
	}
}
