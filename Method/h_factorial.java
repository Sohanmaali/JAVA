import java.util.Scanner;
class Hfactorial
{
	public static BigInteger factorial(int n)
	{
		BigInteger fact = new BigIntegerS("1");
		for(int i=2;i<=n;i++)
		{
			fact=fact.multiply(BigInteger.ValueOf(i));
		}
		return fact;
	}
	public static void main(String args[])
	{
		System.out.println(factorial(100));
	}
}