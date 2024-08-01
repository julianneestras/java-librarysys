
package LibrarySystemForms;

import java.awt.Color;
import javax.swing.JOptionPane;

public class FeedbackFormFaculty extends LibConnect {

    public FeedbackFormFaculty() {
        initComponents();
        
        TransparentFdbck.setBackground(new Color(236, 240, 241, 45));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGFdbck = new javax.swing.JPanel();
        RegHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FdbackFac = new javax.swing.JTextArea();
        TransparentFdbck = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SubmitFdbck = new javax.swing.JButton();
        CancelFdbck = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BorrowBooksStud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FEEDBACK FORM");

        BGFdbck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegHeader.setBackground(new java.awt.Color(109, 25, 25));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("FEEDBACK FORM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        javax.swing.GroupLayout RegHeaderLayout = new javax.swing.GroupLayout(RegHeader);
        RegHeader.setLayout(RegHeaderLayout);
        RegHeaderLayout.setHorizontalGroup(
            RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegHeaderLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        RegHeaderLayout.setVerticalGroup(
            RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegHeaderLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        BGFdbck.add(RegHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 70));

        FdbackFac.setBackground(new java.awt.Color(240, 231, 218));
        FdbackFac.setColumns(20);
        FdbackFac.setRows(5);
        jScrollPane1.setViewportView(FdbackFac);

        BGFdbck.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 440, 70));

        jLabel4.setBackground(new java.awt.Color(240, 231, 218));
        jLabel4.setForeground(new java.awt.Color(240, 231, 218));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Because your feedback is meaningful to us, we  would be glad to hear it from you!");

        SubmitFdbck.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SubmitFdbck.setText("Submit");
        SubmitFdbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitFdbckActionPerformed(evt);
            }
        });

        CancelFdbck.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CancelFdbck.setText("Cancel");
        CancelFdbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelFdbckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransparentFdbckLayout = new javax.swing.GroupLayout(TransparentFdbck);
        TransparentFdbck.setLayout(TransparentFdbckLayout);
        TransparentFdbckLayout.setHorizontalGroup(
            TransparentFdbckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentFdbckLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TransparentFdbckLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(SubmitFdbck)
                .addGap(32, 32, 32)
                .addComponent(CancelFdbck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TransparentFdbckLayout.setVerticalGroup(
            TransparentFdbckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentFdbckLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(TransparentFdbckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitFdbck)
                    .addComponent(CancelFdbck))
                .addContainerGap())
        );

        BGFdbck.add(TransparentFdbck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 500, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/feedback.jpg"))); // NOI18N
        BGFdbck.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 280));

        BorrowBooksStud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BorrowBooksStud.setForeground(new java.awt.Color(240, 231, 218));
        BorrowBooksStud.setText(">> Borrow Books");
        BGFdbck.add(BorrowBooksStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGFdbck, javax.swing.GroupLayout.PREFERRED_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGFdbck, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitFdbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitFdbckActionPerformed
        FdbackFac.setText(null);        
        JOptionPane.showMessageDialog(null, "Thank you for your feedback!", "Feedback Submitted",  JOptionPane.INFORMATION_MESSAGE);
                FacultySys fac = new FacultySys();
            fac.setVisible(true);
            this.dispose();    
    }//GEN-LAST:event_SubmitFdbckActionPerformed

    private void CancelFdbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelFdbckActionPerformed

            FacultySys fac = new FacultySys();
            fac.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_CancelFdbckActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackFormFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackFormFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackFormFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackFormFaculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackFormFaculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGFdbck;
    private javax.swing.JLabel BorrowBooksStud;
    private javax.swing.JButton CancelFdbck;
    private javax.swing.JTextArea FdbackFac;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel RegHeader;
    private javax.swing.JButton SubmitFdbck;
    private javax.swing.JPanel TransparentFdbck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
