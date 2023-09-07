package storedata;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import admin.Admin;
import static databaseconnect.DataBaseConnect.storeStudentMarks;
import java.sql.SQLException;

import static validations.Validations.checkMarks;

import static validations.Validations.checkSemester;
import static validations.Validations.checkYear;

public class StoreData extends javax.swing.JFrame {

    public StoreData() {
        initComponents();
        setTitle("Student Data Store");
        ImageIcon imgicon = new ImageIcon("D:/JAVA/DAVV.png");
        setIconImage(imgicon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mother_l = new javax.swing.JLabel();
        name_T = new javax.swing.JTextField();
        year_l = new javax.swing.JLabel();
        year_T = new javax.swing.JTextField();
        father_l = new javax.swing.JLabel();
        mname_T = new javax.swing.JTextField();
        course_l = new javax.swing.JLabel();
        fname_T = new javax.swing.JTextField();
        roll_l = new javax.swing.JLabel();
        sem_T = new javax.swing.JTextField();
        sem_l = new javax.swing.JLabel();
        branch_T = new javax.swing.JTextField();
        branch_l = new javax.swing.JLabel();
        roll_T = new javax.swing.JTextField();
        name_l = new javax.swing.JLabel();
        course_T = new javax.swing.JTextField();
        physics_l = new javax.swing.JLabel();
        hindi_l = new javax.swing.JLabel();
        chemistry_T = new javax.swing.JTextField();
        physics_T = new javax.swing.JTextField();
        chemistry_l = new javax.swing.JLabel();
        mathes_l = new javax.swing.JLabel();
        english_T = new javax.swing.JTextField();
        hindi_T = new javax.swing.JTextField();
        english_l = new javax.swing.JLabel();
        mathes_T = new javax.swing.JTextField();
        back_B = new javax.swing.JButton();
        reset_B = new javax.swing.JButton();
        submit_B = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        mother_l.setText("Mother Name");

        year_l.setText("Year");

        father_l.setText("Father Name");

        course_l.setText("Course");

        roll_l.setText("Enter Roll Number");

        sem_l.setText("Sem");

        branch_l.setText("Branch");

        roll_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roll_TActionPerformed(evt);
            }
        });

        name_l.setText("Your Name");

        physics_l.setText("Mark Of Physics ");

        hindi_l.setText("Mark Of Hindi");

        physics_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physics_TActionPerformed(evt);
            }
        });

        chemistry_l.setText("Mark Of Chemistry");

        mathes_l.setText("Mark Of Mathes");

        english_l.setText("Mark Of English");

        back_B.setText("BACK");
        back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BActionPerformed(evt);
            }
        });

        reset_B.setText("CLEAR");
        reset_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_BActionPerformed(evt);
            }
        });

        submit_B.setText("SUBMIT");
        submit_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(english_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mathes_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(physics_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submit_B, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mathes_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(hindi_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(physics_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57)
                                        .addComponent(chemistry_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(english_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hindi_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chemistry_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(reset_B, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(course_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(father_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roll_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(course_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(branch_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mother_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(roll_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(name_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(year_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sem_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(name_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(branch_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sem_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roll_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roll_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mother_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(father_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(course_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branch_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branch_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sem_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(physics_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chemistry_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chemistry_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(physics_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mathes_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hindi_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hindi_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mathes_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(english_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(english_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit_B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roll_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roll_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roll_TActionPerformed

    private void physics_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physics_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physics_TActionPerformed

    private void back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BActionPerformed

        new Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_BActionPerformed

    private void reset_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_BActionPerformed

        roll_T.setText("");
        name_T.setText("");
        fname_T.setText("");
        mname_T.setText("");
        course_T.setText("");
        branch_T.setText("");
        year_T.setText("");
        sem_T.setText("");
        physics_T.setText("");
        chemistry_T.setText("");
        mathes_T.setText("");
        hindi_T.setText("");
        english_T.setText("");
    }//GEN-LAST:event_reset_BActionPerformed

    private void submit_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_BActionPerformed

        String name = name_T.getText();
        String fname = fname_T.getText();
        String mname = mname_T.getText();
        String branch = branch_T.getText();
        String corse = course_T.getText();

        if (!name.trim().isEmpty() && !fname.trim().isEmpty() && !mname.trim().isEmpty()
                && !branch.trim().isEmpty() && !corse.trim().isEmpty()) {
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill All lanks");
            return; // Fields should not be empty or contain only spaces
        }

        if (!checkYear(year_T.getText())) {
            JOptionPane.showMessageDialog(null, "INVALIDE YEAR");
            year_T.setText("");
            return;
        }

//        if (!checkRollNumber(roll_T.getText())) {
//            JOptionPane.showMessageDialog(null, "Invalide Roll Number");
//            roll_T.setText("");
//            return;
//        }
        if (!checkSemester(sem_T.getText(), Integer.parseInt(year_T.getText()))) {
            JOptionPane.showMessageDialog(null, "INVALIDE Semester");
            sem_T.setText("");
            return;
        }

        if (!checkMarks(physics_T.getText())) {

            JOptionPane.showMessageDialog(null, "INVALIDE Mark of physics");
            physics_T.setText("");
            return;
        }
        if (!checkMarks(chemistry_T.getText())) {

            JOptionPane.showMessageDialog(null, "INVALIDE Mark of chemistry");
            chemistry_T.setText("");
            return;
        }
        if (!checkMarks(mathes_T.getText())) {

            JOptionPane.showMessageDialog(null, "INVALIDE Mark of math");
            mathes_T.setText("");
            return;
        }
        if (!checkMarks(hindi_T.getText())) {

            JOptionPane.showMessageDialog(null, "INVALIDE Mark of Hindi");
            hindi_T.setText("");
            return;
        }
        if (!checkMarks(english_T.getText())) {

            JOptionPane.showMessageDialog(null, "INVALIDE Mark of English");
            english_T.setText("");
            return;
        }
        try {
            storeStudentMarks(Integer.parseInt(physics_T.getText()), Integer.parseInt(chemistry_T.getText()), Integer.parseInt(mathes_T.getText()), Integer.parseInt(hindi_T.getText()), Integer.parseInt(english_T.getText()));
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(StoreData.class.getName()).log(Level.SEVERE, null, ex);
        }
        roll_T.setText("");
        name_T.setText("");
        fname_T.setText("");
        mname_T.setText("");
        course_T.setText("");
        branch_T.setText("");
        year_T.setText("");
        sem_T.setText("");
        physics_T.setText("");
        chemistry_T.setText("");
        mathes_T.setText("");
        hindi_T.setText("");
        english_T.setText("");
        JOptionPane.showMessageDialog(null, "Student Data Save !");
    }//GEN-LAST:event_submit_BActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange


    }//GEN-LAST:event_formPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_B;
    private javax.swing.JTextField branch_T;
    private javax.swing.JLabel branch_l;
    private javax.swing.JTextField chemistry_T;
    private javax.swing.JLabel chemistry_l;
    private javax.swing.JTextField course_T;
    private javax.swing.JLabel course_l;
    private javax.swing.JTextField english_T;
    private javax.swing.JLabel english_l;
    private javax.swing.JLabel father_l;
    private javax.swing.JTextField fname_T;
    private javax.swing.JTextField hindi_T;
    private javax.swing.JLabel hindi_l;
    private javax.swing.JTextField mathes_T;
    private javax.swing.JLabel mathes_l;
    private javax.swing.JTextField mname_T;
    private javax.swing.JLabel mother_l;
    private javax.swing.JTextField name_T;
    private javax.swing.JLabel name_l;
    private javax.swing.JTextField physics_T;
    private javax.swing.JLabel physics_l;
    private javax.swing.JButton reset_B;
    private javax.swing.JTextField roll_T;
    private javax.swing.JLabel roll_l;
    private javax.swing.JTextField sem_T;
    private javax.swing.JLabel sem_l;
    private javax.swing.JButton submit_B;
    private javax.swing.JTextField year_T;
    private javax.swing.JLabel year_l;
    // End of variables declaration//GEN-END:variables
}
