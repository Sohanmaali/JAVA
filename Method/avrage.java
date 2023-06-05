
import java.util.Scanner; 
class Avrage
{  
	public static void avrage()
	{
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three num");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		System.out.println("Avrage of Three num = "+(n1+n2+n3)/3);
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		avrage();
				
	}
}  