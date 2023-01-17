/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.userdashboard;

import javax.swing.JOptionPane;
import mysql.util.MySQLUtil;
import ui.flightUIPanels.SelectInsurance;

/**
 *
 * @author slenk
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
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
        tableMyFlightBookings = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnCheckin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableMyFlightBookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Flight Name", "Departing City", "Dept Time", "Dept Airport", "Dept Terminal", "Arrival City", "Arrival Time", "Arrival Airport", "Arrival Terminal", "Seats", "Price", "Status", "Insurance status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMyFlightBookings);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("My Flight Bookings");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Insurance Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnCheckin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCheckin.setText("Check In");
        btnCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(562, 562, 562))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = tableMyFlightBookings.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking!");
            return;
        }

        String selectedStatus = tableMyFlightBookings.getModel()
        .getValueAt(selectedRow, 12).toString();

        if(selectedStatus.equals("CHECKED_IN")) {
            JOptionPane.showMessageDialog(this, "You are already checked in!");
            return;
        }

        if(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 13) != null) {
            if(tableMyFlightBookings.getModel()
                .getValueAt(selectedRow, 13).toString().equals("PENDING")) {
                JOptionPane.showMessageDialog(this, "Wait for insurance approval!");
                return;
            }

            if(tableMyFlightBookings.getModel()
                .getValueAt(selectedRow, 13).toString().equals("APPLIED")) {
                JOptionPane.showMessageDialog(this, "Wait for insurance approval!");
                return;
            }

            if(tableMyFlightBookings.getModel()
                .getValueAt(selectedRow, 13).toString().equals("APPROVED")) {
                JOptionPane.showMessageDialog(this, "You're insured!");
                return;
            }
        }

        int bookingId = Integer.parseInt(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 0).toString());

        double totalPrice = Double.valueOf(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 11).toString());

        SelectInsurance s = new SelectInsurance(bookingId, totalPrice);
        s.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinActionPerformed
        int selectedRow = tableMyFlightBookings.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a booking!");
            return;
        }

        int selectedBookingId = Integer.parseInt(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 0).toString());

        String selectedStatus = tableMyFlightBookings.getModel()
        .getValueAt(selectedRow, 12).toString();

        if(selectedStatus.equals("CHECKED_IN")) {
            JOptionPane.showMessageDialog(this, "You are already checked in!");
            return;
        }

        if(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 13) == null) {
            JOptionPane.showMessageDialog(this, "Please select an insurance!");
            return;
        }

        if(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 13).equals("PENDING")) {
            JOptionPane.showMessageDialog(this, "Please wait for insurance approval for checkin!");
            return;
        }

        if(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 13).equals("APPLIED")) {
            JOptionPane.showMessageDialog(this, "Please wait for insurance approval for checkin!");
            return;
        }

        if(tableMyFlightBookings.getModel()
            .getValueAt(selectedRow, 13).equals("REJECTED")) {
            JOptionPane.showMessageDialog(this, "Sorry for the inconvinence,"
                + " booking not insured. Money would be refunded in your account in 3-5 business days!");
            return;
        }

        MySQLUtil.updateFlightBookingStatus(selectedBookingId, "CHECKED_IN");

//        populateTable();
    }//GEN-LAST:event_btnCheckinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMyFlightBookings;
    // End of variables declaration//GEN-END:variables
}
