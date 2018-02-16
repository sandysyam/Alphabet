/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devproject.form;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LC01
 */
public class pShowReport extends javax.swing.JPanel {

    /**
     * Creates new form pMaster
     */
    Connection connection;
    
    public pShowReport() {
        initComponents();
       
    }

    public void addActionListenerRback (ActionListener l) {
        btnback.addActionListener(l);
    }

    public void addActionListenerRClear(ActionListener l) {
        btnclear.addActionListener(l);
    }
    
    public void addActionListenerRsearch (ActionListener l) {
        btnsearch.addActionListener(l);
    }

    public void addActionListenerRexport (ActionListener l) {
        btnexport.addActionListener(l);
    }
    
    public JTable getTabelreport() {
        return tabelreport;
    }

    public JDateChooser getTxtend() {
        return this.txtend;
    }

    public void setTxtend(Date end) {
        txtend.setDate(end);
    }

    public JDateChooser getTxtstart() {
        return this.txtstart;
    }

    public void setTxtstart(Date start) {
        txtstart.setDate(start);
    }

    public JTextField getTxttotal() {
        return txttotal;
    }

    public void setTxttotal(String total) {
        txttotal.setText(total);
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
        btnsave = new com.devproject.component.Tombol_Master();
        btnupdate = new com.devproject.component.Tombol_Master();
        btndelete = new com.devproject.component.Tombol_Master();
        btnback = new com.devproject.component.Tombol_Master();
        btnexport = new com.devproject.component.Tombol_Master();
        btnclear = new com.devproject.component.Tombol_Master();
        btnsearch = new com.devproject.component.Tombol_Master();
        txtend = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtstart = new com.toedter.calendar.JDateChooser();
        btnprint = new com.devproject.component.Tombol_Master();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelreport = new javax.swing.JTable();
        txttotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnexport.setForeground(new java.awt.Color(255, 255, 255));
        btnexport.setText("Export");
        btnexport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnexport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 80, 30));

        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 80, 30));

        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 80, 30));

        txtend.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtend, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 170, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO");
        panelTransparan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        txtstart.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, 30));

        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setText("Print");
        btnprint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FROM");
        panelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1340, 50));

        tabelreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelreport);

        panelBackground1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1340, 550));

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txttotal.setEnabled(false);
        panelBackground1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 400, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL SALES");
        panelBackground1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 640, -1, -1));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.devproject.component.Tombol_Master btnback;
    private com.devproject.component.Tombol_Master btnclear;
    private com.devproject.component.Tombol_Master btndelete;
    private com.devproject.component.Tombol_Master btnexport;
    private com.devproject.component.Tombol_Master btnprint;
    private com.devproject.component.Tombol_Master btnsave;
    private com.devproject.component.Tombol_Master btnsearch;
    private com.devproject.component.Tombol_Master btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.devproject.component.PanelBackground panelBackground1;
    private com.devproject.component.PanelTransparan panelTransparan1;
    private javax.swing.JTable tabelreport;
    private com.toedter.calendar.JDateChooser txtend;
    private com.toedter.calendar.JDateChooser txtstart;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
