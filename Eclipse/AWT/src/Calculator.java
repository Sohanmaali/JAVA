
import java.awt.*;

// extending Frame class to our class AWTExample1
class Calculater extends Frame {

    Label lb1;
    TextField tf1;

    Calculater() {

        this.setVisible(true);
        this.setTitle("This is our basic AWT example");

        Button b = new Button("Click Me!!");

        this.setBounds(100, 50, 700, 400);
        this.setLayout(null);

        lb1 = new Label("Enter First Num");
        b.setBounds(30, 100, 80, 30);
        add(lb1);

        setSize(300, 300);

        tf1 = new TextField();
        tf1.setBounds(170, 50, 150, 30);
        this.add(tf1);

        b.addActionListener(this);
        this.addWindowListener(this);
    }

    public static void main(String args[]) {

        /* Calculater c = */ new Calculater();
    }
}