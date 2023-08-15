
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class ArmStrong {

  public static void main(String[] args) throws IOException {
    new ArmStrongFrame();
  }

}

class ArmStrongFrame extends Frame implements WindowListener, ActionListener {

  Label lb1, lb2, result, ans, error;
  TextField num;
  Button checktbtn, clearBtn;

  public ArmStrongFrame() {
    this.setVisible(true);
    this.setBackground(Color.LIGHT_GRAY);
    this.setBounds(400, 300, 700, 400);
    this.setTitle("Arm-Strong");
    this.addWindowListener(this);
    this.setLayout(null);

    lb1 = new Label("Enter a number");
    this.add(lb1);
    lb1.setBounds(40, 80, 130, 30);

    num = new TextField();
    this.add(num);
    num.setBounds(40, 120, 140, 30);

    checktbtn = new Button("check");
    this.add(checktbtn);
    checktbtn.setBounds(44, 170, 70, 30);
    checktbtn.setBackground(Color.ORANGE);
    checktbtn.addActionListener(this);

    clearBtn = new Button("clear");
    this.add(clearBtn);
    clearBtn.setBounds(120, 170, 60, 30);
    clearBtn.setBackground(Color.LIGHT_GRAY);
    clearBtn.addActionListener(this);

    result = new Label("Result");
    result.setBounds(45, 220, 50, 30);
    this.add(result);
    result.setBackground(Color.white);

    ans = new Label();
    ans.setBounds(115, 220, 200, 30);
    this.add(ans);
    ans.setForeground(Color.black);

    error = new Label();
    error.setBounds(45, 300, 90, 30);
    this.add(error);
    error.setForeground(Color.red);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String s = num.getText();
    int n = Integer.parseInt(s);
    if (e.getSource() == checktbtn) {

      error.setText("");
      int temp = n, arm = 0, count = 0;
      for (; n > 0; n /= 10, count++)
        ;
      n = temp;
      for (; n > 0;) {
        int r = n % 10;
        int i = 1, pow = 1;

        for (i = 1; i <= count; i++, pow *= r)
          ;
        arm += pow;
        n /= 10;
      }
      if (arm == temp) {
        ans.setText(temp + "  is Armstrong number");
      } else {
        ans.setText(temp + "  is Not Armstrong number");
      }
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
