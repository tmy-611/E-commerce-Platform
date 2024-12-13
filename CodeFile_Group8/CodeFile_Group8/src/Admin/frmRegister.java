
package Admin;


import java.awt.HeadlessException;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class frmRegister extends javax.swing.JFrame {
    private static int countCID = 10;
    private static int countUID = 10;
    Connection con = null;
    public frmRegister() {
        initComponents();
        con = EcommerceData.mycon();
        setTitle("Ecommerce Platforms");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        bankNameTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        CpasswordTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        registerBttn = new javax.swing.JButton();
        cancelBttn = new javax.swing.JButton();
        bankAccountTF = new javax.swing.JTextField();
        BnameTF = new javax.swing.JTextField();

        jLabel10.setText("jLabel10");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel1.setText("Register");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Bank Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Bank Account:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Phone:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Address:");

        CpasswordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpasswordTFActionPerformed(evt);
            }
        });

        registerBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registerBttn.setText("Register");
        registerBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBttnActionPerformed(evt);
            }
        });

        cancelBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cancelBttn.setText("Back to Login");
        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttnActionPerformed(evt);
            }
        });

        BnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnameTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerBttn)
                        .addGap(47, 47, 47)
                        .addComponent(cancelBttn)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bankAccountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTF)
                                .addComponent(CpasswordTF)
                                .addComponent(phoneTF)
                                .addComponent(addressTF)
                                .addComponent(BnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bankAccountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BnameTFActionPerformed

    private void CpasswordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpasswordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpasswordTFActionPerformed

    private void cancelBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttnActionPerformed
        //go back to Login screen
        frmLogin lgf = new frmLogin();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_cancelBttnActionPerformed

    private void registerBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBttnActionPerformed
        //register the new account

        countCID++;
        countUID++;
        String cName = nameTF.getText();
        String address = addressTF.getText();
        String phone = phoneTF.getText();
        String bName = BnameTF.getText();
        String bAccount = bankAccountTF.getText();
        String cpassword = CpasswordTF.getText();
        String cid = String.valueOf(countCID);
        String uid = String.valueOf(countUID);
        String aid = "A01";
        
        if(cpassword == null || cName==null || address == null || phone == null || bName == null || bAccount == null) {
            JOptionPane.showMessageDialog(rootPane, "You have to input something in here...");
        }
        else {
            try {
                Statement s = EcommerceData.mycon().createStatement();
                s.executeUpdate("INSERT INTO Customer(CID, UID, Address, Phone, BAccount, BName, CPassword, CName, AID) "
                        + "VALUES ('C"+cid+"','U"+uid+"','"+address+"','"+phone+"','"+bAccount+"','"+bName+"','"+cpassword+"','"+cName+"','"+aid+"') ");
                JOptionPane.showMessageDialog(rootPane, "Your account's created with the ID: C" + cid + ". Login now.");
                this.setVisible(false);
                frmLogin frame = new frmLogin();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            } 
            catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Failed.");
            }
        }

        nameTF.setText("");
        addressTF.setText("");
        phoneTF.setText("");
        BnameTF.setText("");
        bankAccountTF.setText("");
        CpasswordTF.setText("");

    }//GEN-LAST:event_registerBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BnameTF;
    private javax.swing.JTextField CpasswordTF;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField bankAccountTF;
    private javax.swing.JTextField bankNameTF;
    private javax.swing.JButton cancelBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton registerBttn;
    // End of variables declaration//GEN-END:variables
}
