package operation;

import storedata.*;

public class Options extends javax.swing.JFrame  {

    public Options() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        storeData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchData.setText("SEARCH DATA");
        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });

        updateData.setText("UPDATE DATA");
        updateData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDataActionPerformed(evt);
            }
        });

        storeData.setText("STORE DATA");
        storeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(storeData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateData, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(220, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        // TODO add your handling code here:

        new SearchOptions().setVisible(true);
         dispose();

    }//GEN-LAST:event_searchDataActionPerformed

    private void updateDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDataActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_updateDataActionPerformed

    private void storeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeDataActionPerformed

        new StoreData().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_storeDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton searchData;
    private javax.swing.JButton storeData;
    private javax.swing.JButton updateData;
    // End of variables declaration//GEN-END:variables
}
