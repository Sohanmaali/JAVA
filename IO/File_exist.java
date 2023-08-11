import java.io.*;
import java.util.Scanner;
class Operation
{
	public void printFileList()
	{
		File f = new File("D:/JAVA/IO/File");
		
		String[] paths;
		
        paths = f.list();
        
        for(String path:paths) 
		{
            System.out.println(path);
        }
	}
}
class FileExist 
{
    public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter File Name :");
		
        String fileName = sc.next(); 
		
		File fb = new File("D:/JAVA/IO/File/"+fileName);
		
		FileOutputStream fos;
		
		Operation oper = new Operation();
		
		if(fb.exists())
		{
			System.out.println("File Exist");
		}
		else
		{
			System.out.println("File not Exist");
			System.out.println("Do You Want to creat File\n1 For Yes");
			System.out.println("2 For List of Files");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					fos = new FileOutputStream(fb);
					System.out.println("Enter File content");
					sc.nextLine();
					String content = sc.nextLine();
					
					fos.write(content.getBytes());
					
					fos.close();
					
					System.out.println("File created: " + fileName);
					break;
					case 2:
						oper.printFileList();
					break;
			}
		}
	}
}