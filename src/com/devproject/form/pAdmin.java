/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devproject.form;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LC01
 */
public class pAdmin extends javax.swing.JPanel {

    /**
     * Creates new form pMaster
     */
    Connection connection;
    
    public pAdmin() {
        initComponents();
       
    }

    public void addActionListenerAdminLogout (ActionListener l) {
        btnlogout.addActionListener(l);
    }
    
    public void addActionListenerAdminChangePass (ActionListener l) {
        btnpassword.addActionListener(l);
    }
    
    public void addActionListenerAdminRceiving (ActionListener l) {
        btnreceiving.addActionListener(l);
    }
    
    public void addActionListenerAdminIssuing (ActionListener l) {
        btnissuing.addActionListener(l);
    }
    
    public void addActionListenerAdminStock (ActionListener l) {
        btnstock.addActionListener(l);
    }

    public void addActionListenerAdminTruncate (ActionListener l) {
        btntruncate.addActionListener(l);
    }
       /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new com.devproject.component.PanelBackground();
        panelTransparan1 = new com.devproject.component.PanelTransparan();
        jLabel2 = new javax.swing.JLabel();
        btnissuing = new com.devproject.component.Tombol_Master();
        btnpassword = new com.devproject.component.Tombol_Master();
        btnlogout = new com.devproject.component.Tombol_Master();
        btnreceiving = new com.devproject.component.Tombol_Master();
        btnstock = new com.devproject.component.Tombol_Master();
        btntruncate = new com.devproject.component.Tombol_Master();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello, Admin");
        panelTransparan1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        btnissuing.setForeground(new java.awt.Color(255, 255, 255));
        btnissuing.setText("Issuing");
        btnissuing.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnissuing, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 150, 150));

        btnpassword.setForeground(new java.awt.Color(255, 255, 255));
        btnpassword.setText("Change Password ");
        btnpassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 150, 150));

        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("Logout");
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 150, 150));

        btnreceiving.setForeground(new java.awt.Color(255, 255, 255));
        btnreceiving.setText("Receiving");
        btnreceiving.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnreceiving, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 150, 150));

        btnstock.setForeground(new java.awt.Color(255, 255, 255));
        btnstock.setText("Stock");
        btnstock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, 150));

        btntruncate.setForeground(new java.awt.Color(255, 255, 255));
        btntruncate.setText("Truncate");
        btntruncate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btntruncate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 150, 150));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1330, 660));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.devproject.component.Tombol_Master btnissuing;
    private com.devproject.component.Tombol_Master btnlogout;
    private com.devproject.component.Tombol_Master btnpassword;
    private com.devproject.component.Tombol_Master btnreceiving;
    private com.devproject.component.Tombol_Master btnstock;
    private com.devproject.component.Tombol_Master btntruncate;
    private javax.swing.JLabel jLabel2;
    private com.devproject.component.PanelBackground panelBackground1;
    private com.devproject.component.PanelTransparan panelTransparan1;
    // End of variables declaration//GEN-END:variables
}
