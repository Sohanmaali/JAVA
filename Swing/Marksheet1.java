import operation.*;
import datapackage.*;
import display.*;

import javax.swing.*;
import java.util.Properties;
import java.io.*;

class Marksheet1 extends JFrame implements Serialization {

        // Operation op = new Operation();
        DataClass student[] = new DataClass[100];
        // Properties properties = new Properties();
        Display display;
        static int i = 0;

        public Marksheet1() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                jLabel2 = new javax.swing.JLabel();
                name = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                rollNum = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                mName = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                fName = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                year = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                branch = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                course = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                sem = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                math = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                chem = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                phycics = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                hindi = new javax.swing.JTextField();
                english = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel2.setText("Roll Number");

                name.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                nameActionPerformed(evt);
                        }
                });

                jLabel3.setText("Your Name");

                rollNum.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rollNumActionPerformed(evt);
                        }
                });

                jLabel4.setText("Father Name");

                mName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mNameActionPerformed(evt);
                        }
                });

                jLabel5.setText("Mother Name");

                fName.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fNameActionPerformed(evt);
                        }
                });

                jLabel6.setText("Sem");

                year.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                yearActionPerformed(evt);
                        }
                });

                jLabel7.setText("Your course");

                branch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                branchActionPerformed(evt);
                        }
                });

                jLabel8.setText("Your Branch");

                course.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                courseActionPerformed(evt);
                        }
                });

                jLabel9.setText("Year");

                sem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                semActionPerformed(evt);
                        }
                });

                jLabel10.setText("Mark Of Hindi");

                math.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mathActionPerformed(evt);
                        }
                });

                jLabel11.setText("Mark Of Phycics");

                chem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chemActionPerformed(evt);
                        }
                });

                jLabel12.setText("Marrk Of Chemistry");

                phycics.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                phycicsActionPerformed(evt);
                        }
                });

                jLabel13.setText("Mark Of Mathes");

                hindi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                hindiActionPerformed(evt);
                        }
                });

                english.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                englishActionPerformed(evt);
                        }
                });

                jLabel14.setText("Mark Of English");

                jButton2.setText("RESET");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("SUBMIT");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                126,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(38, 38, 38)
                                                                                                .addComponent(rollNum,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                121,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(jLabel3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                86,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                126,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(38, 38, 38)
                                                                                                                .addComponent(year,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                121,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(33, 33, 33)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                86,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                126,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(38, 38, 38)
                                                                                                                .addComponent(course,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                121,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(33, 33, 33)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                86,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                126,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(38, 38, 38)
                                                                                                                .addComponent(fName,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                121,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(33, 33, 33)
                                                                                                                .addComponent(jLabel5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                86,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                126,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(38, 38, 38)
                                                                                                                .addComponent(phycics,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                121,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(33, 33, 33)
                                                                                                                .addComponent(jLabel12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                86,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                126,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addComponent(math,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                121,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel14,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                126,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addComponent(english,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                121,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                86,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(jButton3,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))))))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(mName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                121,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                121,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(sem,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                121,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(branch,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                121,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(hindi,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                121,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(chem,
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                121,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                86,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(135, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(name,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(rollNum,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(fName,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(course,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(year,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(phycics,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel13,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(math,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(mName,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(branch,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(sem,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(chem,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(hindi,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel14,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(english,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(74, 74, 74)));

                pack();
        }// </editor-fold>

        private void nameActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void rollNumActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void mNameActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void fNameActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void yearActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void branchActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void courseActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void semActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void mathActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void chemActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void phycicsActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void hindiActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void englishActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

                rollNum.setText("");
                branch.setText("");
                chem.setText("");
                course.setText("");
                english.setText("");
                fName.setText("");
                hindi.setText("");
                mName.setText("");
                math.setText("");
                name.setText("");
                year.setText("");
                sem.setText("");
                phycics.setText("");
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

                int roll1 = Integer.valueOf(rollNum.getText());

                Properties properties = new Properties();

                String name1, fname1, mname1, branch1, corse1;
                int year1, physics1, chemistry1, math1, hindi1, english1, sem1;

                year1 = Integer.valueOf(year.getText());

                physics1 = Integer.valueOf(phycics.getText());

                chemistry1 = Integer.valueOf(chem.getText());

                math1 = Integer.valueOf(math.getText());

                hindi1 = Integer.valueOf(hindi.getText());

                english1 = Integer.valueOf(english.getText());

                name1 = name.getText();

                fname1 = fName.getText();

                mname1 = mName.getText();

                sem1 = Integer.valueOf(sem.getText());

                branch1 = branch.getText();

                corse1 = course.getText();

                student[i] = new DataClass(name1, fname1, mname1, sem1, branch1, corse1, year1, roll1, physics1,
                                chemistry1, math1, hindi1, english1);
                String mykey = "Roll_" + roll1;
                System.out.println(roll1);
                properties.setProperty(mykey + "_Hindi", String.valueOf(student[i].getHindi()));
                properties.setProperty(mykey + "_English", String.valueOf(student[i].getEnglish()));
                properties.setProperty(mykey + "_Math", String.valueOf(student[i].getMath()));
                properties.setProperty(mykey + "_Chem", String.valueOf(student[i].getChemistry()));
                properties.setProperty(mykey + "_Physics", String.valueOf(student[i].getPhysics()));
                properties.setProperty(mykey + "_Sem", String.valueOf(student[i].getSem()));
                properties.setProperty(mykey + "_Year", String.valueOf(student[i].getYear()));
                properties.setProperty(mykey + "_Branch", student[i].getBranch());
                properties.setProperty(mykey + "_Corse", student[i].getCorse());
                properties.setProperty(mykey + "_Mname", student[i].getMname());
                properties.setProperty(mykey + "_Fname", student[i].getFname());
                properties.setProperty(mykey + "_name", student[i].getName());
                properties.setProperty(mykey + "_Roll", String.valueOf(student[i].getRoll()));

                try (FileOutputStream fileOut = new FileOutputStream("userdata.properties",
                                true)) {
                        properties.store(fileOut, "User Data");
                        System.out.println("Data saved successfully.");
                } catch (IOException e) {
                        e.printStackTrace();
                }
                i++;
                rollNum.setText("");
                branch.setText("");
                chem.setText("");
                course.setText("");
                english.setText("");
                fName.setText("");
                hindi.setText("");
                mName.setText("");
                math.setText("");
                name.setText("");
                year.setText("");
                sem.setText("");
                phycics.setText("");
                this.run();
                
        }
        public void run(){
                new Display().setVisible(true);
        }

        // Variables declaration - do not modify
        private JTextField branch;
        private JTextField chem;
        private JTextField course;
        private JTextField english;
        private JTextField fName;
        private JTextField hindi;
        private JTextField mName;
        private JTextField math;
        private JTextField name;
        private JTextField phycics;
        private JTextField rollNum;
        private JTextField sem;
        private JTextField year;
        private JButton jButton2;
        private JButton jButton3;
        private JLabel jLabel10;
        private JLabel jLabel11;
        private JLabel jLabel12;
        private JLabel jLabel13;
        private JLabel jLabel14;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JLabel jLabel5;
        private JLabel jLabel6;
        private JLabel jLabel7;
        private JLabel jLabel8;
        private JLabel jLabel9;
        // End of variables declaration
}
