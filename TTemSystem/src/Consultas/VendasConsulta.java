/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import Cadastros.VendasCadastro;
import javax.swing.JDesktopPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author CEDUP14
 */
public class VendasConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vendas
     */
    JDesktopPane areadetrabalho;
    public VendasConsulta(JDesktopPane area) {
        initComponents();
        areadetrabalho=area;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BVender = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();

        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Venda", "Cliente", "Valor", "Vendedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 178, 764, 251);

        jToggleButton1.setText("Consultar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(632, 99, 119, 44);

        jPanel3.setMaximumSize(new java.awt.Dimension(387, 149));
        jPanel3.setMinimumSize(new java.awt.Dimension(387, 149));
        jPanel3.setPreferredSize(new java.awt.Dimension(387, 149));
        jPanel3.setLayout(null);
        jPanel3.add(jTextField8);
        jTextField8.setBounds(70, 20, 115, 20);

        jLabel7.setText("De:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(42, 22, 30, 20);

        jLabel8.setText("Até:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(196, 22, 40, 20);
        jPanel3.add(jTextField9);
        jTextField9.setBounds(230, 20, 115, 20);

        jLabel9.setText("Vendedor:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 60, 50, 14);
        jPanel3.add(jTextField10);
        jTextField10.setBounds(64, 57, 55, 20);
        jPanel3.add(jTextField11);
        jTextField11.setBounds(129, 57, 234, 20);

        jLabel10.setText("Venda:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(13, 88, 34, 14);
        jPanel3.add(jTextField12);
        jTextField12.setBounds(65, 85, 147, 20);

        jLabel11.setText("Cliente:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 117, 37, 14);
        jPanel3.add(jTextField13);
        jTextField13.setBounds(65, 111, 55, 20);
        jPanel3.add(jTextField14);
        jTextField14.setBounds(126, 111, 233, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(18, 11, 387, 149);

        BVender.setText("Vender");
        BVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVenderActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, Short.MAX_VALUE)
                .addComponent(BVender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BVender, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 480, 764, 71);

        jPanel2.setLayout(null);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Canceladas");
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(6, 55, 100, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Pendentes");
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(6, 78, 100, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Emitidas");
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(6, 32, 90, 23);

        jLabel5.setText("Situação");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(14, 11, 70, 14);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Orçamento");
        jPanel2.add(jRadioButton4);
        jRadioButton4.setBounds(6, 101, 100, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(400, 20, 130, 131);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVenderActionPerformed
        VendasCadastro vender = new VendasCadastro();
            areadetrabalho.add(vender);
            vender.setVisible(true);
            vender.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
            BasicInternalFrameUI bi =(BasicInternalFrameUI)vender.getUI();
            bi.setNorthPane(null);
            this.dispose();
    }//GEN-LAST:event_BVenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
