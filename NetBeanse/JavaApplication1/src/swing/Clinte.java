/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.WindowConstants;
import swing.operation.Options;

public class Clinte  {

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Options().setVisible(true);
            }
        });
    }
}
