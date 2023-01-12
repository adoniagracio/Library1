/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class ManageBooks extends javax.swing.JFrame {
    //BELOM BIKIN UPDATE SM DELETE DI FILE

    /**
     * Creates new form ManageBooks
     */
    
    private static db<Book> bookdb = new db<Book>("bookdb");
    private static Account currentAccount;
    public ManageBooks(Account admin) {
        currentAccount = admin;
        initComponents();
    }
    
    void deleteData(){
    }
    
    //static Object col[] = {"Title", "Author", "ISBN"};
    //DefaultTableModel tbl = new DefaultTableModel(col, row);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_isbn = new javax.swing.JTextField();
        tf_author = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_title = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cb_status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(61, 25, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(786, 40));

        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SF UI Display ExtBd", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manage Books");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addGap(586, 586, 586)
                .addComponent(close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jLabel4)
                    .addComponent(close)))
        );

        jPanel2.setBackground(new java.awt.Color(214, 229, 229));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel3.setText("ISBN");

        tf_isbn.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_isbn.setToolTipText("Enter book title");
        tf_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_isbnActionPerformed(evt);
            }
        });

        tf_author.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_author.setToolTipText("Enter book author");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel5.setText("Author");

        tf_title.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_title.setToolTipText("Enter ISBN");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel7.setText("Title");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel9.setText("Status");

        add.setFont(new java.awt.Font("SF UI Display", 0, 11)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("SF UI Display", 0, 11)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("SF UI Display", 0, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(153, 51, 0));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_isbn)
                    .addComponent(jLabel5)
                    .addComponent(tf_author)
                    .addComponent(jLabel7)
                    .addComponent(tf_title)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(111, 111, 111))
                    .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(update)
                .addGap(18, 18, 18)
                .addComponent(delete)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tf_isbn.getAccessibleContext().setAccessibleDescription("");

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        tblData.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        DefaultTableModel tblmodel = new DefaultTableModel();
        tblmodel.addColumn("Title");
        tblmodel.addColumn("Author");
        tblmodel.addColumn("ISBN");
        tblmodel.addColumn("Status");
        bookdb.Load();
        for(Book a : bookdb.getList()){
            tblmodel.addRow(new Object[] {a.getTitle(), a.getAuthor(), a.getISBN(), (a.isAvailable())? "Available" : "Borrowed by: " +  a.getBorrower()});
        }
        tblData.setModel(tblmodel);
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setSize(new java.awt.Dimension(802, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        Dashboard home = new Dashboard(currentAccount);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(tf_isbn.getText().isEmpty() || tf_isbn.getText().isEmpty() || tf_isbn.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "A field cannot be empty");
            return;
        }
        DefaultTableModel tblModel = (DefaultTableModel)tblData.getModel();
        bookdb.getSize();
        bookdb.add(new Book(tf_isbn.getText(), tf_title.getText(), tf_author.getText()));
        bookdb.Save();
        tblModel.addRow(new Object[]{
            tf_title.getText(), tf_author.getText(), tf_isbn.getText(), cb_status.getItemAt(cb_status.getSelectedIndex())
        });
        JOptionPane.showMessageDialog(this, "Data successfully added.");
        tf_isbn.setText("");
        tf_author.setText("");
        tf_isbn.setText("");
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tblData.getModel();
      if(tblData.getSelectedRowCount() == 1){
            String title = tf_title.getText();
            String author = tf_author.getText();
            String isbn = tf_isbn.getText();
            String status = cb_status.getItemAt(cb_status.getSelectedIndex());
            
            tblModel.setValueAt(title, tblData.getSelectedRow(), 0);
            tblModel.setValueAt(author, tblData.getSelectedRow(), 1);
            tblModel.setValueAt(isbn, tblData.getSelectedRow(), 2);
            tblModel.setValueAt(status, tblData.getSelectedRow(), 3);
            
            bookdb.update(tblData.getSelectedRow(), new Book(isbn, title, author));
            bookdb.Save();

            JOptionPane.showMessageDialog(this, "Data successfully updated.");
        }
        
        else if(tblData.getRowCount() == 0) JOptionPane.showMessageDialog(this, "Table is empty.");
        else JOptionPane.showMessageDialog(this, "No row selected.");
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)tblData.getModel();
        if(tblData.getSelectedRowCount() == 1){
            bookdb.remove(tblData.getSelectedRow());
            bookdb.Save();
            tblModel.removeRow(tblData.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Data successfully deleted.");
        }
        else if(tblData.getRowCount() == 0) JOptionPane.showMessageDialog(this, "Table is empty.");
        else JOptionPane.showMessageDialog(this, "No row selected.");
    }//GEN-LAST:event_deleteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    }//GEN-LAST:event_formComponentShown

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        //taro di text field
        DefaultTableModel tblModel = (DefaultTableModel)tblData.getModel();
        String tblTitle = tblModel.getValueAt(tblData.getSelectedRow(), 0).toString();
        String tblAuthor = tblModel.getValueAt(tblData.getSelectedRow(), 1).toString();
        String tblISBN = tblModel.getValueAt(tblData.getSelectedRow(), 2).toString();
        
        tf_isbn.setText(tblTitle);
        tf_author.setText(tblAuthor);
        tf_isbn.setText(tblISBN);
    }//GEN-LAST:event_tblDataMouseClicked

    private void tf_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_isbnActionPerformed
        // TODO add your handling code here:
    }                      
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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //ArrayList<Book> books = new ArrayList<Book>();
        //books.add(e);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBooks(currentAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel close;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField tf_author;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JTextField tf_title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
