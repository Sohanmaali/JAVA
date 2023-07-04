// Java pprogram to automatically generate CAPTCHA and
// verify user
import java.util.*;
import java.io.*;

class Captcha
{
	static boolean checkCaptcha(String captcha, String user_captcha)
	{
		return captcha.equals(user_captcha);
	}

	static String generateCaptcha(int n)
	{
		
		String chrs = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
		String captcha = "";
		while (n-- > 0)
		{
			int index = (int)(Math.random()*62);
			captcha+=chrs.charAt(index);
		}
		
		return captcha;
	}
	
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
	
		String captcha = generateCaptcha(6);
		System.out.println(captcha);
		boolean flage;
		do
		{
			flage = true;
			System.out.println("Enter above CAPTCHA: ");
			String usr_captcha = sc.nextLine();
		
			if (checkCaptcha(captcha, usr_captcha))
			{
				System.out.println("CAPTCHA Matched");
				flage = false;
			}
			else
			{
				System.out.println("CAPTCHA Not Matched");
			}
		}while(flage);
	}
}

