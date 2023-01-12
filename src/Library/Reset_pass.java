/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author adoni
 */
public class Reset_pass extends javax.swing.JFrame {
    int randomCode;
    /**
     * Creates new form Reset_pass
     */
    public Reset_pass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        VerifButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Email_user = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Code_ver = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        SendButton3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(214, 229, 229));

        jLabel3.setText("Email");
        jLabel3.setToolTipText("");

        VerifButton.setBackground(new java.awt.Color(187, 210, 211));
        VerifButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        VerifButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerifButtonMouseClicked(evt);
            }
        });

        jLabel4.setText("Verif Code");

        javax.swing.GroupLayout VerifButtonLayout = new javax.swing.GroupLayout(VerifButton);
        VerifButton.setLayout(VerifButtonLayout);
        VerifButtonLayout.setHorizontalGroup(
            VerifButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerifButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VerifButtonLayout.setVerticalGroup(
            VerifButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerifButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel8.setText("Reset Password");

        jLabel7.setText("Verif Code");

        Email_user.setBackground(new java.awt.Color(214, 229, 229));
        Email_user.setText("Email");
        Email_user.setBorder(null);
        Email_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Email_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Email_userFocusLost(evt);
            }
        });
        Email_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_userActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        Code_ver.setBackground(new java.awt.Color(214, 229, 229));
        Code_ver.setText("Code");
        Code_ver.setBorder(null);
        Code_ver.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Code_verFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Code_verFocusLost(evt);
            }
        });
        Code_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Code_verActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setText(":");

        jLabel10.setText(":");

        Close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Close.setText("X");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });

        SendButton3.setBackground(new java.awt.Color(187, 210, 211));
        SendButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SendButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SendButton3MouseClicked(evt);
            }
        });

        jLabel11.setText("    Send");

        javax.swing.GroupLayout SendButton3Layout = new javax.swing.GroupLayout(SendButton3);
        SendButton3.setLayout(SendButton3Layout);
        SendButton3Layout.setHorizontalGroup(
            SendButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        SendButton3Layout.setVerticalGroup(
            SendButton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendButton3Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Close))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Code_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Email_user, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(SendButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel8)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VerifButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Close)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SendButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel9)
                        .addComponent(Email_user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(Code_ver, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(VerifButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        Log_Form rgf = new Log_Form();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void Code_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Code_verActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Code_verActionPerformed

    private void Email_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_userActionPerformed

    private void VerifButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerifButtonMouseClicked
        // TODO add your handling code here:
        if(Integer.valueOf(Code_ver.getText())==randomCode){
        Reset rs = new Reset(Email_user.getText());
        rs.pack();
        rs.setLocationRelativeTo(null);
        rs.setVisible(true);
        this.setVisible(false);
        }else{
        JOptionPane.showMessageDialog(null, "code do not match");
        }

    }//GEN-LAST:event_VerifButtonMouseClicked

    private void SendButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendButton3MouseClicked
    try{
        Random rand = new Random();
        randomCode=rand.nextInt(999999);
        final String user ="noreply.library1@gmail.com";
        final String pass="bnfsuydiiaabjvdn";
        String to = Email_user.getText();
        String subject="Reseting Code";
        String msg ="Your reset code is "+randomCode;
        Properties pros = System.getProperties();
        pros.setProperty("mail.transport.protocol", "smtp");     
        pros.setProperty("mail.host", "smtp.gmail.com");  
        pros.put("mail.smtp.auth", "true");  
        pros.put("mail.smtp.port", "465"); 
        pros.put("mail.debug", "true");
        pros.put("mail.smtp.socketFactory.port", "465");  
        pros.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
        pros.put("mail.smtp.socketFactory.fallback", "false");
        Session session = Session.getDefaultInstance(pros,new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(user,pass);  
        }  
    });
        Transport transport = session.getTransport();  
        InternetAddress addressFrom = new InternetAddress(user);  
        MimeMessage message = new MimeMessage(session);  
        message.setSender(addressFrom);  
        message.setSubject(subject);  
        message.setContent(msg, "text/plain");  
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));  
        transport.connect();  
        Transport.send(message);  
        transport.close();
        JOptionPane.showMessageDialog(null, "code has been send to the email");
        }catch(Exception ex){
        JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_SendButton3MouseClicked

    private void Email_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_userFocusGained
        // TODO add your handling code here:
        if(Email_user.getText().equals("Email")){
            Email_user.setText("");
        }
    }//GEN-LAST:event_Email_userFocusGained

    private void Email_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_userFocusLost
        // TODO add your handling code here:
        if(Email_user.getText().equals("")){
            Email_user.setText("Email");
        }
    }//GEN-LAST:event_Email_userFocusLost

    private void Code_verFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Code_verFocusGained
        // TODO add your handling code here:
        if(Code_ver.getText().equals("Code")){
            Code_ver.setText("");
        }
    }//GEN-LAST:event_Code_verFocusGained

    private void Code_verFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Code_verFocusLost
        // TODO add your handling code here:
        if(Code_ver.getText().equals("")){
            Code_ver.setText("Code");
        }
    }//GEN-LAST:event_Code_verFocusLost

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
            java.util.logging.Logger.getLogger(Reset_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reset_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reset_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reset_pass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reset_pass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField Code_ver;
    private javax.swing.JTextField Email_user;
    private javax.swing.JPanel SendButton3;
    private javax.swing.JPanel VerifButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
