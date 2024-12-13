
package Admin;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
import javax.swing.table.*;


public class frmShopping extends javax.swing.JFrame {
    private static int countOID = 10025;
    frmInvoice invoice = new frmInvoice();

    public frmShopping() {
        initComponents();
        setTitle("Ecommerce Platforms");
        //display the table of products
        try (Connection con = EcommerceData.mycon(); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM Product";
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel tableModel = (DefaultTableModel) jProductTable.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i+1);
            }
            tableModel.setColumnIdentifiers(colName);
            String pid, pname, quantity, price;
            while(rs.next()) {
                pid = rs.getString(1);
                pname = rs.getString(2);
                quantity = rs.getString(3);
                price = rs.getString(4);
                String[] row = {pid, pname, quantity, price};
                tableModel.addRow(row);
            }
            
            stmt.close();
            }
         // Handle any errors that may have occurred.
        catch (SQLException e) {            
            System.out.println("Error: " + e.getMessage());
        }   
        productNameTF.setEditable(false);
        priceTF.setEditable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buyBttn = new javax.swing.JButton();
        quitBttn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productNameTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        totalBttn = new javax.swing.JButton();
        totalPriceLB = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jCartTable = new javax.swing.JTable();
        addToCartBttn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        totalCostLB = new javax.swing.JLabel();
        mainBttn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        unLB = new javax.swing.JLabel();
        cidShopLB = new javax.swing.JLabel();
        searchCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    jProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jProductTableMouseClicked(evt);
        }
    });
    jProductTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
        }
        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            jProductTableInputMethodTextChanged(evt);
        }
    });
    jScrollPane1.setViewportView(jProductTable);

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setText("Product Name:");

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setText("Quantity:");

    buyBttn.setText("Buy");
    buyBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buyBttnActionPerformed(evt);
        }
    });

    quitBttn.setText("Quit");
    quitBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            quitBttnActionPerformed(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel4.setText("Search:");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel5.setText("Price:");

    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel6.setText("Total:");

    productNameTF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            productNameTFActionPerformed(evt);
        }
    });

    quantityTF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            quantityTFActionPerformed(evt);
        }
    });

    totalBttn.setText("Total");
    totalBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            totalBttnActionPerformed(evt);
        }
    });

    totalPriceLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    totalPriceLB.setText("0");

    jCartTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {

        }
    )
    {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    }
    );
    jScrollPane2.setViewportView(jCartTable);

    addToCartBttn.setText("Add to Cart");
    addToCartBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addToCartBttnActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel7.setText("Cart");

    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel8.setText("Total Price:");

    totalCostLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    totalCostLB.setText("0");

    mainBttn.setText("Main");
    mainBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            mainBttnActionPerformed(evt);
        }
    });

    jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    jLabel9.setText("ShopBee Mall");

    label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    label1.setText("Hi,");

    unLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    unLB.setText("username");

    cidShopLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    cidShopLB.setText("cid");

    searchCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Iceberg Lettuce", "Jackfruit", "Kiwi", "Lemon", "Mango", "Nectarine", "Orange" }));
    searchCB.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchCBActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap(44, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jLabel9)
                    .addGap(36, 36, 36)
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(searchCB, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(label1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(unLB)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(cidShopLB)
                    .addGap(43, 43, 43))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(39, 39, 39))))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(productNameTF)
                                .addComponent(quantityTF)
                                .addComponent(totalPriceLB)
                                .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(quitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(96, 96, 96))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(202, 202, 202)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(addToCartBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(buyBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(388, 388, 388)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(totalBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mainBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(768, 768, 768)
                                    .addComponent(jLabel8)
                                    .addGap(34, 34, 34)
                                    .addComponent(totalCostLB)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(23, 23, 23))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(43, 43, 43)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(label1)
                .addComponent(unLB)
                .addComponent(cidShopLB))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(productNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(totalPriceLB))
                    .addGap(41, 41, 41))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(totalCostLB)))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addToCartBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buyBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mainBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(quitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10)
            .addGap(40, 40, 40))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBttnActionPerformed
        //exit the app
        System.exit(0);
    }//GEN-LAST:event_quitBttnActionPerformed

    private void jProductTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jProductTableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jProductTableInputMethodTextChanged

    private void jProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductTableMouseClicked
        
        //action appear when mouse clicked on table
        DefaultTableModel tableModel = (DefaultTableModel) jProductTable.getModel();
        int selectedRowIndex = jProductTable.getSelectedRow();
        
        String productName = tableModel.getValueAt(selectedRowIndex, 1).toString();

        String price = tableModel.getValueAt(selectedRowIndex, 3).toString();

        
        productNameTF.setText(productName);
        quantityTF.setText("1");
        priceTF.setText(price);     

    }//GEN-LAST:event_jProductTableMouseClicked

    private void totalBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBttnActionPerformed
        //calculate total of product in the cart
        DefaultTableModel tableModel = (DefaultTableModel) jProductTable.getModel();
        int selectedRowIndex = jProductTable.getSelectedRow();
        String selectedQuantity = tableModel.getValueAt(selectedRowIndex, 2).toString();
        int selQuan = Integer.parseInt(selectedQuantity);
        int enteredQuantity = Integer.parseInt(quantityTF.getText());
        int price = Integer.parseInt(priceTF.getText());

        if (enteredQuantity > selQuan) {
            JOptionPane.showMessageDialog(null, "Error: Entered quantity is greater than available quantity.");
        } else {
            String result = String.valueOf(enteredQuantity * price);
            totalPriceLB.setText(result);
        }
        if (quantityTF.getText() == null) {
            JOptionPane.showMessageDialog(rootPane, "The quantity must be a number greater than 0");
        }
        
    }//GEN-LAST:event_totalBttnActionPerformed

    private void addToCartBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBttnActionPerformed

        

        
        //when push the button, products are automatically added to the Cart
        DefaultTableModel model = (DefaultTableModel) jCartTable.getModel();
        
        DefaultTableModel tableModel = (DefaultTableModel) jProductTable.getModel();
        int selectedRowIndex = jProductTable.getSelectedRow();
        
        String pid = tableModel.getValueAt(selectedRowIndex, 0).toString();
        Object[] columns = {"PName", "Quantity", "Price"};
        Object[] rows = new Object[3];
        
        model.setColumnIdentifiers(columns);
        jCartTable.setModel(model);
        
        rows[0] = productNameTF.getText();
        rows[1] = quantityTF.getText();
        rows[2] = totalPriceLB.getText();
        
        model.addRow(rows);
        invoice.addRowToTheTable(rows);
        
                //calculate the total price of the receipt
        int sum = 0;
        for (int i = 0; i < jCartTable.getRowCount(); i++) {
            sum = sum + Integer.parseInt(jCartTable.getValueAt(i, 2).toString());
        }
        totalCostLB.setText(Integer.toString(sum));
    }//GEN-LAST:event_addToCartBttnActionPerformed
    


    private void buyBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBttnActionPerformed
        countOID++;
        //add the new Order to the table of Orders
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
            String date = dateFormat.format(new Date());
            Statement s = EcommerceData.mycon().createStatement();
            
            String oid1 = String.valueOf(countOID);
            String aid = "A01";
            
            Random rd = new Random();
            int random = rd.nextInt(9);
            String sid = "S0" + String.valueOf(random);
            String fee1 = String.valueOf(5);
            String cid = cidShopLB.getText();
            
            s.executeUpdate("INSERT INTO [dbo].[Order] (OID, DeliveryFee, TransactionDate, AID, CID, SID) "
                + "VALUES ('O" + oid1+ "','"+fee1+"','"+date+"','"+aid+"','"+cid+"','"+sid+"') ");
            JOptionPane.showMessageDialog(null, "Purchased");
            this.setVisible(false);
            frmInvoice frame = new frmInvoice();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
            } 
        catch (SQLException ex) {
            Logger.getLogger(frmShopping.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Select the recent order to display on the Invoice
        try (Connection con = EcommerceData.mycon(); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 1 * FROM [EcommerceData].[dbo].[Order] ORDER BY OID DESC";
            ResultSet rs = stmt.executeQuery(SQL);
            String oid, deliveryFee, transDate,cusID;
            
            if (rs.next()) {
                oid = rs.getString(1);
                deliveryFee = rs.getString(2);
                transDate = rs.getString(3);
                cusID = rs.getString(5);
                
                DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                Date date = (Date)formatter.parse(transDate);
                SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");
                String finalString = newFormat.format(date);
                
                invoice.deliFee.setText(deliveryFee);
                invoice.dateLB.setText(finalString);
                invoice.oidLB.setText(oid);
                
                //calculate total price of invoice
                int fee = Integer.parseInt(deliveryFee);
                int price = Integer.parseInt(invoice.totalPriceLB.getText());
        
                String result = String.valueOf(fee + price);
                invoice.finalPriceLB.setText(result);

            }
            invoice.nameLB.setText(unLB.getText());
            invoice.cidInvoiceLB.setText(cidShopLB.getText());
            this.setVisible(false);
            invoice.setVisible(true);
            invoice.setLocationRelativeTo(null);
            stmt.close();
            }
         // Handle any errors that may have occurred.
        catch (SQLException e) {            
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(frmShopping.class.getName()).log(Level.SEVERE, null, ex);
        }   

    }//GEN-LAST:event_buyBttnActionPerformed

    private void mainBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBttnActionPerformed
        //come back to main screen
        this.setVisible(false);
        frmLogin frame = new frmLogin();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_mainBttnActionPerformed

    private void productNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameTFActionPerformed

    private void quantityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTFActionPerformed

    private void searchCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCBActionPerformed
        String selectedValue = searchCB.getSelectedItem().toString();
        
        try {
            Statement s = EcommerceData.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM Product WHERE PName = '" + selectedValue+ "'");
            String pname, price;
            
            if (rs.next()) {
                pname = rs.getString(2);
                price = rs.getString(4);
                
                productNameTF.setText(pname);
                quantityTF.setText("1");
                priceTF.setText(price); 
            }
            
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_searchCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBttn;
    private javax.swing.JButton buyBttn;
    public javax.swing.JLabel cidShopLB;
    private javax.swing.JTable jCartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jProductTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JButton mainBttn;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField productNameTF;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton quitBttn;
    private javax.swing.JComboBox<String> searchCB;
    private javax.swing.JButton totalBttn;
    private javax.swing.JLabel totalCostLB;
    private javax.swing.JLabel totalPriceLB;
    public javax.swing.JLabel unLB;
    // End of variables declaration//GEN-END:variables
}
