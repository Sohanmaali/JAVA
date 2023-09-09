package display;

import databaseconnect.DataBaseConnect;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

public class ShowAllStudent extends javax.swing.JFrame {

    public ShowAllStudent() throws ClassNotFoundException, SQLException {

        initComponents();
        DefaultTableModel model = (DefaultTableModel) stDataTable.getModel();
        DataBaseConnect.retriveAllData(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        stDataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stDataTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Registration Id", "Roll Number", "Student Name", "Father Name", "Mother Name"
            }
        ));
        stDataTable.setRowHeight(40);
        jScrollPane1.setViewportView(stDataTable);
        if (stDataTable.getColumnModel().getColumnCount() > 0) {
            stDataTable.getColumnModel().getColumn(0).setHeaderValue("Student Registration Id");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable stDataTable;
    // End of variables declaration//GEN-END:variables
}
