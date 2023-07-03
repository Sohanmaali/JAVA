import java.util.Scanner;
class Book
{
	double price;
	String type;
	int page;
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPage(int page)
	{
		this.page = page;
	}
	public int getPage()
	{
		return this.page;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return this.type;
	}	
}
class Parmpara extends Book
{
	private String writer;
	private String name;
	public void setWriter(String writer)
	{
		this.writer = writer;
	}
	public String getWriter()
	{
		return this.writer;
	}	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}	
}
class Main
{
	public static void main(String[]args)
	{
		Parmpara ob =new Parmpara();
		ob.setPrice(450);
		ob.setPage(300);
		ob.setType("Saanskratik-book");
		ob.setWriter("Narayan-singh");
		ob.setName("Parampara");
		System.out.println("Book name : "+ob.getName());
		System.out.println("Book Writer : "+ob.getWriter());
		System.out.println("Book Type : "+ob.getType());
		System.out.println("Book Page : "+ob.getPage());
		System.out.println("Book Price : "+ob.getPrice());
		
	}
} 
