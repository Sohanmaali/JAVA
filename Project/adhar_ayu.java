import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class AdharAyu
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name,dob,gen,num;
		System.out.println("\tCHOICE ARE:");
		System.out.println("\tpress 1 for Adhar card ");
		System.out.println("\tpress 2 for Ayushman card ");

		System.out.println("\nEnter your choice:");
		int ch = sc.nextInt();
		sc.nextLine();
		switch(ch)
		{   
			case 1:
				
				System.out.println("Enter Name"); 
				name = sc.nextLine();
		
				System.out.println("Enter  Gender"); 
				gen = sc.nextLine();
			
				System.out.println("Enter  DOB"); 
				dob = sc.nextLine();
				
				System.out.println("Enter a num"); 
				num = sc.nextLine();
			
				System.out.println("_____________________________________________");
				System.out.println("|            Government Of India             |");
				System.out.println("| _________                                  |");
				System.out.println("||         |  "+name+"     \t\t     |");
				System.out.println("||         |  "+dob+"                     |");
				System.out.println("||         |  "+gen+"                 \t     |");
				System.out.println("||         |                                 |");
				System.out.println("||_________|                                 |");
				System.out.println("|                                            |");
				System.out.println("|            "+num+"                  |");
				System.out.println("|       vid :  9152 5660 9856 0923           |");
				System.out.println("|____________________________________________|");
				break;
		
			case 2:
		
				System.out.println("Enter name");
				name = sc.nextLine();

				System.out.println("Enter date of birth");
				dob = sc.nextLine();

				System.out.println("Enter Gender");
				gen = sc.next();

				System.out.println("______________________________________________ ");
				System.out.println("|             AYUSHMAN CARD           \t      |");
				System.out.println("| _________                           \t      |");
				System.out.println("||         | NAME: "+name+"         \t      |");
				System.out.println("||         | DOB: "+dob+"           \t      |");
				System.out.println("||         | GENDER: "+gen+"            \t      |");
				System.out.println("||         |                          \t      |");
				System.out.println("||_________|                    ******\t      |");
				System.out.println("|                               ******\t      |");
				System.out.println("|    |||||||||||||||||          ******\t      |");
				System.out.println("|        QWRT23456                    \t      |");
				System.out.println("|_____________________________________________|");
				break;
		}
	}
}
