import java.util.Scanner;
class Vaccin
{
	public static void main(String[]args)                                  
	{
		int num,age,dose=0;
		
		String name,gen;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name"); 
		name = sc.nextLine();
		
		System.out.println("Enter  Age"); 
		age = sc.nextInt();
		sc.nextLine();
	
		System.out.println("Enter  Gender"); 
		gen = sc.nextLine();
		
		System.out.println("\t ______________________________________________________________________________________");
		System.out.println("\t|\n\t|        \t       Ministry of Health & Family Walfare             ");
		System.out.println("\t|           	              Goverment of India       \n\t|      ");
		System.out.println("\t|           	        Certificate ID 83620692649      \n\t|      ");
		System.out.println("\t|         Provisional Certificate for COVID-19 Vaccination "+dose);
		System.out.println("\t|\n\t|\n\t|");
		System.out.println("\t|  Beneficiary Details   \n\t| ");
		System.out.println("\t|  Beneficiary Name                               "+name);
		System.out.println("\t|  Age      \t\t\t\t\t  "+age);
		System.out.println("\t|  Gender \t\t\t\t\t  "+gen);
		System.out.println("\t|  ID Verified                                     ");
		System.out.println("\t|  Unique Health ID (UHID)                        50-1710-0231-1111");
		System.out.println("\t|  Beneficiary Reference ID                       7659656646665643\n\t|\n\t|");
		System.out.println("\t|  Vaccination Details\n\t|");
		System.out.println("\t|  Vaccination Name                               COVISHIELD");
		System.out.println("\t|  Date of 1st Dose                               07 Sep 2022");
		System.out.println("\t|  Next Due date                                  Between 30 nov 2021 and 28 Dec 2022");
		System.out.println("\t|  Vaccinated by                                  Sohan maali");
		System.out.println("\t|  Vaccination at                                 Amla khategaon");
		System.out.println("\t|_____________________________________________________________________________________");
		
	}
}