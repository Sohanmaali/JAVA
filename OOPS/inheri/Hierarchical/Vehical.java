class Vehical {
    int capacity;
    public Vehical() {
        this.capacity = 0;
    }
    public Vehical(int capacity) {
        this.capacity = capacity;
    }
    public void show() {
        System.out.println("Capcity = "+this.capacity);
    }
}
class Car extends Vehical {
    int wheels;
    int get;
    public Car() {
        super();
        this.wheels = 0;
        this.get = 0;
    }
    public Car(int capacity ,int wheels,int get) {
        super(capacity);
        this.wheels = 0;
        this.get = 0;
    }
    public void show() {
        super.show();
        System.out.println("Car Wheels = "+this.wheels);
        System.out.println("Car gets = "+this.get);
    }
}
class Ship extends Vehical {

    public Ship() {
        super();
        
    }
    public Ship(int capacity) {
        super(capacity);
       
    }
    public void show() {
        super.show();
        System.out.println("Ship run on Wather");
    }
    
}
class MoveClass{
    public static void main(String[] args) {
        Car ob = new Car(4,4,4);
        ob.show();
        Ship ob1 = new Ship(150);
        ob1.show();
    }
}

