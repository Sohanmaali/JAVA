package operation;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import display.*;

public class SearchOptions extends javax.swing.JFrame {

    Label name, roll;
    TextField name1, roll1;
    Properties properties = new Properties();

    public SearchOptions() {
        initComponents();

        roll = new Label("Enter Roll Number");
        roll.setBounds(40, 150, 130, 30);
        roll1 = new TextField();
        roll1.setBounds(190, 150, 140, 30);

        name = new Label("Enter Your Name");
        name.setBounds(40, 150, 130, 30);
        name1 = new TextField();
        name1.setBounds(190, 150, 140, 30);
        searchB.setVisible(false);
        firstD.setVisible(false);
        secondD.setVisible(false);
        thirdD.setVisible(false);
        rollNotFound.setVisible(false);
        okB.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchDivision = new javax.swing.JButton();
        searchRoll = new javax.swing.JButton();
        searchName = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        searchB = new javax.swing.JButton();
        secondD = new javax.swing.JButton();
        thirdD = new javax.swing.JButton();
        firstD = new javax.swing.JButton();
        rollNotFound = new javax.swing.JLabel();
        okB = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchDivision.setText("DIVISION");
        searchDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDivisionActionPerformed(evt);
            }
        });

        searchRoll.setText("ROLL NUMBER");
        searchRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRollActionPerformed(evt);
            }
        });

        searchName.setText("NAME");
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        searchB.setText("SEARCH");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });

        secondD.setText("SEC DIVISION");

        thirdD.setText("THIRD DIVISION");
        thirdD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdDActionPerformed(evt);
            }
        });

        firstD.setText("FIRST DIVISION");

        rollNotFound.setText("roll NotFound");

        okB.setText("OK");
        okB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(firstD)
                                .addGap(18, 18, 18)
                                .addComponent(secondD)
                                .addGap(18, 18, 18)
                                .addComponent(thirdD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rollNotFound, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(okB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(searchRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(searchDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(searchB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thirdD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rollNotFound, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        new Options().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    Object searchRollnumber;
    Object searchByName;

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        roll.setVisible(false);
        roll1.setVisible(false);

        name.setVisible(true);
        name1.setVisible(true);

        this.add(name);
        this.add(name1);

        searchB.setVisible(true);
        firstD.setVisible(false);
        secondD.setVisible(false);
        thirdD.setVisible(false);
        searchByName = evt.getSource();

        rollNotFound.setVisible(false);
        okB.setVisible(false);
    }//GEN-LAST:event_searchNameActionPerformed

    private void searchRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRollActionPerformed
        this.add(roll);
        this.add(roll1);

        roll.setVisible(true);
        roll1.setVisible(true);

        name.setVisible(false);
        name1.setVisible(false);

        searchB.setVisible(true);
        firstD.setVisible(false);
        secondD.setVisible(false);
        thirdD.setVisible(false);

        searchRollnumber = evt.getSource();

        rollNotFound.setVisible(false);
        okB.setVisible(false);
    }//GEN-LAST:event_searchRollActionPerformed

    private void searchDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDivisionActionPerformed
        roll.setVisible(false);
        roll1.setVisible(false);
        name.setVisible(false);
        name1.setVisible(false);
        searchB.setVisible(true);
        searchB.setVisible(false);
        firstD.setVisible(true);
        secondD.setVisible(true);
        thirdD.setVisible(true);
    }//GEN-LAST:event_searchDivisionActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        boolean flage = false;
        int rolln = 0;
        name1.setText("");
        try {
            rolln = Integer.parseInt(roll1.getText());
        } catch (NumberFormatException e) {
            System.out.println(e);
            flage = true;
        }
        this.searchByRollNum(rolln);

        if (searchRollnumber == searchB) {
            searchRollnumber = null;
            if (rolln == 0) {
                rollNotFound.setText("PLEASE ENTER ROLL NUMBER");
                rollNotFound.setVisible(true);
                return;
            } else {
                this.searchByRollNum(rolln);
            }
        } else if (searchByName == searchB) {
            searchByName = null;
        }
        roll1.setText("");
    }//GEN-LAST:event_searchBActionPerformed

    private void thirdDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdDActionPerformed

    }//GEN-LAST:event_thirdDActionPerformed

    private void okBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBActionPerformed
        rollNotFound.setVisible(false);
        okB.setVisible(false);
        roll1.setText("");
    }//GEN-LAST:event_okBActionPerformed
    public void searchByRollNum(int roll) {

        try (FileInputStream fileInput = new FileInputStream("Studentdata.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            System.out.println("Error opening file: " + e);
            return;
        }
        String rollKey = "Roll_" + roll; // Construct the correct roll key
        System.out.println("Looking for roll key: " + rollKey); // Debug statement

        String key;
        key = properties.getProperty(rollKey + "_Roll");
        if (key == null) {
            System.out.println("No user data found for the provided roll number.");
            rollNotFound.setText("ROLL NUMBER NOT FOUND");
            rollNotFound.setVisible(true);
            okB.setVisible(true);
            return;
        }
        Display display = new Display();
        display.display(roll);
        display.setVisible(true);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton firstD;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton okB;
    private javax.swing.JLabel rollNotFound;
    private javax.swing.JButton searchB;
    private javax.swing.JButton searchDivision;
    private javax.swing.JButton searchName;
    private javax.swing.JButton searchRoll;
    private javax.swing.JButton secondD;
    private javax.swing.JButton thirdD;
    // End of variables declaration//GEN-END:variables
}
