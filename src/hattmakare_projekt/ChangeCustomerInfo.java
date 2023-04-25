/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author filippabostrom
 */
public class ChangeCustomerInfo extends javax.swing.JFrame {
    
    private static InfDB idb;
    private String chosenCustomer;

    /**
     * Creates new form ChangeCustomerInfo
     */
    public ChangeCustomerInfo(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillComboBoxWithCustomers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChangeCustomerInfo = new javax.swing.JLabel();
        cmbChooseCustomer = new javax.swing.JComboBox<>();
        lblChooseCustomer = new javax.swing.JLabel();
        lblCurrentAddress = new javax.swing.JLabel();
        lblShowCurrentEmail = new javax.swing.JLabel();
        lblNewAddress = new javax.swing.JLabel();
        txtNewEmail = new javax.swing.JTextField();
        txtNewStreet = new javax.swing.JTextField();
        lblNewHouse_number = new javax.swing.JLabel();
        lblCurrentEmail = new javax.swing.JLabel();
        lblShowCurrentAddress = new javax.swing.JLabel();
        lblNewEmail = new javax.swing.JLabel();
        txtNewHouseNumber = new javax.swing.JTextField();
        lblShowCurrentName = new javax.swing.JLabel();
        lblCurrentName = new javax.swing.JLabel();
        lblNewName = new javax.swing.JLabel();
        txtNewName = new javax.swing.JTextField();
        btnChangeAddress = new javax.swing.JButton();
        btnChangeName = new javax.swing.JButton();
        btnChangeEmail = new javax.swing.JButton();
        lblNameError = new javax.swing.JLabel();
        lblAddressError = new javax.swing.JLabel();
        lblEmailError = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChangeCustomerInfo.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblChangeCustomerInfo.setText("�ndra kunduppgifter!");

        cmbChooseCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseCustomerActionPerformed(evt);
            }
        });

        lblChooseCustomer.setText("V�lj kund");

        lblCurrentAddress.setText("Nuvarande adress:");

        lblShowCurrentEmail.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblShowCurrentEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblNewAddress.setText("Ny gata:");

        txtNewEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        txtNewEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewEmailActionPerformed(evt);
            }
        });

        txtNewStreet.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblNewHouse_number.setText("Nytt husnummer:");

        lblCurrentEmail.setText("Nuvarande E-post:");

        lblShowCurrentAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblShowCurrentAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblNewEmail.setText("Ny E-post:");

        txtNewHouseNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        lblShowCurrentName.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        lblShowCurrentName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        lblCurrentName.setText("Nuvarande namn:");

        lblNewName.setText("Nytt Namn:");

        txtNewName.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        btnChangeAddress.setText("�ndra adress");
        btnChangeAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAddressActionPerformed(evt);
            }
        });

        btnChangeName.setText("�ndra namn");
        btnChangeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeNameActionPerformed(evt);
            }
        });

        btnChangeEmail.setText("�ndra E-post");
        btnChangeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeEmailActionPerformed(evt);
            }
        });

        lblNameError.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));

        lblAddressError.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblAddressError.setForeground(new java.awt.Color(255, 0, 0));

        lblEmailError.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblEmailError.setForeground(new java.awt.Color(255, 0, 0));

        btnBack.setText("Tillbaka");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblChangeCustomerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblChooseCustomer)
                            .addComponent(cmbChooseCustomer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCurrentAddress)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblShowCurrentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNewAddress)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNewStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblNewHouse_number)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNewHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCurrentName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblShowCurrentName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNewName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNewName)
                                        .addGap(42, 42, 42)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnChangeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnChangeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCurrentEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblShowCurrentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNewEmail)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnChangeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNameError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lblAddressError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(43, 43, 43))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblChangeCustomerInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChooseCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbChooseCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewName)
                    .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentName)
                    .addComponent(btnChangeName)
                    .addComponent(lblShowCurrentName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewAddress)
                    .addComponent(txtNewStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentAddress)
                    .addComponent(lblShowCurrentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNewHouse_number)
                    .addComponent(btnChangeAddress))
                .addGap(11, 11, 11)
                .addComponent(lblAddressError, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNewEmail)
                        .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChangeEmail))
                    .addComponent(lblCurrentEmail)
                    .addComponent(lblShowCurrentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNewEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewEmailActionPerformed

    private void cmbChooseCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseCustomerActionPerformed
        chosenCustomer = cmbChooseCustomer.getSelectedItem().toString();
        lblShowCurrentName.setText(chosenCustomer);
        setLblShowCurrentAddress();
        setLblShowCurrentEmail();
    }//GEN-LAST:event_cmbChooseCustomerActionPerformed

    private void btnChangeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeNameActionPerformed
        String newName = txtNewName.getText();
        if(newName.isEmpty()) {
            lblNameError.setText("Ange nytt namn!");
            return;
        }
        if (!newName.matches("^[a-�A-�\\s]+$")) {
            lblNameError.setText("Inga specialtecken i namn");
             return;
        }
        try{
            idb.update("UPDATE Customer SET Name = '"+ newName + "' where CustomerId = "+ getCustomerId() +";");
            JOptionPane.showMessageDialog(null, "Namn �ndrat!");
            dispose();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null,"databasfel!");
         
        }
    }//GEN-LAST:event_btnChangeNameActionPerformed

    private void btnChangeAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAddressActionPerformed
        String newStreet = txtNewStreet.getText();
        String newHouseNumber = txtNewHouseNumber.getText();
        
        if((newStreet.isEmpty()) || (newHouseNumber.isEmpty())) {
            lblAddressError.setText("Ange gata och husnummer!");
            return;
        }
        if (!newStreet.matches("^[a-�A-�\\s]+$")) {
            lblAddressError.setText("Inga specialtecken i adress");
             return;
        }
        try{
            idb.update("UPDATE Address SET Street = '"+ newStreet + "', House_number = '" + newHouseNumber + "' where Customer = "+ getCustomerId() +";");
            JOptionPane.showMessageDialog(null, "Adress �ndrat!");
            setLblShowCurrentAddress();
            lblAddressError.setText("");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null,"databasfel!");
         
        }
    }//GEN-LAST:event_btnChangeAddressActionPerformed

    private void btnChangeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeEmailActionPerformed
        String newEmail = txtNewEmail.getText();
        if(newEmail.isEmpty()) {
            lblEmailError.setText("Ange ny E-post!");
            return;
        }
        if(!newEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"))  {
            lblEmailError.setText("Ange en korrekt email-adress");
             return;
            }
        try{
            idb.update("UPDATE Email SET Email_address = '"+ newEmail + "' where Customer = "+ getCustomerId() +";");
            JOptionPane.showMessageDialog(null, "E-post �ndrad!");
            setLblShowCurrentEmail();
            lblEmailError.setText("");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null,"databasfel!");
         
        }
    }//GEN-LAST:event_btnChangeEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private int getCustomerId() {
        int cId = 0;
        try {
            String query = "Select CustomerID from Customer where Name = '" + chosenCustomer + "';";
            String customerIdString = idb.fetchSingle(query);
            cId = parseInt(customerIdString);
            
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
        }
        return cId;
    }
    
   private void fillComboBoxWithCustomers() {
        String query = "SELECT Name from Customer";
        cmbChooseCustomer.removeAllItems();
        
        try {
            ArrayList<String> allCustomers = idb.fetchColumn(query);
            
            for(String namn:allCustomers) {
                cmbChooseCustomer.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }
   
    private void setLblShowCurrentAddress() {
        try{
            String addressQuery = "select Street, House_number from Address where Customer = " + getCustomerId() + ";";
            HashMap<String,String> addressMap = idb.fetchRow(addressQuery);
            String address = addressMap.get("Street") + " " + addressMap.get("House_number");
            lblShowCurrentAddress.setText(address);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null,"databasfel!");
        }
    }
    
    private void setLblShowCurrentEmail() {
        try{
            String emailQuery = "select Email_address from Email where Customer = " + getCustomerId() + ";";
            String email = idb.fetchSingle(emailQuery);
            lblShowCurrentEmail.setText(email);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null,"databasfel!");
        }
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChangeAddress;
    private javax.swing.JButton btnChangeEmail;
    private javax.swing.JButton btnChangeName;
    private javax.swing.JComboBox<String> cmbChooseCustomer;
    private javax.swing.JLabel lblAddressError;
    private javax.swing.JLabel lblChangeCustomerInfo;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblCurrentAddress;
    private javax.swing.JLabel lblCurrentEmail;
    private javax.swing.JLabel lblCurrentName;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblNewAddress;
    private javax.swing.JLabel lblNewEmail;
    private javax.swing.JLabel lblNewHouse_number;
    private javax.swing.JLabel lblNewName;
    private javax.swing.JLabel lblShowCurrentAddress;
    private javax.swing.JLabel lblShowCurrentEmail;
    private javax.swing.JLabel lblShowCurrentName;
    private javax.swing.JTextField txtNewEmail;
    private javax.swing.JTextField txtNewHouseNumber;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtNewStreet;
    // End of variables declaration//GEN-END:variables
}
