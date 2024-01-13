
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Owner_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Owner_Menu
     */
    public Owner_Menu() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inventory_btn = new javax.swing.JButton();
        purchase_btn = new javax.swing.JButton();
        sale_btn = new javax.swing.JButton();
        banking_btn = new javax.swing.JButton();
        expences_btn = new javax.swing.JButton();
        income_btn = new javax.swing.JButton();
        cost_btn = new javax.swing.JButton();
        profit_btn = new javax.swing.JButton();
        purchaseBill_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        saleBill_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        banking_btn1 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Owner Menu");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(790, 834));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 460, -1));

        inventory_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        inventory_btn.setForeground(new java.awt.Color(255, 255, 255));
        inventory_btn.setText("INVENTORY");
        inventory_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        inventory_btn.setContentAreaFilled(false);
        inventory_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventory_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        inventory_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_btnActionPerformed(evt);
            }
        });
        jPanel1.add(inventory_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, 50));

        purchase_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        purchase_btn.setForeground(new java.awt.Color(255, 255, 255));
        purchase_btn.setText("PURCHASE");
        purchase_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        purchase_btn.setContentAreaFilled(false);
        purchase_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchase_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        purchase_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_btnActionPerformed(evt);
            }
        });
        jPanel1.add(purchase_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, 50));

        sale_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        sale_btn.setForeground(new java.awt.Color(255, 255, 255));
        sale_btn.setText("SALE");
        sale_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        sale_btn.setContentAreaFilled(false);
        sale_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sale_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        sale_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sale_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sale_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 290, 50));

        banking_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        banking_btn.setForeground(new java.awt.Color(255, 255, 255));
        banking_btn.setText("EMPLOYEE INFO");
        banking_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        banking_btn.setContentAreaFilled(false);
        banking_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banking_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        banking_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banking_btnActionPerformed(evt);
            }
        });
        jPanel1.add(banking_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 290, 50));

        expences_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        expences_btn.setForeground(new java.awt.Color(255, 255, 255));
        expences_btn.setText("EXPENCES");
        expences_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        expences_btn.setContentAreaFilled(false);
        expences_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expences_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        expences_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expences_btnActionPerformed(evt);
            }
        });
        jPanel1.add(expences_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 290, 50));

        income_btn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        income_btn.setForeground(new java.awt.Color(255, 255, 255));
        income_btn.setText("INCOME");
        income_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        income_btn.setContentAreaFilled(false);
        income_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        income_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        income_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                income_btnActionPerformed(evt);
            }
        });
        jPanel1.add(income_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 310, 60));

        cost_btn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cost_btn.setForeground(new java.awt.Color(255, 255, 255));
        cost_btn.setText("COST");
        cost_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        cost_btn.setContentAreaFilled(false);
        cost_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cost_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        cost_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cost_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cost_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 310, 60));

        profit_btn.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        profit_btn.setForeground(new java.awt.Color(255, 255, 255));
        profit_btn.setText("PROFIT");
        profit_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        profit_btn.setContentAreaFilled(false);
        profit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profit_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        profit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(profit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 700, 310, 60));

        purchaseBill_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        purchaseBill_btn.setForeground(new java.awt.Color(255, 255, 255));
        purchaseBill_btn.setText("PURCHASE BILLS");
        purchaseBill_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        purchaseBill_btn.setContentAreaFilled(false);
        purchaseBill_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseBill_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        purchaseBill_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBill_btnActionPerformed(evt);
            }
        });
        jPanel1.add(purchaseBill_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 50));

        back_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("LOGOUT");
        back_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 5, true));
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 700, 130, 60));

        saleBill_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        saleBill_btn.setForeground(new java.awt.Color(255, 255, 255));
        saleBill_btn.setText("SALE BILLS");
        saleBill_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        saleBill_btn.setContentAreaFilled(false);
        saleBill_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saleBill_btn.setPreferredSize(new java.awt.Dimension(141, 31));
        saleBill_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleBill_btnActionPerformed(evt);
            }
        });
        jPanel1.add(saleBill_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 290, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("------ OWNER MENU ------");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 790, 620, -1));

        banking_btn1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        banking_btn1.setForeground(new java.awt.Color(255, 255, 255));
        banking_btn1.setText("BANKING");
        banking_btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        banking_btn1.setContentAreaFilled(false);
        banking_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        banking_btn1.setPreferredSize(new java.awt.Dimension(141, 31));
        banking_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banking_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(banking_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 290, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/owner1.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saleBill_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleBill_btnActionPerformed
        // TODO add your handling code here:
        Sale_Bills sb = new Sale_Bills();
        sb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saleBill_btnActionPerformed

    private void inventory_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_btnActionPerformed
        // TODO add your handling code here:
        Inventory i = new Inventory();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inventory_btnActionPerformed

    private void purchase_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_btnActionPerformed
        // TODO add your handling code here:
        Purchase p = new Purchase();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_purchase_btnActionPerformed

    private void sale_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sale_btnActionPerformed
        // TODO add your handling code here:
        Sale s = new Sale();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sale_btnActionPerformed

    private void purchaseBill_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBill_btnActionPerformed
        // TODO add your handling code here:
        Purchase_Bill pb = new Purchase_Bill();
        pb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_purchaseBill_btnActionPerformed

    private void banking_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banking_btnActionPerformed
        // TODO add your handling code here:
        employee_info em = new employee_info();
        em.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_banking_btnActionPerformed

    private void expences_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expences_btnActionPerformed
        // TODO add your handling code here:
        Expences e = new Expences();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_expences_btnActionPerformed

    private void income_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_income_btnActionPerformed
        // TODO add your handling code here:
        Income in = new Income();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_income_btnActionPerformed

    private void cost_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cost_btnActionPerformed
        // TODO add your handling code here:
        Cost coo = new Cost();
        coo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cost_btnActionPerformed

    private void profit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profit_btnActionPerformed
        // TODO add your handling code here:
        Profit pr = new Profit();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profit_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void banking_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banking_btn1ActionPerformed
        // TODO add your handling code here:
        Banking b = new Banking();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_banking_btn1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Owner_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JButton banking_btn;
    private javax.swing.JButton banking_btn1;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cost_btn;
    private javax.swing.JButton expences_btn;
    private javax.swing.JButton income_btn;
    private javax.swing.JButton inventory_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton profit_btn;
    private javax.swing.JButton purchaseBill_btn;
    private javax.swing.JButton purchase_btn;
    private javax.swing.JButton saleBill_btn;
    private javax.swing.JButton sale_btn;
    // End of variables declaration//GEN-END:variables
}