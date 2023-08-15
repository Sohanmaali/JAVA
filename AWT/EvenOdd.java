import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class EvenOdd {
    public static void main(String[] args) {
        new CheckEvenOdd();
    }
}

class CheckEvenOdd extends Frame implements WindowListener, ActionListener {

    Label lb1, ans;
    TextField num;
    Button CheckNum, clear;

    public CheckEvenOdd() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Check Even Odd");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter Any Number");
        this.add(lb1);
        lb1.setBounds(30, 80, 100, 30);
        lb1.setBackground(Color.yellow);

        num = new TextField();
        this.add(num);
        num.setBounds(150, 80, 50, 30);

        CheckNum = new Button("Check Num");
        this.add(CheckNum);
        CheckNum.setBounds(220, 80, 100, 30);
        CheckNum.addActionListener(this);

        ans = new Label();
        ans.setBounds(340, 80, 140, 30);
        this.add(ans);
        ans.setBackground(Color.white);

        clear = new Button("Clear");
        clear.setBounds(40, 120, 90, 30);
        this.add(clear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(num.getText());
        if (e.getSource() == CheckNum) {
            if (n % 2 == 0) {
                ans.setText("Enter num is Even");
                num.setText("");
            } else if (e.getSource() == clear) {
                ans.setText("");
                num.setText("");
            } else {
                ans.setText("Enter num is Odd");
                num.setText("");
            }
        } else if (e.getSource() == clear) {
            ans.setText("");
            num.setText("");
        }
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub

    }

}