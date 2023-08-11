//N even odd num squr

import java.util.Scanner;
class NevenOdd
{
  public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream obj = new FileOutputStream("D:/JAVA/IO/File/Even_Serices.txt");
		
		System.out.println("Enter any num");
		int x = sc.nextInt();
		for(int i = 1;i<=x;i++)
		{
			String even = Integer.toString(i*2);
			obj.write(even)
		}
	}
}		
