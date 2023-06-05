import java.util.Scanner; 

class ElderMan
{
	public void elderMan()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age of Ram");
		int ram = sc.nextInt();
		
		System.out.println("Enter Age of Syam");
		int syam = sc.nextInt();
		
		System.out.println("Enter Age of Raj");
		int raj = sc.nextInt();	
		
		if(ram>syam)
		{	
			if(ram>raj)
			{
				System.out.println("Ram is Elder");
			}
			else
			{
				System.out.println("Raj is Elder");
			}
		}
		else if(syam>raj)
		{
			System.out.println("syam is Elder");
		}
		else
		{
			System.out.println("Raj is Elder");
		}
	}
	public static void main(String args[])
	{
		ElderMan ob = new ElderMan();
		ob.elderMan();
	}
}