
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        char gen;
        System.out.println("Enter age");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Genger");
        gen = sc.next().charAt(0);
        System.out.println("age = "+age);
        System.out.println("Gender = "+gen);

        if((age>20&&40<age))
        {
			if('f'==gen)
         System.out.println("Work only urban Area");
        }
        else if(('m'==gen&&(age>20&&40<age)))
        {
            System.out.println("Work anywhere");
        }
       else if('f'==gen)
      {
			System.out.println("not allow to work in any servisec");
      }
        else
        {
            System.out.println("Error");
			 System.out.println("age = "+age);
        System.out.println("Gender = "+gen);
        }
    }
}
