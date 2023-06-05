import java.util.Scanner; 

class ConvertUpper
{
	public void convert()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any two number ");
		char ch = sc.next().charAt(0);
		
		if(ch>='a'&&ch<='z')
		{
			
			System.out.println("Upper case of "+ch+" = "+(char)(ch-32));
		}
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("lower case of "+ch+" = "+(char)(ch+32));
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	public static void main(String args[])
	{
		ConvertUpper ob = new ConvertUpper();
		ob.convert();
	}
}
