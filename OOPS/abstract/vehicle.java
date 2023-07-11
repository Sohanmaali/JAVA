
import java.util.Scanner;

abstract class Vehicle {
    String name;
    String brand;
    String color;
    int capacity;
    double cost;

    public Vehicle() {
        this.name = "";
        this.brand = "";
        this.color = "";
        this.capacity = 0;
        this.cost = 0.0;
    }

    public Vehicle(String name, String brand, String color, int capacity, double cost) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
    }

    public abstract void dirve();

    public abstract void breaK();

    public void display() {
        System.out.println("Name = " + this.name);
        System.out.println("Brand = " + this.brand);
        System.out.println("Color = " + this.color);
        System.out.println("Capacity = " + this.capacity);
        System.out.println("Cost = " + this.cost);
    }
}

abstract class LandTransport extends Vehicle {
    int wheel;

    public LandTransport() {
        super();
        this.wheel = 0;
    }

    public LandTransport(String name, String brand, String color, int capacity, double cost, int wheel) {
        super(name, brand, color, capacity, cost);
        this.wheel = wheel;
    }
}

class Cycle extends LandTransport {

    public Cycle(String name, String brand, String color, int capacity, double cost, int wheel) {
        super(name, brand, color, capacity, cost, wheel);
    }

    public Cycle() {
        super();
    }

    public void dirve() {
        super.display();
        System.out.println("Cycle is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Bike extends LandTransport {

    public Bike(String name, String brand, String color, int capacity, double cost, int wheel) {
        super(name, brand, color, capacity, cost, wheel);
    }

    public Bike() {
        super();
    }

    public void dirve() {
        super.display();
        System.out.println("Bike is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Car extends LandTransport {

    public Car(String name, String brand, String color, int capacity, double cost, int wheel) {
        super(name, brand, color, capacity, cost, wheel);
    }

    public Car() {
        super();
    }

    public void dirve() {
        super.display();
        System.out.println("Car is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

abstract class WaterTranport extends Vehicle {

}

abstract class WithPropelos extends WaterTranport {
    int propelos;

    public WithPropelos() {
        this.propelos = 0;
    }

    public WithPropelos(int propelos) {
        this.propelos = propelos;
    }
}

class Ship extends WithPropelos {
    public void dirve() {
        super.display();
        System.out.println("Bike is wride");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

class Submarin extends WithPropelos {
    public void dirve() {
        super.display();
        System.out.println("Submarin is Drive");
    }

    public void breaK() {
        System.out.println("Procese of Break");
    }
}

abstract class AirTransport extends Vehicle {
    AirTransport() {
    }
}

class Helicopter extends AirTransport {
    int blade;

    public Helicopter() {
        this.blade = 0;
    }

    public Helicopter(int blade) {
        this.blade = blade;
    }

    public void dirve() {
        super.display();
        System.out.println("BLADE = " + this.blade);
    }

    public void breaK() {
        System.out.println("Proces of Break");
    }
}

class Airplane extends AirTransport {

    public void dirve() {
        super.display();
        System.out.println("BLADE = " + this.blade);
    }

    public void breaK() {
        System.out.println("Proces of Break");
    }

}

class Jet extends AirTransport {

    public void dirve() {
        super.display();
        System.out.println("BLADE = " + this.blade);
    }

    public void breaK() {
        System.out.println("Proces of Break");
    }
}

class Main {

    public static void main(String[] args) {
        String name = "Reanger";
        String brand = "Hero";
        String color = "red";
        int capacity = 2;
        double cost = 2500;
        int wheel = 2;
        Cycle cycle = new Cycle(name, brand, color, capacity, cost, wheel);
        cycle.dirve();
        cycle.breaK();

        name = "NINJAH2R";
        brand = "AMERICA";
        color = "BLACK";
        capacity = 2;
        cost = 250000;
        wheel = 2;

        Bike bike = new Bike(name, brand, color, capacity, cost, wheel);
        bike.dirve();
        bike.breaK();

        name = "THAR";
        brand = "MAHENDRA";
        color = "BLACK";
        capacity = 4;
        cost = 2500000;
        wheel = 4;

        Car car = new Car(name, brand, color, capacity, cost, wheel);
        car.dirve();
        car.breaK();

    }
}