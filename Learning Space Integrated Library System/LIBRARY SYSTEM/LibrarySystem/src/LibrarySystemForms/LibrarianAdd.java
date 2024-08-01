
package LibrarySystemForms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class LibrarianAdd extends LibConnect {

    public LibrarianAdd() {
        initComponents();
        DoConnectUsers();
        
        this.eyepassclose.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGAddLibForm = new javax.swing.JPanel();
        AddLibHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        AddLibFooter = new javax.swing.JPanel();
        MainAddLibForm = new javax.swing.JPanel();
        eyepassopen = new javax.swing.JLabel();
        eyepassclose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddLibID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AddLibFN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AddLibMN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddLibMT = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddLibGen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        AddLibCourse = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        AddLibYrLvl = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        AddLibLN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AddLibEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        AddLibContact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        regcancel = new javax.swing.JButton();
        addlibsuccess = new javax.swing.JButton();
        AddLibBirthdate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        AddLibPass = new javax.swing.JTextField();
        AddLibCpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD LIBRARIAN");

        BGAddLibForm.setBackground(new java.awt.Color(212, 200, 190));

        AddLibHeader.setBackground(new java.awt.Color(109, 25, 25));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("REGISTRATION FORM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        javax.swing.GroupLayout AddLibHeaderLayout = new javax.swing.GroupLayout(AddLibHeader);
        AddLibHeader.setLayout(AddLibHeaderLayout);
        AddLibHeaderLayout.setHorizontalGroup(
            AddLibHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddLibHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddLibHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddLibHeaderLayout.setVerticalGroup(
            AddLibHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addGroup(AddLibHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddLibFooter.setBackground(new java.awt.Color(109, 25, 25));

        javax.swing.GroupLayout AddLibFooterLayout = new javax.swing.GroupLayout(AddLibFooter);
        AddLibFooter.setLayout(AddLibFooterLayout);
        AddLibFooterLayout.setHorizontalGroup(
            AddLibFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AddLibFooterLayout.setVerticalGroup(
            AddLibFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        MainAddLibForm.setBackground(new java.awt.Color(245, 246, 242));
        MainAddLibForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 108, 98)));
        MainAddLibForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eyepassopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/eyepassopen.png"))); // NOI18N
        eyepassopen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eyepassopenMousePressed(evt);
            }
        });
        MainAddLibForm.add(eyepassopen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 20));

        eyepassclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/eyepassclose.png"))); // NOI18N
        eyepassclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eyepasscloseMousePressed(evt);
            }
        });
        MainAddLibForm.add(eyepassclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("ID Number:");
        MainAddLibForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, -1, -1));

        AddLibID.setEnabled(false);
        MainAddLibForm.add(AddLibID, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 34, 213, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("First Name:");
        MainAddLibForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 67, -1, -1));
        MainAddLibForm.add(AddLibFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 66, 213, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setText("Middle Name:");
        MainAddLibForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 99, -1, -1));
        MainAddLibForm.add(AddLibMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 98, 213, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel6.setText("Member Type:");
        MainAddLibForm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 164, -1, -1));

        AddLibMT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Librarian Admin" }));
        MainAddLibForm.add(AddLibMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 162, 182, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel7.setText("Birthdate:");
        MainAddLibForm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 230, -1, 29));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setText("Gender:");
        MainAddLibForm.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 198, -1, -1));

        AddLibGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        MainAddLibForm.add(AddLibGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 196, 112, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel9.setText("Course:");
        MainAddLibForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 279, -1, -1));

        AddLibCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable" }));
        MainAddLibForm.add(AddLibCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 277, 112, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel10.setText("Year Level:");
        MainAddLibForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 279, -1, -1));

        AddLibYrLvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable" }));
        MainAddLibForm.add(AddLibYrLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 277, 112, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel11.setText("Last Name:");
        MainAddLibForm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 131, -1, -1));
        MainAddLibForm.add(AddLibLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 130, 213, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel12.setText("Email:");
        MainAddLibForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 312, -1, -1));
        MainAddLibForm.add(AddLibEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 311, 213, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setText("Contact Number:");
        MainAddLibForm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 344, -1, -1));
        MainAddLibForm.add(AddLibContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 343, 213, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel14.setText("Password:");
        MainAddLibForm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 376, -1, -1));

        regcancel.setBackground(new java.awt.Color(109, 25, 25));
        regcancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        regcancel.setForeground(new java.awt.Color(212, 200, 190));
        regcancel.setText("CANCEL");
        regcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcancelActionPerformed(evt);
            }
        });
        MainAddLibForm.add(regcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 101, -1));

        addlibsuccess.setBackground(new java.awt.Color(109, 25, 25));
        addlibsuccess.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addlibsuccess.setForeground(new java.awt.Color(212, 200, 190));
        addlibsuccess.setText("REGISTER");
        addlibsuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlibsuccessActionPerformed(evt);
            }
        });
        MainAddLibForm.add(addlibsuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 101, -1));

        AddLibBirthdate.setDateFormatString("MM/dd/yyyy");
        MainAddLibForm.add(AddLibBirthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 186, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel15.setText("Confirm Password:");
        MainAddLibForm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, -1));
        MainAddLibForm.add(AddLibPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 375, 213, -1));
        MainAddLibForm.add(AddLibCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 190, -1));

        javax.swing.GroupLayout BGAddLibFormLayout = new javax.swing.GroupLayout(BGAddLibForm);
        BGAddLibForm.setLayout(BGAddLibFormLayout);
        BGAddLibFormLayout.setHorizontalGroup(
            BGAddLibFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddLibHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddLibFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGAddLibFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MainAddLibForm, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        BGAddLibFormLayout.setVerticalGroup(
            BGAddLibFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGAddLibFormLayout.createSequentialGroup()
                .addComponent(AddLibHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainAddLibForm, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddLibFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGAddLibForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGAddLibForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eyepassopenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyepassopenMousePressed
        eyepassclose.setVisible(true);
        eyepassopen.setVisible(false);
        AddLibCpass.setEchoChar((char)0);
    }//GEN-LAST:event_eyepassopenMousePressed

    private void eyepasscloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyepasscloseMousePressed
        eyepassopen.setVisible(true);
        eyepassclose.setVisible(false);
        AddLibCpass.setEchoChar('*');
    }//GEN-LAST:event_eyepasscloseMousePressed

    private void regcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcancelActionPerformed
        LoginFormNew login = new LoginFormNew();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regcancelActionPerformed

    private void addlibsuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlibsuccessActionPerformed
       //AUTO GEN CODE INCREMENT
     try {
            rs = stmt.executeQuery("SELECT MAX(IDNO) FROM USERS");
            if(rs.next()) {
                lastid = rs.getInt(1);
                lastid++;
                AddLibID.setText(Integer.toString(lastid));   
                
            }else{
                AddLibID.setText("1001");
            }
                
        //LIBRARIAN INFO KUKUHA DETAILS/INPUT    
        lastid = Integer.parseInt(AddLibID.getText());
        x = String.valueOf(lastid);
        fn = AddLibFN.getText();
        mn = AddLibMN.getText();
        ln = AddLibLN.getText();
        memtyp = String.valueOf(AddLibMT.getSelectedItem());
        gender = String.valueOf(AddLibGen.getSelectedItem());
        crs = String.valueOf(AddLibCourse.getSelectedItem());
        yrlvl = String.valueOf(AddLibCourse.getSelectedItem());
        email = AddLibEmail.getText();
        contact = AddLibContact.getText();
        pw = AddLibPass.getText();
        confirm_pass = String.valueOf(AddLibCpass.getPassword());
        bdate = sdf.format(AddLibBirthdate.getDate());                
   
        if(pw.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input password!", "Password Required", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else if(!pw.equals(confirm_pass)){
             JOptionPane.showMessageDialog(null, "Please retype your password.");
             pst.executeUpdate("");
        }
        
        query = "insert into USERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
                   
                pst = con.prepareStatement(query);
                             
                pst.setString(1, x.trim());
                pst.setString(2, fn.trim());
                pst.setString(3, mn.trim());
                pst.setString(4, ln.trim());
                pst.setString(5, pw.trim());
                pst.setString(6, memtyp.trim());
                pst.setString(7, gender.trim());
                if(bdate !=null){
                  pst.setString(8, bdate.trim());  
                }
                pst.setString(9, crs.trim());
                pst.setString(10, yrlvl.trim());
                pst.setString(11, email.trim());
                pst.setString(12, y.trim());
                           
                
                if(pst.executeUpdate() >0){
                    JOptionPane.showMessageDialog(this, "Data registered successfully! Please try to login as Librarian Admin in the library system"
                    + " using" + lastid + " as your User ID.",
                    "Register Successful", JOptionPane.INFORMATION_MESSAGE);   

                }
                
            LoginFormNew login = new LoginFormNew();
            login.setVisible(true);
            this.dispose();
  

            }catch(SQLException ex){
             Logger.getLogger(LibrarianAdd.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }//GEN-LAST:event_addlibsuccessActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AddLibBirthdate;
    private javax.swing.JTextField AddLibContact;
    private javax.swing.JComboBox<String> AddLibCourse;
    private javax.swing.JPasswordField AddLibCpass;
    private javax.swing.JTextField AddLibEmail;
    private javax.swing.JTextField AddLibFN;
    private javax.swing.JPanel AddLibFooter;
    private javax.swing.JComboBox<String> AddLibGen;
    private javax.swing.JPanel AddLibHeader;
    private javax.swing.JTextField AddLibID;
    private javax.swing.JTextField AddLibLN;
    private javax.swing.JTextField AddLibMN;
    private javax.swing.JComboBox<String> AddLibMT;
    private javax.swing.JTextField AddLibPass;
    private javax.swing.JComboBox<String> AddLibYrLvl;
    private javax.swing.JPanel BGAddLibForm;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MainAddLibForm;
    private javax.swing.JButton addlibsuccess;
    private javax.swing.JLabel eyepassclose;
    private javax.swing.JLabel eyepassopen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regcancel;
    // End of variables declaration//GEN-END:variables
}
