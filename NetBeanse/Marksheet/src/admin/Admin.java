package admin;

import databaseconnect.DataBaseConnect;
import static databaseconnect.DataBaseConnect.checkRegistrationNumberSTRegi;
import static databaseconnect.DataBaseConnect.removeStudentData;
import display.ShowAllRegistration;
import display.ShowAllStudent;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import storedata.StoreStudentMarks;
import swing.RGPVHOM;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        rollGenerator.setVisible(false);
        rollGenerateDoneBTN.setVisible(false);

        updatePannelf.setVisible(false);
        update.setVisible(false);
    }

    public static void main(String[] args) {
        new Admin().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        homeBTN = new javax.swing.JButton();
        academicBTN = new javax.swing.JButton();
        institutionBTM = new javax.swing.JButton();
        quickLinksBTN = new javax.swing.JButton();
        aboutBTN = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        updation = new javax.swing.JComboBox<>();
        viewAllList = new javax.swing.JComboBox<>();
        updatePannel = new javax.swing.JPanel();
        updatePannelf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regis = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rollGenerator = new javax.swing.JPanel();
        take_regis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        rollGenerateDoneBTN = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        removeData = new javax.swing.JComboBox<>();
        generate_Roll = new javax.swing.JComboBox<>();
        generateMarksheet = new javax.swing.JComboBox<>();
        back_B = new javax.swing.JButton();
        marksUpdation = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/logo2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 231, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        homeBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeBTN.setText("HOME");
        homeBTN.setBorder(null);
        homeBTN.setContentAreaFilled(false);
        homeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBTNMouseExited(evt);
            }
        });
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });

        academicBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        academicBTN.setText("ACADEMICS");
        academicBTN.setBorder(null);
        academicBTN.setContentAreaFilled(false);

        institutionBTM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        institutionBTM.setText("INSTITUTIONS");
        institutionBTM.setBorder(null);
        institutionBTM.setContentAreaFilled(false);
        institutionBTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutionBTMActionPerformed(evt);
            }
        });

        quickLinksBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quickLinksBTN.setText("QUICK LINKS");
        quickLinksBTN.setBorder(null);
        quickLinksBTN.setContentAreaFilled(false);

        aboutBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aboutBTN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABOUT", "Item 2", "Item 3", "Item 4" }));
        aboutBTN.setBorder(null);
        aboutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(homeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(aboutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(institutionBTM)
                .addGap(40, 40, 40)
                .addComponent(academicBTN)
                .addGap(42, 42, 42)
                .addComponent(quickLinksBTN)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(academicBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institutionBTM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quickLinksBTN)
                    .addComponent(aboutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setBackground(new java.awt.Color(51, 0, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RAJIV GANDHI PROGYOGIKI VISHWAVIDYALAYA  M.P.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        updation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                   Update", "Name", "Last Name", "Father Name", "Mother Name" }));
        updation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updationActionPerformed(evt);
            }
        });

        viewAllList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               View All", "All Registration", "All Student" }));
        viewAllList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAllListActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Roll Number");

        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rollKeyTyped(evt);
            }
        });

        jLabel4.setText("Enter Ragistration Number");

        regis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisActionPerformed(evt);
            }
        });
        regis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regisKeyTyped(evt);
            }
        });

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Updation Value");

        javax.swing.GroupLayout updatePannelfLayout = new javax.swing.GroupLayout(updatePannelf);
        updatePannelf.setLayout(updatePannelfLayout);
        updatePannelfLayout.setHorizontalGroup(
            updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePannelfLayout.createSequentialGroup()
                .addGroup(updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updatePannelfLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePannelfLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePannelfLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        updatePannelfLayout.setVerticalGroup(
            updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePannelfLayout.createSequentialGroup()
                .addGroup(updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(updatePannelfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePannelfLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePannelfLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        take_regis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                take_regisKeyTyped(evt);
            }
        });

        jLabel6.setText("Enter Ragistration Number");

        javax.swing.GroupLayout rollGeneratorLayout = new javax.swing.GroupLayout(rollGenerator);
        rollGenerator.setLayout(rollGeneratorLayout);
        rollGeneratorLayout.setHorizontalGroup(
            rollGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rollGeneratorLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(take_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        rollGeneratorLayout.setVerticalGroup(
            rollGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rollGeneratorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rollGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(take_regis, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        update.setBackground(new java.awt.Color(5, 131, 210));
        update.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        rollGenerateDoneBTN.setBackground(new java.awt.Color(5, 131, 210));
        rollGenerateDoneBTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rollGenerateDoneBTN.setForeground(new java.awt.Color(255, 255, 255));
        rollGenerateDoneBTN.setText("Generate");
        rollGenerateDoneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollGenerateDoneBTNActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(5, 131, 210));
        delete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePannelLayout = new javax.swing.GroupLayout(updatePannel);
        updatePannel.setLayout(updatePannelLayout);
        updatePannelLayout.setHorizontalGroup(
            updatePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePannelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(updatePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatePannelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePannelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(rollGenerateDoneBTN)
                .addGap(72, 72, 72))
        );
        updatePannelLayout.setVerticalGroup(
            updatePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatePannelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rollGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(updatePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rollGenerateDoneBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(updatePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );

        removeData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         Remove Data", "Registration", "Student" }));
        removeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDataActionPerformed(evt);
            }
        });

        generate_Roll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Generate Roll" }));
        generate_Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_RollActionPerformed(evt);
            }
        });

        generateMarksheet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Generate MarkSheet" }));
        generateMarksheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMarksheetActionPerformed(evt);
            }
        });

        back_B.setBackground(new java.awt.Color(5, 131, 210));
        back_B.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        back_B.setForeground(new java.awt.Color(255, 255, 255));
        back_B.setText("BACK");
        back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_BActionPerformed(evt);
            }
        });

        marksUpdation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                   Marks", "Hindi", "English", "Physics", "Chemestry", "Mathes" }));
        marksUpdation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksUpdationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(generate_Roll, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeData, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAllList, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updation, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateMarksheet, 0, 164, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(marksUpdation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(updatePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(viewAllList, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(marksUpdation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generate_Roll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generateMarksheet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(back_B)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updatePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\JAVA\\NetBeanse\\Marksheet\\Img\\best-uk-universities-education1.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(406, 406, 406)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_BActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if (updation.getSelectedItem().toString().isEmpty() || value.getText().isEmpty() || roll.getText().isEmpty() && regis.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Blanks");
        } else {
            //  System.out.println(updation.getSelectedItem());
            int i = DataBaseConnect.StudentDataUpdate((String) updation.getSelectedItem(), (String) value.getText(), Integer.parseInt(roll.getText()), Integer.parseInt(regis.getText()));
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Updation successly Complide");
                roll.setText("");
                regis.setText("");
                value.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Updation Fail");
                roll.setText("");
                regis.setText("");
                value.setText("");
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void rollGenerateDoneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollGenerateDoneBTNActionPerformed
        try {
            // TODO add your handling code here:
            if (checkRegistrationNumberSTRegi(Integer.parseInt(take_regis.getText()))) {
                int i = DataBaseConnect.ganrateRollNumber(Integer.parseInt(take_regis.getText()));
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Roll Number Ganrated Successfully");
                    take_regis.setText("");
                } else if (i == -1) {
                    JOptionPane.showMessageDialog(null, "Roll Number Already Exists");
                    take_regis.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Roll Number Genaration Fail");
                    take_regis.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ragistration Number Not Found");
                take_regis.setText("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            //  Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rollGenerateDoneBTNActionPerformed

    private void viewAllListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAllListActionPerformed

        switch (viewAllList.getSelectedItem().toString()) {
            case "All Registration" -> {
                try {
                    new ShowAllRegistration().setVisible(true); //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
            case "All Student" -> {
                try {
                    new ShowAllStudent().setVisible(true);
                    dispose();
                } catch (ClassNotFoundException | SQLException ex) {
                    //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_viewAllListActionPerformed
    }
    private void updationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updationActionPerformed
        rollGenerator.setVisible(false);
        rollGenerateDoneBTN.setVisible(false);

        updatePannelf.setVisible(true);
        update.setVisible(true);
    }//GEN-LAST:event_updationActionPerformed

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollActionPerformed

    private void rollKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume non-digit characters
        }
    }//GEN-LAST:event_rollKeyTyped

    private void regisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regisKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume non-digit characters
        }
    }//GEN-LAST:event_regisKeyTyped

    private void removeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeDataActionPerformed
        rollGenerateDoneBTN.setVisible(false);
        switch (removeData.getSelectedIndex()) {
            case 1 -> {
            }
            case 2 -> {
                removeStudentData(10, 10);
            }
        }

    }//GEN-LAST:event_removeDataActionPerformed

    private void generate_RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_RollActionPerformed
        rollGenerator.setVisible(true);
        rollGenerateDoneBTN.setVisible(true);

        updatePannelf.setVisible(false);
        update.setVisible(false);
    }//GEN-LAST:event_generate_RollActionPerformed

    private void take_regisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_take_regisKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume(); // Consume non-digit characters
        }
    }//GEN-LAST:event_take_regisKeyTyped

    private void generateMarksheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMarksheetActionPerformed
        new StoreStudentMarks().setVisible(true);
        dispose();
    }//GEN-LAST:event_generateMarksheetActionPerformed

    private void marksUpdationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marksUpdationActionPerformed
        // TODO add your handling code here:
        rollGenerator.setVisible(false);
        rollGenerateDoneBTN.setVisible(false);

        updatePannelf.setVisible(true);
        update.setVisible(true);
    }//GEN-LAST:event_marksUpdationActionPerformed

    private void regisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regisActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:

        switch (updation.getSelectedItem().toString()) {
            case "Marks" -> {

            }

            case "Hindi" -> {
            }
            case "English" -> {
            }
            case "Chemestry" -> {
            }
            case "Physics" -> {
            }
        }
    }//GEN-LAST:event_valueActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void aboutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBTNActionPerformed

    private void institutionBTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutionBTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutionBTMActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        new RGPVHOM().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeBTNActionPerformed

    private void homeBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBTNMouseEntered
        homeBTN.setForeground(Color.blue);
    }//GEN-LAST:event_homeBTNMouseEntered

    private void homeBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBTNMouseExited
        // TODO add your handling code here:
        homeBTN.setForeground(Color.black);
    }//GEN-LAST:event_homeBTNMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aboutBTN;
    private javax.swing.JButton academicBTN;
    private javax.swing.JButton back_B;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> generateMarksheet;
    private javax.swing.JComboBox<String> generate_Roll;
    private javax.swing.JButton homeBTN;
    private javax.swing.JButton home_butten;
    private javax.swing.JButton institutionBTM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> marksUpdation;
    private javax.swing.JButton quickLinksBTN;
    private javax.swing.JTextField regis;
    private javax.swing.JComboBox<String> removeData;
    private javax.swing.JTextField roll;
    private javax.swing.JButton rollGenerateDoneBTN;
    private javax.swing.JPanel rollGenerator;
    private javax.swing.JTextField take_regis;
    private javax.swing.JButton update;
    private javax.swing.JPanel updatePannel;
    private javax.swing.JPanel updatePannelf;
    private javax.swing.JComboBox<String> updation;
    private javax.swing.JTextField value;
    private javax.swing.JComboBox<String> viewAllList;
    // End of variables declaration//GEN-END:variables
}
