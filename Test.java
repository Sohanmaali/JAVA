class Main	
{  
	public static void main(String args[])
	{ Trancection1 tran = new Trancection1(100000.0);
		MyThread myt1 = new MyThread(tran);
		MyThread myt2 = new MyThread(tran);
		MyThread myt3 = new MyThread(tran);
		MyThread myt4 = new MyThread(tran);
	}
}  