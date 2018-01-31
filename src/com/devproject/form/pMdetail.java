/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devproject.form;

import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JTextField;

/**
 *
 * @author LC01
 */
public class pMdetail extends javax.swing.JPanel {

    /**
     * Creates new form pMaster
     */
    Connection connection;
    
    public pMdetail() {
        initComponents();
    }

    public void setTxtpartnumber(String partnumber) {
        txtpartnumber.setText(partnumber);
    }

    public void setTxtlandedcost(String landedcost) {
        txtlandedcost.setText(landedcost);
    }

    public void setTxtlocation(String location) {
        txtlocation.setText(location);
    }

    public void setTxtoh(String oh) {
        txtoh.setText(oh);
    }

    public void setTxtpartname(String partname) {
        txtpartname.setText(partname);
    }

    public void setTxtpricelist(String pricelist) {
        txtpricelist.setText(pricelist);
    }

    public void setTxtzone(String zone) {
        txtzone.setText(zone);
    }
    
     public void addActionListenerMdetailback (ActionListener l) {
        btncancel.addActionListener(l);
    }

    public JTextField getTxtlandedcost() {
        return txtlandedcost;
    }

    public JTextField getTxtlocation() {
        return txtlocation;
    }

    public JTextField getTxtoh() {
        return txtoh;
    }

    public JTextField getTxtpartname() {
        return txtzone;
    }

    public JTextField getTxtpartnumber() {
        return txtpartnumber;
    }

    public JTextField getTxtpricelist() {
        return txtpricelist;
    }
    
    public JTextField getTxtzone() {
        return txtzone;
    }
    
    public void addActionListenerMdetailupdate (ActionListener l) {
         btnupdate.addActionListener(l);
    }
    
    public void addActionListenerMdetaildelete (ActionListener l) {
         btndelete.addActionListener(l);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpricelist = new javax.swing.JTextField();
        txtpartnumber = new javax.swing.JTextField();
        txtzone = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtoh = new javax.swing.JTextField();
        txtlandedcost = new javax.swing.JTextField();
        btncancel = new com.devproject.component.Tombol_Master();
        btnupdate = new com.devproject.component.Tombol_Master();
        btndelete = new com.devproject.component.Tombol_Master();
        jLabel8 = new javax.swing.JLabel();
        txtpartname = new javax.swing.JTextField();
        panelTransparan2 = new com.devproject.component.PanelTransparan();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        panelBackground1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Price List");
        panelTransparan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Part Number");
        panelTransparan1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Part Name");
        panelTransparan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Zone");
        panelTransparan1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("On Hand");
        panelTransparan1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Landed Cost");
        panelTransparan1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtpricelist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtpricelist, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 1210, 30));

        txtpartnumber.setEditable(false);
        txtpartnumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtpartnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 1210, 30));

        txtzone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtzone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 1210, 30));

        txtlocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 1210, 30));

        txtoh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtohActionPerformed(evt);
            }
        });
        panelTransparan1.add(txtoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 1210, 30));

        txtlandedcost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtlandedcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 1210, 30));

        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 390, 90, 30));

        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 90, 30));

        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 90, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Location");
        panelTransparan1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        txtpartname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        panelTransparan1.add(txtpartname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 1210, 30));

        panelBackground1.add(panelTransparan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1340, 610));

        panelTransparan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Update Detail Part");
        panelTransparan2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 130, 20));

        panelBackground1.add(panelTransparan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 40));

        add(panelBackground1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtohActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtohActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.devproject.component.Tombol_Master btncancel;
    private com.devproject.component.Tombol_Master btndelete;
    private com.devproject.component.Tombol_Master btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.devproject.component.PanelBackground panelBackground1;
    private com.devproject.component.PanelTransparan panelTransparan1;
    private com.devproject.component.PanelTransparan panelTransparan2;
    private javax.swing.JTextField txtlandedcost;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtoh;
    private javax.swing.JTextField txtpartname;
    private javax.swing.JTextField txtpartnumber;
    private javax.swing.JTextField txtpricelist;
    private javax.swing.JTextField txtzone;
    // End of variables declaration//GEN-END:variables

   
}
