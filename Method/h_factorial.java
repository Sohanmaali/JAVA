import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;
class Hfactorial
{
	public static void main(String args[])
	{
		BigInteger fact = new BigInteger("1");
		BigInteger n = new BigInteger("100");
		for(int i = 1; i<=n;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);		
	}
}