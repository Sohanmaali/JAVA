import java.util.Scanner;

/* class Main	
{  
	public static void main(String args[])
	{ 
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File Name :");
		String s = sc.next();
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char x = s.charAt(i);
			if(x>=48&&x<=57)
			{
				sum = sum + (x - '0');
			}
		}
		System.out.println("Sum  = "+sum);
	}
} */

class Main {
	public static void main(String[] args) {
		Main.show(2, 1, 3, 4, 5, 6, 9);
	}

	public static void show(int... a) {
		for (int element : a) {
			System.out.println(element);
		}
	}
}
