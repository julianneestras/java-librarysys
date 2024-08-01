package LibrarySystemForms;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class LoginFormNew extends LibConnect {

    public LoginFormNew() {
        initComponents();
        DoConnectUsers();
        TransparentLogin.setBackground(new Color(236, 240, 241, 110));
        showpass.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homepagefooter = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        LoginBG = new javax.swing.JPanel();
        HomePageFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomePageHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LibraryName1 = new javax.swing.JLabel();
        LibraryName3 = new javax.swing.JLabel();
        TransparentLogin = new javax.swing.JPanel();
        showpass = new javax.swing.JCheckBox();
        UserID = new javax.swing.JLabel();
        LibraryLoginDesign = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        enterUserID = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        LoginIcon = new javax.swing.JLabel();
        signin = new javax.swing.JButton();
        enterPass = new javax.swing.JPasswordField();
        UserType = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        LineSeparator = new javax.swing.JSeparator();
        FAQ = new javax.swing.JButton();
        registerlogin = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        homelogin = new javax.swing.JButton();
        LogInWallpaper = new javax.swing.JLabel();

        homepagefooter.setBackground(new java.awt.Color(109, 25, 25));

        javax.swing.GroupLayout homepagefooterLayout = new javax.swing.GroupLayout(homepagefooter);
        homepagefooter.setLayout(homepagefooterLayout);
        homepagefooterLayout.setHorizontalGroup(
            homepagefooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        homepagefooterLayout.setVerticalGroup(
            homepagefooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        LoginBG.setBackground(new java.awt.Color(212, 200, 190));
        LoginBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePageFooter.setBackground(new java.awt.Color(109, 25, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 200, 190));
        jLabel1.setText("Contact us: +63 45 200 6901 | lspacelib@gmail.com");

        javax.swing.GroupLayout HomePageFooterLayout = new javax.swing.GroupLayout(HomePageFooter);
        HomePageFooter.setLayout(HomePageFooterLayout);
        HomePageFooterLayout.setHorizontalGroup(
            HomePageFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageFooterLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        HomePageFooterLayout.setVerticalGroup(
            HomePageFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        LoginBG.add(HomePageFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 660, 30));

        HomePageHeader.setBackground(new java.awt.Color(109, 25, 25));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N

        LibraryName1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        LibraryName1.setForeground(new java.awt.Color(240, 231, 218));
        LibraryName1.setText("LEARNING SPACE  ");

        LibraryName3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        LibraryName3.setForeground(new java.awt.Color(240, 231, 218));
        LibraryName3.setText("INTEGRATED LIBRARY SYSTEM");

        javax.swing.GroupLayout HomePageHeaderLayout = new javax.swing.GroupLayout(HomePageHeader);
        HomePageHeader.setLayout(HomePageHeaderLayout);
        HomePageHeaderLayout.setHorizontalGroup(
            HomePageHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageHeaderLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Logo)
                .addContainerGap(577, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HomePageHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LibraryName3)
                    .addGroup(HomePageHeaderLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(LibraryName1)))
                .addGap(113, 113, 113))
            .addGroup(HomePageHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomePageHeaderLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(465, Short.MAX_VALUE)))
        );
        HomePageHeaderLayout.setVerticalGroup(
            HomePageHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(LibraryName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LibraryName3)
                .addContainerGap())
            .addGroup(HomePageHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageHeaderLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        LoginBG.add(HomePageHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 83));

        TransparentLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 231, 218), 2));
        TransparentLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showpass.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        showpass.setText("show password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        TransparentLogin.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        UserID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        UserID.setForeground(new java.awt.Color(18, 14, 14));
        UserID.setText("User ID");
        TransparentLogin.add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 50, 30));

        LibraryLoginDesign.setBackground(new java.awt.Color(212, 200, 190));
        LibraryLoginDesign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 231, 218), 2, true));
        LibraryLoginDesign.setForeground(new java.awt.Color(174, 178, 195));

        jLabel3.setBackground(new java.awt.Color(109, 25, 25));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 25, 25));
        jLabel3.setText("LIBRARY LOGIN");

        javax.swing.GroupLayout LibraryLoginDesignLayout = new javax.swing.GroupLayout(LibraryLoginDesign);
        LibraryLoginDesign.setLayout(LibraryLoginDesignLayout);
        LibraryLoginDesignLayout.setHorizontalGroup(
            LibraryLoginDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibraryLoginDesignLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        LibraryLoginDesignLayout.setVerticalGroup(
            LibraryLoginDesignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        TransparentLogin.add(LibraryLoginDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 310, -1));

        enterUserID.setForeground(new java.awt.Color(153, 153, 153));
        enterUserID.setText("Enter User ID");
        enterUserID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterUserIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enterUserIDFocusLost(evt);
            }
        });
        TransparentLogin.add(enterUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 128, 32));

        Password.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(18, 14, 14));
        Password.setText("Password");
        TransparentLogin.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 70, 30));

        LoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/loginIcon (2).png"))); // NOI18N
        LoginIcon.setText("jLabel1");
        TransparentLogin.add(LoginIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 200));

        signin.setBackground(new java.awt.Color(109, 25, 25));
        signin.setForeground(new java.awt.Color(212, 200, 190));
        signin.setText("SIGN IN");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        TransparentLogin.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 80, -1));
        TransparentLogin.add(enterPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 130, 30));

        UserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Librarian Admin", "Student", "Faculty Member" }));
        UserType.setPreferredSize(new java.awt.Dimension(120, 22));
        TransparentLogin.add(UserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        LoginBG.add(TransparentLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 440, 260));

        jPanel1.setBackground(new java.awt.Color(109, 25, 25));

        LineSeparator.setBackground(new java.awt.Color(212, 200, 190));
        LineSeparator.setForeground(new java.awt.Color(212, 200, 190));
        LineSeparator.setToolTipText("");

        FAQ.setBackground(new java.awt.Color(212, 200, 190));
        FAQ.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        FAQ.setForeground(new java.awt.Color(109, 25, 25));
        FAQ.setText("FAQ");
        FAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQActionPerformed(evt);
            }
        });

        registerlogin.setBackground(new java.awt.Color(212, 200, 190));
        registerlogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        registerlogin.setForeground(new java.awt.Color(109, 25, 25));
        registerlogin.setText("REGISTER");
        registerlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerloginActionPerformed(evt);
            }
        });

        aboutus.setBackground(new java.awt.Color(212, 200, 190));
        aboutus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        aboutus.setForeground(new java.awt.Color(109, 25, 25));
        aboutus.setText("ABOUT US");
        aboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusActionPerformed(evt);
            }
        });

        homelogin.setBackground(new java.awt.Color(212, 200, 190));
        homelogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        homelogin.setForeground(new java.awt.Color(109, 25, 25));
        homelogin.setText("HOME");
        homelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LineSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(registerlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homelogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aboutus)
                .addGap(18, 18, 18)
                .addComponent(FAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LineSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FAQ)
                    .addComponent(registerlogin)
                    .addComponent(aboutus)
                    .addComponent(homelogin)))
        );

        LoginBG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 90));

        LogInWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/loginwallpaper (3).jpg"))); // NOI18N
        LoginBG.add(LogInWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 660, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBG, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterUserIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterUserIDFocusGained
        if (enterUserID.getText().equals("Enter User ID")) {
            enterUserID.setText("");
            enterUserID.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_enterUserIDFocusGained

    private void enterUserIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterUserIDFocusLost
         if (enterUserID.getText().equals("")) {
            enterUserID.setText("Enter User ID");
            enterUserID.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_enterUserIDFocusLost

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        if(showpass.isSelected()){
            enterPass.setEchoChar((char)0);
        }else{
            enterPass.setEchoChar('*');
        }
        showpass.setFocusable(false);
        
    }//GEN-LAST:event_showpassActionPerformed

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        user = enterUserID.getText();
        newID = Integer.parseInt(user);
        newUSERTYPE = String.valueOf(UserType.getSelectedItem());
        newPASS = String.valueOf(enterPass.getPassword());
        
        try{
            rs = stmt.executeQuery("SELECT * FROM USERS");
            while(rs.next()) {
                id = rs.getInt("IDNO");
                pass = rs.getString("PASSWORD");
                fn = rs.getString("FIRSTNAME");
                memtyp = rs.getString("MEMBERTYPE");
                
                if(newID == id) {
                    if(newPASS.equals(pass)) {
                        if(newUSERTYPE.equals(memtyp)){
                            temp_user = newID;
                            temp_pass = newPASS;
                            temp_usertype = newUSERTYPE;
                                        
                            con.commit();
                            
                        if(newUSERTYPE.equals("Librarian Admin")){
                            new AdminSys().setVisible(true);
                            LoginFormNew.this.dispose();
                            rs.close();
                        }else if(newUSERTYPE.equals("Student")){
                            new StudentSys().setVisible(true);
                            LoginFormNew.this.dispose();
                            rs.close();
                        }else{
                            new FacultySys().setVisible(true);
                            LoginFormNew.this.dispose();
                            rs.close();
                        }
                        }
                    }
                }
            }
            if(newID != temp_user) {
                if(newPASS != temp_pass) {
                    if(newUSERTYPE != temp_usertype) {
                        JOptionPane.showMessageDialog(null, "Incorrect username, password or user type!");
                        enterUserID.setText(null);
                        enterPass.setText(null);
                    }
                }
            }
        }catch(SQLException e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_signinActionPerformed

    private void registerloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerloginActionPerformed
        StudentRegistrationForm regform = new StudentRegistrationForm();
        regform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerloginActionPerformed

    private void homeloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeloginActionPerformed
        JOptionPane.showMessageDialog(null, "You are already in Home/Login page!", "Information",  JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_homeloginActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        AboutUsNew aboutus = new AboutUsNew();
        aboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutusActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        FAQs faq = new FAQs();
        faq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FAQActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFormNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFormNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FAQ;
    private javax.swing.JPanel HomePageFooter;
    private javax.swing.JPanel HomePageHeader;
    private javax.swing.JPanel LibraryLoginDesign;
    private javax.swing.JLabel LibraryName1;
    private javax.swing.JLabel LibraryName3;
    private javax.swing.JSeparator LineSeparator;
    private javax.swing.JLabel LogInWallpaper;
    private javax.swing.JPanel LoginBG;
    private javax.swing.JLabel LoginIcon;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Password;
    private javax.swing.JPanel TransparentLogin;
    private javax.swing.JLabel UserID;
    private javax.swing.JComboBox<String> UserType;
    private javax.swing.JButton aboutus;
    private javax.swing.JPasswordField enterPass;
    private javax.swing.JTextField enterUserID;
    private javax.swing.JButton homelogin;
    private javax.swing.JPanel homepagefooter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton registerlogin;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JButton signin;
    // End of variables declaration//GEN-END:variables
}
