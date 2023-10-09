//import java.lang.*;
class Main {
	public static void main(String args[]) {
		Trancection1 tran = new Trancection1(100000.0);
		MyThread myt1 = new MyThread(tran);
		MyThread myt2 = new MyThread(tran);
		MyThread myt3 = new MyThread(tran);
		MyThread myt4 = new MyThread(tran);
	}
}

class MyThread extends Thread {
	Trancection1 tran;

	MyThread() {
	}

	MyThread(Trancection1 tran) {
		this.tran = tran;
		this.start();
	}

	public void run() {
		tran.withdrow(1000.0, this);
	}
}

class Trancection1 {
	double balance;

	Trancection1() {
	}

	Trancection1(double balance) {
		this.balance += balance;
	}

	public void withdrow(double amount, Thread ref) {
		/*
		 * while(balance>0)
		 * {
		 */
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Total amout = " + ref.getName() + " = " + balance);
			// System.out.println();
		} else {
			System.out.println("Insufisent Balance");
		}
		// }
	}
}