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
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LC01
 */
public class pSupplier extends javax.swing.JPanel {

    /**
     * Creates new form pMaster
     */
    Connection connection;
    
    public pSupplier() {
        initComponents();
       
    }

    public void addActionListenerSupplierback (ActionListener l) {
        btnback.addActionListener(l);
    }
    
    public void addActionListenerSuppliersave (ActionListener l) {
        btnsave.addActionListener(l);
    }
    
    public void addActionListenerSupplierupdate (ActionListener l) {
        btnupdate.addActionListener(l);
    }
    
    public void addActionListenerSupplierdelete (ActionListener l) {
        btndelete.addActionListener(l);
    }
    
    public void addActionListenerSupplierrefresh (ActionListener l) {
        btnrefresh.addActionListener(l);
    }
    
    public void addActionListenerSuppliersearch (ActionListener l) {
        btnsearch.addActionListener(l);
    }
    
    public void addActionListenerSuppliertabel (MouseListener l) {
         tabelsupplier.addMouseListener(l);
    }
    
    public void addActionListenerSupplierclear (ActionListener l) {
        btnclear.addActionListener(l);
    }
    
    public void addKeyListenerSupplierSearch (KeyListener l) {
        txtsearch.addKeyListener(l);
    }

    public JTable getTabelsupplier() {
        return tabelsupplier;
    }

    public JTextField getTxtaddress() {
        return txtaddress;
    }

    public JTextField getTxtcontact1() {
        return txtcontact1;
    }

    public JTextField getTxtcontact2() {
        return txtcontact2;
    }

    public JTextField getTxtcontact3() {
        return txtcontact3;
    }

    public JTextField getTxtsuppliername() {
        return txtsuppliername;
    }

    public JTextField getTxtsearch() {
        return txtsearch;
    }

    public JTextField getTxtno() {
        return txtno;
    }

    public void setTxtno(String no) {
        txtno.setText(no);
    }

    public void setTxtsearch(String search) {
        txtsearch.setText(search);
    }

    public void setTxtaddress(String address) {
        txtaddress.setText(address);
    }

    public void setTxtcontact1(String contact1) {
        txtcontact1.setText(contact1);
    }

    public void setTxtcontact2(String contact2) {
        txtcontact2.setText(contact2);
    }

    public void setTxtcontact3(String contact3) {
        txtcontact3.setText(contact3);
    }

    public void setTxtsuppliername(String suppliername) {
        txtsuppliername.setText(suppliername);
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
        btnback = new com.devproject.component.Tombol_Master();
        panelTransparan1 = new com.devproject.component.PanelTransparan();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcontact3 = new javax.swing.JTextField();
        txtsuppliername = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtcontact1 = new javax.swing.JTextField();
        txtcontact2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnrefresh = new com.devproject.component.Tombol_Master();
        btnsave = new com.devproject.component.Tombol_Master();
        btnupdate = new com.devproject.component.Tombol_Master();
        btndelete = new com.devproject.component.Tombol_Master();
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new com.devproject.component.Tombol_Master();
        btnclear = new com.devproject.component.Tombol_Master();
        txtno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsupplier = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelBackground1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Supplier No");
        panelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        panelTransparan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtcontact3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtcontact3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 1190, 30));

        txtsuppliername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtsuppliername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 1190, 30));

        txtaddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 1190, 30));

        txtcontact1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtcontact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1190, 30));

        txtcontact2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtcontact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 1190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact 1");
        panelTransparan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact 2");
        panelTransparan1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Refresh");
        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 260, 80, 30));

        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 80, 30));

        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 260, 80, 30));

        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 260, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact 3");
        panelTransparan1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 650, 30));

        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 80, 30));

        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 80, 30));

        txtno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 1190, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Supplier Name");
        panelTransparan1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1330, 310));

        tabelsupplier.setAutoCreateRowSorter(true);
        tabelsupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelsupplier);

        panelBackground1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1330, 310));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.devproject.component.Tombol_Master btnback;
    private com.devproject.component.Tombol_Master btnclear;
    private com.devproject.component.Tombol_Master btndelete;
    private com.devproject.component.Tombol_Master btnrefresh;
    private com.devproject.component.Tombol_Master btnsave;
    private com.devproject.component.Tombol_Master btnsearch;
    private com.devproject.component.Tombol_Master btnupdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private com.devproject.component.PanelBackground panelBackground1;
    private com.devproject.component.PanelTransparan panelTransparan1;
    private javax.swing.JTable tabelsupplier;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact1;
    private javax.swing.JTextField txtcontact2;
    private javax.swing.JTextField txtcontact3;
    private javax.swing.JTextField txtno;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsuppliername;
    // End of variables declaration//GEN-END:variables
}
