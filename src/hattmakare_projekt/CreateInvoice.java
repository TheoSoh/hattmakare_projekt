/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author tommy
 */
public class CreateInvoice extends javax.swing.JFrame {

    private InfDB idb;
    private String selectedOrderID;
    private final int employeeIdet;
    /**
     * Creates new form CreateInvoice
     * @param idb
     * @param selectedOrderID
     * @param employeeIdet
     */
    public CreateInvoice(InfDB idb, String selectedOrderID, int employeeIdet) {
        initComponents();
        this.idb = idb;
        this.selectedOrderID = selectedOrderID;
        this.employeeIdet = employeeIdet;
        fillEmployee();
        fillIDLabel();
        fetchAmount();
        fetchTotalPrice();
        fetchDescription();
        fetchCustomerName();
        fetchCustomerStreet();
        fetchCustomerHouseNumber();
        fetchPrice();
        fetchShippingDate();
        fetchCustomerID();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInvoiceHeadline = new javax.swing.JLabel();
        lblCompanyHeadline = new javax.swing.JLabel();
        lblCompanyAdress = new javax.swing.JLabel();
        lblCompanyZipcode = new javax.swing.JLabel();
        lblCustomerHeadline = new javax.swing.JLabel();
        lblCustomerAdress = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblInvoiceDateHeadline = new javax.swing.JLabel();
        lblInvoiceNumberHeadline = new javax.swing.JLabel();
        lblCustomerIDHeadline = new javax.swing.JLabel();
        lblEmployeeHeadline = new javax.swing.JLabel();
        lblPaymentConditionHeadline = new javax.swing.JLabel();
        lbl14Days = new javax.swing.JLabel();
        lblInvoiceDate = new javax.swing.JLabel();
        lblInvoiceNumber = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        lblDescriptionHeadline = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblPriceHeadline = new javax.swing.JLabel();
        lblAmountHeadline = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblPriceToPayHeadline = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblBetaluppgifter = new javax.swing.JLabel();
        lblBankgiro = new javax.swing.JLabel();
        lblOrderIDHeadline = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        lblCustomerHouseNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInvoiceHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblInvoiceHeadline.setText("Faktura");

        lblCompanyHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblCompanyHeadline.setText("Hattmakarna AB");

        lblCompanyAdress.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblCompanyAdress.setText("Fakultetsgatan 1");

        lblCompanyZipcode.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblCompanyZipcode.setText("702 81 �rebro");

        lblCustomerHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblCustomerHeadline.setText("Mottagare");

        lblCustomerAdress.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblCustomerName.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblInvoiceDateHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblInvoiceDateHeadline.setText("Fakturadatum:");

        lblInvoiceNumberHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblInvoiceNumberHeadline.setText("Fakturanummer:");

        lblCustomerIDHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblCustomerIDHeadline.setText("Kundnummer:");

        lblEmployeeHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblEmployeeHeadline.setText("Er referens:");

        lblPaymentConditionHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblPaymentConditionHeadline.setText("Betalningsvillkor:");

        lbl14Days.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lbl14Days.setText("14 dagar");

        lblInvoiceDate.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblInvoiceNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblCustomerID.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblEmployeeName.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblDescriptionHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblDescriptionHeadline.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescriptionHeadline.setText("Beskrivning");

        lblDescription.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblPriceHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblPriceHeadline.setText("Belopp");

        lblAmountHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblAmountHeadline.setText("Antal");

        lblAmount.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblPrice.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblPriceToPayHeadline.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblPriceToPayHeadline.setText("Summa att betala");

        lblTotalPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N

        lblBetaluppgifter.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblBetaluppgifter.setText("Betalningsuppgifter");

        lblBankgiro.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblBankgiro.setText("Bankgiro   123-4567");

        lblOrderIDHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblOrderIDHeadline.setText("Order#");

        lblCustomerHouseNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblInvoiceDateHeadline)
                                            .addComponent(lblInvoiceNumberHeadline))
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblInvoiceDate, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(lblInvoiceNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCustomerIDHeadline)
                                            .addComponent(lblPaymentConditionHeadline))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl14Days)
                                            .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(lblEmployeeHeadline))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInvoiceHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescriptionHeadline)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAmountHeadline)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomerAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCustomerName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPriceHeadline)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCompanyAdress)
                                .addComponent(lblCompanyHeadline)
                                .addComponent(lblCompanyZipcode)
                                .addComponent(lblCustomerHeadline))
                            .addGap(25, 25, 25))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblOrderIDHeadline)
                            .addGap(18, 18, 18)
                            .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblBankgiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBetaluppgifter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPriceToPayHeadline)
                .addGap(18, 18, 18)
                .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInvoiceHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInvoiceDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInvoiceDateHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblInvoiceNumberHeadline)
                            .addComponent(lblInvoiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCustomerIDHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaymentConditionHeadline)
                            .addComponent(lbl14Days)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrderIDHeadline)
                            .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblCompanyHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompanyAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompanyZipcode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerHeadline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCustomerHouseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmployeeHeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmployeeName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescriptionHeadline)
                    .addComponent(lblPriceHeadline)
                    .addComponent(lblAmountHeadline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPriceToPayHeadline)
                        .addComponent(lblBetaluppgifter))
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblBankgiro))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    private void fillIDLabel(){
        lblOrderID.setText(selectedOrderID);
    }
    
    private void fillEmployee(){
        String query = "Select Name from Employee where EmployeeID = " + employeeIdet;
        try {
            String result = idb.fetchSingle(query);
            lblEmployeeName.setText(result);
            
        } catch (InfException ex) {
            Logger.getLogger(CreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void fetchTotalPrice(){
        try{
            String query = "Select Total_Price from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblTotalPrice.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchDescription(){
        try{
            String query = "Select Description from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblDescription.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchCustomerName(){
        try{
            String query = "Select Name from Customer JOIN `Order` O on Customer.CustomerID = O.Customer where OrderID = '" + lblOrderID.getText() + "'";
            String result = idb.fetchSingle(query);
            lblCustomerName.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void fetchCustomerStreet(){
        try{
            String query = "SELECT Street from Address join `Order` O on Address.Customer = O.Customer where OrderID = '" + lblOrderID.getText() + "'";
            String result = idb.fetchSingle(query);
            lblCustomerName.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void fetchCustomerHouseNumber(){
        try{
            String query = "SELECT House_number from Address join `Order` O on Address.Customer = O.Customer where OrderID = '" + lblOrderID.getText() + "'";
            String result = idb.fetchSingle(query);
            lblCustomerHouseNumber.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    private void fetchPrice(){
        try{
            String query = "Select Price from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblPrice.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchShippingDate(){
        try{
            String query = "Select Shipment_date from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblInvoiceDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchCustomerID(){
        try{
            String query = "Select Customer from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = idb.fetchSingle(query);
            lblCustomerID.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl14Days;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountHeadline;
    private javax.swing.JLabel lblBankgiro;
    private javax.swing.JLabel lblBetaluppgifter;
    private javax.swing.JLabel lblCompanyAdress;
    private javax.swing.JLabel lblCompanyHeadline;
    private javax.swing.JLabel lblCompanyZipcode;
    private javax.swing.JLabel lblCustomerAdress;
    private javax.swing.JLabel lblCustomerHeadline;
    private javax.swing.JLabel lblCustomerHouseNumber;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblCustomerIDHeadline;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescriptionHeadline;
    private javax.swing.JLabel lblEmployeeHeadline;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblInvoiceDate;
    private javax.swing.JLabel lblInvoiceDateHeadline;
    private javax.swing.JLabel lblInvoiceHeadline;
    private javax.swing.JLabel lblInvoiceNumber;
    private javax.swing.JLabel lblInvoiceNumberHeadline;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblOrderIDHeadline;
    private javax.swing.JLabel lblPaymentConditionHeadline;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblPriceHeadline;
    private javax.swing.JLabel lblPriceToPayHeadline;
    private javax.swing.JLabel lblTotalPrice;
    // End of variables declaration//GEN-END:variables
}
