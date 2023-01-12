/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class IssueBooks extends javax.swing.JFrame {

    /**
     * Creates new form ManageBooks
     */
    private static db<Account> accountdb = new db<Account>("accountdb");
    private static db<Book> bookdb = new db<Book>("bookdb");
    private static int bookindex = -1; 
    private static int accountindex = -1; 
    private static Account currentAccount;
    public IssueBooks(Account acc) {
        currentAccount = acc;
        initComponents();
    }

    private static int searchISBN(String input){
        bookdb.Load();
        for (int i = 0; i < bookdb.getSize(); i++) {
            if (bookdb.getIndex(i).getISBN().equals(input)) {
                return i;
            }
        }
        return -1;
    }
    private static int searchUser(String user) {
        accountdb.Load();
        for (int i=0; i<accountdb.getSize(); i++) {
            System.out.println("Check " + accountdb.getIndex(i).getName() + " and " + user);
            if (accountdb.getIndex(i).getName().equals(user)) {
                return i;
            }
        }
        return -1;
    }

        //     String str;
    //     try {
    //         // BufferedReader br = new BufferedReader(new FileReader(f + "\\books.txt"));
    //         // Object[] tblLines = br.lines().toArray();
    //         for(int i = 0; i < tblLines.length; i++){
    //             String line = tblLines[i].toString().trim();
    //             String[] arr = line.split("/");

    //             title = arr[0];
    //             author = arr[1];
    //             isbn = arr[2];
    //         }
            
    //         while((str = br.readLine()) != null){
    //             if(str.contains(isbn)){
    //                 JOptionPane.showMessageDialog(this, "Data successfully added.");
    //                 fill_title.setText(title);
    //                 fill_author.setText(author);
    //                 fill_isbn.setText(isbn);
    //             }
    //         }
    //     } catch (FileNotFoundException ex) {
    //         Logger.getLogger(IssueBooks.class.getName()).log(Level.SEVERE, null, ex);
    //     } catch (IOException ex) {
    //         Logger.getLogger(IssueBooks.class.getName()).log(Level.SEVERE, null, ex);
    //     }
        
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
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_isbn = new javax.swing.JTextField();
        tf_userID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_returnDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        IssueButton = new javax.swing.JButton();
        tf_issueDate = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        fill_email = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fill_name = new javax.swing.JLabel();
        fill_isbn = new javax.swing.JLabel();
        fill_title = new javax.swing.JLabel();
        fill_author = new javax.swing.JLabel();
        fill_userID = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(61, 25, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 40));

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

        jLabel18.setFont(new java.awt.Font("SF UI Display ExtBd", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Issue Books");

        jLabel10.setFont(new java.awt.Font("SF UI Display ExtBd", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Issue Books");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(jLabel18)
                    .addComponent(jLabel10)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(214, 229, 229));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel3.setText("ISBN");

        tf_isbn.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_isbn.setToolTipText("Enter ISBN");
        tf_isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_isbnFocusLost(evt);
            }
        });

        tf_userID.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_userID.setToolTipText("Enter user ID");
        tf_userID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_userIDFocusLost(evt);
            }
        });
        tf_userID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_userIDKeyPressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel5.setText("User ID");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel7.setText("Issue date");

        tf_returnDate.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        tf_returnDate.setToolTipText("Return date");
        tf_returnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_returnDateActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel9.setText("Return date");

        IssueButton.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        IssueButton.setText("Issue");
        IssueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueButtonActionPerformed(evt);
            }
        });

        tf_issueDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));
        tf_issueDate.setToolTipText("Enter issue date");
        tf_issueDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_issueDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_issueDateFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IssueButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tf_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(tf_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tf_returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_issueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IssueButton)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        tf_isbn.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBackground(new java.awt.Color(61, 25, 50));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("SF UI Display ExtBd", 1, 16)); // NOI18N
        jLabel4.setText("Book");

        jLabel11.setFont(new java.awt.Font("SF UI Display ExtBd", 1, 16)); // NOI18N
        jLabel11.setText("User");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel12.setText("Email: ");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel14.setText("Name:");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel17.setText("ISBN: ");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel19.setText("Title:");

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel20.setText("Author: ");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel21.setText("User ID: ");

        fill_email.setBackground(new java.awt.Color(0, 0, 0));
        fill_email.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 51, 0));

        fill_name.setBackground(new java.awt.Color(0, 0, 0));
        fill_name.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        fill_isbn.setBackground(new java.awt.Color(0, 0, 0));
        fill_isbn.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        fill_title.setBackground(new java.awt.Color(0, 0, 0));
        fill_title.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        fill_author.setBackground(new java.awt.Color(0, 0, 0));
        fill_author.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        fill_userID.setBackground(new java.awt.Color(0, 0, 0));
        fill_userID.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("SF UI Display", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(15, 15, 15)
                                .addComponent(fill_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(25, 25, 25)
                                .addComponent(fill_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(fill_email, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(fill_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(26, 26, 26)
                                .addComponent(fill_title, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fill_author, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(fill_userID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(fill_name, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(fill_email, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(fill_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(fill_title, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(fill_author, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        setSize(new java.awt.Dimension(768, 450));
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

    private void IssueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueButtonActionPerformed
        if(tf_isbn.getText().isEmpty() || tf_userID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "FILL");
        }
        else{
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            accountdb.getIndex(accountindex).BorrowBook(sdf.format(cal.getTime()), null);
        }
    }//GEN-LAST:event_IssueButtonActionPerformed

    private void tf_returnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_returnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_returnDateActionPerformed

    private void tf_isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_isbnFocusLost
        String ISBN = tf_isbn.getText();
        if(!ISBN.isEmpty()){
            bookindex = searchISBN(ISBN);
            if(bookindex == -1){
                JOptionPane.showMessageDialog(this, "Book Not Found!");
            }
            else{
                fill_isbn.setText(bookdb.getIndex(bookindex).getISBN());
                fill_title.setText(bookdb.getIndex(bookindex).getTitle());
                fill_author.setText(bookdb.getIndex(bookindex).getAuthor());
            }
        }
    }//GEN-LAST:event_tf_isbnFocusLost

    // private void tf_issueDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_issueDateFocusLost
    //     //kalo diklik yg lain, jd ilang
    //     Calendar cal = Calendar.getInstance();
    //     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //     if(tf_issueDate.getText().isEmpty())
    //     tf_issueDate.setText(sdf.format(cal.getTime()));
    //     else{
    //         String issueDate = tf_issueDate.getText();
    //         try{
    //             cal.setTime(sdf.parse(issueDate));
    //         } catch(ParseException e){
    //             e.printStackTrace();
    //         }
    //     }
        
    //     cal.add(Calendar.DAY_OF_MONTH, 14);
    //     String returnBook = sdf.format(cal.getTime());
    //     tf_returnDate.setText(returnBook);
    // }//GEN-LAST:event_tf_issueDateFocusLost

    private void tf_issueDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_issueDateFocusGained
        //kalo diklik yg lain, jd ilang
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if(tf_issueDate.getText().isEmpty())
        tf_issueDate.setText(sdf.format(cal.getTime()));
        else{
            String issueDate = tf_issueDate.getText();
            try{
                cal.setTime(sdf.parse(issueDate));
            } catch(ParseException e){
                e.printStackTrace();
            }
        }
        
        cal.add(Calendar.DAY_OF_MONTH, 14);
        String returnBook = sdf.format(cal.getTime());
        tf_returnDate.setText(returnBook);
    }//GEN-LAST:event_tf_issueDateFocusGained

    private void tf_userIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_userIDFocusLost
        String UserID = tf_userID.getText();
        if(!UserID.isEmpty()){
            accountindex = searchUser(UserID);
            if(accountindex == -1){
                JOptionPane.showMessageDialog(this, "User Not Found!");
            }
            else{
                fill_userID.setText(accountdb.getIndex(accountindex).getName());
                fill_name.setText(accountdb.getIndex(accountindex).getNick());
                fill_email.setText(accountdb.getIndex(accountindex).getEmail());
            }
        }
    }//GEN-LAST:event_tf_userIDFocusLost

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
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        ArrayList<Book> books = new ArrayList<Book>();
        //books.add(e);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBooks(currentAccount).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IssueButton;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel fill_author;
    private javax.swing.JLabel fill_email;
    private javax.swing.JLabel fill_isbn;
    private javax.swing.JLabel fill_name;
    private javax.swing.JLabel fill_title;
    private javax.swing.JLabel fill_userID;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tf_isbn;
    private javax.swing.JFormattedTextField tf_issueDate;
    private javax.swing.JTextField tf_returnDate;
    private javax.swing.JTextField tf_userID;
    // End of variables declaration//GEN-END:variables
}
