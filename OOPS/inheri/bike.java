import java.util.Scanner; 
class Vehicle 
{
    private String color;
    private float price;
    private int capacity;

    public void setData(String color,float price,int capacity)
	{
        this.color = color;
        this.price = price;
        this.capacity = capacity;
    }
	public String getColor()
	{
		return this.color;
	}
	public float getPrice()
	{
		return this.price;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
}

class Bike extends Vehicle 
{
	private String numPlat;
	private String horn;
    public void setData(String color,float price,int capacity,String numPlat ,String horn) 
	{
        this.setData(color,price,capacity);
        this.numPlat = numPlat;
        this.horn = horn;
    }
	public String getNumPlat()
	{
		return this.numPlat;
	}
	public String getHorn()
	{
		return this.horn;
	}
}

class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Bike ob = new Bike();
		
		String color,numPlat,horn;
		float hight,price;
		int capacity;
		
		System.out.println("Enter Bike Color");
		color = sc.nextLine();
		
		System.out.println("Enter Bike price");
		price = sc.nextFloat();
		
		System.out.println("Enter Bike Capacity");
		capacity = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Bike num");
		numPlat = sc.nextLine();
		
		System.out.println("Enter Bike horn");
		horn = sc.nextLine();
	
		ob.setData(color,price,capacity,numPlat,horn);
		
		System.out.println("Bike Color = "+ob.getColor()+"\nBike Price = "+ob.getPrice()+"\nBike Capacity = "+ob.getCapacity()+"\nBike Num = "+ob.getNumPlat()+"\nBike Horn = "+ob.getHorn());
    }
}