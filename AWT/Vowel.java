
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Vowel {

    public static void main(String[] args) throws IOException {
        new VowelFrame();
    }
}
class VowelFrame extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans, error;
    TextField tf1;
    Button convertbtn, clearBtn;

    public VowelFrame() {
        this.setVisible(true);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("Voting");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter a Alphabet");
        this.add(lb1);
        lb1.setBounds(40, 80, 120, 30);

        tf1 = new TextField();
        this.add(tf1);
        tf1.setBounds(180, 80, 140, 30);

        convertbtn = new Button("Check");
        this.add(convertbtn);
        convertbtn.setBounds(44, 170, 70, 30);
        convertbtn.setBackground(Color.cyan);
        convertbtn.addActionListener(this);

        clearBtn = new Button("clear");
        this.add(clearBtn);
        clearBtn.setBounds(120, 170, 60, 30);
        clearBtn.setBackground(Color.pink);
        clearBtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 220, 50, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(115, 220, 100, 30);
        this.add(ans);

        error = new Label();
        error.setBounds(45, 300, 90, 30);
        this.add(error);
        error.setForeground(Color.red);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = tf1.getText();
        char ch = s.charAt(0);
        if (e.getSource() == convertbtn) {

            error.setText("");
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                 ans.setText(ch + "  is Vowels");
                tf1.setText("");

            } else if ((ch >= 0 && ch < 48) || (ch > 57 && ch < 65) || (ch > 90 && ch < 97) || (ch > 122 && ch < 255)) {
               ans.setText(ch + "  Is Special Symbol...");
            } else if (ch >= 48 && ch <= 57) {
               ans.setText(ch + "  Is Digit...");
            }
            else if (ch >= 65 && ch <= 90 || (ch >= 97 && ch <= 122)) {
               ans.setText(ch + " is Consonent");
            }
            else{

                error.setText("invalid input");
            }

        } else if (e.getSource() == clearBtn) {
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
