
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String gen;
        System.out.println("Enter age");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Genger");
        gen = sc.nextLine();
        System.out.println("age = "+age);
        System.out.println("Gender = "+gen);
        if((gen=="female")&&(age>20&&40<age))
        {
         System.out.println("Work only urban Area");   
        }
        else if((gen=="male"&&(age>20&&40<age)))
        {
            System.out.println("Work anywhere");
        }
       else if(gen=="female")
       {
            System.out.println("not allow to work in any servisec");
        }
        else 
        {
          
             System.out.println("Error");
        }
    }
}


/*public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String gen;
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Gender:");
        gen = sc.nextLine();
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gen);
        
        if (("female".equalsIgnoreCase(gen)) && (age > 20 && age < 40)) {
            System.out.println("Work only in urban areas.");
        } else if (("male".equalsIgnoreCase(gen)) && (age > 20 && age < 40)) {
            System.out.println("Work anywhere.");
        } else if (age > 40 && "female".equalsIgnoreCase(gen)) {
            System.out.println("Not allowed to work in any service.");
        } else {
            System.out.println("Error: Invalid input.");
        }
    }
}
*/