
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Power {

    public static void main(String[] args) throws IOException {
        new PowerFrame();
    }

}

class PowerFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans, error;
    TextField num, num2;
    Button checktbtn, clearBtn;

    public PowerFrame() {
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Power");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a number");
        this.add(lb1);
        lb1.setBounds(40, 80, 130, 30);
        // lb1.setBackground(Color.white);
        lb2 = new Label("Enter expond number");
        this.add(lb2);
        lb2.setBounds(190, 80, 130, 30);

        num = new TextField();
        this.add(num);
        num.setBounds(40, 120, 140, 30);

        num2 = new TextField();
        this.add(num2);
        num2.setBounds(190, 120, 140, 30);

        checktbtn = new Button("count");
        this.add(checktbtn);
        checktbtn.setBounds(44, 170, 70, 30);
        checktbtn.setBackground(Color.cyan);
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(265, 170, 60, 30);
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 50, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(265, 220, 50, 30);
        this.add(ans);
        ans.setForeground(Color.black);
        ans.setBackground(Color.white);

        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = num.getText();
        String s2 = num2.getText();

        int n = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if (e.getSource() == checktbtn) {               
           int pow=1;  
           for(int i=1;i<=n2;i++)
            {
                pow=pow*n;
            }
            ans.setText(String.valueOf(pow));
        }

        else if (e.getSource() == clearBtn) {
            num.setText("");
            num2.setText("");
            ans.setText("");
            error.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {

        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
