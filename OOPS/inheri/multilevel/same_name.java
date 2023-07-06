class Test 
{
	int x;
    public Test(int x)
	{
		this.x= x;
	}
	public void show()
	{
		System.out.println("First x = "+x);
	}
}

class Test1 extends Test 
{
    int x;
    public Test1(int x,int x1)
	{
		super(x);
		this.x = x1;
	}
	public void show()
	{
		super.show();
		System.out.println("Second Y = "+this.x);
	}
}

class Test2 extends Test1 
{
    int x;
    public Test2(int x,int x1,int x3)
	{
		super(x,x1);
		this.x = x3;
	}
	public void show()
	{
		super.show();
		System.out.println("Third Z = "+this.x);
	}
}

class Same
{
    public static void main(String[] args) 
	{
        Test2 ob = new Test2(8,12,15);
        ob.show();
    }
}