import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

class Calculator {

    public static void main(String[] args) throws IOException {
        new Calc();
    }
}

class Calc extends Frame implements WindowListener, ActionListener {

    Label lb1, lb2, result, ans;
    TextField tf1, num1, num2;
    Button addbtn, subbtn, multibtn, divbtn, modbtn, clearbtn;

    public Calc() {
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(400, 300, 700, 400);
        this.setTitle("calculator");
        this.addWindowListener(this);
        this.setLayout(null);

        lb1 = new Label("Enter first number");
        this.add(lb1);
        lb1.setBounds(40, 80, 120, 30);

        lb2 = new Label("Enter Second number");
        this.add(lb2);
        lb2.setBounds(170, 80, 120, 30);

        num1 = new TextField();
        this.add(num1);
        num1.setBounds(40, 120, 100, 30);

        num2 = new TextField();
        this.add(num2);
        num2.setBounds(170, 120, 100, 30);

        addbtn = new Button("add");
        this.add(addbtn);
        addbtn.setBounds(44, 170, 60, 30);
        addbtn.setBackground(Color.cyan);
        addbtn.addActionListener(this);

        subbtn = new Button("sub");
        this.add(subbtn);
        subbtn.setBounds(122, 170, 60, 30);
        subbtn.setBackground(Color.cyan);
        subbtn.addActionListener(this);

        multibtn = new Button("multi");
        this.add(multibtn);
        multibtn.setBounds(204, 170, 60, 30);
        multibtn.setBackground(Color.cyan);
        multibtn.addActionListener(this);

        divbtn = new Button("div");
        this.add(divbtn);
        divbtn.setBounds(44, 220, 60, 30);
        divbtn.setBackground(Color.cyan);
        divbtn.addActionListener(this);

        modbtn = new Button("mod");
        this.add(modbtn);
        modbtn.setBounds(122, 220, 60, 30);
        modbtn.setBackground(Color.cyan);
        modbtn.addActionListener(this);

        clearbtn = new Button("clear");
        this.add(clearbtn);
        clearbtn.setBounds(204, 220, 60, 30);
        clearbtn.setBackground(Color.pink);
        clearbtn.addActionListener(this);

        result = new Label("Result");
        result.setBounds(45, 265, 90, 30);
        this.add(result);
        result.setBackground(Color.white);

        ans = new Label();
        ans.setBounds(175, 265, 90, 30);
        this.add(ans);
        ans.setBackground(Color.white);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = 0, b = 0;

        try {
            a = Integer.parseInt(num1.getText());
            b = Integer.parseInt(num2.getText());
            throw new NumberFormatException("Please valide num");

        } catch (Exception x) {
            System.out.println(x);
        }
        if (e.getSource() == addbtn) {
            ans.setText(String.valueOf(a + b));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == subbtn) {
            ans.setText(String.valueOf(a - b));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == multibtn) {
            ans.setText(String.valueOf(a * b));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == divbtn) {
            ans.setText(String.valueOf(a / b));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == modbtn) {
            ans.setText(String.valueOf(a % b));
            num1.setText("");
            num2.setText("");
        } else if (e.getSource() == clearbtn) {
            num1.setText("");
            num2.setText("");
            ans.setText("");
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
        System.exit(0);
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