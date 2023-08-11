//WAP Fectoriyal Serices sum 1!/2 + 2!/3 + 3!/4 + 4!/5 + 5!/6 =  27.46
import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String args[]) throws Exception
	{
		//File ob = new File("Series.txt");
		FileOutputStream obj = new FileOutputStream("D:/JAVA/IO/File/Fect_Serices.txt");
		int n,i=1;
		int  sum=0,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
			sum=sum+(fact/(i+1));
			if(i>1)
			{
				//System.out.print(" + ");
				obj.write(43); // + Ascaii Value
			}
			//System.out.print(i+"!/"+(i+1));
			obj.write(i+48);
			obj.write(33); //! Ascaii Value
			obj.write(i+49);
			
		}
		//String sumStr = String.format(sum);
		obj.write(61);//Equal Ascaii ValueBase
		String s = Integer.toString(sum);
		byte a[]= s.getBytes();
		obj.write(a);
		//System.out.println(" = "+sum);
	}
}