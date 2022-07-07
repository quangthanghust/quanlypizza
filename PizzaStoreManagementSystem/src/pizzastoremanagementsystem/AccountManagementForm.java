/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzastoremanagementsystem;


import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Vu Duc Duy
 */
public class AccountManagementForm extends javax.swing.JFrame {

    /**
     * Creates new form AccountManagementForm
     */
    public AccountManagementForm() {
        initComponents();
        SelectAccount();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        AccountId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AccountName = new javax.swing.JTextField();
        AccountPassword = new javax.swing.JTextField();
        Role = new javax.swing.JComboBox<>();
        AddAccount = new javax.swing.JButton();
        EditAccount = new javax.swing.JButton();
        ClearAccount = new javax.swing.JButton();
        DeleteAccount = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccountTable = new javax.swing.JTable();
        SearchField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JLabel();
        ProductButton = new javax.swing.JLabel();
        RevenueButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("MANAGE ACCOUNTS");

        AccountId.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountId.setForeground(new java.awt.Color(255, 102, 0));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("ACCOUNTID");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("NAME");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("PASSWORD");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("ROLE");

        AccountName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountName.setForeground(new java.awt.Color(255, 102, 0));

        AccountPassword.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountPassword.setForeground(new java.awt.Color(255, 102, 0));

        Role.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Role.setForeground(new java.awt.Color(255, 102, 0));
        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));

        AddAccount.setBackground(new java.awt.Color(255, 102, 0));
        AddAccount.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddAccount.setForeground(new java.awt.Color(255, 255, 255));
        AddAccount.setText("ADD");
        AddAccount.setBorder(null);
        AddAccount.setBorderPainted(false);
        AddAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAccountMouseClicked(evt);
            }
        });

        EditAccount.setBackground(new java.awt.Color(255, 102, 0));
        EditAccount.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditAccount.setForeground(new java.awt.Color(255, 255, 255));
        EditAccount.setText("EDIT");
        EditAccount.setBorder(null);
        EditAccount.setBorderPainted(false);
        EditAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccountMouseClicked(evt);
            }
        });

        ClearAccount.setBackground(new java.awt.Color(255, 102, 0));
        ClearAccount.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearAccount.setForeground(new java.awt.Color(255, 255, 255));
        ClearAccount.setText("CLEAR");
        ClearAccount.setBorder(null);
        ClearAccount.setBorderPainted(false);
        ClearAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearAccountMouseClicked(evt);
            }
        });

        DeleteAccount.setBackground(new java.awt.Color(255, 102, 0));
        DeleteAccount.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccount.setText("DELETE");
        DeleteAccount.setBorder(null);
        DeleteAccount.setBorderPainted(false);
        DeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccountMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("ACCOUNT LIST");

        AccountTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AccountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ACCID", "NAME", "PASSWORD", "GENDER"
            }
        ));
        AccountTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AccountTable.setRowHeight(25);
        AccountTable.setSelectionBackground(new java.awt.Color(255, 102, 0));
        AccountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AccountTable);

        SearchField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SearchField.setForeground(new java.awt.Color(255, 102, 0));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("SEARCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccountId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(EditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(ClearAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchField)
                            .addComponent(Role, 0, 180, Short.MAX_VALUE)
                            .addComponent(AccountPassword))))
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(309, 309, 309))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        RevenueButton.setText("Revenue");
        RevenueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RevenueButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LogoutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RevenueButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ProductButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ProductButton)
                        .addGap(18, 18, 18)
                        .addComponent(RevenueButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAccountMouseClicked
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
    }//GEN-LAST:event_AddAccountMouseClicked

    private void AccountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)AccountTable.getModel();
        int Myindex = AccountTable.getSelectedRow();
        AccountId.setText(model.getValueAt(Myindex, 0).toString());
        AccountName.setText(model.getValueAt(Myindex, 1).toString());
        AccountPassword.setText(model.getValueAt(Myindex, 2).toString());
        Role.setSelectedItem(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_AccountTableMouseClicked

    private void ClearAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearAccountMouseClicked
        AccountId.setText("");
        AccountName.setText("");
        AccountPassword.setText("");
    }//GEN-LAST:event_ClearAccountMouseClicked

    private void DeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountMouseClicked
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
    }//GEN-LAST:event_DeleteAccountMouseClicked

    private void EditAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccountMouseClicked
        if(AccountId.getText().isEmpty()|| AccountName.getText().isEmpty()|| AccountPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem","root","");
        String Query = "Update accounttable set NAME ='"+ AccountName.getText()+"',"+ "PASSWORD ='"+ AccountPassword.getText()+"',"+ "ROLE='"+ Role.getSelectedItem().toString()+"'"+ "Where ACCID=" +AccountId.getText();
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        SelectAccount();
        JOptionPane.showMessageDialog(this, "Edit account success fully!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditAccountMouseClicked

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        new LoginForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        new ProductManagementForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void RevenueButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RevenueButtonMouseClicked
        //new RevenueForm().setVisible(true);//Start display LoginForm
        //this.dispose();
    }//GEN-LAST:event_RevenueButtonMouseClicked
    
    public void SelectAccount(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from accounttable");
            AccountTable.setModel(DbUtils.resultSetToTableModel(Rs));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /*public void Search(String str){
        DefaultTableModel model = (DefaultTableModel)AccountTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        AccountTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }*/
    
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
            java.util.logging.Logger.getLogger(AccountManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManagementForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManagementForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountId;
    private javax.swing.JTextField AccountName;
    private javax.swing.JTextField AccountPassword;
    private javax.swing.JTable AccountTable;
    private javax.swing.JButton AddAccount;
    private javax.swing.JButton ClearAccount;
    private javax.swing.JButton DeleteAccount;
    private javax.swing.JButton EditAccount;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JLabel ProductButton;
    private javax.swing.JLabel RevenueButton;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTextField SearchField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
