import java.util.*;
import java.io.*;

class Captcha
{

	public String generateCaptcha(int n)
	{
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQURSTUVWQYZ0123456789";
		String captch = "";
		while(n-- > 0)
		{
			int index = (int)(Math.random()*62);
			captch+= str.charAt(index);
		}			
		return captch;
	}
	public static void main(String args[])
	{
		Captcha ob = new Captcha();
		Scanner sc = new Scanner(System.in);
	
		boolean flage = false;
		String captcha = ob.generateCaptcha(6);
		System.out.println(captcha);
		do
		{
			String userCaptcha = sc.nextLine();
			if(userCaptcha.equals(captcha))
			{
				System.out.println("Captcha Matched");
				flage = true;
			}
			else
			{
				System.out.println("Captcha Not Matched");
			}
		}while(!flage);
	}
}