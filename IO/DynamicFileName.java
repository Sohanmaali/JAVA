import java.io.*;
import java.util.Scanner;
class DynamicFileName 
{
    public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File Name :");
		
        String fileName = sc.next(); 
		// fileName+="."+"text";
		File fb = new File("D:/JAVA/IO/File/"+fileName);
		
		
        FileOutputStream fos = new FileOutputStream(fb);
		

		System.out.println("Enter File content");
		sc.nextLine();
        String content = sc.nextLine();
		
        fos.write(content.getBytes());
        
		fos.close();
        
		System.out.println("File created: " + fileName);
	}
}