class Bank 
{
	long acc;
    String ifsc;
    String type;

	public Bank()
	{
		this.acc = 0;
		this.ifsc = "";
		this.type = "";
	}
	public Bank(Long acc,String ifsc,String type)
	{
		this.acc = acc;
		this.ifsc = ifsc;
		this.type = type;
	}
	void show() 
	{
		System.out.println("ACOUNT TYPE : "+this.type);
		System.out.println("IFSC CODE : "+this.ifsc);
		System.out.println("ACCOUNT : "+this.acc);
	}
}

class SBI extends Bank
{
    String tC;
	public SBI()
	{
		super();
        this.tC = "";
	}
    public SBI(Long acc,String ifsc,String type)
	{
		super(acc,ifsc,type);
        this.tC = "Lunch ke bad Aanaaaaa.......";
	}
	public void show() 
	{
        System.out.println("STATE BANK OF INDIA");
		super.show();
        System.out.println("TC = "+this.tC);
	}
}

class BOI extends Bank
{
    String tc;
	public BOI()
	{
		super();
        this.tc = "";
	}
    public BOI(Long acc,String ifsc,String type)
	{
		super(acc,ifsc,type);
        this.tc = "Server NOt Working";
	}
	public void show() 
	{
        System.out.println("BANK OF BARODA");
		super.show();
        System.out.println("TC = "+this.tc);
	}
}


class Main 
{
	public static void main(String[] args) 
	{
		SBI sbi = new SBI(256565656l,"SBI066","GOV");
		BOI boi = new BOI(56565656l,"BOI5656","PRIVATE");
		
		sbi.show();
        System.out.println("");
		boi.show();		
	}
}