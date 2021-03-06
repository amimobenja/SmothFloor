/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class UserSetUp extends javax.swing.JFrame {
    public static java.sql.Connection connectDB = null;
    java.lang.String userName = null;
    com.amimobenja.www.helpers.DBObject dbObject;

    /**
     * Creates new form UserSetUp
     * @param connDb
     * @param username
     */
    public UserSetUp(java.sql.Connection connDb, java.lang.String username) {
        connectDB = connDb;
        userName = username;
        dbObject = new com.amimobenja.www.helpers.DBObject();
        
        initComponents();
        
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

        userSetUpPanel = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        otherNameTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        firstNameLbl = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        otherNameLbl = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        userNameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confPasswordLbl = new javax.swing.JLabel();
        passwordFieldTxt = new javax.swing.JPasswordField();
        confPasswordFieldTxt = new javax.swing.JPasswordField();
        accessLevelCmBx = new javax.swing.JComboBox();
        accessLevelLbl = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Set Up.");
        setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        userSetUpPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter user Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        userSetUpPanel.setLayout(new java.awt.GridBagLayout());

        idLbl.setText("National ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(idLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(otherNameTxt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(firstNameTxt, gridBagConstraints);

        firstNameLbl.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(firstNameLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(idTxt, gridBagConstraints);

        otherNameLbl.setText("Other Names");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(otherNameLbl, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(userNameTxt, gridBagConstraints);

        userNameLbl.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(userNameLbl, gridBagConstraints);

        passwordLbl.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(passwordLbl, gridBagConstraints);

        confPasswordLbl.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(confPasswordLbl, gridBagConstraints);

        passwordFieldTxt.setText("123456");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(passwordFieldTxt, gridBagConstraints);

        confPasswordFieldTxt.setText("789101");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(confPasswordFieldTxt, gridBagConstraints);

        accessLevelCmBx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        accessLevelCmBx.setSelectedIndex(1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(accessLevelCmBx, gridBagConstraints);

        accessLevelLbl.setText("Access Level");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        userSetUpPanel.add(accessLevelLbl, gridBagConstraints);

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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        btnPanel.add(saveBtn, gridBagConstraints);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        btnPanel.add(clearBtn, gridBagConstraints);

        closeBtn.setText("Exit");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        btnPanel.add(closeBtn, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        userSetUpPanel.add(btnPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(userSetUpPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        System.out.println("Save Button Clicked!!!");
        
        boolean admin;
        
        idLbl.setForeground(Color.BLACK);
        firstNameLbl.setForeground(Color.BLACK);
        otherNameLbl.setForeground(Color.BLACK);
        userNameLbl.setForeground(Color.BLACK);
        passwordLbl.setForeground(Color.BLACK);
        confPasswordLbl.setForeground(Color.BLACK); 
        
        char passsWord[] = this.passwordFieldTxt.getPassword();
        
        java.lang.String passWord = java.lang.String.copyValueOf(passsWord);
        
        char passsWordTwo[] = this.confPasswordFieldTxt.getPassword();
        
        java.lang.String passWordTwo = java.lang.String.copyValueOf(passsWordTwo);
        
        if (idTxt.getText().equals("") || firstNameTxt.getText().equals("")
                 || otherNameTxt.getText().equals("") || userNameTxt.getText().equals("") || !passWord.equals(passWordTwo)) {
                        
            if (idTxt.getText().equals("")) {
                idLbl.setForeground(Color.red);
            }  else if (firstNameTxt.getText().equals("")) {
                firstNameLbl.setForeground(Color.red);
            }  else if (otherNameTxt.getText().equals("")) {
                otherNameLbl.setForeground(Color.red);
            }  else if (userNameTxt.getText().equals("")) {
                userNameLbl.setForeground(Color.red);
            }  else if (!passWord.equals(passWordTwo)) {
                passwordLbl.setForeground(Color.RED);
                confPasswordLbl.setForeground(Color.RED);
                JOptionPane.showMessageDialog(null, "Password Do Not Match!!! ",
                    "Password Error!", JOptionPane.INFORMATION_MESSAGE);
            }  else {
                System.out.print("Sorry man Unknown Error!!!");
                JOptionPane.showMessageDialog(null, "Contact the Administrator -- Possibly missing entries. Unknown Error!!!. ", 
                    "Unknown Error!!!", JOptionPane.ERROR_MESSAGE);
            }
        
        } else {
            System.out.print("About to insert the values.!!!");  
            
            if (accessLevelCmBx.getSelectedIndex() == 0) {
                admin = true;            
            } else {
                admin = false;            
            }
            
            try {
                    connectDB.setAutoCommit(false);
                    
                    java.sql.PreparedStatement pstmt = connectDB.prepareStatement("INSERT INTO secure_access_tbl(id, first_name, "
                            + "other_names, username, password, created_by, admin) VALUES (?, ?, ?, ?, ?, ?, ?);");
                    
                        pstmt.setString(1, idTxt.getText().trim());
                        pstmt.setString(2, firstNameTxt.getText().trim());
                        pstmt.setString(3, otherNameTxt.getText().trim());
                        pstmt.setString(4, userNameTxt.getText().trim());
                        pstmt.setString(5, passWordTwo);
                        pstmt.setString(6, userName);
                        pstmt.setBoolean(7, admin);

                        pstmt.executeUpdate();
                        connectDB.commit();
                        connectDB.setAutoCommit(true);
                        
                        clear();
                        
                        System.out.print("\nSuccess!!! Data saved successfully");
                        JOptionPane.showMessageDialog(null, "User has been created successfully. ", 
                            "Success!!! User created successfully", JOptionPane.INFORMATION_MESSAGE);
                        
                    
                } catch (java.lang.Exception sq) {

                    try {
                        connectDB.rollback();
                    } catch (java.sql.SQLException sql) {
                        javax.swing.JOptionPane.showMessageDialog(this, sql.getMessage(), "Error Message!", javax.swing.JOptionPane.ERROR_MESSAGE);
                    }
                    System.out.println(sq.getMessage());
                    javax.swing.JOptionPane.showMessageDialog(this, sq.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void clear() {
        idTxt.setText("");
        firstNameTxt.setText("");
        otherNameTxt.setText("");
        userNameTxt.setText("");
        passwordFieldTxt.setText("123456");
        confPasswordFieldTxt.setText("789101");
        accessLevelCmBx.setSelectedItem("User");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accessLevelCmBx;
    private javax.swing.JLabel accessLevelLbl;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JPasswordField confPasswordFieldTxt;
    private javax.swing.JLabel confPasswordLbl;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel otherNameLbl;
    private javax.swing.JTextField otherNameTxt;
    private javax.swing.JPasswordField passwordFieldTxt;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JPanel userSetUpPanel;
    // End of variables declaration//GEN-END:variables

    
}
