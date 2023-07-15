import java.util.Scanner;

interface MyLambda{
    int add(int a,int b);
}

public class Test{
    public static void main(String[] args) {
    
        MyLambda ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));
    
        MyLambda ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));
    }  
}