/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Oskar
 */
public class RegisterOrder extends javax.swing.JFrame {

    private InfDB idb;
    
    
    /**
     * Creates new form RegisterOrder
     * @param idb
     */
    public RegisterOrder(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillCustomerName();
    }

    /**
     * Creates new form RegisterOrder
     */
    public RegisterOrder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        cboAllCustomers = new javax.swing.JComboBox<>();
        lblChooseCustomer = new javax.swing.JLabel();
        lblHatSize = new javax.swing.JLabel();
        txtHatSize = new javax.swing.JTextField();
        lblHatColor = new javax.swing.JLabel();
        cboHatColor = new javax.swing.JComboBox<>();
        lblHatDescription = new javax.swing.JLabel();
        txtHatDescription = new javax.swing.JTextField();
        lblHatSketch = new javax.swing.JLabel();
        btnSearchHatSketch = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblEstimatedTime = new javax.swing.JLabel();
        txtEstimatedTime = new javax.swing.JTextField();
        lblEstimatedCost = new javax.swing.JLabel();
        txtEstimatedMaterialCost = new javax.swing.JTextField();
        btnEstimatedCost = new javax.swing.JButton();
        lblEstimatedPrice = new javax.swing.JLabel();
        cboOptionalDiscount = new javax.swing.JComboBox<>();
        txtChooseDiscount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboAllCustomers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAllCustomersActionPerformed(evt);
            }
        });

        lblChooseCustomer.setText("V�lj kund:");

        lblHatSize.setText("Storlek (cm)");

        txtHatSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHatSizeActionPerformed(evt);
            }
        });

        lblHatColor.setText("F�rg:");

        cboHatColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V�lj", "Bl�", "Brun", "Gr�", "Gr�n", "Gul", "Guld", "Lila", "Orange", "Rosa", "R�d", "Silver", "Svart", "Turkos", "Violett", "Vit" }));
        cboHatColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHatColorActionPerformed(evt);
            }
        });

        lblHatDescription.setText("Beskrivning:");

        btnSearchHatSketch.setText("Skiss..");
        btnSearchHatSketch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHatSketchActionPerformed(evt);
            }
        });

        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Registrera order");
        lblRubrik.setMaximumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setMinimumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setPreferredSize(new java.awt.Dimension(234, 44));
        lblRubrik.setSize(new java.awt.Dimension(20, 20));

        lblEstimatedTime.setText("Uppskattad arbetstid (h):");

        txtEstimatedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedTimeActionPerformed(evt);
            }
        });

        lblEstimatedCost.setText("Uppskattad materialkostnad (kr):");

        txtEstimatedMaterialCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedMaterialCostActionPerformed(evt);
            }
        });

        btnEstimatedCost.setText("Uppskattad kostnad:");
        btnEstimatedCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstimatedCostActionPerformed(evt);
            }
        });

        lblEstimatedPrice.setText("jLabel1");

        cboOptionalDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%" }));
        cboOptionalDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOptionalDiscountActionPerformed(evt);
            }
        });

        txtChooseDiscount.setText("V�lj rabatt:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEstimatedCost))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearchHatSketch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblHatDescription)
                                .addGap(66, 66, 66)
                                .addComponent(txtHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cboHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblChooseCustomer)
                                                .addComponent(lblHatSize))
                                            .addGap(70, 70, 70)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboAllCustomers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtHatSize))
                                            .addGap(5, 5, 5)))
                                    .addComponent(lblHatColor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtChooseDiscount))
                            .addComponent(lblEstimatedTime)
                            .addComponent(lblEstimatedCost)
                            .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(txtEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblEstimatedPrice)))
                .addGap(622, 622, 622))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseCustomer)
                    .addComponent(cboAllCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstimatedTime)
                    .addComponent(txtEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstimatedCost)
                    .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHatSize)
                            .addComponent(txtHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHatColor)
                            .addComponent(cboHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChooseDiscount)
                            .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstimatedCost)
                    .addComponent(lblEstimatedPrice))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatDescription)
                    .addComponent(txtHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchHatSketch)
                    .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAllCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAllCustomersActionPerformed

    private void txtHatSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHatSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHatSizeActionPerformed

    private void cboHatColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHatColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHatColorActionPerformed

    private void btnSearchHatSketchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHatSketchActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File file = chooser.getSelectedFile();
    String path = file.getAbsolutePath();
    
    Image im = Toolkit.getDefaultToolkit().createImage(path);
    im = im.getScaledInstance(lblHatSketch.getWidth(), lblHatSketch.getHeight(), lblHatSketch.getHorizontalAlignment());
    ImageIcon ii = new ImageIcon(im);
    lblHatSketch.setIcon(ii);
    }//GEN-LAST:event_btnSearchHatSketchActionPerformed

    private void txtEstimatedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedTimeActionPerformed

    private void txtEstimatedMaterialCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedMaterialCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedMaterialCostActionPerformed

    private void btnEstimatedCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstimatedCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstimatedCostActionPerformed

    private void cboOptionalDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOptionalDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboOptionalDiscountActionPerformed

    private void fillCustomerName() {
        String question = "SELECT Name FROM Customer";

        ArrayList<String> allCustomers;

        try {
           allCustomers = idb.fetchColumn(question);

            for (String name :allCustomers) {
                cboAllCustomers.addItem(name);
            }
        /*} catch (InfException e) {
            JOptionPane.showMessageDialog(null, "N�got gick fel med uppkopplingen till databasen");
            System.out.println(e.getMessage());
        }*/
        }   catch (InfException ex) {
            Logger.getLogger(RegisterOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstimatedCost;
    private javax.swing.JButton btnSearchHatSketch;
    private javax.swing.JComboBox<String> cboAllCustomers;
    private javax.swing.JComboBox<String> cboHatColor;
    private javax.swing.JComboBox<String> cboOptionalDiscount;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblEstimatedCost;
    private javax.swing.JLabel lblEstimatedPrice;
    private javax.swing.JLabel lblEstimatedTime;
    private javax.swing.JLabel lblHatColor;
    private javax.swing.JLabel lblHatDescription;
    private javax.swing.JLabel lblHatSize;
    private javax.swing.JLabel lblHatSketch;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel txtChooseDiscount;
    private javax.swing.JTextField txtEstimatedMaterialCost;
    private javax.swing.JTextField txtEstimatedTime;
    private javax.swing.JTextField txtHatDescription;
    private javax.swing.JTextField txtHatSize;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterOrder().setVisible(true);
            }
        });
    }
    
    private static class image {

        public image() {
        }
    }
}
