package swing.storedata;

import datapackage.DataClass;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import swing.admin.Admin;

public class StoreData extends javax.swing.JFrame {

    DataClass student[] = new DataClass[100];
    Properties properties = new Properties();
    static int i = 0;

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
                                .addComponent(fname_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mother_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roll_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(name_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(course_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(branch_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(year_T, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sem_l, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(course_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(branch_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branch_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(year_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sem_l, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sem_T, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
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

        int sem;
        int year;
        int roll;
        int physics;
        int chemistry;
        int math;
        int hindi;
        int english;

        if (!name.trim().isEmpty() && !fname.trim().isEmpty() && !mname.trim().isEmpty()
                && !branch.trim().isEmpty() && !corse.trim().isEmpty()) {
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill All blanks");
            return; // Fields should not be empty or contain only spaces
        }
        try {
            year = Integer.parseInt(year_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE YEAR");
            year_T.setText("");
            return;
        }

        try {
            roll = Integer.parseInt(roll_T.getText());
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Invalide Roll Number");
            return;
        }
        try {
            sem = Integer.parseInt(sem_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE Semester");
            return;
        }
        try {
            physics = Integer.parseInt(physics_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "INVALIDE Mark of physics");
            return;
        }
        try {
            chemistry = Integer.parseInt(sem_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE Mark of chemistry");
            return;
        }
        try {
            math = Integer.parseInt(mathes_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE Mark of math");
            return;
        }
        try {
            hindi = Integer.parseInt(hindi_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE Mark of Hindi");
            return;
        }
        try {
            english = Integer.parseInt(english_T.getText());
            // ... (similarly for other integer inputs)
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "INVALIDE Mark of English");
            return;
        }
        int total = physics + chemistry + math + hindi + english;
        
        if (english > 100 || physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || math < 0 || math > 100 || hindi < 0 || hindi > 100 || english < 0) {
            JOptionPane.showMessageDialog(null, "INVALIDE Mark");
            return;
        }
        student[i] = new DataClass(name, fname, mname, sem, branch, corse, year, roll, physics, chemistry, math, hindi, english, total);

        String key = "Roll_" + roll;

        properties.setProperty(key + "_Roll", String.valueOf(student[i].getRoll()));
        properties.setProperty(key + "_Name", student[i].getName());
        properties.setProperty(key + "_FName", student[i].getFname());
        properties.setProperty(key + "_MName", student[i].getMname());
        properties.setProperty(key + "_Course", student[i].getCorse());
        properties.setProperty(key + "_Branch", student[i].getBranch());
        properties.setProperty(key + "_Year", String.valueOf(student[i].getYear()));
        properties.setProperty(key + "_Sem", String.valueOf(student[i].getSem()));
        properties.setProperty(key + "_Physics", String.valueOf(student[i].getPhysics()));
        properties.setProperty(key + "_Chemistry", String.valueOf(student[i].getChemistry()));
        properties.setProperty(key + "_Mathes", String.valueOf(student[i].getMath()));
        properties.setProperty(key + "_Hindi", String.valueOf(student[i].getHindi()));
        properties.setProperty(key + "_English", String.valueOf(student[i].getEnglish()));
        properties.setProperty(key + "_Total", String.valueOf(student[i].getTotal()));
      

        try (FileOutputStream fileOut = new FileOutputStream("Studentdata.properties",
                true)) {
            properties.store(fileOut, "User Data");
            System.out.println("Data saved successfully.");
            i++;
        } catch (IOException e) {
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
