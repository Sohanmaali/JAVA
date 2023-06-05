import java.util.Scanner; 

class Marks
{
	public void marks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Five sub Mark");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		if(sub1<0||sub1>100)
		{	
			System.out.println("Invalid Mark of First Sub");
		}
		else if(sub2<0||sub2>100)
		{
			System.out.println("Invalid Mark of Second Sub");
		}
		else if(sub3<0||sub3>100)
		{
			System.out.println("Invalid Mark of Third Sub");
		}
		else if(sub4<0||sub4>100)
		{
			System.out.println("Invalid Mark of Fourth Sub");
		}
		else if(sub5<0||sub5>100)
		{
			System.out.println("Invalid Mark of Fifth Sub");
		}
		else
		{
			System.out.println("Valide marks");
		}
	}
	public static void main(String args[])
	{
		Marks ob = new Marks();
		ob.marks();
	}
}