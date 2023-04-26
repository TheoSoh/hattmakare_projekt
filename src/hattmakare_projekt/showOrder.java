/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.SQLException;



public class showOrder extends javax.swing.JFrame {

    private InfDB idb;
    private String selectedOrderID;
    private final int employeeIdet;
    
    
    /**
     * Creates new form showOrder
     * @param idb
     * @param selectedOrderID
     * @param employeeIdet
     */
    public showOrder(InfDB idb, String selectedOrderID, int employeeIdet) {
        initComponents();
        this.idb = idb;
        this.selectedOrderID = selectedOrderID;
        this.employeeIdet = employeeIdet;
        fillIDLabel();
        fillStatusLabel();
        fetchCustomer();
        fetchColor();
        fetchSize();
        fetchAmount();
        fetchDescription();
        fetchTotalPrice();
        fetchShippingDate();
        fetchOrderDate();
        fetchSketch();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrderIDHeadline = new javax.swing.JLabel();
        lblStatusHeadline = new javax.swing.JLabel();
        lblCustomerNameHeadline = new javax.swing.JLabel();
        lblOrderDateHeadline = new javax.swing.JLabel();
        lblDescriptionHeadline = new javax.swing.JLabel();
        lblColorHeadline = new javax.swing.JLabel();
        lblSizeHeadline = new javax.swing.JLabel();
        lblAmountHeadline = new javax.swing.JLabel();
        lblTotalPriceHeadline = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblHatColor = new javax.swing.JLabel();
        lblHatSize = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblHatDescription = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblShippmentDateHeadline = new javax.swing.JLabel();
        lblPictureHeadline = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblShippingDate = new javax.swing.JLabel();
        btnBackToSearch = new javax.swing.JButton();
        cmbChangeStatus = new javax.swing.JComboBox<>();
        lblCurrentStatus = new javax.swing.JLabel();
        lblChangeStatusHL = new javax.swing.JLabel();
        lblHatSketch = new javax.swing.JLabel();
        btnInvoice = new javax.swing.JButton();
        btnFraktsedel = new javax.swing.JButton();
        btnTullsedel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrderIDHeadline.setText("Ordernummer:");

        lblStatusHeadline.setText("Status:");

        lblCustomerNameHeadline.setText("Kundnamn:");

        lblOrderDateHeadline.setText("Best�llningsdatum:");

        lblDescriptionHeadline.setText("Hattbeskrivning:");

        lblColorHeadline.setText("F�rg:");

        lblSizeHeadline.setText("Storlek:");

        lblAmountHeadline.setText("Antal:");

        lblTotalPriceHeadline.setText("Totalpris:");

        lblHatDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblShippmentDateHeadline.setText("Leveransdatum:");

        lblPictureHeadline.setText("Bild:");

        btnBackToSearch.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnBackToSearch.setText("Tillbaka");
        btnBackToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSearchActionPerformed(evt);
            }
        });

        cmbChangeStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F�rfr�gan", "Best�llning", "Skickad" }));
        cmbChangeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChangeStatusActionPerformed(evt);
            }
        });

        lblChangeStatusHL.setText("�ndra status");

        btnInvoice.setText("Skapa Faktura");
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        btnFraktsedel.setText("Skapa Fraktsedel");
        btnFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFraktsedelActionPerformed(evt);
            }
        });

        btnTullsedel.setText("Skapa Tullsedel");
        btnTullsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTullsedelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderDateHeadline)
                    .addComponent(lblShippmentDateHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblShippingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(lblTotalPriceHeadline)
                        .addGap(31, 31, 31)))
                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblColorHeadline)
                                .addGap(30, 30, 30)
                                .addComponent(lblHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBackToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSizeHeadline)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblAmountHeadline)
                                    .addGap(34, 34, 34)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addComponent(lblOrderIDHeadline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblDescriptionHeadline)
                                .addGap(18, 18, 18)
                                .addComponent(lblHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblCustomerNameHeadline)
                                .addGap(27, 27, 27)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatusHeadline)
                        .addGap(18, 18, 18)
                        .addComponent(lblCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPictureHeadline)
                                .addGap(18, 18, 18)
                                .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFraktsedel)
                                    .addComponent(btnInvoice)
                                    .addComponent(cmbChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTullsedel))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblChangeStatusHL)
                                .addGap(94, 94, 94))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblOrderIDHeadline)
                                        .addComponent(btnBackToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblStatusHeadline)
                                    .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCustomerNameHeadline)
                                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblCurrentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColorHeadline, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblChangeStatusHL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbChangeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnInvoice)
                .addGap(18, 18, 18)
                .addComponent(btnFraktsedel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTullsedel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSizeHeadline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmountHeadline))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescriptionHeadline)
                                    .addComponent(lblHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lblPictureHeadline))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderDateHeadline)
                    .addComponent(lblOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTotalPriceHeadline)
                        .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblShippmentDateHeadline))
                    .addComponent(lblShippingDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnBackToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSearchActionPerformed
        
        new searchOrder(idb, employeeIdet).setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnBackToSearchActionPerformed

    private void cmbChangeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChangeStatusActionPerformed
        // TODO add your handling code here:
      
        if(cmbChangeStatus.getSelectedItem().toString().equals("F�rfr�gan")){
            try {
                idb.update("UPDATE `Order` SET Order_complete_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                idb.update("UPDATE `Order` SET Payment_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                idb.update("UPDATE `Order` SET Invoice_sent_status = TRUE WHERE OrderID = '" + lblOrderID.getText() + "';");
                
            } catch (InfException ex) {
                Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        } else {
            
            if(cmbChangeStatus.getSelectedItem().toString().equals("Best�llning")){
                try {
                    idb.update("UPDATE `Order` SET Payment_status = TRUE WHERE OrderID = '" + lblOrderID.getText() + "';");
                    idb.update("UPDATE `Order` SET Invoice_sent_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                    idb.update("UPDATE `Order` SET Order_complete_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                } catch (InfException ex) {
                    Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                if(cmbChangeStatus.getSelectedItem().toString().equals("Skickad")){
                    try {
                        idb.update("UPDATE `Order` SET Invoice_sent_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                        idb.update("UPDATE `Order` SET Payment_status = FALSE WHERE OrderID = '" + lblOrderID.getText() + "';");
                        idb.update("UPDATE `Order` SET Order_complete_status = TRUE WHERE OrderID = '" + lblOrderID.getText() + "';");
                    
                    } catch (InfException ex) {
                        
                        Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } 
        fillStatusLabel();
    }//GEN-LAST:event_cmbChangeStatusActionPerformed

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        // TODO add your handling code here:
        try {
               
               String query = "Update `Order` SET Shipment_date = curdate() Where OrderID = '" + selectedOrderID + "'";
               
               idb.update(query);
               new CreateInvoice(idb, selectedOrderID, employeeIdet).setVisible(true);
               
           } catch (InfException ex) {
               Logger.getLogger(searchInvoice.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFraktsedelActionPerformed
        // TODO add your handling code here:
        try {
               
               String query = "Update `Order` SET Shipment_date = curdate() Where OrderID = '" + selectedOrderID + "'";
               
               idb.update(query);
               new openFraktsedel(idb, selectedOrderID).setVisible(true);
               
           } catch (InfException ex) {
               Logger.getLogger(searchInvoice.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_btnFraktsedelActionPerformed

    private void btnTullsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTullsedelActionPerformed
        // TODO add your handling code here:
        try {
               
               String query = "Update `Order` SET Shipment_date = curdate() Where OrderID = '" + selectedOrderID + "'";
               
               idb.update(query);
               new openTullsedel(idb, selectedOrderID).setVisible(true);
               
           } catch (InfException ex) {
               Logger.getLogger(searchInvoice.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_btnTullsedelActionPerformed

    private void fillIDLabel(){
        lblOrderID.setText(selectedOrderID);
    }

    private void fillStatusLabel(){
     
        String bestallningsQuery = "SELECT OrderID from `Order` where Payment_status = '1' and OrderID = '" + lblOrderID.getText() + "'";
        String forfragansQuery = "SELECT OrderID from `Order` where Invoice_sent_status = '1' and OrderID = '" + lblOrderID.getText() + "'";
        String skickadQuery = "SELECT OrderID from `Order` where Order_complete_status = '1' and OrderID = '" + lblOrderID.getText() + "'";
        try{
            
        
        String bestallningsResult = idb.fetchSingle(bestallningsQuery);
        String forfragansResult = idb.fetchSingle(forfragansQuery);
        String skickadsResult = idb.fetchSingle(skickadQuery);
        
        if(forfragansResult == null && skickadsResult == null){
            lblCurrentStatus.setText("Best�llning");
            
        } else{
            if(bestallningsResult == null && skickadsResult == null){
                lblCurrentStatus.setText("F�rfr�gan");
                
            } else{
                if(bestallningsResult == null && forfragansResult == null){
                    lblCurrentStatus.setText("Skickad");
                }
                
            }
        }
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    private void fetchCustomer(){
        try{
            String query = "Select Name from Customer JOIN `Order` O on Customer.CustomerID = O.Customer where OrderID = '" + lblOrderID.getText() + "'";
            String result = idb.fetchSingle(query);
            lblCustomerName.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void fetchSketch() {
      try {
    String query = "SELECT image FROM Hat JOIN Hat_in_order Hio ON Hat.HatID = Hio.HatID JOIN `Order` O ON O.OrderID = Hio.OrderID WHERE O.OrderID = '" + lblOrderID.getText() + "'";
    String result = idb.fetchSingle(query);

    // Convert string to image
    File file = new File(result);
    Image image = ImageIO.read(file);
    ImageIcon icon = new ImageIcon(image);

    Image im = Toolkit.getDefaultToolkit().createImage(result);
    im = im.getScaledInstance(lblHatSketch.getWidth(), lblHatSketch.getHeight(), lblHatSketch.getHorizontalAlignment());
    ImageIcon ii = new ImageIcon(im);
    lblHatSketch.setIcon(ii);
     } catch (Exception ex) {
    // Handle exception
             Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
    }

}
    
    private void fetchColor() {
        try{
           
        String query = "Select Color from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
        String result = idb.fetchSingle(query);
        lblHatColor.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchSize(){
        try{
            String query = "Select Size from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblHatSize.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchAmount(){
        try{
            String query = "Select Amount from `Order`where OrderID = '" + lblOrderID.getText() + "'";
            String result = idb.fetchSingle(query);
            lblAmount.setText(result);
            
        } catch(InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void fetchDescription(){
        try{
            String query = "Select Description from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblHatDescription.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchTotalPrice(){
        try{
            String query = "Select Total_Price from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblTotalPrice.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchOrderDate(){
        try{
            String query = "Select Order_date from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblOrderDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchShippingDate(){
        try{
            String query = "Select Shipment_date from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblShippingDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToSearch;
    private javax.swing.JButton btnFraktsedel;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnTullsedel;
    private javax.swing.JComboBox<String> cmbChangeStatus;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountHeadline;
    private javax.swing.JLabel lblChangeStatusHL;
    private javax.swing.JLabel lblColorHeadline;
    private javax.swing.JLabel lblCurrentStatus;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerNameHeadline;
    private javax.swing.JLabel lblDescriptionHeadline;
    private javax.swing.JLabel lblHatColor;
    private javax.swing.JLabel lblHatDescription;
    private javax.swing.JLabel lblHatSize;
    private javax.swing.JLabel lblHatSketch;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderDateHeadline;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblOrderIDHeadline;
    private javax.swing.JLabel lblPictureHeadline;
    private javax.swing.JLabel lblShippingDate;
    private javax.swing.JLabel lblShippmentDateHeadline;
    private javax.swing.JLabel lblSizeHeadline;
    private javax.swing.JLabel lblStatusHeadline;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPriceHeadline;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
