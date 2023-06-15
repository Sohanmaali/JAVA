import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;
class Hfactorial
{
	public static void main(String args[])
	{
		BigInteger fact = new BigInteger("1");
		
		for(int i = 1;i<=100;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
			
		}
		System.out.println(fact);		
	}
}