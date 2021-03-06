/*
 * DatePanel.java
 *
 * Created on 23rd November 2014, 05:56 PM
 */
package com.amimobenja.www;

/**
 *
 * @author  afro
 */
public class DisplayReport extends javax.swing.JDialog {

    int reportName;
    java.sql.Connection connectDB = null;
    java.util.Vector dateStartEnd = null;
    javax.swing.JSpinner beginDateSpinner = null;
    javax.swing.JSpinner endDateSpinner = null;
    
    java.lang.String userName = null;
    
   
    
    public DisplayReport(java.sql.Connection connectDb, java.lang.String username) {

        connectDB = connectDb;
        userName = username;

        initComponents();
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        specifyGroupRadioBtn = new javax.swing.ButtonGroup();
        softMainDesktopPane = new kiwi.ui.KDesktopPane();

        setTitle("Smooth Floor General Report - Select Begin & End Date");
        setBounds(new java.awt.Rectangle(0, 0, 650, 800));
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 50.0;
        getContentPane().add(softMainDesktopPane, gridBagConstraints);

        setSize(new java.awt.Dimension(656, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    
    
    
    

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane softMainDesktopPane;
    private javax.swing.ButtonGroup specifyGroupRadioBtn;
    // End of variables declaration//GEN-END:variables
}
