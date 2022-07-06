/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_congnghephanmem;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Vu Duc Duy
 */
public class AccountManagement extends javax.swing.JFrame {

    /**
     * Creates new form AccountManagement
     */
    public AccountManagement() {
        initComponents();
        SelectAccount();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        AccountId1 = new javax.swing.JTextField();
        AccountName1 = new javax.swing.JTextField();
        AccountPassword1 = new javax.swing.JTextField();
        Role1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AddAccount1 = new javax.swing.JButton();
        ClearAccount1 = new javax.swing.JButton();
        DeleteAccount1 = new javax.swing.JButton();
        EditAccount1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AccountTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("MANAGE ACCOUNTS");

        AccountId1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountId1.setForeground(new java.awt.Color(255, 102, 0));

        AccountName1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountName1.setForeground(new java.awt.Color(255, 102, 0));

        AccountPassword1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AccountPassword1.setForeground(new java.awt.Color(255, 102, 0));

        Role1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Role1.setForeground(new java.awt.Color(255, 102, 0));
        Role1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("ACCOUNTID");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("NAME");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("GENDER");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("PASSWORD");

        AddAccount1.setBackground(new java.awt.Color(255, 102, 0));
        AddAccount1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddAccount1.setForeground(new java.awt.Color(255, 255, 255));
        AddAccount1.setText("ADD");
        AddAccount1.setBorder(null);
        AddAccount1.setBorderPainted(false);
        AddAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAccount1MouseClicked(evt);
            }
        });

        ClearAccount1.setBackground(new java.awt.Color(255, 102, 0));
        ClearAccount1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ClearAccount1.setForeground(new java.awt.Color(255, 255, 255));
        ClearAccount1.setText("Clear");
        ClearAccount1.setBorder(null);
        ClearAccount1.setBorderPainted(false);
        ClearAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearAccount1MouseClicked(evt);
            }
        });

        DeleteAccount1.setBackground(new java.awt.Color(255, 102, 0));
        DeleteAccount1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DeleteAccount1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAccount1.setText("Delete");
        DeleteAccount1.setBorder(null);
        DeleteAccount1.setBorderPainted(false);
        DeleteAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccount1MouseClicked(evt);
            }
        });

        EditAccount1.setBackground(new java.awt.Color(255, 102, 0));
        EditAccount1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        EditAccount1.setForeground(new java.awt.Color(255, 255, 255));
        EditAccount1.setText("Edit");
        EditAccount1.setBorder(null);
        EditAccount1.setBorderPainted(false);
        EditAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditAccount1MouseClicked(evt);
            }
        });

        AccountTable1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AccountTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ACCID", "NAME", "PASSWORD", "Role"
            }
        ));
        AccountTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        AccountTable1.setRowHeight(25);
        AccountTable1.setSelectionBackground(new java.awt.Color(255, 102, 0));
        AccountTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(AccountTable1);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("ACCOUNTS LIST");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("SEARCH");

        jTextField1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 102, 0));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("SELECT ROLE");

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 102, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Password", "Gender" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccountId1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountName1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Role1, 0, 180, Short.MAX_VALUE)
                            .addComponent(AccountPassword1))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(AddAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(EditAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(DeleteAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClearAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(36, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(263, 263, 263))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(300, 300, 300))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(AccountId1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AccountPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Role1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addComponent(AccountName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Log out");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Product");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Revenue");
        jLabel19.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void SelectAccount(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_cacmohinhphanmem","root","");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from accounttable");
            AccountTable1.setModel(DbUtils.resultSetToTableModel(Rs));
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private void AddAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAccount1MouseClicked
        // TODO add your handling code here:
        if(AccountId1.getText().isEmpty() || AccountName1.getText().isEmpty() || AccountPassword1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
    Con = DriverManager.getConnection("jdbc:mysql://localhost/project_cacmohinhphanmem","root","");
    PreparedStatement add = Con.prepareStatement("insert into accounttable value(?,?,?,?)");
            add.setInt(1, Integer.valueOf(AccountId1.getText()));
            add.setString(2, AccountName1.getText());
            add.setString(3, AccountPassword1.getText());
            add.setString(4, Role1.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Account Added Successfully!");
            Con.close();
            SelectAccount();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddAccount1MouseClicked

    private void EditAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditAccount1MouseClicked
        // TODO add your handling code here:
        if(AccountId1.getText().isEmpty()|| AccountName1.getText().isEmpty()|| AccountPassword1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }
        else{
            try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_cacmohinhphanmem","root","");
        String Query = "Update accounttable set NAME ='"+ AccountName1.getText()+"',"+ "PASSWORD ='"+ AccountPassword1.getText()+"',"+ "Role='"+ Role1.getSelectedItem().toString()+"'"+ "Where ACCID=" +AccountId1.getText();
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        SelectAccount();
        JOptionPane.showMessageDialog(this, "Edit account success fully!");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditAccount1MouseClicked

    private void DeleteAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccount1MouseClicked
        // TODO add your handling code here:
        if(AccountId1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Choose a index before deleting account!");
        }
        else{
            try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_cacmohinhphanmem","root","");
        String Query = "Delete from accounttable where ACCID=" + AccountId1.getText();
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);
        SelectAccount();
        JOptionPane.showMessageDialog(this, "Delete account success fully!");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteAccount1MouseClicked

    private void ClearAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearAccount1MouseClicked
        AccountId1.setText("");
        AccountName1.setText("");
        AccountPassword1.setText("");
    }//GEN-LAST:event_ClearAccount1MouseClicked

    private void AccountTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)AccountTable1.getModel();
        int Myindex = AccountTable1.getSelectedRow();
        AccountId1.setText(model.getValueAt(Myindex, 0).toString());
        AccountName1.setText(model.getValueAt(Myindex, 1).toString());
        AccountPassword1.setText(model.getValueAt(Myindex, 2).toString());
        Role1.setSelectedItem(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_AccountTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        new LoginForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_jLabel17MouseClicked
    
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
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountId1;
    private javax.swing.JTextField AccountName1;
    private javax.swing.JTextField AccountPassword1;
    private javax.swing.JTable AccountTable1;
    private javax.swing.JButton AddAccount1;
    private javax.swing.JButton ClearAccount1;
    private javax.swing.JButton DeleteAccount1;
    private javax.swing.JButton EditAccount1;
    private javax.swing.JComboBox<String> Role1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
