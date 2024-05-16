package nerdzsocialasocials;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ayşe Elif Çelik
 */
public class SignUpPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
    public SignUpPage() {
        initComponents();
    }

    public void Insert() throws SQLException {
        Connection connect = null;
        DbHelper db = new DbHelper();
        PreparedStatement statement = null;
        
        try {
            connect = db.getConnection();
            String sql = "insert into first_app.userdata (id_user,user_name,password)" + "values(?,?,?)";
            statement = connect.prepareStatement(sql);
            statement.setString(1, null);
            statement.setString(2, tf_username.getText());
            statement.setString(3, pf_password.getText());
            if(pf_password.getText().equals(pf_password1.getText())){
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "You're a member now.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Passwords are not the same, check them.");
            }
        } catch (SQLException exception) {
            db.showError(exception);
        } finally {
            statement.close();
            connect.close();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        password1 = new javax.swing.JLabel();
        pf_password1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NERDz - Sign Up Page");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/Koa.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NERDz");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setOpaque(true);

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        login.setForeground(new java.awt.Color(204, 204, 255));
        login.setText("Sign Up");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 255), new java.awt.Color(255, 204, 255), new java.awt.Color(102, 0, 102), new java.awt.Color(153, 0, 153)));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        pf_password.setForeground(new java.awt.Color(204, 204, 204));
        pf_password.setText("passwordxxxx");
        pf_password.setToolTipText("");
        pf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_passwordFocusLost(evt);
            }
        });
        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pf_passwordKeyTyped(evt);
            }
        });

        username.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        username.setText("Username");

        password.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        password.setText("Password");
        password.setMaximumSize(new java.awt.Dimension(57, 17));
        password.setMinimumSize(new java.awt.Dimension(57, 17));

        tf_username.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        tf_username.setForeground(new java.awt.Color(204, 204, 204));
        tf_username.setText("Username");
        tf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_usernameFocusLost(evt);
            }
        });
        tf_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_usernameKeyTyped(evt);
            }
        });

        password1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        password1.setText("Password Again");
        password1.setMaximumSize(new java.awt.Dimension(57, 17));
        password1.setMinimumSize(new java.awt.Dimension(57, 17));

        pf_password1.setForeground(new java.awt.Color(204, 204, 204));
        pf_password1.setText("passwordxxxx");
        pf_password1.setToolTipText("");
        pf_password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pf_password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pf_password1FocusLost(evt);
            }
        });
        pf_password1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pf_password1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(login)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void pf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passwordFocusGained
        if(pf_password.getText().equals("passwordxxxx")){
            pf_password.setText("");
        }
    }//GEN-LAST:event_pf_passwordFocusGained

    private void pf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_passwordFocusLost
        if(pf_password.getText().equals("")){
            pf_password.setText("passwordxxxx");
        }
    }//GEN-LAST:event_pf_passwordFocusLost

    private void pf_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyTyped
        pf_password.setForeground(Color.BLACK);
    }//GEN-LAST:event_pf_passwordKeyTyped

    private void tf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusGained
        if(tf_username.getText().equals("Username")){
            tf_username.setText("");
        }
    }//GEN-LAST:event_tf_usernameFocusGained

    private void tf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusLost
        if(tf_username.getText().equals("")){
            tf_username.setText("Username");
        }
    }//GEN-LAST:event_tf_usernameFocusLost

    private void tf_usernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyTyped
        tf_username.setForeground(Color.BLACK);
    }//GEN-LAST:event_tf_usernameKeyTyped

    private void pf_password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_password1FocusGained
        if(pf_password1.getText().equals("passwordxxxx")){
            pf_password1.setText("");
        }
    }//GEN-LAST:event_pf_password1FocusGained

    private void pf_password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pf_password1FocusLost
        if(pf_password1.getText().equals("")){
            pf_password1.setText("passwordxxxx");
        }
    }//GEN-LAST:event_pf_password1FocusLost

    private void pf_password1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_password1KeyTyped
        pf_password1.setForeground(Color.BLACK);
    }//GEN-LAST:event_pf_password1KeyTyped

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try {
            Insert();
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_password1;
    private javax.swing.JTextField tf_username;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

}
