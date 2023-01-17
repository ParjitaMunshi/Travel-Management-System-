/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminPanel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.enterprise.Enterprise;
import mysql.util.MySQLUtil;

/**
 *
 * @author parjita
 */
public class ViewEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form ViewEnterprise
     */
    public ViewEnterprise() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EnterpriseViewTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EnterpriseTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        EnterpriseViewTable.setForeground(new java.awt.Color(0, 153, 153));
        EnterpriseViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Admin ID", "Enterprise Name", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EnterpriseViewTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("View Enterprise");

        Deletebtn.setBackground(new java.awt.Color(0, 153, 153));
        Deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        Deletebtn.setText("Delete");
        Deletebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        Updatebtn.setBackground(new java.awt.Color(0, 153, 153));
        Updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("Update");
        Updatebtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Enterprise Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(EnterpriseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterpriseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = EnterpriseViewTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) EnterpriseViewTable.getModel();
        int AdminID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        
        MySQLUtil.deleteenterprise(AdminID);
                    
        populateTable();
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = EnterpriseViewTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update!");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) EnterpriseViewTable.getModel();
        int selectedAdminId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        
        JOptionPane.showMessageDialog(this,"enterprise Details Updates");
        String enterPriseName = EnterpriseTextField.getText();
               
        MySQLUtil.updateenterprisedetail(enterPriseName, selectedAdminId);
        populateTable();

        EnterpriseTextField.setText("");
    }//GEN-LAST:event_UpdatebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField EnterpriseTextField;
    private javax.swing.JTable EnterpriseViewTable;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel model = (DefaultTableModel) EnterpriseViewTable.getModel();
       model.setRowCount(0);
       ArrayList<Enterprise> enterpriseList = MySQLUtil.viewenterprisedetails();
       for(Enterprise e : enterpriseList ){
            Object[] row = new Object[3];                   
                   row[0] = e.getAdminID();
                   row[1] = e.getEnterpriseName();
                   row[2] = e.getEmail();    
                   
                   model.addRow(row);
       }
    }
}
