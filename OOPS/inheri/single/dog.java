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

class Dog extends Animal 
{
    private String sound;

    public void setData(String eat, String tail,float hight, int age,int weight,String sound) 
	{
        this.setData(eat, tail,hight,age,weight);
        this.sound = sound;
    }

    public String getSound()
	{
        return this.sound;
    }
}

class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Dog ob = new Dog();
		
		String eat,tail,sound;
		float hight;
		int age,weight;
		
		System.out.println("Enter Dog Eating");
		eat = sc.nextLine();
		
		System.out.println("Enter Dog tail");
		tail = sc.nextLine();
		
		System.out.println("Enter Dog Hight");
		hight = sc.nextFloat();
		
		System.out.println("Enter Dog Age");
		age = sc.nextInt();
		
		System.out.println("Enter Dog Weight");
		weight = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Dog Sound");
		sound = sc.nextLine();
		
		ob.setData(eat,tail,hight,age,weight,sound);
		
		System.out.println("EAT = "+ob.getEat()+"\ntail = "+ob.gettail()+"\nHight = "+ob.getHight()+"\nAge = "+ob.getAge()+"\nWeight = "+ob.getWeight()+"\nSound = "+ob.getSound());
    }
}