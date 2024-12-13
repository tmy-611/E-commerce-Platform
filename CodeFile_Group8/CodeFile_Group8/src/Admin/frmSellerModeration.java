
package Admin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmSellerModeration extends javax.swing.JFrame {
    Connection con = null;
    public frmSellerModeration() {
        initComponents();
        con = EcommerceData.mycon();
        setTitle("Ecommerce Platforms");
        
        //see the table of Sellers
        try (Statement stmt = con.createStatement();) {
            String SQL = "SELECT * FROM Seller";
            ResultSet rs = stmt.executeQuery(SQL);
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel tableModel = (DefaultTableModel) sellerTable.getModel();
            int cols = rsmd.getColumnCount()-1;
            String[] colName = new String[cols];
            for (int i = 0; i < cols; i++) {
                colName[i] = rsmd.getColumnName(i+1);
            }
            tableModel.setColumnIdentifiers(colName);
            String sid, sname, spassword;
            while(rs.next()) {
                sid = rs.getString(1);
                sname = rs.getString(2);
                spassword = rs.getString(3);
               
                String[] row = {sid, sname,spassword};
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sidTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        addBttn = new javax.swing.JButton();
        removeBttn = new javax.swing.JButton();
        backBttn = new javax.swing.JButton();
        spasswordTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        jLabel1.setText("Seller Management");

        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellerTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Seller ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Seller Name:");

        addBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBttn.setText("Add");
        addBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBttnActionPerformed(evt);
            }
        });

        removeBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeBttn.setText("Remove");
        removeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBttnActionPerformed(evt);
            }
        });

        backBttn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backBttn.setText("Bank to Main");
        backBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBttnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sidTF)
                                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(spasswordTF)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBttn)
                                .addGap(50, 50, 50)
                                .addComponent(removeBttn)
                                .addGap(46, 46, 46)
                                .addComponent(backBttn)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBttnActionPerformed
        
        //remove the seller from the database
        DefaultTableModel tableModel = (DefaultTableModel) sellerTable.getModel();
        int selectedRowIndex = sellerTable.getSelectedRow();
        
        String sid = tableModel.getValueAt(selectedRowIndex, 0).toString();

        try {
            Statement s = EcommerceData.mycon().createStatement();
            s.executeUpdate("DELETE FROM Seller WHERE SID = '" +sid+"'");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Fail to delete.");
        }
        
        //remove the seller from the displayed table
        try {
            tableModel.removeRow(selectedRowIndex);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        


    }//GEN-LAST:event_removeBttnActionPerformed

    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseClicked


    }//GEN-LAST:event_sellerTableMouseClicked

    private void addBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBttnActionPerformed
        //add the seller to the displayed table
        DefaultTableModel model = (DefaultTableModel) sellerTable.getModel();
        Object[] rows = new Object[3];
        
        sellerTable.setModel(model);
        
        rows[0] = sidTF.getText();
        rows[1] = nameTF.getText();
        rows[2] = spasswordTF.getText();
        model.addRow(rows);
        
        //add the seller to the database
        String sellerID = sidTF.getText();
        String sellerName = nameTF.getText();
        String sellerPassword = spasswordTF.getText();
        String aid = "A01";
        try {
            Statement s = EcommerceData.mycon().createStatement();
            s.executeUpdate("INSERT INTO Seller(SID, SName, SPassword, AID) "
                    + "VALUES ('"+sellerID+"','"+sellerName+"','"+sellerPassword+"','"+aid+"') ");
        } catch (HeadlessException | SQLException e) {
            e.printStackTrace(System.out);
        }
    }//GEN-LAST:event_addBttnActionPerformed

    private void backBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttnActionPerformed
        //back to Admin Properties Screen
        this.setVisible(false);
        frmAdminProperties frame = new frmAdminProperties();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_backBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBttn;
    private javax.swing.JButton backBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton removeBttn;
    private javax.swing.JTable sellerTable;
    private javax.swing.JTextField sidTF;
    private javax.swing.JTextField spasswordTF;
    // End of variables declaration//GEN-END:variables
}
