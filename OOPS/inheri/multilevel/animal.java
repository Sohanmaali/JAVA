class Animal 
{
    void eat() 
	{
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal 
{
    void bark() 
	{
        System.out.println("Dog is barking");
    }
}

class BabyDog extends Dog 
{
    void weep() 
	{
        System.out.println("Baby dog is weeping");
    }
}

class AnimalDog
{
    public static void main(String[] args) 
	{
        BabyDog bd = new BabyDog();
        bd.eat(); 
        bd.bark();
        bd.weep();
    }
}