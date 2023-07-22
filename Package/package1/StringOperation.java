package package1;

public class StringOperation
{
	public boolean equal(String str, String str1) 
	{
		if (str.length() != str1.length())
		{
			return false;
		}
		for (int i = 0; i < str.length(); i++) 
		{
			char a = str.charAt(i);
			char b = str1.charAt(i);

			if (a != b) 
			{
				return false;
			}
		}
		return true;
	}
	public int length1(String str)
	{
		int s=0;
		char st[] = str.toCharArray();
		for(int x:st)
		{
			s++;
		}
		return s;
	}
	
}