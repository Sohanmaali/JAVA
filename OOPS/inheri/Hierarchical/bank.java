class Bank 
{
	long acc;
    String ifsc;
    String type;
	String name;

	public Bank()
	{
		this.acc = 0;
		this.ifsc = "";
		this.type = "";
		this.name = "";
	}
	public Bank(Long acc,String ifsc,String type,String name)
	{
		this.acc = acc;
		this.ifsc = ifsc;
		this.type = type;
		this.name = name;
	}
	void show() 
	{
		System.out.println("ACOUNT TYPE : "+this.type);
		System.out.println("BANK NAME : "+this.name);
		System.out.println("IFSC CODE : "+this.ifsc);
		System.out.println("ACCOUNT : "+this.acc);
	}
}

class SBI extends Bank
{
    String atm;
	public SBI()
	{
		super();
        this.atm = "";
	}
    public SBI(Long acc,String ifsc,String type,String name)
	{
		super(acc,ifsc,type,name);
        this.atm = "Provide";
	}
	public void show() 
	{
        System.out.println("STATE BANK OF INDIA");
		super.show();
        System.out.println("ATM CARD = "+this.atm);
	}
}

class BOI extends Bank
{
    String dCard;
	public BOI()
	{
		super();
        this.dCard = "";
	}
    public BOI(Long acc,String ifsc,String type,String name)
	{
		super(acc,ifsc,type,name);
        this.dCard = "Provide";
	}
	public void show() 
	{
        System.out.println("BANK OF BARODA");
		super.show();
        System.out.println("DEBIT CARD = "+this.dCard);
	}
}

class Main 
{
	public static void main(String[] args) 
	{
		SBI sbi = new SBI(256565656l,"SBI066","GOV","SBI");
		BOI boi = new BOI(56565656l,"BOI5656","PRIVATE","BOI");

		sbi.show();
        System.out.println("");
		boi.show();		
	}
}