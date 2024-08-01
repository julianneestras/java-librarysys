
package LibrarySystemForms;

import java.awt.Color;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class BorrowerList extends LibConnect {

    public BorrowerList() {
        initComponents();
        
        TransparentBorrowers.setBackground(new Color(236, 240, 241, 90));
        
        DoConnectBooks();
        DoConnectUsers();
        DoConnectIssueBooks();
        UpdateTable();
                     
    }
private void UpdateTable() {
        viewbooks = "SELECT BORROW_BOOKS.IDNO, BORROW_BOOKS.BOOKID, BORROW_BOOKS.CURRENTDATE, "
                + "BORROW_BOOKS.RETURNDATE FROM BORROW_BOOKS";
        try{
        pst = con.prepareStatement(viewbooks);
        rs = pst.executeQuery();
        AdminBorrowersList.setModel(DbUtils.resultSetToTableModel(rs));
        
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                rs.close();
                pst.close();
            }catch (Exception e){
                
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        LibrarySystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LibrarySystemPU").createEntityManager();
        borrowBooksQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM BorrowBooks b");
        borrowBooksList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : borrowBooksQuery.getResultList();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminBorrowersList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        TransparentBorrowers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BORROWERS LIST (ADMIN)");

        jPanel1.setBackground(new java.awt.Color(109, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, borrowBooksList, AdminBorrowersList);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(AdminBorrowersList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 76, 658, 270));

        jButton1.setBackground(new java.awt.Color(240, 231, 218));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(109, 25, 25));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 102, -1));

        TransparentBorrowers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("BORROWERS LIST");

        javax.swing.GroupLayout TransparentBorrowersLayout = new javax.swing.GroupLayout(TransparentBorrowers);
        TransparentBorrowers.setLayout(TransparentBorrowersLayout);
        TransparentBorrowersLayout.setHorizontalGroup(
            TransparentBorrowersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentBorrowersLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
        );
        TransparentBorrowersLayout.setVerticalGroup(
            TransparentBorrowersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentBorrowersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jPanel1.add(TransparentBorrowers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminSys adsys = new AdminSys();
        adsys.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowerList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowerList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdminBorrowersList;
    private javax.persistence.EntityManager LibrarySystemPUEntityManager;
    private javax.swing.JPanel TransparentBorrowers;
    private java.util.List<LibrarySystemForms.BorrowBooks> borrowBooksList;
    private javax.persistence.Query borrowBooksQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
