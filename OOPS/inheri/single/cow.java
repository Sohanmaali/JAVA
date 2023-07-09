import java.util.Scanner; 
class Animal 
{
    private String eat;
    private String tail;
    private float hight;
    private int weight;
    private int age;

    public void setData(String eat, String tail,float hight,int age,int weight)
	{
        this.eat = eat;
        this.tail = tail;
        this.hight = hight;
        this.weight = weight;
		this.age = age;
    }

    public String getEat() 
	{
        return this.eat;
    }

    public String gettail()
	{
        return this.tail;
    }
	public float getHight()
	{
        return this.hight;
    }
	public float getAge()
	{
        return this.age;
    }
	public float getWeight()
	{
        return this.weight;
    }
}

class Cow extends Animal 
{
    private String sound;
    private String breed;

    public void setData(String eat, String tail,float hight, int age,int weight,String breed,String sound) 
	{
        this.setData(eat, tail,hight,age,weight);
        this.sound = sound;
        this.breed = breed;
    }

    public String getSound()
	{
        return this.sound;
    }
	
	public String getBreed()
	{
        return this.breed;
    }
}

class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Cow ob = new Cow();
		
		String eat,tail,sound,breed;
		float hight;
		int age,weight;
		
		System.out.println("Enter Cows Eating");
		eat = sc.nextLine();
		
		System.out.println("Enter Cows tail");
		tail = sc.nextLine();
		
		System.out.println("Enter Cows Hight");
		hight = sc.nextFloat();
		
		System.out.println("Enter Cows Age");
		age = sc.nextInt();
		
		System.out.println("Enter Cows Weight");
		weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Cows Breed");
		breed = sc.nextLine();
		
		System.out.println("Enter Cows Sound");
		sound = sc.nextLine();
		
		ob.setData(eat,tail,hight,age,weight,breed,sound);
		
		System.out.println("EAT = "+ob.getEat()+"\ntail = "+ob.gettail()+"\nHight = "+ob.getHight()+"\nAge = "+ob.getAge()+"\nWeight = "+ob.getWeight()+"\nSound = "+ob.getSound());
    }
}