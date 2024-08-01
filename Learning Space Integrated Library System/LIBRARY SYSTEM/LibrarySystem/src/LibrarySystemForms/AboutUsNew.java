
package LibrarySystemForms;
import java.awt.*;
import javax.swing.*;

public class AboutUsNew extends javax.swing.JFrame {

    public AboutUsNew() {
        initComponents();
        AboutUsTransparent.setBackground(new Color(236, 240, 241, 200));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginBG = new javax.swing.JPanel();
        HomePageHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LibraryName1 = new javax.swing.JLabel();
        LibraryName3 = new javax.swing.JLabel();
        HomePageFooter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AboutUsTransparent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LineSeparator = new javax.swing.JSeparator();
        FAQ = new javax.swing.JButton();
        registerlogin = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        homelogin = new javax.swing.JButton();
        LogInWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABOUT US ");

        LoginBG.setBackground(new java.awt.Color(212, 200, 190));
        LoginBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        AboutUsTransparent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AboutUsTransparent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(109, 25, 25));
        jLabel4.setText("efficiently among other things. ");
        AboutUsTransparent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 25, 25));
        jLabel5.setText("Hit the button and join us today for an exciting and effortless reading experience!");
        AboutUsTransparent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 490, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 25, 25));
        jLabel6.setText("promotes intellectual growth and facilitates access to information and resources");
        AboutUsTransparent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 480, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 25, 25));
        jLabel7.setText(" The Learning Space Integrated Library System is an online library-friendly system that  ");
        AboutUsTransparent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 530, -1));

        LoginBG.add(AboutUsTransparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 660, 190));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(109, 25, 25));
        jLabel3.setText("OUR LIBRARY");
        LoginBG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

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
        LoginBG.add(LogInWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 660, -1));

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

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
        FAQs faq = new FAQs();
        faq.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FAQActionPerformed

    private void registerloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerloginActionPerformed
        StudentRegistrationForm regform = new StudentRegistrationForm();
        regform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerloginActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
         JOptionPane.showMessageDialog(null, "You are already in About Us page!", "Information",  JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutusActionPerformed

    private void homeloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeloginActionPerformed
        LoginFormNew login = new LoginFormNew();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeloginActionPerformed

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
            java.util.logging.Logger.getLogger(AboutUsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUsNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutUsTransparent;
    private javax.swing.JButton FAQ;
    private javax.swing.JPanel HomePageFooter;
    private javax.swing.JPanel HomePageHeader;
    private javax.swing.JLabel LibraryName1;
    private javax.swing.JLabel LibraryName3;
    private javax.swing.JSeparator LineSeparator;
    private javax.swing.JLabel LogInWallpaper;
    private javax.swing.JPanel LoginBG;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton aboutus;
    private javax.swing.JButton homelogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerlogin;
    // End of variables declaration//GEN-END:variables
}
