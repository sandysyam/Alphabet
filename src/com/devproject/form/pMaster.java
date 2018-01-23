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
public class pMaster extends javax.swing.JPanel {

    /**
     * Creates new form pMaster
     */
    Connection connection;
    
    public pMaster() {
        initComponents();
       
    }
    
    public void addActionListenerMasterImport (ActionListener l) {
        btnimport.addActionListener(l);
    }
    
    public void addActionListenerMasterback (ActionListener l) {
        btnback.addActionListener(l);
    }
    
    public void addActionListenerMasterTabel (MouseListener l) {
         tabelMaster.addMouseListener(l);
    }
     
    public void addActionListenerMastersearch (ActionListener l) {
         btnsearch.addActionListener(l);
    }
    
    public void addKeyListenerMasterSearch (KeyListener l) {
        txtsearch.addKeyListener(l);
    }
    
    public void addActionListenerMasterrefresh (ActionListener l) {
         btnrefresh.addActionListener(l);
    }
    
    public void addActionListenerMasternew (ActionListener l) {
         btnnew.addActionListener(l);
    }
    
    public JTable getTabelMaster() {
        return tabelMaster;
    }

    public JTextField getTxtsearch() {
        return txtsearch;
    }

    public void setTxtsearch(String search) {
        txtsearch.setText(search);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMaster = new javax.swing.JTable();
        panelTransparan1 = new com.devproject.component.PanelTransparan();
        btnrefresh = new com.devproject.component.Tombol_Master();
        txtsearch = new javax.swing.JTextField();
        btnback = new com.devproject.component.Tombol_Master();
        btnsearch = new com.devproject.component.Tombol_Master();
        btnnew = new com.devproject.component.Tombol_Master();
        btnimport = new com.devproject.component.Tombol_Master();
        btnexport = new com.devproject.component.Tombol_Master();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelMaster.setAutoCreateRowSorter(true);
        tabelMaster.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelMaster.setGridColor(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(tabelMaster);

        panelBackground1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1340, 620));

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("Refresh");
        btnrefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 100, 30));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        panelTransparan1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 250, 30));

        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("Back");
        btnback.setToolTipText("");
        btnback.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.setToolTipText("");
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        panelTransparan1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 100, 30));

        btnnew.setForeground(new java.awt.Color(255, 255, 255));
        btnnew.setText("New Part");
        btnnew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 100, 30));

        btnimport.setForeground(new java.awt.Color(255, 255, 255));
        btnimport.setText("Import");
        btnimport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnimport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 100, 30));

        btnexport.setForeground(new java.awt.Color(255, 255, 255));
        btnexport.setText("Export");
        btnexport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnexport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 100, 30));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1340, 50));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.devproject.component.Tombol_Master btnback;
    private com.devproject.component.Tombol_Master btnexport;
    private com.devproject.component.Tombol_Master btnimport;
    private com.devproject.component.Tombol_Master btnnew;
    private com.devproject.component.Tombol_Master btnrefresh;
    private com.devproject.component.Tombol_Master btnsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private com.devproject.component.PanelBackground panelBackground1;
    private com.devproject.component.PanelTransparan panelTransparan1;
    private javax.swing.JTable tabelMaster;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
