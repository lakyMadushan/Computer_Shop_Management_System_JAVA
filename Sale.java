
import java.awt.Image;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Sale() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
         cbLoadData("customer","name", customer_combo);
         AutoCompleteDecorator.decorate(customer_combo);
        
         try {
            
            ResultSet rs = dbcon.SEARCH("SELECT * FROM sale");
            while(rs.next()){
                
                String id = rs.getString("id");
                String date = rs.getString("date");
                String bill = rs.getString("bill_no");
                String dis = rs.getString("customer");
                String brand = rs.getString("brand");
                String model = rs.getString("model");
                String code = rs.getString("item_code");
                String qty = rs.getString("qty");
                String buy = rs.getString("buy");
                String sell = rs.getString("sell");
                String price = rs.getString("price");
                String total = rs.getString("total");
                
                Vector v = new Vector();
                v.add(id);
                v.add(date);
                v.add(bill);
                v.add(dis);
                v.add(brand);
                v.add(model);
                v.add(code);
                v.add(qty);
                v.add(buy);
                v.add(sell);
                v.add(price);
                v.add(total);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        print_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        customer_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        loadAll = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("0000 / 00 / 00");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("DATE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sale");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(1121, 832));
        jPanel1.setPreferredSize(new java.awt.Dimension(1121, 832));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        print_btn.setForeground(new java.awt.Color(255, 255, 255));
        print_btn.setText("PRINT");
        print_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 4));
        print_btn.setContentAreaFilled(false);
        print_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });
        jPanel1.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 715, 160, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 95, -1, -1));

        search_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(255, 255, 255));
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        search_txt.setOpaque(false);
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        jPanel1.add(search_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 79, 370, 40));

        edit_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        edit_btn.setContentAreaFilled(false);
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 50));

        remove_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("REMOVE");
        remove_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        remove_btn.setContentAreaFilled(false);
        remove_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        jPanel1.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 180, 50));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "BILL NO.", "CUSTOMER", "BRAND", "MODEL", "ITEM CODE", "QTY", "BUY", "SELL", "PRICE", "TOTAL"
            }
        ));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 261, 1080, 440));

        back_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("DASHBOAD");
        back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 4));
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 715, 170, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CUSTOMER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 150, -1, -1));

        customer_combo.setBackground(new java.awt.Color(204, 204, 204));
        customer_combo.setEditable(true);
        customer_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customer_combo.setForeground(new java.awt.Color(0, 0, 0));
        customer_combo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        customer_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_comboActionPerformed(evt);
            }
        });
        jPanel1.add(customer_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 142, 370, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("------ SALE ------");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 750, 620, -1));

        loadAll.setBackground(new java.awt.Color(255, 255, 255));
        loadAll.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loadAll.setForeground(new java.awt.Color(255, 255, 255));
        loadAll.setText("ALL");
        loadAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        loadAll.setContentAreaFilled(false);
        loadAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAllActionPerformed(evt);
            }
        });
        jPanel1.add(loadAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 50, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:
        try {
            int r = jTable1.getSelectedRow();
            String delr = jTable1.getValueAt(r, 0).toString(); // 0 veni row
            dbcon.IUD("DELETE FROM sale WHERE `id` = '"+delr+"'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.removeRow(r);
            JOptionPane.showMessageDialog(this, "Row Deleted Successfulll!","DONE",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_remove_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Owner_Menu on = new Owner_Menu();
        on.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("LAKSHITHA SOFTWARE JAVA (C) All Rights");
        MessageFormat footer = new MessageFormat("Thank You!!!");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_print_btnActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         String txt = search_txt.getText();
         TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
         jTable1.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(txt));
    }//GEN-LAST:event_search_txtKeyReleased

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        try {
            int r = jTable1.getSelectedRow();
            
            String id = jTable1.getValueAt(r, 0).toString();
            String date = jTable1.getValueAt(r, 1).toString();
            String bill_no = jTable1.getValueAt(r, 2).toString();
            String customer = jTable1.getValueAt(r, 3).toString();
            String brand = jTable1.getValueAt(r, 4).toString();
            String model = jTable1.getValueAt(r, 5).toString();
            String item_code = jTable1.getValueAt(r, 6).toString();
            String qty = jTable1.getValueAt(r, 7).toString();
            String buy = jTable1.getValueAt(r, 8).toString();
            String sell = jTable1.getValueAt(r, 9).toString();
            String price = jTable1.getValueAt(r, 10).toString();
            String total = jTable1.getValueAt(r, 11).toString();
            
            dbcon.IUD("UPDATE sale SET `date` = '"+date+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `bill_no` = '"+bill_no+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `customer` = '"+customer+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `brand` = '"+brand+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `model` = '"+model+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `item_code` = '"+item_code+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `qty` = '"+qty+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `buy` = '"+buy+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `sell` = '"+sell+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `price` = '"+price+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE sale SET `total` = '"+total+"' WHERE `id` = '"+id+"' ");
            
            JOptionPane.showMessageDialog(this,"Row Update Successfully!","DONE",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void customer_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_comboActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = dbcon.SEARCH("SELECT * FROM sale WHERE `customer` = '"+String.valueOf(customer_combo.getSelectedItem())+"' ");
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("bill_no");
                String customer = rs.getString("customer");
                String brand = rs.getString("brand");
                String model = rs.getString("model"); 
                String item_code = rs.getString("item_code"); 
                String qty = rs.getString("qty"); 
                String buy = rs.getString("buy"); 
                String sell = rs.getString("sell");
                String price = rs.getString("price");
                String total = rs.getString("total"); 
                
               
                Vector v = new Vector();                
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(customer);
                v.add(brand);
                v.add(model);
                v.add(item_code);
                v.add(qty);
                v.add(buy);
                v.add(sell);
                v.add(price);
                v.add(total);                
               
               
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_customer_comboActionPerformed

    private void loadAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAllActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = dbcon.SEARCH("SELECT * FROM sale");
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("bill_no");
                String customer = rs.getString("customer");
                String brand = rs.getString("brand");
                String model = rs.getString("model"); 
                String item_code = rs.getString("item_code"); 
                String qty = rs.getString("qty"); 
                String buy = rs.getString("buy"); 
                String sell = rs.getString("sell");
                String price = rs.getString("price");
                String total = rs.getString("total"); 
                
               
                Vector v = new Vector();                
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(customer);
                v.add(brand);
                v.add(model);
                v.add(item_code);
                v.add(qty);
                v.add(buy);
                v.add(sell);
                v.add(price);
                v.add(total);                
               
               
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loadAllActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> customer_combo;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loadAll;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables


public void cbLoadData(String table , String column, JComboBox cb){
    Vector v = new Vector();
    try {
        
        ResultSet rs = dbcon.SEARCH("SELECT * FROM "+table+" ");
        while(rs.next()){
            String col = rs.getString(column);
            v.add(col);
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
            cb.setModel(dcm);
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
