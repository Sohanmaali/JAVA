package swing;

import java.awt.Image;
import javax.swing.ImageIcon;
import operation.Options;

public class Clinte {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageIcon imgicon = new ImageIcon("D:/JAVA/DAVV.png");
                setIconImage(imgicon.getImage());
                new Options().setVisible(true);
            }

            private void setIconImage(Image image) {
                // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
}
