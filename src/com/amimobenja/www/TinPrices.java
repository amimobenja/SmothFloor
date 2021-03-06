/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amimobenja.www;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author afro
 */
public class TinPrices extends javax.swing.JFrame {
    public static java.sql.Connection connectDB = null;
    java.lang.String userName = null;
    com.amimobenja.www.helpers.DBObject dbObject;
    java.lang.String price;

    /**
     * Creates new form TinPrices1
     * @param connDb
     * @param username
     */
    public TinPrices(java.sql.Connection connDb, java.lang.String username) {
        connectDB = connDb;
        userName = username;
        dbObject = new com.amimobenja.www.helpers.DBObject();
        
        initComponents();
        
        populateTextFields();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        previousPriceLbl = new javax.swing.JLabel();
        previousPriceTxt = new javax.swing.JTextField();
        newPriceLbl = new javax.swing.JLabel();
        newPriceTxt = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tin Price Set-up");
        setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Set Up the Prices of a Tin of Maize"));
        mainPanel.setToolTipText("");
        mainPanel.setLayout(new java.awt.GridBagLayout());

        previousPriceLbl.setText("Previous Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        mainPanel.add(previousPriceLbl, gridBagConstraints);

        previousPriceTxt.setEditable(false);
        previousPriceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousPriceTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        mainPanel.add(previousPriceTxt, gridBagConstraints);

        newPriceLbl.setText("New Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        mainPanel.add(newPriceLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        mainPanel.add(newPriceTxt, gridBagConstraints);

        btnPanel.setLayout(new java.awt.GridBagLayout());

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        btnPanel.add(saveBtn, gridBagConstraints);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        btnPanel.add(clearBtn, gridBagConstraints);

        cancelBtn.setText("Exit");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        btnPanel.add(cancelBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        mainPanel.add(btnPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mainPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousPriceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousPriceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousPriceTxtActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        newPriceTxt.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        java.util.Calendar cal = java.util.Calendar.getInstance();
        java.util.Date todayDate = cal.getTime();
        
        if (!(newPriceTxt.getText().equals("")) && (newPriceTxt.getText().matches("^[0-9]+(\\.[0-9]{1,4})?$"))) {
            System.out.print("About to insert the values.!!!");
            
            try {
                    connectDB.setAutoCommit(false);
                    
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO tin_prices_tbl(date, price, set_by) VALUES (?, ?, ?)");
                    
                        pstmt.setDate(1, com.amimobenja.www.helpers.SQLDateFormat.getSQLDate(todayDate));
                        pstmt.setDouble(2, Double.valueOf(newPriceTxt.getText()));
                        pstmt.setString(3, userName);
                        
                        pstmt.executeUpdate();
                        connectDB.commit();
                        connectDB.setAutoCommit(true);
                        
                        System.out.print("\nSuccess!!! Price Changed successfully");
                        JOptionPane.showMessageDialog(null, "The Tin Price has been changed successfully. New Price - "+newPriceTxt.getText(), 
                            "Success!!! Price Changed successfully", JOptionPane.INFORMATION_MESSAGE);
                    
                } catch (java.lang.Exception sq) {

                    try {
                        connectDB.rollback();
                    } catch (java.sql.SQLException sql) {
                        javax.swing.JOptionPane.showMessageDialog(this, sql.getMessage(), "Error Message!", javax.swing.JOptionPane.ERROR_MESSAGE);
                    }
                    System.out.println(sq.getMessage());
                    javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
        } else {
            newPriceLbl.setForeground(Color.red);
            
            if (newPriceTxt.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "The Text Field New Price is Empty.", "Empty Fields Noted! ", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "The Text Field New Price has some unrecognized Values - "+newPriceTxt.getText(), 
                        "Unrecognized Values Noted! ", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    
    public void populateTextFields() {
        try {
                connectDB.setAutoCommit(false);

                System.out.println("About to Get the Tin Price");

                java.sql.Statement stm = connectDB.createStatement();
                java.sql.ResultSet rse = stm.executeQuery("SELECT price FROM tin_prices_tbl");

                System.out.println("To Get the Tin Price");

                while (rse.next()) {
                    System.out.println("Getting the Tin Price");
                    price = dbObject.getDBObject(rse.getObject(1), "0");

                }
                previousPriceTxt.setText(price);
                
                System.out.println("The Tin Price should be set! - "+price);

                connectDB.commit();
                connectDB.setAutoCommit(true);
            } catch (final Exception es) {
                System.out.println(es);

            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel newPriceLbl;
    private javax.swing.JTextField newPriceTxt;
    private javax.swing.JLabel previousPriceLbl;
    private javax.swing.JTextField previousPriceTxt;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
