package admin;

import databaseconnect.*;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import operation.Operation;

public class StudentSing extends javax.swing.JFrame {

    public StudentSing() {
        initComponents();
        setTitle("Student sing Up Page");
        show_Captch.setText(Operation.ganrateCapcha());
    }

    public static void main(String[] args) {
        new StudentSing().setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_First = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        father_Name = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        name_Last = new javax.swing.JTextField();
        mother_Name = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        gmail_Id = new javax.swing.JTextField();
        mobile_Num = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        street_Add = new javax.swing.JTextField();
        block = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        distric = new javax.swing.JTextField();
        pincode = new javax.swing.JTextField();
        gen = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        other = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        Clear_B = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        enter_Captch = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        user_Password = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        user_Password_con = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        show_Captch = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        user_name1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("RAJIV GANDHI PROGYOGIKI VISHWAVIDYALAYA  STUDENT REGISTRATION FROM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("First Name*");

        name_First.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_FirstActionPerformed(evt);
            }
        });
        name_First.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_FirstKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Father Name*");

        father_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        father_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                father_NameActionPerformed(evt);
            }
        });
        father_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                father_NameKeyTyped(evt);
            }
        });

        dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dobKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("DOB*");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Mother Name*");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Course*");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Gmail*");

        name_Last.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_Last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_LastActionPerformed(evt);
            }
        });
        name_Last.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_LastKeyTyped(evt);
            }
        });

        mother_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mother_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mother_NameActionPerformed(evt);
            }
        });
        mother_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mother_NameKeyTyped(evt);
            }
        });

        course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseActionPerformed(evt);
            }
        });
        course.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                courseKeyTyped(evt);
            }
        });

        gmail_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gmail_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gmail_IdActionPerformed(evt);
            }
        });

        mobile_Num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mobile_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile_NumActionPerformed(evt);
            }
        });
        mobile_Num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobile_NumKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mobile Num*");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Personal information");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Address");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Street Address*");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Block*");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("State*");

        street_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        street_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street_AddActionPerformed(evt);
            }
        });
        street_Add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                street_AddKeyTyped(evt);
            }
        });

        block.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockActionPerformed(evt);
            }
        });
        block.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                blockKeyTyped(evt);
            }
        });

        state.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateActionPerformed(evt);
            }
        });
        state.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stateKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Distric*");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Zip / Pincode*");

        distric.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        distric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districActionPerformed(evt);
            }
        });
        distric.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                districKeyTyped(evt);
            }
        });

        pincode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeActionPerformed(evt);
            }
        });
        pincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pincodeKeyTyped(evt);
            }
        });

        gen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gen.setText("Gender*");

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        other.setText("Other");
        other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Clear_B.setText("Clear");
        Clear_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_BActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("User Name*");

        enter_Captch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enter_Captch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_CaptchActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Password*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Coform Password*");

        jButton4.setText("Re-ganrate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Captcha");

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));

        show_Captch.setBackground(new java.awt.Color(255, 255, 255));
        show_Captch.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        show_Captch.setText("Ackds52");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(show_Captch, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(show_Captch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Enter Capcha*");

        user_name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        user_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_name1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(mobile_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(dob))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(father_Name))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(name_First, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gmail_Id)
                                    .addComponent(course)
                                    .addComponent(mother_Name)
                                    .addComponent(name_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(user_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(user_Password_con)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(enter_Captch, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(315, 321, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(user_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(distric, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(street_Add)))
                        .addGap(67, 67, 67))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(50, 50, 50)
                .addComponent(Clear_B)
                .addGap(55, 55, 55)
                .addComponent(jButton3)
                .addGap(344, 344, 344))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_First, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(other)
                                    .addComponent(female)
                                    .addComponent(male)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(father_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mobile_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gmail_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_Last, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(mother_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(street_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distric, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_Password_con, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enter_Captch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(Clear_B)
                    .addComponent(submit))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void father_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_father_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_father_NameActionPerformed

    private void name_FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_FirstActionPerformed

    private void name_LastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_LastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_LastActionPerformed

    private void mother_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mother_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mother_NameActionPerformed

    private void courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseActionPerformed

    private void gmail_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gmail_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gmail_IdActionPerformed

    private void mobile_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile_NumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobile_NumActionPerformed

    private void street_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_street_AddActionPerformed

    private void blockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockActionPerformed

    private void stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateActionPerformed

    private void districActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districActionPerformed

    private void pincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincodeActionPerformed

    private void enter_CaptchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_CaptchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_CaptchActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        show_Captch.setText(Operation.ganrateCapcha());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Clear_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_BActionPerformed
        name_First.setText("");
        name_Last.setText("");
        father_Name.setText("");
        mother_Name.setText("");
        dob.setText("");
        course.setText("");
        mobile_Num.setText("");
        gmail_Id.setText("");
        street_Add.setText("");
        block.setText("");
        user_name1.setText("");
        distric.setText("");
        state.setText("");
        pincode.setText("");
        enter_Captch.setText("");
        user_Password.setText("");
        user_Password_con.setText("");
        enter_Captch.setText("");
        show_Captch.setText(Operation.ganrateCapcha());
    }//GEN-LAST:event_Clear_BActionPerformed

    private void user_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_name1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new StudentLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        char[] password = user_Password.getPassword();
        String password_1 = new String(password);
        char[] conPass = user_Password_con.getPassword();
        String conPass_1 = new String(conPass);
        String full_name = name_First.getText() + name_Last.getText();
        System.out.println("1");
        if (!enter_Captch.getText().trim().isEmpty() && !mobile_Num.getText().trim().isEmpty() && !user_name1.getText().trim().isEmpty() && !father_Name.getText().trim().isEmpty() && !full_name.trim().isEmpty() && !mobile_Num.getText().trim().isEmpty() && !course.getText().trim().isEmpty() && !dob.getText().trim().isEmpty() && !gmail_Id.getText().trim().isEmpty() && !street_Add.getText().trim().isEmpty() && !block.getText().trim().isEmpty() && !distric.getText().trim().isEmpty() && !state.getText().trim().isEmpty() && !pincode.getText().trim().isEmpty() && !password_1.trim().isEmpty() && !conPass_1.trim().isEmpty()) {
        } else {

            JOptionPane.showMessageDialog(null, "Please Fill All Blanks");
            show_Captch.setText(Operation.ganrateCapcha());
            return;
        }

        if (!Operation.checkGmail(gmail_Id.getText())) {
            JOptionPane.showMessageDialog(null, "Invalide Gmail Id");
            gmail_Id.setText("");
            return;
        }

//        if (!Operation.checkMobileNumber(mobile_Num.getText())) {
//            System.out.println("3");
//            JOptionPane.showMessageDialog(null, "Invalide Mobile Number");
//            mobile_Num.setText("");
//            return;
//        }
        System.out.println("4");
//        if (!Operation.checkZipCode(pincode.getText())) {
//
//            System.out.println("4");
//            JOptionPane.showMessageDialog(null, "Invalide Zip COde");
//            pincode.setText("");
//            return;
//        }
        if (!password_1.equals(conPass_1)) {
            JOptionPane.showMessageDialog(null, "Password Not Match");
            user_Password.setText("");
            user_Password_con.setText("");
            return;
        }
        if (!enter_Captch.getText().equals(show_Captch.getText())) {
            JOptionPane.showMessageDialog(null, "Invalide Captch");
            enter_Captch.setText("");
            show_Captch.setText(Operation.ganrateCapcha());
            return;
        }
        try {
            if (DataBaseConnect.checkUserID(user_name1.getText())) {
                JOptionPane.showMessageDialog(null, "User AllReady Exist");
                user_name1.setText("");
                return;

            }
        } catch (ClassNotFoundException | SQLException ex) {
            // Logger.getLogger(StudentSing.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            DataBaseConnect.storePersnalData(name_First.getText(), name_Last.getText(), father_Name.getText(), mother_Name.getText(), dob.getText(), course.getText(), male.getText(), mobile_Num.getText(), gmail_Id.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        try {
            DataBaseConnect.storeAddress(street_Add.getText(), block.getText(), distric.getText(), state.getText(), pincode.getText(), gmail_Id.getText());
        } catch (ClassNotFoundException | SQLException e) {
        }
        System.out.println("2");
        try {
            DataBaseConnect.storeIdPassword(user_name1.getText(), password_1, gmail_Id.getText());
        } catch (ClassNotFoundException | SQLException e) {
        }
        JOptionPane.showMessageDialog(null, "Sign Up successly");
        show_Captch.setText(Operation.ganrateCapcha());
        new StudentLogin().setVisible(true);
        dispose();
        name_First.setText("");
        name_Last.setText("");
        father_Name.setText("");
        mother_Name.setText("");
        dob.setText("");
        course.setText("");
        mobile_Num.setText("");
        gmail_Id.setText("");
        street_Add.setText("");
        block.setText("");
        distric.setText("");
        state.setText("");
        pincode.setText("");
        enter_Captch.setText("");
        user_Password.setText("");
        user_Password_con.setText("");
        user_name1.setText("");
        enter_Captch.setText("");
    }//GEN-LAST:event_submitActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        if (male.isSelected()) {
            female.setSelected(false);
            other.setSelected(false);
            //gen = "Male";
        }
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        if (female.isSelected()) {
            male.setSelected(false);
            other.setSelected(false);
            //gen = "Male";
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherActionPerformed
        if (other.isSelected()) {
            male.setSelected(false);
            female.setSelected(false);
            //gen = "Male";
        }
    }//GEN-LAST:event_otherActionPerformed

    private void mobile_NumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobile_NumKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume non-digit characters
        } else {
            String s = mobile_Num.getText() + c; // Append the new character to the existing text
            try {

                if (s.length() > 10) {
                    evt.consume(); // Consume the event if the value is greater than 100
                }
            } catch (NumberFormatException ex) {
                // Handle the case where the text is not a valid integer
                evt.consume();
            }
        }
    }//GEN-LAST:event_mobile_NumKeyTyped

    private void pincodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pincodeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume non-digit characters
        } else {
            String s = pincode.getText() + c; // Append the new character to the existing text
            try {

                if (s.length() > 6) {
                    evt.consume(); // Consume the event if the value is greater than 100
                }
            } catch (NumberFormatException ex) {
                // Handle the case where the text is not a valid integer
                evt.consume();
            }
        }
    }//GEN-LAST:event_pincodeKeyTyped

    private void name_FirstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_FirstKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }
    }//GEN-LAST:event_name_FirstKeyTyped

    private void name_LastKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_LastKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        } // TODO add your handling code here:
    }//GEN-LAST:event_name_LastKeyTyped

    private void father_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_father_NameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {

            evt.consume(); // Consume digit characters
        }        // TODO add your handling code here:
    }//GEN-LAST:event_father_NameKeyTyped

    private void mother_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mother_NameKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }  // TODO add your handling code here:
    }//GEN-LAST:event_mother_NameKeyTyped

    private void dobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }      // TODO add your handling code here:
    }//GEN-LAST:event_dobKeyTyped

    private void courseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        } // TODO add your handling code here:
    }//GEN-LAST:event_courseKeyTyped

    private void street_AddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_street_AddKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }  // TODO add your handling code here:
    }//GEN-LAST:event_street_AddKeyTyped

    private void blockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blockKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }    // TODO add your handling code here:
    }//GEN-LAST:event_blockKeyTyped

    private void districKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_districKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }  // TODO add your handling code here:
    }//GEN-LAST:event_districKeyTyped

    private void stateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stateKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c)) {

            evt.consume(); // Consume digit characters
        }      // TODO add your handling code here:
    }//GEN-LAST:event_stateKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_B;
    private javax.swing.JTextField block;
    private javax.swing.JTextField course;
    private javax.swing.JTextField distric;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField enter_Captch;
    private javax.swing.JTextField father_Name;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gen;
    private javax.swing.JTextField gmail_Id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mobile_Num;
    private javax.swing.JTextField mother_Name;
    private javax.swing.JTextField name_First;
    private javax.swing.JTextField name_Last;
    private javax.swing.JRadioButton other;
    private javax.swing.JTextField pincode;
    private javax.swing.JLabel show_Captch;
    private javax.swing.JTextField state;
    private javax.swing.JTextField street_Add;
    private javax.swing.JButton submit;
    private javax.swing.JPasswordField user_Password;
    private javax.swing.JPasswordField user_Password_con;
    private javax.swing.JTextField user_name1;
    // End of variables declaration//GEN-END:variables
}
