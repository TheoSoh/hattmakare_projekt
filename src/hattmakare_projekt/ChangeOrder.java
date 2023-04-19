/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import oru.inf.InfDB;
/**
 *
 * @author filippabostrom
 */
public class ChangeOrder extends javax.swing.JFrame {
    private static InfDB idb;
    private int orderId;
    /**
     * Creates new form ChangeOrder
     */
    public ChangeOrder(InfDB idb, int orderId) {
        initComponents();
        this.idb = idb;
        this.orderId = orderId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblShowOrderDate = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblCurrentColor = new javax.swing.JLabel();
        lblNewColor = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        btnChangeColor = new javax.swing.JButton();
        lblSize = new javax.swing.JLabel();
        lblCurrentSize = new javax.swing.JLabel();
        lblNewSize = new javax.swing.JLabel();
        txtNewSize = new javax.swing.JTextField();
        btnChangeSize = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        lblCurrentPrice = new javax.swing.JLabel();
        lblNewPrice = new javax.swing.JLabel();
        txtNewPrice = new javax.swing.JTextField();
        btnChangePrice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblHeader.setText("�ndra i ordern h�r!");

        lblOrderDate.setText("Orderdatum:");

        lblColor.setText("Nuvarande f�rg:");

        lblNewColor.setText("Ny f�rg:");

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bl�", "Brun", "Gr�", "Gr�n", "Gul", "Guld", "Lila", "Orange", "Rosa", "R�d", "Silver", "Svart", "Turkos", "Violett", "Vit" }));

        btnChangeColor.setText("�ndra f�rg");

        lblSize.setText("Nuvarande storlek:");

        lblNewSize.setText("Ny storlek:");

        btnChangeSize.setText("�ndra storlek");

        lblPrice.setText("Nuvarande pris:");

        lblNewPrice.setText("Nytt pris:");

        btnChangePrice.setText("�ndra pris");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblColor)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCurrentColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOrderDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblShowOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCurrentSize, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblNewColor)
                                .addGap(18, 18, 18)
                                .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNewSize)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNewSize, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNewPrice)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNewPrice))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangeColor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeSize)
                    .addComponent(btnChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrderDate)
                            .addComponent(lblShowOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColor)
                                .addComponent(lblCurrentColor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNewColor)
                                .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChangeColor)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSize)
                                .addComponent(lblCurrentSize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNewSize)
                                .addComponent(txtNewSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChangeSize)))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(lblCurrentPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNewPrice)
                        .addComponent(txtNewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnChangePrice)))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeColor;
    private javax.swing.JButton btnChangePrice;
    private javax.swing.JButton btnChangeSize;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblCurrentColor;
    private javax.swing.JLabel lblCurrentPrice;
    private javax.swing.JLabel lblCurrentSize;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblNewColor;
    private javax.swing.JLabel lblNewPrice;
    private javax.swing.JLabel lblNewSize;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblShowOrderDate;
    private javax.swing.JLabel lblSize;
    private javax.swing.JTextField txtNewPrice;
    private javax.swing.JTextField txtNewSize;
    // End of variables declaration//GEN-END:variables
}
