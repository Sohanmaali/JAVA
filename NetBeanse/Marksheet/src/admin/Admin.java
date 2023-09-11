package admin;

import databaseconnect.DataBaseConnect;
import static databaseconnect.DataBaseConnect.checkRegistrationNumberSTRegi;
import display.ShowAllRegistration;
import display.ShowAllStudent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import test.StoreData;
import storedata.StoreStudentMarks;
import swing.RGPVHOM;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
        ImageIcon imgicon = new ImageIcon("D:/JAVA/DAVV.png");
        setIconImage(imgicon.getImage());
    }

    public static void main(String[] args) {
        new Admin().setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        homeBTN = new javax.swing.JButton();
        academicBTN = new javax.swing.JButton();
        institutionBTM = new javax.swing.JButton();
        quickLinksBTN = new javax.swing.JButton();
        aboutBTN = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        updateButten = new javax.swing.JButton();
        storeDataButten = new javax.swing.JButton();
        deleteButten = new javax.swing.JButton();
        genrate_rollNumber = new javax.swing.JButton();
        rollGenerateDoneBTN = new javax.swing.JButton();
        back_B = new javax.swing.JButton();
        enterRollNumber = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ragis = new javax.swing.JTextField();
        viewStudentRagistration = new javax.swing.JComboBox<>();
        viewOptionStudent = new javax.swing.JComboBox<>();
        enterRagistreterName = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ragisTakeName = new javax.swing.JTextField();
        viewRegistrationBTN = new javax.swing.JButton();
        enterName1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ragis2 = new javax.swing.JTextField();
        done2 = new javax.swing.JButton();

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        homeBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeBTN.setText("HOME");
        homeBTN.setContentAreaFilled(false);
        homeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBTNActionPerformed(evt);
            }
        });

        academicBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        academicBTN.setText("ACADEMICS");
        academicBTN.setContentAreaFilled(false);

        institutionBTM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        institutionBTM.setText("INSTITUTIONS");
        institutionBTM.setContentAreaFilled(false);
        institutionBTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institutionBTMActionPerformed(evt);
            }
        });

        quickLinksBTN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quickLinksBTN.setText("QUICK LINKS");
        quickLinksBTN.setContentAreaFilled(false);

        aboutBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aboutBTN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ABOUT", "Item 2", "Item 3", "Item 4" }));
        aboutBTN.setBorder(null);
        aboutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
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
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\JAVA\\NetBeanse\\Marksheet\\Img\\best-uk-universities-education1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        updateButten.setBackground(new java.awt.Color(5, 131, 210));
        updateButten.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        updateButten.setForeground(new java.awt.Color(255, 255, 255));
        updateButten.setText("UPDATE DATA");
        updateButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtenActionPerformed(evt);
            }
        });

        storeDataButten.setBackground(new java.awt.Color(5, 131, 210));
        storeDataButten.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        storeDataButten.setForeground(new java.awt.Color(255, 255, 255));
        storeDataButten.setText("STORE DATA");
        storeDataButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeDataButtenActionPerformed(evt);
            }
        });

        deleteButten.setBackground(new java.awt.Color(5, 131, 210));
        deleteButten.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        deleteButten.setForeground(new java.awt.Color(255, 255, 255));
        deleteButten.setText("DELETE");
        deleteButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtenActionPerformed(evt);
            }
        });

        genrate_rollNumber.setBackground(new java.awt.Color(5, 131, 210));
        genrate_rollNumber.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        genrate_rollNumber.setForeground(new java.awt.Color(255, 255, 255));
        genrate_rollNumber.setText("Generate Roll");
        genrate_rollNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genrate_rollNumberActionPerformed(evt);
            }
        });

        rollGenerateDoneBTN.setBackground(new java.awt.Color(5, 131, 210));
        rollGenerateDoneBTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        rollGenerateDoneBTN.setForeground(new java.awt.Color(255, 255, 255));
        rollGenerateDoneBTN.setText("DONE");
        rollGenerateDoneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollGenerateDoneBTNActionPerformed(evt);
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

        enterRollNumber.setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enter Ragistration Number :");

        ragis.setBackground(new java.awt.Color(204, 255, 153));
        ragis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ragisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterRollNumberLayout = new javax.swing.GroupLayout(enterRollNumber);
        enterRollNumber.setLayout(enterRollNumberLayout);
        enterRollNumberLayout.setHorizontalGroup(
            enterRollNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterRollNumberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(ragis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        enterRollNumberLayout.setVerticalGroup(
            enterRollNumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterRollNumberLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ragis, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        viewStudentRagistration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Student Registration", "View By Name", "View By Address" }));
        viewStudentRagistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentRagistrationActionPerformed(evt);
            }
        });

        viewOptionStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Student", "View By Name", "View By Roll Number" }));
        viewOptionStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOptionStudentActionPerformed(evt);
            }
        });

        enterRagistreterName.setBackground(new java.awt.Color(204, 255, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Enter Name                  :");

        ragisTakeName.setBackground(new java.awt.Color(204, 255, 153));
        ragisTakeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ragisTakeNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterRagistreterNameLayout = new javax.swing.GroupLayout(enterRagistreterName);
        enterRagistreterName.setLayout(enterRagistreterNameLayout);
        enterRagistreterNameLayout.setHorizontalGroup(
            enterRagistreterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterRagistreterNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ragisTakeName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        enterRagistreterNameLayout.setVerticalGroup(
            enterRagistreterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterRagistreterNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ragisTakeName, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        viewRegistrationBTN.setBackground(new java.awt.Color(5, 131, 210));
        viewRegistrationBTN.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        viewRegistrationBTN.setForeground(new java.awt.Color(255, 255, 255));
        viewRegistrationBTN.setText("DONE");
        viewRegistrationBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationBTNActionPerformed(evt);
            }
        });

        enterName1.setBackground(new java.awt.Color(204, 255, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Enter Name");

        ragis2.setBackground(new java.awt.Color(204, 255, 153));
        ragis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ragis2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterName1Layout = new javax.swing.GroupLayout(enterName1);
        enterName1.setLayout(enterName1Layout);
        enterName1Layout.setHorizontalGroup(
            enterName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterName1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(ragis2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        enterName1Layout.setVerticalGroup(
            enterName1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ragis2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        done2.setBackground(new java.awt.Color(5, 131, 210));
        done2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        done2.setForeground(new java.awt.Color(255, 255, 255));
        done2.setText("DONE");
        done2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(viewOptionStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(enterName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(done2))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(genrate_rollNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(enterRollNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rollGenerateDoneBTN)
                            .addGap(8, 8, 8))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(viewStudentRagistration, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(enterRagistreterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(viewRegistrationBTN)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(storeDataButten, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(updateButten, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(deleteButten, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genrate_rollNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enterRollNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollGenerateDoneBTN))
                .addGap(54, 54, 54)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterRagistreterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewStudentRagistration, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRegistrationBTN, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(done2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enterName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewOptionStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButten, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButten, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeDataButten, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeDataButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeDataButtenActionPerformed

        new StoreStudentMarks().setVisible(true);
        dispose();
    }//GEN-LAST:event_storeDataButtenActionPerformed

    private void back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_BActionPerformed
        new AdminLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_BActionPerformed

    private void updateButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtenActionPerformed

        //dispose();
    }//GEN-LAST:event_updateButtenActionPerformed

    private void homeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBTNActionPerformed
        new RGPVHOM().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeBTNActionPerformed

    private void institutionBTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institutionBTMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_institutionBTMActionPerformed

    private void aboutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutBTNActionPerformed

    private void genrate_rollNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genrate_rollNumberActionPerformed
        //  if(genrate_roll.)

    }//GEN-LAST:event_genrate_rollNumberActionPerformed

    private void deleteButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtenActionPerformed

    private void ragisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ragisActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ragisActionPerformed

    private void rollGenerateDoneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollGenerateDoneBTNActionPerformed
        try {
            // TODO add your handling code here:
            if (checkRegistrationNumberSTRegi(Integer.parseInt(ragis.getText()))) {
                int i = DataBaseConnect.ganrateRollNumber(Integer.parseInt(ragis.getText()));
                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Roll Number Ganrated Successfully");
                    ragis.setText("");
                } else if (i == -1) {
                    JOptionPane.showMessageDialog(null, "Roll Number Allready Exist");
                    ragis.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Roll Number Genaration Fail");
                    ragis.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ragistration Number Not Found");
                ragis.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rollGenerateDoneBTNActionPerformed

    private void viewStudentRagistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentRagistrationActionPerformed
        // TODO add your handling code here:

        switch (viewStudentRagistration.getSelectedItem().toString()) {
            case "All Student Registration" -> {
                new ShowAllRegistration("All Student Registration", ragisTakeName.getText()).setVisible(true); //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                dispose();
            }
            case "View By Name" -> {

            }
            case "View By Address" -> {
                new ShowAllRegistration("View By Address", ragisTakeName.getText()).setVisible(true); //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                dispose();
            }
        }
    }//GEN-LAST:event_viewStudentRagistrationActionPerformed

    private void viewOptionStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOptionStudentActionPerformed

        switch (viewOptionStudent.getSelectedItem().toString()) {
            case "All Student" -> {
                try {
                    new ShowAllStudent().setVisible(true);
                    System.out.println("555555555");
                    dispose();
                } catch (ClassNotFoundException | SQLException ex) {
                    //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case "View By Name" -> {
            }
            case "View By Roll Number" -> {
            }
            default -> {
            }
        }

    }//GEN-LAST:event_viewOptionStudentActionPerformed

    private void ragisTakeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ragisTakeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ragisTakeNameActionPerformed

    private void viewRegistrationBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationBTNActionPerformed
        // TODO add your handling code here:
        if (true && !ragisTakeName.getText().isEmpty()) {
            System.out.println(ragisTakeName.getText());
            new ShowAllRegistration("View By Name", ragisTakeName.getText()).setVisible(true); //Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Fill all Blank");

        }
    }//GEN-LAST:event_viewRegistrationBTNActionPerformed

    private void ragis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ragis2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ragis2ActionPerformed

    private void done2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_done2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aboutBTN;
    private javax.swing.JButton academicBTN;
    private javax.swing.JButton back_B;
    private javax.swing.JButton deleteButten;
    private javax.swing.JButton done2;
    private javax.swing.JPanel enterName1;
    private javax.swing.JPanel enterRagistreterName;
    private javax.swing.JPanel enterRollNumber;
    private javax.swing.JButton genrate_rollNumber;
    private javax.swing.JButton homeBTN;
    private javax.swing.JButton institutionBTM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton quickLinksBTN;
    private javax.swing.JTextField ragis;
    private javax.swing.JTextField ragis2;
    private javax.swing.JTextField ragisTakeName;
    private javax.swing.JButton rollGenerateDoneBTN;
    private javax.swing.JButton storeDataButten;
    private javax.swing.JButton updateButten;
    private javax.swing.JComboBox<String> viewOptionStudent;
    private javax.swing.JButton viewRegistrationBTN;
    private javax.swing.JComboBox<String> viewStudentRagistration;
    // End of variables declaration//GEN-END:variables
}
