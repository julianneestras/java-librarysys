package LibrarySystemForms;

import java.awt.*;
import javax.swing.JOptionPane;
public class FAQs extends javax.swing.JFrame {

    public FAQs() {
        initComponents();
        FAQTransparent.setBackground(new Color(236, 240, 241, 110));
        q1.setBackground(new Color(152, 108, 98, 120));
        a1.setBackground(new Color(236, 236, 236, 120));
        q2.setBackground(new Color(152, 108, 98, 120));
        a2.setBackground(new Color(236, 236, 236, 120));
        q3.setBackground(new Color(152, 108, 98, 120));
        a3.setBackground(new Color(236, 236, 236, 120));
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AboutUsBG4 = new javax.swing.JPanel();
        HomePageFooter3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomePageHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LibraryName1 = new javax.swing.JLabel();
        LibraryName3 = new javax.swing.JLabel();
        FAQTransparent = new javax.swing.JPanel();
        q1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        a1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        q2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        a2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        q3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        a3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LineSeparator = new javax.swing.JSeparator();
        FAQ = new javax.swing.JButton();
        registerlogin = new javax.swing.JButton();
        homelogin = new javax.swing.JButton();
        aboutus = new javax.swing.JButton();
        LogInWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FREQUENTLY ASKED QUESTIONS");

        AboutUsBG4.setBackground(new java.awt.Color(212, 200, 190));
        AboutUsBG4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePageFooter3.setBackground(new java.awt.Color(109, 25, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(212, 200, 190));
        jLabel1.setText("Contact us: +63 45 200 6901 | lspacelib@gmail.com");

        javax.swing.GroupLayout HomePageFooter3Layout = new javax.swing.GroupLayout(HomePageFooter3);
        HomePageFooter3.setLayout(HomePageFooter3Layout);
        HomePageFooter3Layout.setHorizontalGroup(
            HomePageFooter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageFooter3Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        HomePageFooter3Layout.setVerticalGroup(
            HomePageFooter3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        AboutUsBG4.add(HomePageFooter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 660, 30));

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

        AboutUsBG4.add(HomePageHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 83));

        FAQTransparent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FAQTransparent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setBackground(new java.awt.Color(152, 108, 98));

        jPanel3.setBackground(new java.awt.Color(160, 83, 83));
        jPanel3.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(109, 25, 25));
        jLabel13.setText("Q.");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(109, 25, 25));
        jLabel5.setText("What is Learning Space Integrated Library System and how does it works? ");

        javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
        q1.setLayout(q1Layout);
        q1Layout.setHorizontalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );
        q1Layout.setVerticalGroup(
            q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q1Layout.createSequentialGroup()
                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        FAQTransparent.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 600, 40));

        a1.setBackground(new java.awt.Color(236, 236, 236));

        jPanel2.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("A.");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("The Library name operates on an advanced system that allows students and faculty to easily borrow the books they require.");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText(" One whoever is a  student or faculty member must fill out the login form to gain access to the library system.");

        javax.swing.GroupLayout a1Layout = new javax.swing.GroupLayout(a1);
        a1.setLayout(a1Layout);
        a1Layout.setHorizontalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(a1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        a1Layout.setVerticalGroup(
            a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a1Layout.createSequentialGroup()
                .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(a1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(a1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        FAQTransparent.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 40));

        q2.setBackground(new java.awt.Color(152, 108, 98));

        jPanel5.setBackground(new java.awt.Color(160, 83, 83));
        jPanel5.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(109, 25, 25));
        jLabel7.setText("Q.");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(109, 25, 25));
        jLabel9.setText("How can i borrow books?");

        javax.swing.GroupLayout q2Layout = new javax.swing.GroupLayout(q2);
        q2.setLayout(q2Layout);
        q2Layout.setHorizontalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        q2Layout.setVerticalGroup(
            q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        FAQTransparent.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 600, 40));

        a2.setBackground(new java.awt.Color(236, 236, 236));

        jPanel7.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("A.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("to fill out the information provided.");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Once inside the library's system, look for the Borrowers Icon and click it to borrow a book, as well as");

        javax.swing.GroupLayout a2Layout = new javax.swing.GroupLayout(a2);
        a2.setLayout(a2Layout);
        a2Layout.setHorizontalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        a2Layout.setVerticalGroup(
            a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addComponent(jLabel10))
            .addGroup(a2Layout.createSequentialGroup()
                .addGroup(a2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        FAQTransparent.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 40));

        q3.setBackground(new java.awt.Color(152, 108, 98));

        jPanel6.setBackground(new java.awt.Color(160, 83, 83));
        jPanel6.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(109, 25, 25));
        jLabel8.setText("Q.");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(109, 25, 25));
        jLabel11.setText("Who can access the library system?");

        javax.swing.GroupLayout q3Layout = new javax.swing.GroupLayout(q3);
        q3.setLayout(q3Layout);
        q3Layout.setHorizontalGroup(
            q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(q3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(540, Short.MAX_VALUE))
            .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, q3Layout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );
        q3Layout.setVerticalGroup(
            q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(q3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        FAQTransparent.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 600, 40));

        a3.setBackground(new java.awt.Color(236, 236, 236));

        jPanel8.setPreferredSize(new java.awt.Dimension(5, 79));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("A.");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText(" who have access to the library system.");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Members of the learning space such as Librarian, Faculty Members, and Students are the only ones ");

        javax.swing.GroupLayout a3Layout = new javax.swing.GroupLayout(a3);
        a3.setLayout(a3Layout);
        a3Layout.setHorizontalGroup(
            a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a3Layout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );
        a3Layout.setVerticalGroup(
            a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(a3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(a3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(a3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, a3Layout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        FAQTransparent.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 600, 40));

        AboutUsBG4.add(FAQTransparent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 600, 300));

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

        homelogin.setBackground(new java.awt.Color(212, 200, 190));
        homelogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        homelogin.setForeground(new java.awt.Color(109, 25, 25));
        homelogin.setText("HOME");
        homelogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeloginActionPerformed(evt);
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
                    .addComponent(homelogin)
                    .addComponent(aboutus)))
        );

        AboutUsBG4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 90));

        LogInWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/loginwallpaper (3).jpg"))); // NOI18N
        AboutUsBG4.add(LogInWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AboutUsBG4, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AboutUsBG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerloginActionPerformed
        StudentRegistrationForm regform = new StudentRegistrationForm();
        regform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerloginActionPerformed

    private void homeloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeloginActionPerformed
        LoginFormNew login = new LoginFormNew();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeloginActionPerformed

    private void FAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQActionPerformed
         JOptionPane.showMessageDialog(null, "You are already in FAQ page!", "Information",  JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_FAQActionPerformed

    private void aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusActionPerformed
        AboutUsNew aboutus = new AboutUsNew();
        aboutus.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutusActionPerformed

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
            java.util.logging.Logger.getLogger(FAQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAQs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAQs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AboutUsBG4;
    private javax.swing.JButton FAQ;
    private javax.swing.JPanel FAQTransparent;
    private javax.swing.JPanel HomePageFooter3;
    private javax.swing.JPanel HomePageHeader;
    private javax.swing.JLabel LibraryName1;
    private javax.swing.JLabel LibraryName3;
    private javax.swing.JSeparator LineSeparator;
    private javax.swing.JLabel LogInWallpaper;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel a1;
    private javax.swing.JPanel a2;
    private javax.swing.JPanel a3;
    private javax.swing.JButton aboutus;
    private javax.swing.JButton homelogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel q1;
    private javax.swing.JPanel q2;
    private javax.swing.JPanel q3;
    private javax.swing.JButton registerlogin;
    // End of variables declaration//GEN-END:variables
}
