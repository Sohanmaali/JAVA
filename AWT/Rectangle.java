import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class RectangleMen extends Frame implements WindowListener, ActionListener {
    Label lb1, ans, lb2;
    TextField num1, num2;
    Button area, diagonal, clearbtn;

    public RectangleMen() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Mensuration");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter Height");
        this.add(lb1);
        lb1.setBounds(30, 80, 120, 30);

        num1 = new TextField();
        this.add(num1);
        num1.setBounds(170, 80, 50, 30);

        lb2 = new Label("Enter Width");
        this.add(lb2);
        lb2.setBounds(30, 130, 120, 30);

        num2 = new TextField();
        this.add(num2);
        num2.setBounds(170, 130, 50, 30);

        area = new Button("Area");
        this.add(area);
        area.setBounds(45, 180, 100, 30);
        area.setBackground(Color.yellow);
        area.addActionListener(this);

        diagonal = new Button("Diagonal");
        this.add(diagonal);
        diagonal.setBounds(165, 180, 100, 30);
        diagonal.addActionListener(this);

        clearbtn = new Button("clear");
        this.add(clearbtn);
        clearbtn.setBounds(325, 180, 100, 30);
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

        if (e.getSource() == area) {
            ans.setText(String.valueOf(2f * 3.14f * r));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == diagonal) {
            ans.setText(String.valueOf(3.14f * r * r));
            num1.setText("");
            num2.setText("");
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

class Rectangle {
    public static void main(String[] args) {
        new RectangleMen();
    }
}