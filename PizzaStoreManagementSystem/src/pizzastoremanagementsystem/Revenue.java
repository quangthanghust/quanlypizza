package pizzastoremanagementsystem;

import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class Revenue extends javax.swing.JFrame {

    public Revenue() {
        initComponents();
        showSoldProducts();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        soldProductTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        mostSoldButton = new javax.swing.JButton();
        leastSoldButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        RevenueTextField = new javax.swing.JTextField();
        revenueCalculateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JLabel();
        AccountButton = new javax.swing.JLabel();
        ExitButton = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(898, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(769, 562));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("REVENUE");

        soldProductTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        soldProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
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
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        soldProductTable.setRowHeight(25);
        jScrollPane1.setViewportView(soldProductTable);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("SOLD PRODUCTS LIST");

        mostSoldButton.setBackground(new java.awt.Color(255, 102, 0));
        mostSoldButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mostSoldButton.setForeground(new java.awt.Color(255, 255, 255));
        mostSoldButton.setText("MOST SOLD");
        mostSoldButton.setBorder(null);
        mostSoldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostSoldButtonMouseClicked(evt);
            }
        });

        leastSoldButton.setBackground(new java.awt.Color(255, 102, 0));
        leastSoldButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        leastSoldButton.setForeground(new java.awt.Color(255, 255, 255));
        leastSoldButton.setText("LEAST SOLD");
        leastSoldButton.setBorder(null);
        leastSoldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leastSoldButtonMouseClicked(evt);
            }
        });

        newButton.setBackground(new java.awt.Color(255, 102, 0));
        newButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        newButton.setForeground(new java.awt.Color(255, 255, 255));
        newButton.setText("NEW");
        newButton.setBorder(null);
        newButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newButtonMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("The revenue of this month is:");

        RevenueTextField.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        RevenueTextField.setForeground(new java.awt.Color(0, 153, 51));
        RevenueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevenueTextFieldActionPerformed(evt);
            }
        });

        revenueCalculateButton.setBackground(new java.awt.Color(255, 102, 0));
        revenueCalculateButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        revenueCalculateButton.setForeground(new java.awt.Color(255, 255, 255));
        revenueCalculateButton.setText("CALCULATE");
        revenueCalculateButton.setBorder(null);
        revenueCalculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                revenueCalculateButtonMouseClicked(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 102, 0));
        backButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.setBorder(null);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(mostSoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leastSoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(335, 335, 335))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(RevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenueCalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leastSoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostSoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RevenueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revenueCalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        ProductButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        ProductButton.setForeground(new java.awt.Color(255, 255, 255));
        ProductButton.setText("Product");
        ProductButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductButtonMouseClicked(evt);
            }
        });

        AccountButton.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        AccountButton.setForeground(new java.awt.Color(255, 255, 255));
        AccountButton.setText("Account");
        AccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountButtonMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProductButton)
                    .addComponent(AccountButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(LogoutButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ProductButton)
                        .addGap(18, 18, 18)
                        .addComponent(AccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    //Show sold products on table
    private void showSoldProducts() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT ProdId, ProdName, ProdPrice, SoldAmount, ProdPrice*SoldAmount as Total FROM product");
            soldProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {

        }
    }

    //Log out event
    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
        new LoginForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void RevenueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevenueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RevenueTextFieldActionPerformed

    private void newButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newButtonMouseClicked
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem", "root", "");
            St = Con.createStatement();
            St.executeUpdate("UPDATE product SET SoldAmount = 0, Total = 0 WHERE 1");
            showSoldProducts();
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_newButtonMouseClicked

    private void mostSoldButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostSoldButtonMouseClicked
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM `product` WHERE SoldAmount = (SELECT MAX(SoldAmount) FROM product)");
            soldProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_mostSoldButtonMouseClicked

    private void leastSoldButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leastSoldButtonMouseClicked
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM `product` WHERE SOLDAMOUNT = (SELECT MIN(SOLDAMOUNT) FROM product)");
            soldProductTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {

        }
    }//GEN-LAST:event_leastSoldButtonMouseClicked

    private void revenueCalculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_revenueCalculateButtonMouseClicked
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project_MoHinhPhanMem", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT SUM(ProdPrice*SoldAmount) as revenue FROM `product` WHERE 1");

            while (Rs.next()) {
                String a = Rs.getString(1);
                System.out.println(a);
                RevenueTextField.setText(a);
            }

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_revenueCalculateButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        showSoldProducts();
    }//GEN-LAST:event_backButtonMouseClicked

    private void ProductButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductButtonMouseClicked
        new ProductManagementForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_ProductButtonMouseClicked

    private void AccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountButtonMouseClicked
        new AccountManagementForm().setVisible(true);//Start display LoginForm
        this.dispose();
    }//GEN-LAST:event_AccountButtonMouseClicked

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
    private javax.swing.JLabel AccountButton;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel LogoutButton;
    private javax.swing.JLabel ProductButton;
    private javax.swing.JTextField RevenueTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leastSoldButton;
    private javax.swing.JButton mostSoldButton;
    private javax.swing.JButton newButton;
    private javax.swing.JButton revenueCalculateButton;
    private javax.swing.JTable soldProductTable;
    // End of variables declaration//GEN-END:variables

}
