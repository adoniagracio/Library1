/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author adoni
 */
public class Log_Form extends javax.swing.JFrame {
    private static db<Account> accountdb = new db<Account>("accountdb");
    /**
     * Creates new form Log_Form
     */
    
    public Log_Form() {
        if(new File("src/accountdb.bin").exists())
            accountdb.Load();
        else{
            accountdb.add(new Admin("admin", "Password"));
            accountdb.add(new Admin("nama", "Password"));
            accountdb.Save();
        }
        System.out.println(accountdb.getSize());
        initComponents();
        this.hidepass.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        SignInButton = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        showpass = new javax.swing.JLabel();
        hidepass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(74, 31, 61));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_library_building_96px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LIBRARY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(214, 229, 229));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(214, 229, 229));
        username.setText("Username");
        username.setBorder(null);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 111, 199, 24));

        password.setBackground(new java.awt.Color(214, 229, 229));
        password.setText("Password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 159, 199, 27));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 141, 199, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 192, 199, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 111, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lock.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 162, -1, -1));

        jPanel4.setBackground(new java.awt.Color(187, 210, 211));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(88, 32));
        jPanel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                jPanel4AncestorRemoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        SignInButton.setText("Sign In");
        SignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(SignInButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignInButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        SignUpButton.setBackground(new java.awt.Color(187, 210, 211));
        SignUpButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SignUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Sign Up");

        javax.swing.GroupLayout SignUpButtonLayout = new javax.swing.GroupLayout(SignUpButton);
        SignUpButton.setLayout(SignUpButtonLayout);
        SignUpButtonLayout.setHorizontalGroup(
            SignUpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        SignUpButtonLayout.setVerticalGroup(
            SignUpButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel5.setText("Forget Password?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel8.setText("LOGIN");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 43, 95, -1));

        showpass.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoni\\OneDrive\\Dokumen\\NetBeansProjects\\Library1\\src\\icon\\icons8_eye_24px.png")); // NOI18N
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        jPanel3.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        hidepass.setIcon(new javax.swing.ImageIcon("C:\\Users\\adoni\\OneDrive\\Dokumen\\NetBeansProjects\\Library1\\src\\icon\\icons8_invisible_24px.png")); // NOI18N
        hidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidepassMouseClicked(evt);
            }
        });
        jPanel3.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4AncestorAdded

    private void jPanel4AncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel4AncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4AncestorRemoved

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked
    private void login(){
        if((username.getText().isEmpty())||(username.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"Username or Password cannot be empty!", "Warning", 2);
            return;
        }
        for(Account i : accountdb.getList()){
            if(i.check(username.getText(), password.getText())){
                System.out.println("isAdmin() = " + i.isAdmin());
                if(i.isAdmin()){
                    Dashboard Dashboard = new Dashboard(i);
                    Dashboard.setVisible(true);
                    Dashboard.pack();
                    Dashboard.setLocationRelativeTo(null); 
                }
                else{
                    USERSearchBook dsh = new USERSearchBook(i);
                    dsh.setVisible(true);
                    dsh.pack();
                    dsh.setLocationRelativeTo(null); 

                }
                this.dispose();
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Incorrect", "Warning", 2);
        return;
    }
    private void SignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInButtonMouseClicked
        // TODO add your handling code here:
        login();
//        if (acc != null )

    }//GEN-LAST:event_SignInButtonMouseClicked

    private void SignUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpButtonMouseClicked
        // TODO add your handling code here:
        SignUP_Form rgf = new SignUP_Form();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_SignUpButtonMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Reset_pass rgf = new Reset_pass();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(username.getText().equals("Username")){
            username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("Password")){
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(username.getText().equals("")){
            username.setText("Username");
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().equals("")){
            password.setText("Password");
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_usernameKeyPressed

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        this.hidepass.setVisible(true);
        this.showpass.setVisible(false);
        password.setEchoChar((char)0);
    }//GEN-LAST:event_showpassMouseClicked

    private void hidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidepassMouseClicked
        this.showpass.setVisible(true);
        this.hidepass.setVisible(false);
        password.setEchoChar('*');
    }//GEN-LAST:event_hidepassMouseClicked

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
            java.util.logging.Logger.getLogger(Log_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        //</editor-fold>
        
//        accountdb.add(new User("account1", "pass123"));
        
        // accountdb.add(new User("2501", "pass", "nama", "Email"));
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignInButton;
    private javax.swing.JPanel SignUpButton;
    private javax.swing.JLabel hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel showpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
