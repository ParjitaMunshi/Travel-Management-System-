/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.lifestyle;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Hotel.Hotel;
import mysql.util.MySQLUtil;
import static mysql.util.MySQLUtil.connectMySQL;

/**
 *
 * @author Anshul
 */
public class HotelCrud extends javax.swing.JPanel {

    /**
     * Creates new form HotelCrud
     */
    
    public HotelCrud() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        crCity = new javax.swing.JTextField();
        crZipcode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        crHotel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        crAddress = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        upCity = new javax.swing.JTextField();
        upZipcode = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        upHotel = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        upAddress = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 600, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hotel", "Address", "City", "Zipcode", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 460, 170));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 600, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 600, 10));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 600, 30));

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 30));
        add(crCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 200, 30));
        add(crZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 200, 30));

        jLabel15.setText("City");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel16.setText("Address");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 20));

        jLabel17.setText("Zipcode");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 10));

        crHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crHotelActionPerformed(evt);
            }
        });
        add(crHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 200, 30));

        jLabel19.setText("Hotel");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));
        add(crAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 200, 30));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 150, 30));
        add(upCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 200, 30));
        add(upZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 200, 30));

        jLabel23.setText("City");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 20));

        jLabel24.setText("Address");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 20));

        jLabel25.setText("Zipcode");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, 20));
        add(upHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 200, 30));

        jLabel26.setText("Hotel");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 20));
        add(upAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 200, 30));

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 90, 30));

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 90, 30));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if(crHotel.getText().isEmpty() || crAddress.getText().isEmpty() || crCity.getText().isEmpty() ||
                crZipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inputs should not be Empty");
            return;
        }
          
        String hotel = crHotel.getText();
        String address = crAddress.getText();
        String city = crCity.getText();
        String zipcode = crZipcode.getText();
        
        Hotel h = new Hotel();
        
        h.setHotel(hotel);
        h.setAddress(address);
        h.setCity(city);
        h.setZipcode(zipcode);
        MySQLUtil.addHotel(h);
        
        JOptionPane.showMessageDialog(this, "Record created successfully!");
        
        crHotel.setText("");
        crAddress.setText("");
        crCity.setText("");
        crZipcode.setText("");
        
        populateTable();
    }//GEN-LAST:event_submitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        if(upHotel.getText().isEmpty() || upAddress.getText().isEmpty() ||
                upCity.getText().isEmpty() || upZipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Inputs should not be Empty");
            return;
        }
        
        String hotel = upHotel.getText();
        String address = upAddress.getText();
        String city = upCity.getText();
        String zipcode = upZipcode.getText();
        
        int selectedRowIndex = jTable1.getSelectedRow();
         
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
          
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int id = Integer.parseInt(model.getValueAt(selectedRowIndex, 4).toString());
        
        Hotel h = new Hotel(id, hotel, address, city, zipcode);
        MySQLUtil.updateHotel(h);
        
        upHotel.setText("");
        upAddress.setText("");
        upCity.setText("");
        upZipcode.setText("");
        
        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void crHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crHotelActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
         
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this,"Please select a row to view.");
            return;
        }
          
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String hotel = model.getValueAt(selectedRowIndex, 0).toString();
        String address = model.getValueAt(selectedRowIndex, 1).toString();
        String city = model.getValueAt(selectedRowIndex, 2).toString();
        String zipcode = model.getValueAt(selectedRowIndex, 3).toString();
//        int id = Integer.parseInt(model.getValueAt(selectedRowIndex, 4));
        
        upHotel.setText(hotel);
        upAddress.setText(address);
        upCity.setText(city);
        upZipcode.setText(zipcode);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
            int selectedRowIndex = jTable1.getSelectedRow();

            if(selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this,"Please select a row to view.");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            String hotel = model.getValueAt(selectedRowIndex, 0).toString();
            String address = model.getValueAt(selectedRowIndex, 1).toString();
            String city = model.getValueAt(selectedRowIndex, 2).toString();
            String zipcode = model.getValueAt(selectedRowIndex, 3).toString();
            int id = Integer.parseInt(model.getValueAt(selectedRowIndex, 4).toString());

            Hotel h = new Hotel(id, hotel, address, city, zipcode);

            MySQLUtil.deleteHotel(h);
            JOptionPane.showMessageDialog(this,"Record deleted Successfully!");

            upHotel.setText("");
            upAddress.setText("");
            upCity.setText("");
            upZipcode.setText("");

            populateTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        upHotel.setText("");
        upAddress.setText("");
        upCity.setText("");
        upZipcode.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        ArrayList<Hotel> allHotel = MySQLUtil.getAllHotel();
        
        for(Hotel h : allHotel) {
            Object[] row = new Object[5];
            row[0] = h.getHotel();
            row[1] = h.getAddress();
            row[2] = h.getCity();
            row[3] = h.getZipcode();
            row[4] = h.getId();
            
            model.addRow(row);
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField crAddress;
    private javax.swing.JTextField crCity;
    private javax.swing.JTextField crHotel;
    private javax.swing.JTextField crZipcode;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextField upAddress;
    private javax.swing.JTextField upCity;
    private javax.swing.JTextField upHotel;
    private javax.swing.JTextField upZipcode;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}