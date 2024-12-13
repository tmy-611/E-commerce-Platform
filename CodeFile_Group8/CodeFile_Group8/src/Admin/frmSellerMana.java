
package Admin;

import Admin.EcommerceData;
import Admin.frmMarket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSellerMana extends javax.swing.JFrame {
    Connection con = null;
    
    public frmSellerMana() throws SQLException {
        initComponents();
        con = EcommerceData.mycon();
        setTitle("Ecommerce Platforms");
        //display the Product table
        try (Connection con = EcommerceData.mycon(); Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM Product";
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel tableModel = (DefaultTableModel) productTable.getModel();
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        removeBttn = new javax.swing.JButton();
        quitBttn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pidTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnameTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        backBttn = new javax.swing.JButton();
        addBttn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sNameLB = new javax.swing.JLabel();
        sidP_LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N

        productTable.setModel(new javax.swing.table.DefaultTableModel(
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
    productTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            productTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(productTable);

    removeBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    removeBttn.setText("Remove");
    removeBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeBttnActionPerformed(evt);
        }
    });

    quitBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    quitBttn.setText("Quit");
    quitBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            quitBttnActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setText("Product ID:");

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel3.setText("Product Name:");

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel4.setText("Quantity:");

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel5.setText("Price (for each item):");

    backBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    backBttn.setText("Back to Main");
    backBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backBttnActionPerformed(evt);
        }
    });

    addBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    addBttn.setText("Add");
    addBttn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addBttnActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
    jLabel6.setText("Product Management");

    sNameLB.setText("name");

    sidP_LB.setText("id");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(60, 60, 60)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(backBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(removeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addComponent(quitBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(77, 77, 77))
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(sNameLB)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(sidP_LB)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jLabel1))
                .addGroup(layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel6)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jLabel1)
            .addGap(10, 10, 10)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(removeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(57, 57, 57)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(quitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(sNameLB)
                .addComponent(sidP_LB))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBttnActionPerformed
        //exit the app
        System.exit(0);
    }//GEN-LAST:event_quitBttnActionPerformed

    private void backBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttnActionPerformed
        //back to Main Screen
        this.setVisible(false);
        frmMarket frame = new frmMarket();
        frame.sidLB.setText(sidP_LB.getText());
        frame.sellerLB.setText(sNameLB.getText());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBttnActionPerformed

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        //add the Product to the table
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        Object[] rows = new Object[4];
        
        productTable.setModel(model);
        
        rows[0] = pidTF.getText();
        rows[1] = pnameTF.getText();
        rows[2] = quantityTF.getText();
        rows[3] = priceTF.getText();
        
        model.addRow(rows);
    }//GEN-LAST:event_addBttnActionPerformed

    private void removeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBttnActionPerformed
        //remove product
        DefaultTableModel tableModel = (DefaultTableModel) productTable.getModel();
        
        try {
            int selectedRowIndex = productTable.getSelectedRow();
            tableModel.removeRow(selectedRowIndex);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_removeBttnActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
   
        //get the information of the product from the table
        DefaultTableModel tableModel = (DefaultTableModel) productTable.getModel();
        int selectedRowIndex = productTable.getSelectedRow();
        
        String pid = tableModel.getValueAt(selectedRowIndex, 0).toString();
        String productName = tableModel.getValueAt(selectedRowIndex, 1).toString();
        String quantity = tableModel.getValueAt(selectedRowIndex, 2).toString();
        String price = tableModel.getValueAt(selectedRowIndex, 3).toString(); 
    }//GEN-LAST:event_productTableMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JButton backBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pidTF;
    private javax.swing.JTextField pnameTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JButton quitBttn;
    private javax.swing.JButton removeBttn;
    public javax.swing.JLabel sNameLB;
    public javax.swing.JLabel sidP_LB;
    // End of variables declaration//GEN-END:variables
}
