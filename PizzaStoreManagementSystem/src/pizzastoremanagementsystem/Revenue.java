package pizzastoremanagementsystem;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Revenue extends javax.swing.JFrame {

    public Revenue() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        AddAccount3 = new javax.swing.JButton();
        EditAccount3 = new javax.swing.JButton();
        DeleteAccount3 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AccountTable3 = new javax.swing.JTable();
        ExitButton = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JLabel();
        ProductButton = new javax.swing.JLabel();
        RevenueButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 600));

        jPanel8.setBackground(new java.awt.Color(255, 102, 0));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 102, 0));
        jLabel30.setText("REVENUE");

        AddAccount3.setBackground(new java.awt.Color(255, 102, 0));
        AddAccount3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddAccount3.setForeground(new java.awt.Color(255, 255, 255));
        AddAccount3.setText("REVENUE");
        AddAccount3.setBorder(null);
        AddAccount3.setBorderPainted(false);
        AddAccount3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAccount3MouseClicked(evt);
            }
        });
        AddAccount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccount3ActionPerformed(evt);
            }
        });

        EditAccount3.setBackground(new java.awt.Color(255, 102, 0));
        EditAccount3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditAccount3.setForeground(new java.awt.Color(255, 255, 255));
        EditAccount3.setText("MOST SOLD");
        EditAccount3.setBorder(null);
        EditAccount3.setBorderPainted(false);
        EditAccount3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccount3MouseClicked(evt);
            }
        });

        DeleteAccount3.setBackground(new java.awt.Color(255, 102, 0));
        DeleteAccount3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteAccount3.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccount3.setText("LEAST SOLD");
        DeleteAccount3.setBorder(null);
        DeleteAccount3.setBorderPainted(false);
        DeleteAccount3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccount3MouseClicked(evt);
            }
        });
        DeleteAccount3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccount3ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 102, 0));
        jLabel35.setText("SOLD PRODUCTS TABLE");

        AccountTable3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AccountTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PRODUCT ID", "NAME", "PRICE", "SOLD AMOUNT", "TOTAL"
            }
        ));
        AccountTable3.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AccountTable3.setRowHeight(25);
        AccountTable3.setSelectionBackground(new java.awt.Color(255, 102, 0));
        AccountTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(AccountTable3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(329, 329, 329))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(AddAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(EditAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(DeleteAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(262, 262, 262))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(47, 47, 47)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteAccount3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        ExitButton.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("X");
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Log out");
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });

        ProductButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        ProductButton.setForeground(new java.awt.Color(255, 255, 255));
        ProductButton.setText("Product");
        ProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductButtonMouseClicked(evt);
            }
        });

        RevenueButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        RevenueButton.setForeground(new java.awt.Color(255, 255, 255));
        RevenueButton.setText("Account");
        RevenueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RevenueButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LogoutButton))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RevenueButton))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ProductButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ProductButton)
                        .addGap(18, 18, 18)
                        .addComponent(RevenueButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccount3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAccount3MouseClicked
        if(AccountId.getText().isEmpty() || AccountName.getText().isEmpty() || AccountPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem","root","");
                PreparedStatement add = Con.prepareStatement("insert into accounttable value(?,?,?,?)");
                add.setInt(1, Integer.valueOf(AccountId.getText()));
                add.setString(2, AccountName.getText());
                add.setString(3, AccountPassword.getText());
                add.setString(4, Role.getSelectedItem().toString());
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Account Added Successfully!");
                Con.close();
                SelectAccount();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddAccount3MouseClicked

    private void EditAccount3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccount3MouseClicked
        if(AccountId.getText().isEmpty()|| AccountName.getText().isEmpty()|| AccountPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem","root","");
                String Query = "Update accounttable set NAME ='"+ AccountName.getText()+"',"+ "PASSWORD ='"+ AccountPassword.getText()+"',"+ "Gender='"+ Role.getSelectedItem().toString()+"'"+ "Where ACCID=" +AccountId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectAccount();
                JOptionPane.showMessageDialog(this, "Edit account success fully!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditAccount3MouseClicked

    private void DeleteAccount3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccount3MouseClicked
        if(AccountId.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Choose a index before deleting account!");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem","root","");
                String Query = "Delete from accounttable where ACCID=" + AccountId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectAccount();
                JOptionPane.showMessageDialog(this, "Delete account success fully!");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteAccount3MouseClicked

    private void AccountTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountTable3MouseClicked
        DefaultTableModel model = (DefaultTableModel)AccountTable.getModel();
        int Myindex = AccountTable.getSelectedRow();
        AccountId.setText(model.getValueAt(Myindex, 0).toString());
        AccountName.setText(model.getValueAt(Myindex, 1).toString());
        AccountPassword.setText(model.getValueAt(Myindex, 2).toString());
        Role.setSelectedItem(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_AccountTable3MouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        new LoginForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        new ProductManagementForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void RevenueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RevenueButtonMouseClicked
        //new RevenueForm().setVisible(true);//Start display LoginForm
        //this.dispose();
    }//GEN-LAST:event_RevenueButtonMouseClicked

    private void AddAccount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccount3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAccount3ActionPerformed

    private void DeleteAccount3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccount3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteAccount3ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Revenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountId;
    private javax.swing.JTextField AccountId1;
    private javax.swing.JTextField AccountId2;
    private javax.swing.JTextField AccountName;
    private javax.swing.JTextField AccountName1;
    private javax.swing.JTextField AccountName2;
    private javax.swing.JTextField AccountPassword;
    private javax.swing.JTextField AccountPassword1;
    private javax.swing.JTextField AccountPassword2;
    private javax.swing.JTable AccountTable;
    private javax.swing.JTable AccountTable1;
    private javax.swing.JTable AccountTable2;
    private javax.swing.JTable AccountTable3;
    private javax.swing.JButton AddAccount;
    private javax.swing.JButton AddAccount1;
    private javax.swing.JButton AddAccount2;
    private javax.swing.JButton AddAccount3;
    private javax.swing.JButton ClearAccount;
    private javax.swing.JButton ClearAccount1;
    private javax.swing.JButton ClearAccount2;
    private javax.swing.JButton DeleteAccount;
    private javax.swing.JButton DeleteAccount1;
    private javax.swing.JButton DeleteAccount2;
    private javax.swing.JButton DeleteAccount3;
    private javax.swing.JButton EditAccount;
    private javax.swing.JButton EditAccount1;
    private javax.swing.JButton EditAccount2;
    private javax.swing.JButton EditAccount3;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JLabel ProductButton;
    private javax.swing.JLabel RevenueButton;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JComboBox<String> Role1;
    private javax.swing.JComboBox<String> Role2;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextField SearchField1;
    private javax.swing.JTextField SearchField2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
