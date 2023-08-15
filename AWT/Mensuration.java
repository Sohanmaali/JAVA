import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Mensuration extends Frame implements WindowListener, ActionListener {
    Label lb1, ans, lb2;
    TextField num1;
    Button circumference, Radius, Diameter, clearbtn;

    public Mensuration() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Mensuration");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter Radius of Circle");
        this.add(lb1);
        lb1.setBounds(30, 80, 120, 30);

        num1 = new TextField();
        this.add(num1);
        num1.setBounds(170, 80, 100, 30);

        circumference = new Button("circumference");
        this.add(circumference);
        circumference.setBounds(45, 120, 100, 30);
        circumference.setBackground(Color.yellow);
        circumference.addActionListener(this);

        Radius = new Button("Radius");
        this.add(Radius);
        Radius.setBounds(165, 120, 60, 30);
        Radius.addActionListener(this);

        Diameter = new Button("Diameter");
        this.add(Diameter);
        Diameter.setBounds(245, 120, 60, 30);
        Diameter.addActionListener(this);

        clearbtn = new Button("clear");
        this.add(clearbtn);
        clearbtn.setBounds(325, 120, 60, 30);
        clearbtn.setBackground(Color.pink);
        clearbtn.addActionListener(this);

        lb2 = new Label("Ans");
        this.add(lb2);
        lb2.setBounds(290, 80, 40, 30);
        lb2.setBackground(Color.yellow);

        ans = new Label();
        ans.setBounds(350, 80, 90, 30);
        this.add(ans);
        ans.setBackground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = Integer.parseInt(num1.getText());

        if (e.getSource() == circumference) {
            ans.setText(String.valueOf(2f * 3.14f * r));
            num1.setText("");
        } else if (e.getSource() == Radius) {
            ans.setText(String.valueOf(3.14f * r * r));
            num1.setText("");
        } else if (e.getSource() == Diameter) {
            ans.setText(String.valueOf(r * r));
            num1.setText("");
        } else if (e.getSource() == clearbtn) {

            ans.setText("");
            num1.setText("");
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }
}

class Circle {
    public static void main(String[] args) {
        new Mensuration();
    }
}