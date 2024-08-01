
package LibrarySystemForms;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class IssuedReturnList extends LibConnect {

    public IssuedReturnList() {
        initComponents();
        DoConnectReturnBooks();
        
        BookreturnDisplay();        
        
        TransparentIssue.setBackground(new Color(236, 240, 241, 90));
       
   // LIST FOR RETURN BOOKS
    }public ArrayList<ReturnBooklist> listreturn(){
        ArrayList<ReturnBooklist> listreturn = new ArrayList<>();
        try{
            selectbooks = "SELECT * FROM RETURN_BOOKS"; 
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectbooks);

            ReturnBooklist returnbooks;
            while(rs.next()) {
                returnbooks = new ReturnBooklist(rs.getInt("IDNO"), rs.getInt("BOOKID"), rs.getString("BORROWEDDATE"), 
                rs.getString("DUEDATE"), rs.getString("RETURNDATE"));
                listreturn.add(returnbooks);
            }
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
    }return listreturn;
    
    
    // RETURN BOOKS TABLE DISPLAY
    } public void BookreturnDisplay(){
       ArrayList<ReturnBooklist> list = listreturn();
       model = (DefaultTableModel)ReturnBookList.getModel();
       Object[] row = new Object[5];
       for(int ctr = 0; ctr < list.size(); ctr++){
           row[0] = list.get(ctr).getUserID();
           row[1] = list.get(ctr).getBookID();
           row[2] = list.get(ctr).getBorrowedDate();
           row[3] = list.get(ctr).getReturnDate();
           row[4] = list.get(ctr).getDateToday();
           
           model.addRow(row); {
           
       }
       }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        LibrarySystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LibrarySystemPU").createEntityManager();
        bookIssueQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM BookIssue b");
        bookIssueList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : bookIssueQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        IssueRerunListBack = new javax.swing.JButton();
        TransparentIssue = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminBorrowersList = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReturnBookList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISSUED AND RETURN LIST");

        jPanel1.setBackground(new java.awt.Color(109, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IssueRerunListBack.setBackground(new java.awt.Color(240, 231, 218));
        IssueRerunListBack.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        IssueRerunListBack.setForeground(new java.awt.Color(109, 25, 25));
        IssueRerunListBack.setText("Back");
        IssueRerunListBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueRerunListBackActionPerformed(evt);
            }
        });
        jPanel1.add(IssueRerunListBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 140, -1));

        TransparentIssue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bookIssueList, AdminBorrowersList);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idno}"));
        columnBinding.setColumnName("USER ID NO");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookid}"));
        columnBinding.setColumnName("BOOK ID");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${borroweddate}"));
        columnBinding.setColumnName("BORROWED DATE");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${returndate}"));
        columnBinding.setColumnName("RETURN DATE");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(AdminBorrowersList);

        ReturnBookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID NO", "BOOOK ID", "BORROWED DATE", "DUE DATE", "RETURN DATE"
            }
        ));
        jScrollPane2.setViewportView(ReturnBookList);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("RETURN LIST");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("ISSUED LIST");

        javax.swing.GroupLayout TransparentIssueLayout = new javax.swing.GroupLayout(TransparentIssue);
        TransparentIssue.setLayout(TransparentIssueLayout);
        TransparentIssueLayout.setHorizontalGroup(
            TransparentIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentIssueLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(TransparentIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentIssueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TransparentIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentIssueLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentIssueLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(283, 283, 283))))
        );
        TransparentIssueLayout.setVerticalGroup(
            TransparentIssueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentIssueLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(TransparentIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 720, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IssueRerunListBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueRerunListBackActionPerformed
        AdminSys adsys = new AdminSys();
        adsys.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IssueRerunListBackActionPerformed

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
            java.util.logging.Logger.getLogger(IssuedReturnList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssuedReturnList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssuedReturnList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssuedReturnList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssuedReturnList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdminBorrowersList;
    private javax.swing.JButton IssueRerunListBack;
    private javax.persistence.EntityManager LibrarySystemPUEntityManager;
    private javax.swing.JTable ReturnBookList;
    private javax.swing.JPanel TransparentIssue;
    private java.util.List<LibrarySystemForms.BookIssue> bookIssueList;
    private javax.persistence.Query bookIssueQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
