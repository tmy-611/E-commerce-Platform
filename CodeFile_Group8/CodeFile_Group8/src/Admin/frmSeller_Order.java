
package Admin;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmSeller_Order extends javax.swing.JFrame {
    Connection con = null;
    private String sidString;
    
    public void sidSetter(String sid) {
        this.sidString = sid;
    }
    
    public String sidGetter(){
        return this.sidString;
    }
     public frmSeller_Order(String sid) {
        initComponents();
        con = EcommerceData.mycon();
        setTitle("Ecommerce Platforms");
        
        sid_OLB.setText(sid);
        //display the Order table
        try (Statement stmt = con.createStatement();) {
            String SQL = "SELECT OID, DeliveryFee, TransactionDate FROM [EcommerceData].[dbo].[Order] WHERE SID = '" +sid+ "'";
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel tableModel = (DefaultTableModel) orderTable.getModel();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i+1);
            }
            tableModel.setColumnIdentifiers(colName);
            String oid,deliveryFeeString, transactionDate;
            while(rs.next()) {
                oid = rs.getString(1);
                deliveryFeeString = rs.getString(2);
                transactionDate = rs.getString(3);
                String[] row = {oid,deliveryFeeString, transactionDate};
                tableModel.addRow(row);
            }
            
        stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        mainBttn = new javax.swing.JButton();
        sid_OLB = new javax.swing.JLabel();
        sNameLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(orderTable);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel1.setText("My Order");

        mainBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mainBttn.setText("Main Menu");
        mainBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainBttnActionPerformed(evt);
            }
        });

        sid_OLB.setText("id");

        sNameLb.setText("name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sNameLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sid_OLB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(219, 219, 219))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(mainBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(mainBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sid_OLB)
                    .addComponent(sNameLb)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainBttnActionPerformed
        this.setVisible(false);
        frmMarket frame = new frmMarket();
        frame.sidLB.setText(sidString);
        frame.sellerLB.setText(sNameLb.getText());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_mainBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainBttn;
    private javax.swing.JTable orderTable;
    public javax.swing.JLabel sNameLb;
    public javax.swing.JLabel sid_OLB;
    // End of variables declaration//GEN-END:variables
}
