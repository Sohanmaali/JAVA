

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Voting {

    public static void main(String[] args) throws IOException {
        new VotingFrame();
    }
}

class VotingFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, result, ans, error;
    TextField tf1;
    Button checktbtn, clearBtn;

    public VotingFrame() {
        this.setVisible(true);
        this.setBackground(Color.LIGHT_GRAY);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Voting-Frame");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter your age");
        this.add(lb1);
        lb1.setBounds(40, 80, 130, 30);
        // lb1.setBackground(Color.white);

        tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(40, 120, 140, 30);

        checktbtn = new Button("check");
        this.add(checktbtn);
        checktbtn.setBounds(44, 170, 70, 30);
        checktbtn.setBackground(Color.ORANGE);
        checktbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(120, 170, 60, 30);
        clearBtn.setBackground(Color.GRAY);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 50, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(45, 250, 150, 30);
        this.add(ans);
        ans.setForeground(Color.black);

        error = new Label();
        error.setBounds(45, 270, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();
        
        int age = Integer.parseInt(s);
       
        if (e.getSource() == checktbtn) {
          
            
        if(age<0)
        {
            error.setText("Inavlid age");
        }
         else  if(age>=18)
        {
            ans.setText(" ELIGIBLE FOR VOTING");
        }
        else
            ans.setText("NOT ELIGIBLE FOR VOTING");;
        }
        
        else if (e.getSource() == clearBtn) {
        tf1.setText("");
        tf1.setText("");
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
