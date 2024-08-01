package LibrarySystemForms;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class StudentRegistrationForm extends LibConnect {

    public StudentRegistrationForm() {
        initComponents();
        DoConnectUsers();
        
        this.eyepassclose.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        BGRegForm = new javax.swing.JPanel();
        RegHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        RegFooter = new javax.swing.JPanel();
        MainRegForm = new javax.swing.JPanel();
        eyepassopen = new javax.swing.JLabel();
        eyepassclose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RegFN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RegMN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        RegMT = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RegGen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        RegCourse = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        RegYrLvl = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        RegLN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RegEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        RegContact = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        regcancel = new javax.swing.JButton();
        regsucess = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        RegConfirmPass = new javax.swing.JPasswordField();
        RegPass = new javax.swing.JPasswordField();
        RegBdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER FORM");

        BGRegForm.setBackground(new java.awt.Color(212, 200, 190));

        RegHeader.setBackground(new java.awt.Color(109, 25, 25));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("REGISTRATION FORM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        javax.swing.GroupLayout RegHeaderLayout = new javax.swing.GroupLayout(RegHeader);
        RegHeader.setLayout(RegHeaderLayout);
        RegHeaderLayout.setHorizontalGroup(
            RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        RegHeaderLayout.setVerticalGroup(
            RegHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addGroup(RegHeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegFooter.setBackground(new java.awt.Color(109, 25, 25));

        javax.swing.GroupLayout RegFooterLayout = new javax.swing.GroupLayout(RegFooter);
        RegFooter.setLayout(RegFooterLayout);
        RegFooterLayout.setHorizontalGroup(
            RegFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RegFooterLayout.setVerticalGroup(
            RegFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        MainRegForm.setBackground(new java.awt.Color(245, 246, 242));
        MainRegForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(152, 108, 98)));
        MainRegForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eyepassopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/eyepassopen.png"))); // NOI18N
        eyepassopen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eyepassopenMousePressed(evt);
            }
        });
        MainRegForm.add(eyepassopen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 30, 20));

        eyepassclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/eyepassclose.png"))); // NOI18N
        eyepassclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eyepasscloseMousePressed(evt);
            }
        });
        MainRegForm.add(eyepassclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("ID Number:");
        MainRegForm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 35, -1, -1));

        RegID.setEnabled(false);
        MainRegForm.add(RegID, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 34, 213, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("First Name:");
        MainRegForm.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 67, -1, -1));
        MainRegForm.add(RegFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 66, 213, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel5.setText("Middle Name:");
        MainRegForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 99, -1, -1));
        MainRegForm.add(RegMN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 98, 213, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel6.setText("Member Type:");
        MainRegForm.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 164, -1, -1));

        RegMT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Faculty Member" }));
        MainRegForm.add(RegMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 162, 182, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel7.setText("Birthdate:");
        MainRegForm.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 230, -1, 29));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel8.setText("Gender:");
        MainRegForm.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 198, -1, -1));

        RegGen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        MainRegForm.add(RegGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 196, 112, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel9.setText("Course:");
        MainRegForm.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 279, -1, -1));

        RegCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "Engineering", "Architecture", "Tourism", "Political Science" }));
        MainRegForm.add(RegCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 277, 112, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel10.setText("Year Level:");
        MainRegForm.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 279, -1, -1));

        RegYrLvl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Applicable", "1st", "2nd", "3rd", "4th" }));
        MainRegForm.add(RegYrLvl, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 277, 112, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel11.setText("Last Name:");
        MainRegForm.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 131, -1, -1));
        MainRegForm.add(RegLN, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 130, 213, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel12.setText("Email:");
        MainRegForm.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 312, -1, -1));
        MainRegForm.add(RegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 311, 213, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel13.setText("Contact Number:");
        MainRegForm.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 344, -1, -1));
        MainRegForm.add(RegContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 343, 213, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel14.setText("Password:");
        MainRegForm.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 376, -1, -1));

        regcancel.setBackground(new java.awt.Color(109, 25, 25));
        regcancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        regcancel.setForeground(new java.awt.Color(212, 200, 190));
        regcancel.setText("CANCEL");
        regcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regcancelActionPerformed(evt);
            }
        });
        MainRegForm.add(regcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 101, -1));

        regsucess.setBackground(new java.awt.Color(109, 25, 25));
        regsucess.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        regsucess.setForeground(new java.awt.Color(212, 200, 190));
        regsucess.setText("REGISTER");
        regsucess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regsucessActionPerformed(evt);
            }
        });
        MainRegForm.add(regsucess, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 101, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel15.setText("Confirm Password:");
        MainRegForm.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, -1));
        MainRegForm.add(RegConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 190, -1));
        MainRegForm.add(RegPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 210, -1));

        RegBdate.setDateFormatString("MM/dd/yyyy");
        MainRegForm.add(RegBdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 180, -1));

        javax.swing.GroupLayout BGRegFormLayout = new javax.swing.GroupLayout(BGRegForm);
        BGRegForm.setLayout(BGRegFormLayout);
        BGRegFormLayout.setHorizontalGroup(
            BGRegFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RegFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGRegFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(MainRegForm, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGRegFormLayout.setVerticalGroup(
            BGRegFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGRegFormLayout.createSequentialGroup()
                .addComponent(RegHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainRegForm, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGRegForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BGRegForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regcancelActionPerformed
        LoginFormNew login = new LoginFormNew();
        login.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_regcancelActionPerformed

    private void regsucessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regsucessActionPerformed
        if(RegFN.getText().isEmpty() || RegMN.getText().isEmpty() || RegLN.getText().isEmpty() 
        || RegEmail.getText().isEmpty() || RegContact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out all information before submitting this form.");
         }
        
        try {
            rs = stmt.executeQuery("SELECT MAX(IDNO) FROM USERS");
            if(rs.next()) {
                lastid = rs.getInt(1);
                lastid++;
                RegID.setText(Integer.toString(lastid));   
                
            }else{
                RegID.setText("1001");
            }
          
        //USER INPUT FILLING OUT DETAILS    
        lastid = Integer.parseInt(RegID.getText());
        x = String.valueOf(lastid).trim();
        fn = RegFN.getText().trim();
        mn = RegMN.getText().trim();
        ln = RegLN.getText().trim();
        memtyp = String.valueOf(RegMT.getSelectedItem()).trim();
        gender = String.valueOf(RegGen.getSelectedItem()).trim();
        crs = String.valueOf(RegCourse.getSelectedItem()).trim();
        yrlvl = String.valueOf(RegYrLvl.getSelectedItem()).trim();
        email = RegEmail.getText().trim();
        contact = RegContact.getText();
  
        pw = RegPass.getText().trim();
        confirm_pass = String.valueOf(RegConfirmPass.getPassword());
        bdate = sdf.format(RegBdate.getDate()).trim();    
        
        if(pw.equals("")) {
            JOptionPane.showMessageDialog(null, "Please input password!", "Password Required", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else if(!pw.equals(confirm_pass)){
             JOptionPane.showMessageDialog(null, "Please retype your password.");
        }else{
            
            stmt.execute("INSERT INTO USERS values ("+x+", '"+fn+"','"+mn+"', '"+ln+"', '"+pw+"', '"+memtyp+"', '"+gender+"',"
                    + "'"+bdate+"','"+crs+"','"+yrlvl+"', '"+email+"', "+contact+")");
            
                JOptionPane.showMessageDialog(this, "You are registered successfully! Please try to login in the library system"
                    + " using " + lastid + " as your User ID.",
                    "Register Successful", JOptionPane.INFORMATION_MESSAGE);     
                    
                           
            LoginFormNew login = new LoginFormNew();
            login.setVisible(true);
            this.dispose();
        }

        
            
        }catch (SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_regsucessActionPerformed

    private void eyepasscloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyepasscloseMousePressed
        eyepassopen.setVisible(true);
        eyepassclose.setVisible(false);
        RegConfirmPass.setEchoChar('*');
    }//GEN-LAST:event_eyepasscloseMousePressed

    private void eyepassopenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyepassopenMousePressed
        eyepassclose.setVisible(true);
        eyepassopen.setVisible(false);
        RegConfirmPass.setEchoChar((char)0);
    }//GEN-LAST:event_eyepassopenMousePressed

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
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGRegForm;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MainRegForm;
    private com.toedter.calendar.JDateChooser RegBdate;
    private javax.swing.JPasswordField RegConfirmPass;
    private javax.swing.JTextField RegContact;
    private javax.swing.JComboBox<String> RegCourse;
    private javax.swing.JTextField RegEmail;
    private javax.swing.JTextField RegFN;
    private javax.swing.JPanel RegFooter;
    private javax.swing.JComboBox<String> RegGen;
    private javax.swing.JPanel RegHeader;
    private javax.swing.JTextField RegID;
    private javax.swing.JTextField RegLN;
    private javax.swing.JTextField RegMN;
    private javax.swing.JComboBox<String> RegMT;
    private javax.swing.JPasswordField RegPass;
    private javax.swing.JComboBox<String> RegYrLvl;
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
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regcancel;
    private javax.swing.JButton regsucess;
    // End of variables declaration//GEN-END:variables
}
