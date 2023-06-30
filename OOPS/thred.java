class Table  
{     
	static void printTable(int n)
	{    
		for(int i=1;i<=5;i++)
		{
			System.out.print(n*i+" ");    
		}    
	}    
}    
class First 
{    
	public void run()	
	{    
		Table.printTable(1);    
	}    
}    
class Second
{    
	public void run()
	{    
		Table.printTable(10);    
	}    
}    
class Third
{    
	public void run()
	{    
		Table.printTable(100);    
	}    
}    
class Fourth
{    
	public void run()
	{    
		Table.printTable(1000);    
	}    
}    
class Test extends Thread
{    
	public static void main(String t[])
	{    
		/* First t1 = new First();    
		Second t2 = new Second();    
		Third t3 = new Third();    
		Fourth t4 = new Fourth();     */
		Table ob = new Table();
		Table ob1 = new Table();
		/* t1.run();    
		t2.run();    
		t3.run();    
		t4.run(); */
		ob.printTable(2);
		ob1.printTable(4);
	}
}