
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Factorial {

    public static void main(String[] args) throws IOException {
        new FactorialFrame();
    }

}

class FactorialFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans, error;
    TextField num;
    Button checktbtn, clearBtn;

    public FactorialFrame() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Factorial-Frame");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a number");
        this.add(lb1);
        lb1.setBounds(75, 80, 160, 30);
        // lb1.setBackground(Color.white);

        num = new TextField();
        this.add(num);
        num.setBounds(75, 120, 160, 30);

        checktbtn = new Button("print");
        this.add(checktbtn);
        checktbtn.setBounds(75, 170, 90, 30);
        checktbtn.setBackground(Color.blue );
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(150, 170, 90, 30);
        clearBtn.setBackground(Color.LIGHT_GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(75, 220, 70, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(150, 220, 80, 30);
        this.add(ans);
        ans.setForeground(Color.black);
        ans.setBackground(Color.white);

        error = new Label();
        error.setBounds(75, 270, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = num.getText();
        int n = Integer.parseInt(s);
        if (e.getSource() == checktbtn) {

            error.setText("");
            int fact=1;
            for (int i=1; i<=n; i++)
            {
                fact*=i;
            }  
            ans.setText(String.valueOf(fact));
        }
        
         else if (e.getSource() == clearBtn) {
            num.setText("");
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
