/* class Time extends Thread
{
	public Time (){
		this.start();
		
	}
	public Time (String name){
		super(name);
		this.start();
	}
    public void run()
	{
		int sec=0,mint = 0,hour = 0;
		System.out.println("hour mint  sec");
		for(;hour<24;sec++)
		{
			if(sec==60)
			{
				mint++;
				sec=0;
			}
			if(mint==60)
			{
				mint=0;
				hour++;
			} 
			System.out.format(" %02d : %02d : %02d\r",hour,mint,sec);
			try
			{
				this.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.print(e);
			}
		}
    }
} */
class Main
{
	public static void main(String[]args) throws InterruptedException                            
	{
		//Time ob = new Time();
		int sec=0,mint = 0,hour = 0;
		System.out.println("hour mint  sec");
		while(true)
		{
			if(sec==60)
			{
				mint++;
				sec=0;
			}
			if(mint==60)
			{
				mint=0;
				hour++;
			} 
			if(hour==24)
			{
				hour=0;
			} 
			System.out.format(" %02d : %02d : %02d\r",hour,mint,sec);
			Thread.sleep(1000);
			sec++;
		}
	}
}