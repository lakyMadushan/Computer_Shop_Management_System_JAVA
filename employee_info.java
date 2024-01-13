
import java.awt.Image;
import java.sql.Blob;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class employee_info extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public employee_info() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        try {
            int serial_id = 1;
            ResultSet rs = dbcon.SEARCH("SELECT * FROM user WHERE `serial_key` = '"+serial_id+"'");
            while(rs.next()){
                
                String id = rs.getString("id");
                String date = rs.getString("username");
                String cat = rs.getString("full_name");
                String type = rs.getString("contact_no");
                String bank = rs.getString("address");
                String dis = rs.getString("dob");
                String cus = rs.getString("password");
                //String amount = rs.getString("image");
            
                Blob blob = rs.getBlob("image");
                
                Vector v = new Vector();
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(type);
                v.add(bank);
                v.add(dis);
                v.add(cus);
                v.add(blob);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        category_combo = new javax.swing.JComboBox<>();
        search_txt = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        print_btn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banking");
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(1121, 832));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("------ EMPLOYEE INFO ------");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 190, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("0 - EMPLOYEE");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        category_combo.setBackground(new java.awt.Color(102, 102, 102));
        category_combo.setEditable(true);
        category_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        category_combo.setForeground(new java.awt.Color(0, 0, 0));
        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));
        category_combo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        category_combo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        category_combo.setOpaque(false);
        category_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_comboActionPerformed(evt);
            }
        });
        jPanel2.add(category_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 317, 50));

        search_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(255, 255, 255));
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        search_txt.setOpaque(false);
        search_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_txtMouseClicked(evt);
            }
        });
        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        jPanel2.add(search_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 87, 317, 40));

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
        jPanel2.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, 133, 40));

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
        jPanel2.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 137, 40));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USERNAME", "FULL NAME", "CONTACT NO", "ADDRESS", "DOB", "PASWORD", "IMAGE"
            }
        ));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 278, 1070, 450));

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
        jPanel2.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 740, 170, 45));

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
        jPanel2.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 170, 45));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 760, 620, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("OWN - EMP");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("1 - OWNER");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.png"))); // NOI18N
        jPanel2.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:
        try {
            int r = jTable1.getSelectedRow();
            String delr = jTable1.getValueAt(r, 0).toString(); // 0 veni row
            dbcon.IUD("DELETE FROM user WHERE `id` = '"+delr+"'");
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
            String category = jTable1.getValueAt(r, 2).toString();
            String type = jTable1.getValueAt(r, 3).toString();
            String bank = jTable1.getValueAt(r, 4).toString();
            String dis = jTable1.getValueAt(r, 5).toString();
            String cus = jTable1.getValueAt(r, 6).toString();
            //String amount = jTable1.getValueAt(r, 7).toString();
            
            dbcon.IUD("UPDATE user SET `username` = '"+date+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE user SET `full_name` = '"+category+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE user SET `contact_no` = '"+type+"'WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE user SET `address` = '"+bank+"'WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE user SET `dob` = '"+dis+"'WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE user SET `serial_key` = '"+cus+"'WHERE `id` = '"+id+"'");
            //dbcon.IUD("UPDATE user SET `password` = '"+amount+"'WHERE `id` = '"+id+"'");
            
            JOptionPane.showMessageDialog(this,"Row Update Successfully!","DONE",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_btnActionPerformed

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

    private void category_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_comboActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = dbcon.SEARCH("SELECT*FROM user WHERE `serial_key` = '"+String.valueOf(category_combo.getSelectedItem())+"'");
            
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("username");
                String cat = rs.getString("full_name");
                String type = rs.getString("contact_no");
                String bank = rs.getString("address");
                String dis = rs.getString("dob");
                String cus = rs.getString("password");
                //String amount = rs.getString("image");
            
                Blob blob = rs.getBlob("image");
                
                Vector v = new Vector();
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(type);
                v.add(bank);
                v.add(dis);
                v.add(cus);
                v.add(blob);
                //DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_category_comboActionPerformed

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_search_txtActionPerformed

    private void search_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_txtMouseClicked
        // TODO add your handling code here:
        search_txt.setText(null);
    }//GEN-LAST:event_search_txtMouseClicked

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
                new employee_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JButton edit_btn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables


}
