package LibrarySystemForms;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class StudentSys extends LibConnect{
    public StudentSys() {
        initComponents();
        DoConnectBooks();
        DoConnectUsers();
        DoConnectIssueBooks();
        
        TransparentStudent.setBackground(new Color(236, 240, 241, 90));
        StudentHomePage.setVisible(true);
        BookStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        SearchStudent.setVisible(false);
        ReturnBooksStudent.setVisible(false);
        
    }
        public String addSubtractDate(int n){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        String result = dateFormat.format(cal.getTime());
        return result;
    }
        {   
    }void GetBorrowRecords(){
            try {
                userID = rs.getInt("IDNO");
                bookID = rs.getInt("BOOKID");
                title = rs.getString("TITLE");
                curdate = rs.getString("CURRENTDATE");
                redate = rs.getString("RETURNDATE");       
            }catch (SQLException err){
                JOptionPane.showMessageDialog(StudentSys.this, err.getMessage());
        }
    } void CancelBtn() {
        StudentHomePage.setVisible(true);
        BookStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        ReturnBooksStudent.setVisible(false);
        SearchStudent.setVisible(false);
    }
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        LibrarySystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LibrarySystemPU").createEntityManager();
        booksQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM Books b");
        booksList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : booksQuery.getResultList();
        StudentSystem = new javax.swing.JPanel();
        StudentHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        StudentFooter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ClickHereStud = new javax.swing.JLabel();
        StudentMenu = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        HomeStud = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BooksStud = new javax.swing.JPanel();
        BooksStudIcon = new javax.swing.JLabel();
        logoutstudent = new javax.swing.JPanel();
        logouticon = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        ReturnStud = new javax.swing.JPanel();
        BooksReturnStud = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        SearchStud = new javax.swing.JPanel();
        SearchBooksStud = new javax.swing.JLabel();
        BorrowStud = new javax.swing.JPanel();
        BorrowBooksStud = new javax.swing.JLabel();
        StudentHomePage = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ViewBorrowStud = new javax.swing.JButton();
        welcometext = new javax.swing.JLabel();
        TransparentStudent = new javax.swing.JPanel();
        ClickSearchStud = new javax.swing.JButton();
        ClicBookStud = new javax.swing.JButton();
        ClickReturnStud = new javax.swing.JButton();
        ClickBorrowStud = new javax.swing.JButton();
        StudentWP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BookStudent = new javax.swing.JPanel();
        TransparentStudBook = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        addlibrarian4 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        BookReqStud = new javax.swing.JButton();
        BookBorrowStudent = new javax.swing.JPanel();
        TransparentAdmin7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        EnterIDNoStud = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TitleStud = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        StudentBorrowButton = new javax.swing.JButton();
        BookBorrowStudCancel = new javax.swing.JButton();
        SearchTitle = new javax.swing.JButton();
        BrrwsrchID = new javax.swing.JTextField();
        srchstatus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        EnterBIDStud = new javax.swing.JTextField();
        StudReturn = new javax.swing.JTextField();
        StudBorrow = new javax.swing.JTextField();
        SearchID = new javax.swing.JButton();
        BrrwsrchTitle = new javax.swing.JTextField();
        ClrStudSrch = new javax.swing.JButton();
        ReturnBooksStudent = new javax.swing.JPanel();
        TransparentAdmin8 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        BookReturnStud = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        BIDReturnStud = new javax.swing.JTextField();
        TitleReturnStud = new javax.swing.JTextField();
        StudCurrentDate = new javax.swing.JTextField();
        StudReturnDate = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        UIDReturnStud = new javax.swing.JTextField();
        DateTodayStud = new javax.swing.JTextField();
        SearchStudent = new javax.swing.JPanel();
        TransparentAdmin5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        clickbookclear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookstatus = new javax.swing.JTextField();
        booktitle = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        clickbooksearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT SYSTEM");

        StudentSystem.setBackground(new java.awt.Color(212, 200, 190));
        StudentSystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StudentHeader.setBackground(new java.awt.Color(109, 25, 25));
        StudentHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N
        Logo.setText("Lo");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("STUDENT");

        javax.swing.GroupLayout StudentHeaderLayout = new javax.swing.GroupLayout(StudentHeader);
        StudentHeader.setLayout(StudentHeaderLayout);
        StudentHeaderLayout.setHorizontalGroup(
            StudentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentHeaderLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(StudentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentHeaderLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(StudentHeaderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(StudentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(StudentHeaderLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel2)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        StudentHeaderLayout.setVerticalGroup(
            StudentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentHeaderLayout.createSequentialGroup()
                .addGroup(StudentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentHeaderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(Logo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentSystem.add(StudentHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 750, 80));

        StudentFooter.setBackground(new java.awt.Color(109, 25, 25));
        StudentFooter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, java.awt.Color.white));

        jLabel3.setForeground(new java.awt.Color(240, 231, 218));
        jLabel3.setText("We would love to hear your feedback! ");

        ClickHereStud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ClickHereStud.setForeground(new java.awt.Color(102, 102, 255));
        ClickHereStud.setText("Click Here.");
        ClickHereStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClickHereStudMousePressed(evt);
            }
        });

        javax.swing.GroupLayout StudentFooterLayout = new javax.swing.GroupLayout(StudentFooter);
        StudentFooter.setLayout(StudentFooterLayout);
        StudentFooterLayout.setHorizontalGroup(
            StudentFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFooterLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClickHereStud, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        StudentFooterLayout.setVerticalGroup(
            StudentFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(ClickHereStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentSystem.add(StudentFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 750, 30));

        StudentMenu.setBackground(new java.awt.Color(109, 25, 25));
        StudentMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, java.awt.Color.white));

        HomeStud.setBackground(new java.awt.Color(109, 25, 25));
        HomeStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeStudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeStudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeStudMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 231, 218));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/home (7).png"))); // NOI18N
        jLabel4.setText(">> Home");

        javax.swing.GroupLayout HomeStudLayout = new javax.swing.GroupLayout(HomeStud);
        HomeStud.setLayout(HomeStudLayout);
        HomeStudLayout.setHorizontalGroup(
            HomeStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeStudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        HomeStudLayout.setVerticalGroup(
            HomeStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeStudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BooksStud.setBackground(new java.awt.Color(109, 25, 25));
        BooksStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BooksStudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BooksStudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BooksStudMousePressed(evt);
            }
        });

        BooksStudIcon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BooksStudIcon.setForeground(new java.awt.Color(240, 231, 218));
        BooksStudIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/book-with-white-bookmark (1).png"))); // NOI18N
        BooksStudIcon.setText(">> Books");

        javax.swing.GroupLayout BooksStudLayout = new javax.swing.GroupLayout(BooksStud);
        BooksStud.setLayout(BooksStudLayout);
        BooksStudLayout.setHorizontalGroup(
            BooksStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BooksStudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BooksStudIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BooksStudLayout.setVerticalGroup(
            BooksStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksStudIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        logoutstudent.setBackground(new java.awt.Color(109, 25, 25));
        logoutstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutstudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutstudentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutstudentMousePressed(evt);
            }
        });

        logouticon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logouticon.setForeground(new java.awt.Color(240, 231, 218));
        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/exit-logout-2857 (1).png"))); // NOI18N
        logouticon.setText(">> Logout");

        javax.swing.GroupLayout logoutstudentLayout = new javax.swing.GroupLayout(logoutstudent);
        logoutstudent.setLayout(logoutstudentLayout);
        logoutstudentLayout.setHorizontalGroup(
            logoutstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutstudentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logouticon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        logoutstudentLayout.setVerticalGroup(
            logoutstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logouticon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        ReturnStud.setBackground(new java.awt.Color(109, 25, 25));
        ReturnStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnStudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnStudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReturnStudMousePressed(evt);
            }
        });

        BooksReturnStud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BooksReturnStud.setForeground(new java.awt.Color(240, 231, 218));
        BooksReturnStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/bookreturn.png"))); // NOI18N
        BooksReturnStud.setText(">> Return Books");

        javax.swing.GroupLayout ReturnStudLayout = new javax.swing.GroupLayout(ReturnStud);
        ReturnStud.setLayout(ReturnStudLayout);
        ReturnStudLayout.setHorizontalGroup(
            ReturnStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnStudLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BooksReturnStud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReturnStudLayout.setVerticalGroup(
            ReturnStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksReturnStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SearchStud.setBackground(new java.awt.Color(109, 25, 25));
        SearchStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchStudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchStudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchStudMousePressed(evt);
            }
        });

        SearchBooksStud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchBooksStud.setForeground(new java.awt.Color(240, 231, 218));
        SearchBooksStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/seaaaaarrch.png"))); // NOI18N
        SearchBooksStud.setText(">> Search");

        javax.swing.GroupLayout SearchStudLayout = new javax.swing.GroupLayout(SearchStud);
        SearchStud.setLayout(SearchStudLayout);
        SearchStudLayout.setHorizontalGroup(
            SearchStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchStudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchBooksStud, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        SearchStudLayout.setVerticalGroup(
            SearchStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchStudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SearchBooksStud, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BorrowStud.setBackground(new java.awt.Color(109, 25, 25));
        BorrowStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrowStudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrowStudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrowStudMousePressed(evt);
            }
        });

        BorrowBooksStud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BorrowBooksStud.setForeground(new java.awt.Color(240, 231, 218));
        BorrowBooksStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/borrow-icon-10 (1).png"))); // NOI18N
        BorrowBooksStud.setText(">> Borrow Books");

        javax.swing.GroupLayout BorrowStudLayout = new javax.swing.GroupLayout(BorrowStud);
        BorrowStud.setLayout(BorrowStudLayout);
        BorrowStudLayout.setHorizontalGroup(
            BorrowStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorrowStudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BorrowBooksStud)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BorrowStudLayout.setVerticalGroup(
            BorrowStudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrowBooksStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout StudentMenuLayout = new javax.swing.GroupLayout(StudentMenu);
        StudentMenu.setLayout(StudentMenuLayout);
        StudentMenuLayout.setHorizontalGroup(
            StudentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReturnStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(StudentMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(HomeStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BooksStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(StudentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addComponent(BorrowStud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StudentMenuLayout.setVerticalGroup(
            StudentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentMenuLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(HomeStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BooksStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrowStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        StudentSystem.add(StudentMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        StudentHomePage.setBackground(new java.awt.Color(212, 200, 190));
        StudentHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(212, 200, 190));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(109, 25, 25));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(109, 25, 25));
        jLabel15.setText("Books Borrowed:");

        ViewBorrowStud.setBackground(new java.awt.Color(109, 25, 25));
        ViewBorrowStud.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ViewBorrowStud.setForeground(new java.awt.Color(212, 200, 190));
        ViewBorrowStud.setText("View Here");
        ViewBorrowStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBorrowStudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewBorrowStud, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBorrowStud)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentHomePage.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 280, 50));

        welcometext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        welcometext.setForeground(new java.awt.Color(240, 231, 218));
        welcometext.setText("Welcome to Learning Space library system! What would you like to do?");
        StudentHomePage.add(welcometext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 700, -1));

        TransparentStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 231, 218), 2));

        ClickSearchStud.setBackground(new java.awt.Color(109, 25, 25));
        ClickSearchStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/searchstud.png"))); // NOI18N
        ClickSearchStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickSearchStudActionPerformed(evt);
            }
        });

        ClicBookStud.setBackground(new java.awt.Color(109, 25, 25));
        ClicBookStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/AAAAAAAAAAAAA.png"))); // NOI18N
        ClicBookStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClicBookStudActionPerformed(evt);
            }
        });

        ClickReturnStud.setBackground(new java.awt.Color(109, 25, 25));
        ClickReturnStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/return.png"))); // NOI18N
        ClickReturnStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickReturnStudActionPerformed(evt);
            }
        });

        ClickBorrowStud.setBackground(new java.awt.Color(109, 25, 25));
        ClickBorrowStud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/borrowstud.png"))); // NOI18N
        ClickBorrowStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickBorrowStudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransparentStudentLayout = new javax.swing.GroupLayout(TransparentStudent);
        TransparentStudent.setLayout(TransparentStudentLayout);
        TransparentStudentLayout.setHorizontalGroup(
            TransparentStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentStudentLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(ClicBookStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickSearchStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickBorrowStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        TransparentStudentLayout.setVerticalGroup(
            TransparentStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentStudentLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(TransparentStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClickSearchStud)
                    .addComponent(ClickReturnStud)
                    .addComponent(ClickBorrowStud)
                    .addComponent(ClicBookStud))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        StudentHomePage.add(TransparentStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 690, 240));
        StudentHomePage.add(StudentWP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/studentwallpaper (2).jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        StudentHomePage.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        StudentSystem.add(StudentHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        BookStudent.setBackground(new java.awt.Color(212, 200, 190));
        BookStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentStudBook.setBackground(new java.awt.Color(240, 231, 218));
        TransparentStudBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentStudBook.setForeground(new java.awt.Color(109, 25, 25));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, booksList, addlibrarian4);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bookid}"));
        columnBinding.setColumnName("BOOK ID");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("TITLE");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${author}"));
        columnBinding.setColumnName("AUTHOR");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("STATUS");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane5.setViewportView(addlibrarian4);

        javax.swing.GroupLayout TransparentStudBookLayout = new javax.swing.GroupLayout(TransparentStudBook);
        TransparentStudBook.setLayout(TransparentStudBookLayout);
        TransparentStudBookLayout.setHorizontalGroup(
            TransparentStudBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        TransparentStudBookLayout.setVerticalGroup(
            TransparentStudBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        BookStudent.add(TransparentStudBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 290));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(109, 25, 25));
        jLabel13.setText("Not the book you are looking for? Request for a book to add!");
        BookStudent.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 40));

        BookReqStud.setBackground(new java.awt.Color(109, 25, 25));
        BookReqStud.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BookReqStud.setForeground(new java.awt.Color(240, 231, 218));
        BookReqStud.setText("Request Book +");
        BookReqStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReqStudActionPerformed(evt);
            }
        });
        BookStudent.add(BookReqStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        StudentSystem.add(BookStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        BookBorrowStudent.setBackground(new java.awt.Color(212, 200, 190));
        BookBorrowStudent.setPreferredSize(new java.awt.Dimension(720, 410));
        BookBorrowStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin7.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin7.setForeground(new java.awt.Color(109, 25, 25));
        TransparentAdmin7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel30.setText("Enter Book ID:");
        TransparentAdmin7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        TransparentAdmin7.add(EnterIDNoStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel28.setText("ID Number:");
        TransparentAdmin7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel31.setText("Book Title:");
        TransparentAdmin7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        TitleStud.setEditable(false);
        TransparentAdmin7.add(TitleStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 199, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel33.setText("Current Date:");
        TransparentAdmin7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel34.setText("Return Date:");
        TransparentAdmin7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        StudentBorrowButton.setBackground(new java.awt.Color(109, 25, 25));
        StudentBorrowButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        StudentBorrowButton.setForeground(new java.awt.Color(212, 200, 190));
        StudentBorrowButton.setText("BORROW");
        StudentBorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentBorrowButtonActionPerformed(evt);
            }
        });
        TransparentAdmin7.add(StudentBorrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 104, -1));

        BookBorrowStudCancel.setBackground(new java.awt.Color(109, 25, 25));
        BookBorrowStudCancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookBorrowStudCancel.setForeground(new java.awt.Color(212, 200, 190));
        BookBorrowStudCancel.setText("CANCEL");
        BookBorrowStudCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBorrowStudCancelActionPerformed(evt);
            }
        });
        TransparentAdmin7.add(BookBorrowStudCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 85, -1));

        SearchTitle.setBackground(new java.awt.Color(109, 25, 25));
        SearchTitle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SearchTitle.setForeground(new java.awt.Color(240, 231, 218));
        SearchTitle.setText("  Search for Book Title");
        SearchTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTitleActionPerformed(evt);
            }
        });
        TransparentAdmin7.add(SearchTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 150, -1));
        TransparentAdmin7.add(BrrwsrchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 110, -1));

        srchstatus.setEditable(false);
        TransparentAdmin7.add(srchstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 120, -1));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Book Status");
        TransparentAdmin7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 70, -1));

        EnterBIDStud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterBIDStudKeyReleased(evt);
            }
        });
        TransparentAdmin7.add(EnterBIDStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 199, -1));

        StudReturn.setEditable(false);
        StudReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudReturnMouseEntered(evt);
            }
        });
        TransparentAdmin7.add(StudReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, -1));

        StudBorrow.setEditable(false);
        StudBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StudBorrowMouseEntered(evt);
            }
        });
        TransparentAdmin7.add(StudBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 200, -1));

        SearchID.setBackground(new java.awt.Color(109, 25, 25));
        SearchID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SearchID.setForeground(new java.awt.Color(240, 231, 218));
        SearchID.setText("  Search for Book ID");
        SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDActionPerformed(evt);
            }
        });
        TransparentAdmin7.add(SearchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 150, -1));
        TransparentAdmin7.add(BrrwsrchTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, -1));

        ClrStudSrch.setBackground(new java.awt.Color(109, 25, 25));
        ClrStudSrch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ClrStudSrch.setForeground(new java.awt.Color(240, 231, 218));
        ClrStudSrch.setText("Clear");
        ClrStudSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrStudSrchActionPerformed(evt);
            }
        });
        TransparentAdmin7.add(ClrStudSrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        BookBorrowStudent.add(TransparentAdmin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 670, 360));

        StudentSystem.add(BookBorrowStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        ReturnBooksStudent.setBackground(new java.awt.Color(212, 200, 190));
        ReturnBooksStudent.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ReturnBooksStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin8.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin8.setForeground(new java.awt.Color(109, 25, 25));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Enter Book ID:");

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Enter Book Title:");

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel36.setText("Date Borrowed:");

        BookReturnStud.setBackground(new java.awt.Color(109, 25, 25));
        BookReturnStud.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookReturnStud.setForeground(new java.awt.Color(212, 200, 190));
        BookReturnStud.setText("RETURN");
        BookReturnStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReturnStudActionPerformed(evt);
            }
        });

        CancelBtn.setBackground(new java.awt.Color(109, 25, 25));
        CancelBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(212, 200, 190));
        CancelBtn.setText("CANCEL");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("Due Date:");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("Date Returned:");

        BIDReturnStud.setEditable(false);

        TitleReturnStud.setEditable(false);

        StudCurrentDate.setEditable(false);

        StudReturnDate.setEditable(false);

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("Enter ID Number:");

        UIDReturnStud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UIDReturnStudKeyReleased(evt);
            }
        });

        DateTodayStud.setEditable(false);
        DateTodayStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DateTodayStudMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout TransparentAdmin8Layout = new javax.swing.GroupLayout(TransparentAdmin8);
        TransparentAdmin8.setLayout(TransparentAdmin8Layout);
        TransparentAdmin8Layout.setHorizontalGroup(
            TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(BookReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin8Layout.createSequentialGroup()
                        .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel32)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UIDReturnStud)
                            .addComponent(BIDReturnStud, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleReturnStud, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudCurrentDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudReturnDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateTodayStud))))
                .addGap(194, 194, 194))
        );
        TransparentAdmin8Layout.setVerticalGroup(
            TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin8Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UIDReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(BIDReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel37)
                        .addGap(21, 21, 21)
                        .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(DateTodayStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TitleReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StudCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(StudReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookReturnStud)
                    .addComponent(CancelBtn))
                .addGap(41, 41, 41))
        );

        ReturnBooksStudent.add(TransparentAdmin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 360));

        StudentSystem.add(ReturnBooksStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        SearchStudent.setBackground(new java.awt.Color(212, 200, 190));
        SearchStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin5.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin5.setForeground(new java.awt.Color(109, 25, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 53)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(109, 25, 25));
        jLabel6.setText("SEARCH BOOKS");

        clickbookclear.setBackground(new java.awt.Color(109, 25, 25));
        clickbookclear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clickbookclear.setForeground(new java.awt.Color(240, 231, 218));
        clickbookclear.setText("Clear");
        clickbookclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickbookclearActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/red.png"))); // NOI18N
        jLabel12.setText("Book ID:");

        jLabel17.setText("Title:");

        jLabel18.setText("Status:");

        clickbooksearch.setBackground(new java.awt.Color(109, 25, 25));
        clickbooksearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clickbooksearch.setForeground(new java.awt.Color(240, 231, 218));
        clickbooksearch.setText("Search");
        clickbooksearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickbooksearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransparentAdmin5Layout = new javax.swing.GroupLayout(TransparentAdmin5);
        TransparentAdmin5.setLayout(TransparentAdmin5Layout);
        TransparentAdmin5Layout.setHorizontalGroup(
            TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin5Layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel17))
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin5Layout.createSequentialGroup()
                                            .addComponent(clickbooksearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addComponent(clickbookclear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36))))))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        TransparentAdmin5Layout.setVerticalGroup(
            TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clickbookclear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clickbooksearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(31, 31, 31))
        );

        SearchStudent.add(TransparentAdmin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 340));

        StudentSystem.add(SearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StudentSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeStudMouseEntered
        HomeStud.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_HomeStudMouseEntered

    private void HomeStudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeStudMouseExited
        HomeStud.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_HomeStudMouseExited

    private void HomeStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeStudMousePressed
        StudentSys student = new StudentSys();
        student.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeStudMousePressed

    private void BooksStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksStudMouseEntered
        BooksStud.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_BooksStudMouseEntered

    private void BooksStudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksStudMouseExited
        BooksStud.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_BooksStudMouseExited

    private void BooksStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksStudMousePressed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(true);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);
    }//GEN-LAST:event_BooksStudMousePressed

    private void logoutstudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutstudentMouseEntered
        logoutstudent.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_logoutstudentMouseEntered

    private void logoutstudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutstudentMouseExited
        logoutstudent.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_logoutstudentMouseExited

    private void logoutstudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutstudentMousePressed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Select Option", JOptionPane.YES_NO_OPTION);
        if(response == 0) {
            LoginFormNew logout = new LoginFormNew();
            logout.setVisible(true);
            this.dispose();           
        }else{
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutstudentMousePressed

    private void ReturnStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnStudMouseEntered
        ReturnStud.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_ReturnStudMouseEntered

    private void ReturnStudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnStudMouseExited
        ReturnStud.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_ReturnStudMouseExited

    private void ReturnStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnStudMousePressed
        ReturnBooksStudent.setVisible(true);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);
    }//GEN-LAST:event_ReturnStudMousePressed

    private void SearchStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchStudMouseEntered
     SearchStud.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_SearchStudMouseEntered

    private void SearchStudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchStudMouseExited
        SearchStud.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_SearchStudMouseExited

    private void SearchStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchStudMousePressed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(true);
    }//GEN-LAST:event_SearchStudMousePressed

    private void ClickHereStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickHereStudMousePressed
        FeedbackForm fdbackstud = new FeedbackForm();
        fdbackstud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClickHereStudMousePressed

    private void BorrowStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowStudMouseEntered
        BorrowStud.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_BorrowStudMouseEntered

    private void BorrowStudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowStudMouseExited
        BorrowStud.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_BorrowStudMouseExited

    private void BorrowStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowStudMousePressed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(true);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);
       
//        try{
//            
//            pst = con.prepareStatement("SELECT USERID FROM LOGIN");
//            rs = pst.executeQuery();
//            rs.next();
//            EnterIDNoStud.setText(rs.getString("USERID"));
//            
//            
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_BorrowStudMousePressed

    private void ClicBookStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClicBookStudActionPerformed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(true);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);       
    }//GEN-LAST:event_ClicBookStudActionPerformed

    private void ClickSearchStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickSearchStudActionPerformed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(true);
    }//GEN-LAST:event_ClickSearchStudActionPerformed

    private void ClickBorrowStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickBorrowStudActionPerformed
        ReturnBooksStudent.setVisible(false);
        BookBorrowStudent.setVisible(true);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);
        
        
    }//GEN-LAST:event_ClickBorrowStudActionPerformed

    private void ClickReturnStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickReturnStudActionPerformed
        ReturnBooksStudent.setVisible(true);
        BookBorrowStudent.setVisible(false);
        BookStudent.setVisible(false);
        StudentHomePage.setVisible(false);
        SearchStudent.setVisible(false);
    }//GEN-LAST:event_ClickReturnStudActionPerformed

    private void BookReqStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReqStudActionPerformed
        BookRequest req = new BookRequest();
        req.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookReqStudActionPerformed

    private void ViewBorrowStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBorrowStudActionPerformed
        StudBorrowBooks viewborrow = new StudBorrowBooks();
        viewborrow.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_ViewBorrowStudActionPerformed

    private void SearchTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTitleActionPerformed
        SearchID.setEnabled(false);
        try{
             pst = con.prepareStatement("SELECT TITLE, STATUS FROM BOOKS WHERE TITLE=?");
             srchbook = BrrwsrchTitle.getText();
             pst.setString(1, srchbook);
             rs = pst.executeQuery();

            if(rs.next()==false){
            JOptionPane.showMessageDialog(null, "Sorry! Record not found.");
            srchstatus.setText("");

        }else{
             srchstatus.setText(rs.getString("STATUS"));
                }
               
        }catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }       
    }//GEN-LAST:event_SearchTitleActionPerformed

    private void clickbooksearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickbooksearchActionPerformed
    try{
              pst = con.prepareStatement("SELECT BOOKID, TITLE, STATUS FROM BOOKS WHERE BOOKID=?");
              booksrch = Integer.parseInt(bookid.getText());
              pst.setInt(1, booksrch);
             rs = pst.executeQuery();

            if(rs.next()==false){
            JOptionPane.showMessageDialog(null, "Sorry! Record not found.");
            bookid.setText("");
            booktitle.setText("");
            bookstatus.setText("");
        }else{
                 booktitle.setText(rs.getString("TITLE"));
              bookstatus.setText(rs.getString("STATUS"));
                }
               
        }catch (SQLException ex) {
            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clickbooksearchActionPerformed

    private void clickbookclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickbookclearActionPerformed
        bookid.setText("");
        booktitle.setText("");
        bookstatus.setText("");
    }//GEN-LAST:event_clickbookclearActionPerformed

    private void StudentBorrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentBorrowButtonActionPerformed
    UID = Integer.parseInt(EnterIDNoStud.getText());
        uidissue = String.valueOf(UID);
        BID = Integer.parseInt(EnterBIDStud.getText());
        bidissue = String.valueOf(BID);
        title = TitleStud.getText();
        borrowdate = StudBorrow.getText();
        returndate = StudReturn.getText();
        
        try {
            stmt=con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID="+bidissue+"");
            if(rs.next()) {
                ResultSet rsl = stmt.executeQuery("SELECT * FROM USERS WHERE IDNO="+uidissue+"");
                if(rsl.next()) {
                    stmt.executeUpdate("INSERT INTO BORROW_BOOKS VALUES("+uidissue+","+bidissue+",'"+title+"', '"+borrowdate+"', "
                            + "'"+returndate+"')");
                   
                    JOptionPane.showMessageDialog(null, "Thank you! Your book borrow request is now pending.");
                    EnterIDNoStud.setText("");
                    StudBorrow.setText("");
                    StudReturn.setText("");
                    EnterBIDStud.setText("");
                    TitleStud.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect ID Number!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect BookID!");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Your book borrow request is already pending.");
        }
    }//GEN-LAST:event_StudentBorrowButtonActionPerformed

    private void BookReturnStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReturnStudActionPerformed
            
            Uuid = Integer.parseInt(UIDReturnStud.getText());
            UUsuid = String.valueOf(Uuid);
            
            BBbid = Integer.parseInt(BIDReturnStud.getText());
            Bbsuid = String.valueOf(BBbid);
            
            Btitle = TitleReturnStud.getText();
            borrowd = StudCurrentDate.getText();
            duedate = StudReturnDate.getText();
            retdate = DateTodayStud.getText();
            //rdate= sdf.format (CalendarReturnDateStud.getDate());
        
        try {
          
            borrow = "INSERT INTO RETURN_BOOKS VALUES (?,?,?,?,?)"; 
            pst = con.prepareStatement(borrow);

            pst.setString(1, UUsuid); 
            pst.setString(2, Bbsuid);
            pst.setString(3, borrowd);
            pst.setString(4, duedate);
            pst.setString(5, retdate);
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "Book returned successfully! Thank you.");
            
        UIDReturnStud.setText("");
        BIDReturnStud.setText("");
        TitleReturnStud.setText("");
        StudCurrentDate.setText("");
        StudReturnDate.setText("");
        DateTodayStud.setText("");            
                      
               
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Book has been returned.");
        }
       
    }//GEN-LAST:event_BookReturnStudActionPerformed
 
    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        CancelBtn();
        BIDReturnStud.setText("");
        TitleReturnStud.setText("");
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void BookBorrowStudCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBorrowStudCancelActionPerformed
        CancelBtn();
        TitleStud.setText("");
        EnterIDNoStud.setText("");

    }//GEN-LAST:event_BookBorrowStudCancelActionPerformed

    private void StudBorrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudBorrowMouseEntered
    StudBorrow.setText(sdf.format(thisDate));
    }//GEN-LAST:event_StudBorrowMouseEntered

    private void StudReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudReturnMouseEntered
    StudReturn.setText(addSubtractDate(3));
    }//GEN-LAST:event_StudReturnMouseEntered

    private void SearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIDActionPerformed
    SearchTitle.setEnabled(false);
        try{
            pst = con.prepareStatement("SELECT BOOKID, STATUS FROM BOOKS WHERE BOOKID=?");
            booksrch = Integer.parseInt(BrrwsrchID.getText());
            pst.setInt(1, booksrch);
            rs = pst.executeQuery();

            if(rs.next()==false){
                JOptionPane.showMessageDialog(null, "Sorry! Record not found.");
                srchstatus.setText("");

            }else{
                srchstatus.setText(rs.getString("STATUS"));
            }
               
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
//            Logger.getLogger(StudentRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         

    }//GEN-LAST:event_SearchIDActionPerformed

    private void EnterBIDStudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterBIDStudKeyReleased
        srchbid = "SELECT * FROM BOOKS WHERE BOOKID=?";
        try{
            pst = con.prepareStatement(srchbid);
            pst.setString(1, EnterBIDStud.getText().trim());
            rs = pst.executeQuery();

            if(rs.next()) {
                TitleStud.setText(rs.getString("TITLE"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EnterBIDStudKeyReleased

    private void ClrStudSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrStudSrchActionPerformed
        BrrwsrchTitle.setText("");
        BrrwsrchID.setText("");
        srchstatus.setText("");
        SearchTitle.setEnabled(true);
        SearchID.setEnabled(true);
    }//GEN-LAST:event_ClrStudSrchActionPerformed

    private void UIDReturnStudKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UIDReturnStudKeyReleased
         try{
          bookreturn = "SELECT BORROW_BOOKS.BOOKID, BORROW_BOOKS.TITLE, BORROW_BOOKS.CURRENTDATE, BORROW_BOOKS.RETURNDATE"
                  + " FROM BORROW_BOOKS WHERE BORROW_BOOKS.IDNO="+UIDReturnStud.getText()+"";
          
            
            pst = con.prepareStatement(bookreturn);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                BIDReturnStud.setText(rs.getString("BOOKID"));
                TitleReturnStud.setText(rs.getString("TITLE"));
                StudCurrentDate.setText(rs.getString("CURRENTDATE"));
                 StudReturnDate.setText(rs.getString("RETURNDATE"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UIDReturnStudKeyReleased

    private void DateTodayStudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateTodayStudMouseEntered
    DateTodayStud.setText(sdf.format(thisDate));
    }//GEN-LAST:event_DateTodayStudMouseEntered

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
            java.util.logging.Logger.getLogger(StudentSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BIDReturnStud;
    private javax.swing.JButton BookBorrowStudCancel;
    private javax.swing.JPanel BookBorrowStudent;
    private javax.swing.JButton BookReqStud;
    private javax.swing.JButton BookReturnStud;
    private javax.swing.JPanel BookStudent;
    private javax.swing.JLabel BooksReturnStud;
    private javax.swing.JPanel BooksStud;
    private javax.swing.JLabel BooksStudIcon;
    private javax.swing.JLabel BorrowBooksStud;
    private javax.swing.JPanel BorrowStud;
    private javax.swing.JTextField BrrwsrchID;
    private javax.swing.JTextField BrrwsrchTitle;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ClicBookStud;
    private javax.swing.JButton ClickBorrowStud;
    private javax.swing.JLabel ClickHereStud;
    private javax.swing.JButton ClickReturnStud;
    private javax.swing.JButton ClickSearchStud;
    private javax.swing.JButton ClrStudSrch;
    private javax.swing.JTextField DateTodayStud;
    private javax.swing.JTextField EnterBIDStud;
    private javax.swing.JTextField EnterIDNoStud;
    private javax.swing.JPanel HomeStud;
    private javax.persistence.EntityManager LibrarySystemPUEntityManager;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel ReturnBooksStudent;
    private javax.swing.JPanel ReturnStud;
    private javax.swing.JLabel SearchBooksStud;
    private javax.swing.JButton SearchID;
    private javax.swing.JPanel SearchStud;
    private javax.swing.JPanel SearchStudent;
    private javax.swing.JButton SearchTitle;
    private javax.swing.JTextField StudBorrow;
    private javax.swing.JTextField StudCurrentDate;
    private javax.swing.JTextField StudReturn;
    private javax.swing.JTextField StudReturnDate;
    private javax.swing.JButton StudentBorrowButton;
    private javax.swing.JPanel StudentFooter;
    private javax.swing.JPanel StudentHeader;
    private javax.swing.JPanel StudentHomePage;
    private javax.swing.JPanel StudentMenu;
    private javax.swing.JPanel StudentSystem;
    private javax.swing.JLabel StudentWP;
    private javax.swing.JTextField TitleReturnStud;
    private javax.swing.JTextField TitleStud;
    private javax.swing.JPanel TransparentAdmin5;
    private javax.swing.JPanel TransparentAdmin7;
    private javax.swing.JPanel TransparentAdmin8;
    private javax.swing.JPanel TransparentStudBook;
    private javax.swing.JPanel TransparentStudent;
    private javax.swing.JTextField UIDReturnStud;
    private javax.swing.JButton ViewBorrowStud;
    private javax.swing.JTable addlibrarian4;
    private javax.swing.JTextField bookid;
    private java.util.List<LibrarySystemForms.Books> booksList;
    private javax.persistence.Query booksQuery;
    private javax.swing.JTextField bookstatus;
    private javax.swing.JTextField booktitle;
    private javax.swing.JButton clickbookclear;
    private javax.swing.JButton clickbooksearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logouticon;
    private javax.swing.JPanel logoutstudent;
    private javax.swing.JTextField srchstatus;
    private javax.swing.JLabel welcometext;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
