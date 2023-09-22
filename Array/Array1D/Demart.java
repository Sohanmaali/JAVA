import java.util.Scanner;
class Demart
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String  name,gen,gift,item1,item2,item3,item4,item5,item6,item7,item8,item9,item10;
		double total,total1=0,tol1,tol2,tol3,tol4,tol5,tol6,tol7,tol8,tol9,tol10;
		double dis,dis1,dis2,dis3,after4,after1=0,gst;
		System.out.println("Enter Today Date :");
		int Date = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Name :");
		name = sc.nextLine();
		System.out.println("Enter your Gender:");
		gen = sc.nextLine();
		if(gen=="male"||gen=="Male")
		{
			gift = "Wallet";
		}
		else if(gen=="female"||gen=="Female")
		{
			gift = "Cadberrey";
		}
		System.out.println("Enter The First Product Name Is :");
		item1 = sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int  quant1 = sc.nextInt();
		if(quant1>4)
		{
			tol1 = quant1*10;
			dis = tol1*5/100;
		    after1 = tol1-dis;
		}
		else
		{
			tol1 =quant1*10; 
		}
		System.out.println("Enter The Second  Product Name Is :");
		item2 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant2 = sc.nextInt();
		tol2 = quant2*20;
		System.out.println("Enter The Third Product Name Is :");
		item3 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant3 = sc.nextInt();
		tol3 =quant3*30;
		System.out.println("Enter The Fourth Product Name Is :");
		item4 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant4 = sc.nextInt();
		tol4 =quant4*40;
		System.out.println("Enter The Fifth Product Name Is :");
		item5 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant5 = sc.nextInt();
		tol5 = quant5*50;
		dis1 = (tol5*10)/100;
		double after2 = tol5-dis1;
		System.out.println("Enter The Sixth Product Name Is :");
		item6 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant6 = sc.nextInt();
		tol6 =quant6*60;
		System.out.println("Enter The seventh Product Name Is :");
		item7 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant7 = sc.nextInt();
		tol7 =quant7*70;
		System.out.println("Enter The Eighth Product Name Is :");
		item8 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant8 = sc.nextInt();
		tol8 =quant8*80;
		System.out.println("Enter The Ninth Product Name Is :");
		item9 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant9 = sc.nextInt();
		tol9 =quant9*90;
		System.out.println("Enter The Tenth Product Name Is :");
		item10 = sc.nextLine();
		sc.nextLine();
		System.out.println("How many quantity are purchase :");
		int quant10 = sc.nextInt();
		if(quant10>=20)
		{
			tol10 = quant10*100;
			dis2 = tol10*15/100;
			double after3 = tol10-dis2;
		}
		else
		{
			tol10 =quant10*100; 
		}
		total=tol1+tol2+tol3+tol4+tol5+tol6+tol7+tol8+tol9+tol10;
		if(total>=10000)
		{
			dis3 =(total*15)/100;
		    after4 = total-dis3;
		    gst =(after4*10)/100; 
			total1 = after4+gst;
			
		}
		else if(total>=5000)
		{
			dis3 =(total*10)/100;
			after4 = tol10-dis3;
			gst =(after4*10)/100;
			total1 = after4+gst;
		}
		System.out.println("If you want to purchase carry bag press 'y'&'Y':");
		char ch = sc.next().charAt(0);
		if(ch=='y'||ch=='y')
		{
			int bag=0;
			bag= bag+10;
			total1 = total1+10;
		}
     	System.out.println("|-------------------------------------------------------------------------------|");  
        System.out.println("|                               "+"D-mart"+"                                    |");
      	System.out.println("|Name    :"+name+"                                   Date :"+Date+"             |");
		System.out.println("|-------------------------------------------------------------------------------|");
      	System.out.println("|   Item Name      Quantity       Price         Total        After-Discount     |");
      	System.out.println("|  "+item1+"      "+quant1+"      10 Rs        "+tol1+"         "+after1+"      |");
     	System.out.println("|                                                                               |");
      	System.out.println("|                                                                               |");
		System.out.println("|                                                                               |");
      	System.out.println("|                                                                               |");
     	System.out.println("|                                                                               |");
      	System.out.println("|                                                                               |");
		System.out.println("|                                                                               |");
      	System.out.println("|                                                                               |");
     	System.out.println("|                                                                               |");
      	System.out.println("|                                                                               |");
      	System.out.println("-------------------------------------------------------------------------------"); 		
	}
}
