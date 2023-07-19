import com.JAVA.Package.Density;
import java.util.Scanner;

public class ClinteClass {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Foure value ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		double side4 = sc.nextDouble();
		
		Density ob3 = new Density(side1,side2,side3,side4);
		
		double res;
		
		res = ob3.rectangleArea();
		System.out.println("Area = "+res);
		
		res = ob3.rectVol();
		System.out.println("Volume = "+res);
		
		res = ob3.rectDensity();
		System.out.println("Density = "+res);
		
	}
}