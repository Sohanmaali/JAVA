import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Cone {
    public static void main(String[] args) {
        new ConeMen();
    }
}

class ConeMen extends Frame implements WindowListener, ActionListener {
    Label lb1, ans, lb2;
    TextField num1, num2;
    Button surfaceArea, lateralSurface, volume, clearbtn;

    public ConeMen() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Mensuration");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter Radius");
        this.add(lb1);
        lb1.setBounds(30, 80, 120, 30);

        num1 = new TextField();
        this.add(num1);
        num1.setBounds(170, 80, 50, 30);

        lb2 = new Label("Enter Height");
        this.add(lb2);
        lb2.setBounds(30, 130, 120, 30);

        num2 = new TextField();
        this.add(num2);
        num2.setBounds(170, 130, 50, 30);

        surfaceArea = new Button("SurfaceArea");
        this.add(surfaceArea);
        surfaceArea.setBounds(45, 180, 100, 30);
        surfaceArea.setBackground(Color.yellow);
        surfaceArea.addActionListener(this);

        lateralSurface = new Button("lateralSurface");
        this.add(lateralSurface);
        lateralSurface.setBounds(165, 180, 100, 30);
        lateralSurface.addActionListener(this);

        volume = new Button("volume");
        this.add(volume);
        volume.setBounds(285, 180, 100, 30);
        volume.addActionListener(this);

        clearbtn = new Button("clear");
        this.add(clearbtn);
        clearbtn.setBounds(405, 180, 100, 30);
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
        float r = Integer.parseInt(num1.getText());
        float h = Integer.parseInt(num2.getText());

        if (e.getSource() == surfaceArea) {
            ans.setText(String.valueOf(3.14f * r * (r + Math.sqrt(h * h + r * r))));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == lateralSurface) {
            ans.setText(String.valueOf(3.14f * r * (Math.sqrt(h * h + r * r))));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == volume) {
            ans.setText(String.valueOf(3.14f * r * r * (h / 3)));
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