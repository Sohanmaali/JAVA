import java.util.Scanner; 

class DataClass //POJOCLASS
{
	public static int a = 0;
	public DataClass ()
	{
		a++;
	}
}

class operation //BL
{
	public operation ()
	{
		DataClass.a++;
	}
	public operation (int a)
	{
		//DataClass.a++;
	}
}

class CountObject   //Main class OR Cilnt Class
{
	public CountObject()
	{
		DataClass.a++;
	}
	public static void main(String args[])
	{
		System.out.println(DataClass.a+" ");
		CountObject ob = new CountObject();
		CountObject ob1 = new CountObject();
		operation ob2 = new operation(5);
		operation ob3 = new operation();
		DataClass ob4 = new DataClass();
		DataClass ob5 = new DataClass();
		System.out.println(DataClass.a+" ");
	}
}