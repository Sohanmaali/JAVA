class Move {
    String name;
    double length;
    public Move ()
    {
        this.name = "";
        this.length = 0.0;
    }
    public Move (String name,double length)
    {
        this.name = name;
        this.length = length;
    }
    public void show() {
        System.out.println("Move name = "+this.name);
        System.out.println("Move Length = "+this.length);
    }
}
class Comedy extends Move {
    
    public Comedy() {
        super();
    }
     public Comedy(String name,double length) {
        super(name,length);
    }
    public void show() {
        super.show();
        System.out.println("This is Comedy Move");
    }
}
class Action extends Move {
    
    public Action() {
        super();
    }
     public Action(String name,double length) {
        super(name,length);
    }
    public void show() {
         super.show();
        System.out.println("This is Action Move");
    }
}
class MoveClass{
    public static void main(String[] args) {
        Comedy ob = new Comedy("dhamal",2.5);
        ob.show();
        Action ob1 = new Action("Bahubali",3.0);
        ob1.show();
    }
}
