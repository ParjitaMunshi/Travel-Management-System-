/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.busAdminDashboard;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Flight.FlightBookings;
import model.Person.Person;
import model.bus.BusBookings;
import mysql.util.MySQLUtil;

/**
 *
 * @author slenk
 */
public class UpdateBusBookingStatus extends javax.swing.JPanel {

    /**
     * Creates new form UpdateBusBookingStatus
     */
    private String selectedStatus;
    private int selectedBookingId;
    
    public UpdateBusBookingStatus() {
        initComponents();
        
        String[] statusArr = {"SELECT A STATUS", "BOOKED", 
            "CANCELED", "CHECKED_IN"}; 
        flightBookingStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(statusArr));
        
        populateTable();
    }
    
    public void populateTable() {
        ArrayList<BusBookings> busBookingList = 
                MySQLUtil.getAllBusBookings();
        
        DefaultTableModel model = (DefaultTableModel) 
                tableFlightBookingDetails.getModel();
        
        model.setRowCount(0);
        
        for(BusBookings bookings: busBookingList) {
            
//            Person person = MySQLUtil.getPerson(bookings.getPersonId());
            
            Object[] row = new Object[5];
            
            row[0] = bookings.getBookingId();
            row[1] = bookings.getBusId();
//            row[2] = person.getFirstname() + " " + 
//                    person.getLastname();
            row[2] = bookings.getSeat();
            row[3] = bookings.getPrice();
            row[4] = bookings.getBookingStatus();
            
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFlightBookingDetails = new javax.swing.JTable();
        flightBookingStatusCombo = new javax.swing.JComboBox<>();
        btnUpdateStatus = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Bus Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tableFlightBookingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Booking ID", "Bus ID", "Seat", "Price", "Status"
            }
        ));
        tableFlightBookingDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFlightBookingDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFlightBookingDetails);

        flightBookingStatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        flightBookingStatusCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightBookingStatusComboActionPerformed(evt);
            }
        });

        btnUpdateStatus.setText("Update Status");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(flightBookingStatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightBookingStatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUpdateStatus, flightBookingStatusCombo});

    }// </editor-fold>//GEN-END:initComponents

    private void tableFlightBookingDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFlightBookingDetailsMouseClicked
        int selectedRow = tableFlightBookingDetails.getSelectedRow();

        this.selectedBookingId = Integer.parseInt(tableFlightBookingDetails.getValueAt(
            selectedRow, 0).toString());

    }//GEN-LAST:event_tableFlightBookingDetailsMouseClicked

    private void flightBookingStatusComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightBookingStatusComboActionPerformed
        String status = String.valueOf(flightBookingStatusCombo.getSelectedItem());

        System.out.println(status + this.selectedBookingId);

        if(status.equals("SELECT A STATUS")) {
            this.selectedStatus = "";
        } else {
            this.selectedStatus = status;
        }
    }//GEN-LAST:event_flightBookingStatusComboActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed

        if(tableFlightBookingDetails.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }

        System.out.println(this.selectedBookingId + " "
            + this.selectedStatus);

        MySQLUtil.updateBusBookingStatus(this.selectedBookingId,
            this.selectedStatus);

        populateTable();
    }//GEN-LAST:event_btnUpdateStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> flightBookingStatusCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFlightBookingDetails;
    // End of variables declaration//GEN-END:variables
}
