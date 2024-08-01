
package LibrarySystemForms;
import java.awt.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FacultySys extends LibConnect {

    public FacultySys() {
        initComponents();
        DoConnectBooks();
        DoConnectUsers();
        DoConnectIssueBooks();        
        
        TransparentFac.setBackground(new Color(109, 25, 25, 90));
        FacultyHomePage.setVisible(true);
        BookFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        FacSearch.setVisible(false);
        ReturnBooksFac.setVisible(false);
        
    } void CancelBtn() {
        FacultyHomePage.setVisible(true);
        BookFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        ReturnBooksFac.setVisible(false);
        FacSearch.setVisible(false);
        
    } public String addSubtractDate(int n){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/Y");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, n);
        String result = dateFormat.format(cal.getTime());
        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        LibrarySystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LibrarySystemPU").createEntityManager();
        booksQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM Books b");
        booksList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : booksQuery.getResultList();
        booksQuery1 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM Books b");
        booksList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : booksQuery1.getResultList();
        FacultySystem = new javax.swing.JPanel();
        FacultyHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        FacultyFooter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ClickHereStud = new javax.swing.JLabel();
        FacultyMenu = new javax.swing.JPanel();
        HomeFac = new javax.swing.JPanel();
        Fac = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        BooksFac = new javax.swing.JPanel();
        BooksFacIcon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BorrowFac = new javax.swing.JPanel();
        BorrowBooksFac = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        ReturnFac = new javax.swing.JPanel();
        BooksReturnFac = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        SearchFac = new javax.swing.JPanel();
        SearchBooksFac = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        logoutfac = new javax.swing.JPanel();
        logouticon = new javax.swing.JLabel();
        FacultyHomePage = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ViewBorrowFac = new javax.swing.JButton();
        welcometext = new javax.swing.JLabel();
        TransparentFac = new javax.swing.JPanel();
        ClickSearchStud = new javax.swing.JButton();
        ClicBookStud = new javax.swing.JButton();
        ClickReturnStud = new javax.swing.JButton();
        ClickBorrowStud = new javax.swing.JButton();
        StudentWP = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BookFac = new javax.swing.JPanel();
        TransparentStudBook = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        addlibrarian4 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        BookReq = new javax.swing.JButton();
        BookBorrowFac = new javax.swing.JPanel();
        TransparentAdmin7 = new javax.swing.JPanel();
        EnterIDNoFac = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        EnterBIDFac = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        TitleFac = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        FacBorrowBook = new javax.swing.JButton();
        FacCancelBorrow = new javax.swing.JButton();
        FacBorrow = new javax.swing.JTextField();
        FacReturn = new javax.swing.JTextField();
        BrrwsrchTitle = new javax.swing.JTextField();
        SearchTitle = new javax.swing.JButton();
        BrrwsrchID = new javax.swing.JTextField();
        SearchID = new javax.swing.JButton();
        ClearFacSrch = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        srchstatus = new javax.swing.JTextField();
        ReturnBooksFac = new javax.swing.JPanel();
        TransparentAdmin8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        UIDReturnFac = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        BIDReturnFac = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        TitleReturnFac = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        BookReturnFac = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        FacCurrentDate = new javax.swing.JTextField();
        FacReturnDate = new javax.swing.JTextField();
        DateTodayFac = new javax.swing.JTextField();
        FacSearch = new javax.swing.JPanel();
        TransparentAdmin5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        clickbooksearch = new javax.swing.JButton();
        clickbookclear = new javax.swing.JButton();
        booktitle = new javax.swing.JTextField();
        bookstatus = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FACULTY SYSTEM");

        FacultySystem.setBackground(new java.awt.Color(212, 200, 190));
        FacultySystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FacultyHeader.setBackground(new java.awt.Color(212, 200, 190));
        FacultyHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(109, 25, 25), new java.awt.Color(109, 25, 25)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(109, 25, 25));
        jLabel1.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N
        Logo.setText("Lo");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(109, 25, 25));
        jLabel2.setText("FACULTY");

        javax.swing.GroupLayout FacultyHeaderLayout = new javax.swing.GroupLayout(FacultyHeader);
        FacultyHeader.setLayout(FacultyHeaderLayout);
        FacultyHeaderLayout.setHorizontalGroup(
            FacultyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyHeaderLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FacultyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacultyHeaderLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(FacultyHeaderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(FacultyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FacultyHeaderLayout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel2)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        FacultyHeaderLayout.setVerticalGroup(
            FacultyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyHeaderLayout.createSequentialGroup()
                .addGroup(FacultyHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacultyHeaderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(Logo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FacultySystem.add(FacultyHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 750, 80));

        FacultyFooter.setBackground(new java.awt.Color(212, 200, 190));
        FacultyFooter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(109, 25, 25), null, null, new java.awt.Color(109, 25, 25)));

        jLabel3.setForeground(new java.awt.Color(109, 25, 25));
        jLabel3.setText("We would love to hear your feedback! ");

        ClickHereStud.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ClickHereStud.setForeground(new java.awt.Color(102, 102, 255));
        ClickHereStud.setText("Click Here.");
        ClickHereStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClickHereStudMousePressed(evt);
            }
        });

        javax.swing.GroupLayout FacultyFooterLayout = new javax.swing.GroupLayout(FacultyFooter);
        FacultyFooter.setLayout(FacultyFooterLayout);
        FacultyFooterLayout.setHorizontalGroup(
            FacultyFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyFooterLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClickHereStud, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        FacultyFooterLayout.setVerticalGroup(
            FacultyFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacultyFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addComponent(ClickHereStud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FacultySystem.add(FacultyFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 750, 30));

        FacultyMenu.setBackground(new java.awt.Color(212, 200, 190));
        FacultyMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(109, 25, 25), new java.awt.Color(109, 25, 25)));

        HomeFac.setBackground(new java.awt.Color(212, 200, 190));
        HomeFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeFacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeFacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeFacMousePressed(evt);
            }
        });

        Fac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Fac.setForeground(new java.awt.Color(109, 25, 25));
        Fac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/ggg.png"))); // NOI18N
        Fac.setText(">> Home");

        javax.swing.GroupLayout HomeFacLayout = new javax.swing.GroupLayout(HomeFac);
        HomeFac.setLayout(HomeFacLayout);
        HomeFacLayout.setHorizontalGroup(
            HomeFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeFacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        HomeFacLayout.setVerticalGroup(
            HomeFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeFacLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BooksFac.setBackground(new java.awt.Color(212, 200, 190));
        BooksFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BooksFacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BooksFacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BooksFacMousePressed(evt);
            }
        });

        BooksFacIcon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BooksFacIcon.setForeground(new java.awt.Color(109, 25, 25));
        BooksFacIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/bookredfac.png"))); // NOI18N
        BooksFacIcon.setText(">> Books");

        javax.swing.GroupLayout BooksFacLayout = new javax.swing.GroupLayout(BooksFac);
        BooksFac.setLayout(BooksFacLayout);
        BooksFacLayout.setHorizontalGroup(
            BooksFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BooksFacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BooksFacIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        BooksFacLayout.setVerticalGroup(
            BooksFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksFacIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        BorrowFac.setBackground(new java.awt.Color(212, 200, 190));
        BorrowFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrowFacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrowFacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BorrowFacMousePressed(evt);
            }
        });

        BorrowBooksFac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BorrowBooksFac.setForeground(new java.awt.Color(109, 25, 25));
        BorrowBooksFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/000.png"))); // NOI18N
        BorrowBooksFac.setText(">> Borrow Books");

        javax.swing.GroupLayout BorrowFacLayout = new javax.swing.GroupLayout(BorrowFac);
        BorrowFac.setLayout(BorrowFacLayout);
        BorrowFacLayout.setHorizontalGroup(
            BorrowFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BorrowFacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BorrowBooksFac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BorrowFacLayout.setVerticalGroup(
            BorrowFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrowBooksFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ReturnFac.setBackground(new java.awt.Color(212, 200, 190));
        ReturnFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnFacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnFacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReturnFacMousePressed(evt);
            }
        });

        BooksReturnFac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BooksReturnFac.setForeground(new java.awt.Color(109, 25, 25));
        BooksReturnFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/finalredreturn.png"))); // NOI18N
        BooksReturnFac.setText(">> Return Books");

        javax.swing.GroupLayout ReturnFacLayout = new javax.swing.GroupLayout(ReturnFac);
        ReturnFac.setLayout(ReturnFacLayout);
        ReturnFacLayout.setHorizontalGroup(
            ReturnFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReturnFacLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BooksReturnFac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReturnFacLayout.setVerticalGroup(
            ReturnFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BooksReturnFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SearchFac.setBackground(new java.awt.Color(212, 200, 190));
        SearchFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchFacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchFacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchFacMousePressed(evt);
            }
        });

        SearchBooksFac.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchBooksFac.setForeground(new java.awt.Color(109, 25, 25));
        SearchBooksFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/redsearch.png"))); // NOI18N
        SearchBooksFac.setText(">> Search");

        javax.swing.GroupLayout SearchFacLayout = new javax.swing.GroupLayout(SearchFac);
        SearchFac.setLayout(SearchFacLayout);
        SearchFacLayout.setHorizontalGroup(
            SearchFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchFacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchBooksFac, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        SearchFacLayout.setVerticalGroup(
            SearchFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchFacLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SearchBooksFac, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logoutfac.setBackground(new java.awt.Color(212, 200, 190));
        logoutfac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutfacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutfacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutfacMousePressed(evt);
            }
        });

        logouticon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logouticon.setForeground(new java.awt.Color(109, 25, 25));
        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/exitred (2).png"))); // NOI18N
        logouticon.setText(">> Logout");

        javax.swing.GroupLayout logoutfacLayout = new javax.swing.GroupLayout(logoutfac);
        logoutfac.setLayout(logoutfacLayout);
        logoutfacLayout.setHorizontalGroup(
            logoutfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutfacLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logouticon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        logoutfacLayout.setVerticalGroup(
            logoutfacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logouticon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FacultyMenuLayout = new javax.swing.GroupLayout(FacultyMenu);
        FacultyMenu.setLayout(FacultyMenuLayout);
        FacultyMenuLayout.setHorizontalGroup(
            FacultyMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReturnFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FacultyMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(HomeFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BooksFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutfac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FacultyMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addComponent(BorrowFac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FacultyMenuLayout.setVerticalGroup(
            FacultyMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacultyMenuLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(HomeFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BooksFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrowFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutfac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        FacultySystem.add(FacultyMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        FacultyHomePage.setBackground(new java.awt.Color(212, 200, 190));
        FacultyHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(109, 25, 25));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setBackground(new java.awt.Color(240, 231, 218));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 231, 218));
        jLabel15.setText("Books Borrowed:");

        ViewBorrowFac.setBackground(new java.awt.Color(212, 200, 190));
        ViewBorrowFac.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ViewBorrowFac.setText("View Here");
        ViewBorrowFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBorrowFacActionPerformed(evt);
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
                .addComponent(ViewBorrowFac, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewBorrowFac)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FacultyHomePage.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 280, 50));

        welcometext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        welcometext.setForeground(new java.awt.Color(109, 25, 25));
        welcometext.setText("Welcome to Learning Space library system! What would you like to do?");
        FacultyHomePage.add(welcometext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 700, -1));

        TransparentFac.setBackground(new java.awt.Color(109, 25, 25));
        TransparentFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 231, 218), 2));

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

        javax.swing.GroupLayout TransparentFacLayout = new javax.swing.GroupLayout(TransparentFac);
        TransparentFac.setLayout(TransparentFacLayout);
        TransparentFacLayout.setHorizontalGroup(
            TransparentFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentFacLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(ClicBookStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickSearchStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickBorrowStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClickReturnStud, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        TransparentFacLayout.setVerticalGroup(
            TransparentFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentFacLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(TransparentFacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClickSearchStud)
                    .addComponent(ClickReturnStud)
                    .addComponent(ClickBorrowStud)
                    .addComponent(ClicBookStud))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        FacultyHomePage.add(TransparentFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 690, 240));
        FacultyHomePage.add(StudentWP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/FacWP.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        FacultyHomePage.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        FacultySystem.add(FacultyHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        BookFac.setBackground(new java.awt.Color(240, 231, 218));
        BookFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentStudBook.setBackground(new java.awt.Color(240, 231, 218));
        TransparentStudBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 200, 190), 2));
        TransparentStudBook.setForeground(new java.awt.Color(109, 25, 25));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, booksList1, addlibrarian4);
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
        columnBinding.setColumnName("Status");
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

        BookFac.add(TransparentStudBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 290));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(109, 25, 25));
        jLabel13.setText("Not the book you are looking for? Request for a book to add!");
        BookFac.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 40));

        BookReq.setBackground(new java.awt.Color(212, 200, 190));
        BookReq.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BookReq.setForeground(new java.awt.Color(109, 25, 25));
        BookReq.setText("Request Book +");
        BookReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReqActionPerformed(evt);
            }
        });
        BookFac.add(BookReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        FacultySystem.add(BookFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        BookBorrowFac.setBackground(new java.awt.Color(240, 231, 218));
        BookBorrowFac.setPreferredSize(new java.awt.Dimension(720, 410));
        BookBorrowFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin7.setBackground(new java.awt.Color(152, 108, 98));
        TransparentAdmin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 200, 190), 2));
        TransparentAdmin7.setForeground(new java.awt.Color(109, 25, 25));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 231, 218));
        jLabel28.setText("Enter ID Number:");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(240, 231, 218));
        jLabel30.setText("Enter Book ID:");

        EnterBIDFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterBIDFacKeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 231, 218));
        jLabel31.setText("Enter Book Title:");

        TitleFac.setEditable(false);

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 231, 218));
        jLabel33.setText("Current Date:");

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 231, 218));
        jLabel34.setText("Return Date:");

        FacBorrowBook.setBackground(new java.awt.Color(240, 231, 218));
        FacBorrowBook.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FacBorrowBook.setForeground(new java.awt.Color(109, 25, 25));
        FacBorrowBook.setText("BORROW");
        FacBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacBorrowBookActionPerformed(evt);
            }
        });

        FacCancelBorrow.setBackground(new java.awt.Color(240, 231, 218));
        FacCancelBorrow.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FacCancelBorrow.setForeground(new java.awt.Color(109, 25, 25));
        FacCancelBorrow.setText("CANCEL");
        FacCancelBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacCancelBorrowActionPerformed(evt);
            }
        });

        FacBorrow.setEditable(false);
        FacBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FacBorrowMouseEntered(evt);
            }
        });

        FacReturn.setEditable(false);
        FacReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FacReturnMouseEntered(evt);
            }
        });

        SearchTitle.setBackground(new java.awt.Color(240, 231, 218));
        SearchTitle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SearchTitle.setForeground(new java.awt.Color(109, 25, 25));
        SearchTitle.setText("  Search for Book Title");
        SearchTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTitleActionPerformed(evt);
            }
        });

        SearchID.setBackground(new java.awt.Color(240, 231, 218));
        SearchID.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SearchID.setForeground(new java.awt.Color(109, 25, 25));
        SearchID.setText("  Search for Book ID");
        SearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIDActionPerformed(evt);
            }
        });

        ClearFacSrch.setBackground(new java.awt.Color(240, 231, 218));
        ClearFacSrch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ClearFacSrch.setForeground(new java.awt.Color(109, 25, 25));
        ClearFacSrch.setText("Clear");
        ClearFacSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearFacSrchActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(240, 231, 218));
        jLabel16.setText("Book Status");

        srchstatus.setEditable(false);

        javax.swing.GroupLayout TransparentAdmin7Layout = new javax.swing.GroupLayout(TransparentAdmin7);
        TransparentAdmin7.setLayout(TransparentAdmin7Layout);
        TransparentAdmin7Layout.setHorizontalGroup(
            TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                            .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin7Layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel31)
                                    .addGap(2, 2, 2)))
                            .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TitleFac, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(EnterBIDFac)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TransparentAdmin7Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FacBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FacReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin7Layout.createSequentialGroup()
                                .addComponent(FacBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FacCancelBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin7Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnterIDNoFac, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ClearFacSrch))
                            .addComponent(BrrwsrchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrrwsrchID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(srchstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        TransparentAdmin7Layout.setVerticalGroup(
            TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(EnterIDNoFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(EnterBIDFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(TitleFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34))
                            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                .addComponent(FacBorrow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(FacReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                .addComponent(ClearFacSrch)
                                .addGap(6, 6, 6)
                                .addComponent(BrrwsrchTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(BrrwsrchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchTitle)
                                    .addGroup(TransparentAdmin7Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(SearchID)))))
                        .addGap(16, 16, 16)
                        .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(srchstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(TransparentAdmin7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FacBorrowBook)
                    .addComponent(FacCancelBorrow))
                .addContainerGap())
        );

        BookBorrowFac.add(TransparentAdmin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 670, 360));

        FacultySystem.add(BookBorrowFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        ReturnBooksFac.setBackground(new java.awt.Color(212, 200, 190));
        ReturnBooksFac.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ReturnBooksFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin8.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin8.setForeground(new java.awt.Color(109, 25, 25));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("Enter ID Number:");

        UIDReturnFac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UIDReturnFacKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Enter Book ID:");

        BIDReturnFac.setEditable(false);

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Enter Book Title:");

        TitleReturnFac.setEditable(false);

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel36.setText("Date Borrowed:");

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("Due Date:");

        BookReturnFac.setBackground(new java.awt.Color(109, 25, 25));
        BookReturnFac.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookReturnFac.setForeground(new java.awt.Color(212, 200, 190));
        BookReturnFac.setText("RETURN");
        BookReturnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookReturnFacActionPerformed(evt);
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

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("Date Returned:");

        FacCurrentDate.setEditable(false);

        FacReturnDate.setEditable(false);

        DateTodayFac.setEditable(false);
        DateTodayFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DateTodayFacMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout TransparentAdmin8Layout = new javax.swing.GroupLayout(TransparentAdmin8);
        TransparentAdmin8.setLayout(TransparentAdmin8Layout);
        TransparentAdmin8Layout.setHorizontalGroup(
            TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(BookReturnFac, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(CancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                        .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel32)
                            .addComponent(jLabel29)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleReturnFac, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(BIDReturnFac, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(UIDReturnFac, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(FacReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(FacCurrentDate, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(DateTodayFac))))
                .addGap(185, 185, 185))
        );
        TransparentAdmin8Layout.setVerticalGroup(
            TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UIDReturnFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BIDReturnFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleReturnFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(FacCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(FacReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(DateTodayFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(TransparentAdmin8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookReturnFac)
                    .addComponent(CancelBtn))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ReturnBooksFac.add(TransparentAdmin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 670, 360));

        FacultySystem.add(ReturnBooksFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        FacSearch.setBackground(new java.awt.Color(240, 231, 218));
        FacSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin5.setBackground(new java.awt.Color(152, 108, 98));
        TransparentAdmin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin5.setForeground(new java.awt.Color(109, 25, 25));

        jLabel6.setBackground(new java.awt.Color(240, 231, 218));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 53)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 231, 218));
        jLabel6.setText("SEARCH BOOKS");

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/red.png"))); // NOI18N
        jLabel12.setText("Book ID:");

        clickbooksearch.setBackground(new java.awt.Color(240, 231, 218));
        clickbooksearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clickbooksearch.setForeground(new java.awt.Color(109, 25, 25));
        clickbooksearch.setText("Search");
        clickbooksearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickbooksearchActionPerformed(evt);
            }
        });

        clickbookclear.setBackground(new java.awt.Color(240, 231, 218));
        clickbookclear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clickbookclear.setForeground(new java.awt.Color(109, 25, 25));
        clickbookclear.setText("Clear");
        clickbookclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickbookclearActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Title:");

        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Status:");

        javax.swing.GroupLayout TransparentAdmin5Layout = new javax.swing.GroupLayout(TransparentAdmin5);
        TransparentAdmin5.setLayout(TransparentAdmin5Layout);
        TransparentAdmin5Layout.setHorizontalGroup(
            TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel11)
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                    .addGap(103, 103, 103)
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin5Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdmin5Layout.createSequentialGroup()
                                                .addComponent(clickbooksearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addComponent(clickbookclear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36))))))))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
        TransparentAdmin5Layout.setVerticalGroup(
            TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TransparentAdmin5Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(clickbookclear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clickbooksearch, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(TransparentAdmin5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addGap(28, 28, 28)))
        );

        FacSearch.add(TransparentAdmin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 340));

        FacultySystem.add(FacSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FacultySystem, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FacultySystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickHereStudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickHereStudMousePressed
        FeedbackFormFaculty fdback = new FeedbackFormFaculty();
        fdback.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClickHereStudMousePressed

    private void HomeFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeFacMouseEntered
        HomeFac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_HomeFacMouseEntered

    private void HomeFacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeFacMouseExited
        HomeFac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_HomeFacMouseExited

    private void HomeFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeFacMousePressed
        FacultySys fac = new FacultySys();
        fac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeFacMousePressed

    private void BooksFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksFacMouseEntered
        BooksFac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_BooksFacMouseEntered

    private void BooksFacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksFacMouseExited
        BooksFac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_BooksFacMouseExited

    private void BooksFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksFacMousePressed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(true);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
        
    }//GEN-LAST:event_BooksFacMousePressed

    private void logoutfacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutfacMouseEntered
        logoutfac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_logoutfacMouseEntered

    private void logoutfacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutfacMouseExited
        logoutfac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_logoutfacMouseExited

    private void logoutfacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutfacMousePressed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Select Option", 
                JOptionPane.YES_NO_OPTION);
        if(response == 0) {
            LoginFormNew logout = new LoginFormNew();
            logout.setVisible(true);
            this.dispose();
        }else{
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutfacMousePressed

    private void ReturnFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnFacMouseEntered
        ReturnFac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_ReturnFacMouseEntered

    private void ReturnFacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnFacMouseExited
        ReturnFac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_ReturnFacMouseExited

    private void ReturnFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnFacMousePressed
        ReturnBooksFac.setVisible(true);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
    }//GEN-LAST:event_ReturnFacMousePressed

    private void SearchFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFacMouseEntered
        SearchFac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_SearchFacMouseEntered

    private void SearchFacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFacMouseExited
        SearchFac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_SearchFacMouseExited

    private void SearchFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchFacMousePressed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(true);
    }//GEN-LAST:event_SearchFacMousePressed

    private void BorrowFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowFacMouseEntered
        BorrowFac.setBackground(new Color(176, 151, 137));
    }//GEN-LAST:event_BorrowFacMouseEntered

    private void BorrowFacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowFacMouseExited
        BorrowFac.setBackground(new Color(212, 200, 190));
    }//GEN-LAST:event_BorrowFacMouseExited

    private void BorrowFacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowFacMousePressed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(true);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
    }//GEN-LAST:event_BorrowFacMousePressed

    private void ClickSearchStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickSearchStudActionPerformed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(true);
    }//GEN-LAST:event_ClickSearchStudActionPerformed

    private void ClicBookStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClicBookStudActionPerformed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(true);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
    }//GEN-LAST:event_ClicBookStudActionPerformed

    private void ClickReturnStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickReturnStudActionPerformed
        ReturnBooksFac.setVisible(true);
        BookBorrowFac.setVisible(false);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
    }//GEN-LAST:event_ClickReturnStudActionPerformed

    private void ClickBorrowStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickBorrowStudActionPerformed
        ReturnBooksFac.setVisible(false);
        BookBorrowFac.setVisible(true);
        BookFac.setVisible(false);
        FacultyHomePage.setVisible(false);
        FacSearch.setVisible(false);
    }//GEN-LAST:event_ClickBorrowStudActionPerformed

    private void BookReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReqActionPerformed
        BookRequestFac req = new BookRequestFac();
        req.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BookReqActionPerformed

    private void ViewBorrowFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBorrowFacActionPerformed
       FacBorrowBooks viewborrow = new FacBorrowBooks();
        viewborrow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewBorrowFacActionPerformed

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

    private void EnterBIDFacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterBIDFacKeyReleased
           srchbid = "SELECT * FROM BOOKS WHERE BOOKID=?";      
        try{
            pst = con.prepareStatement(srchbid);
            pst.setString(1, EnterBIDFac.getText().trim());
            rs = pst.executeQuery();    
            
            if(rs.next()) {
                TitleFac.setText(rs.getString("TITLE"));        
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EnterBIDFacKeyReleased

    private void FacBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacBorrowBookActionPerformed
    UID = Integer.parseInt(EnterIDNoFac.getText());
        uidissue = String.valueOf(UID);
        BID = Integer.parseInt(EnterBIDFac.getText());
        bidissue = String.valueOf(BID);
        title = TitleFac.getText();
        borrowdate = FacBorrow.getText();
        returndate = FacReturn.getText();
        
        try {
            stmt=con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID="+bidissue+"");
            if(rs.next()) {
                ResultSet rsl = stmt.executeQuery("SELECT * FROM USERS WHERE IDNO="+uidissue+"");
                if(rsl.next()) {
                    stmt.executeUpdate("INSERT INTO BORROW_BOOKS VALUES("+uidissue+","+bidissue+",'"+title+"', '"+borrowdate+"', "
                            + "'"+returndate+"')");
                    JOptionPane.showMessageDialog(null, "Thank you! Your book borrow request is now pending.");
                    EnterIDNoFac.setText("");
                    FacBorrow.setText("");
                    FacReturn.setText("");
                    EnterBIDFac.setText("");
                    TitleFac.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect ID Number!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect BookID!");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Your book borrow request is already pending.");
        }
    }//GEN-LAST:event_FacBorrowBookActionPerformed

    private void FacCancelBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacCancelBorrowActionPerformed
       CancelBtn(); 
        EnterIDNoFac.setText("");
        TitleFac.setText("");
        EnterBIDFac.setText("");
    }//GEN-LAST:event_FacCancelBorrowActionPerformed

    private void UIDReturnFacKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UIDReturnFacKeyReleased
         try{
          bookreturn = "SELECT BORROW_BOOKS.BOOKID, BORROW_BOOKS.TITLE, BORROW_BOOKS.CURRENTDATE, BORROW_BOOKS.RETURNDATE"
                  + " FROM BORROW_BOOKS WHERE BORROW_BOOKS.IDNO="+UIDReturnFac.getText()+"";
          
            
            pst = con.prepareStatement(bookreturn);
            rs = pst.executeQuery();
            
            if(rs.next()) {
                BIDReturnFac.setText(rs.getString("BOOKID"));
                TitleReturnFac.setText(rs.getString("TITLE"));
                FacCurrentDate.setText(rs.getString("CURRENTDATE"));
                 FacReturnDate.setText(rs.getString("RETURNDATE"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UIDReturnFacKeyReleased

    private void BookReturnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookReturnFacActionPerformed

            Uuid = Integer.parseInt(UIDReturnFac.getText());
            UUsuid = String.valueOf(Uuid);
            
            BBbid = Integer.parseInt(BIDReturnFac.getText());
            Bbsuid = String.valueOf(BBbid);
            
            Btitle = TitleReturnFac.getText();
            borrowd = FacCurrentDate.getText();
            duedate = FacReturnDate.getText();
            retdate = DateTodayFac.getText();
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
            
        UIDReturnFac.setText("");
        BIDReturnFac.setText("");
        TitleReturnFac.setText("");
        FacCurrentDate.setText("");
        FacReturnDate.setText("");
        DateTodayFac.setText("");            
                      
               
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Book has been returned.");
        }
       
    }//GEN-LAST:event_BookReturnFacActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        CancelBtn();
        UIDReturnFac.setText("");
        BIDReturnFac.setText("");
        TitleReturnFac.setText("");
    }//GEN-LAST:event_CancelBtnActionPerformed

    private void FacBorrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacBorrowMouseEntered
        FacBorrow.setText(sdf.format(thisDate));
    }//GEN-LAST:event_FacBorrowMouseEntered

    private void FacReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacReturnMouseEntered
        FacReturn.setText(addSubtractDate(75));
    }//GEN-LAST:event_FacReturnMouseEntered

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

    private void ClearFacSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearFacSrchActionPerformed
        BrrwsrchTitle.setText("");
        BrrwsrchID.setText("");
        srchstatus.setText("");
        SearchTitle.setEnabled(true);
        SearchID.setEnabled(true);       
    }//GEN-LAST:event_ClearFacSrchActionPerformed

    private void DateTodayFacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateTodayFacMouseEntered
        DateTodayFac.setText(sdf.format(thisDate));
    }//GEN-LAST:event_DateTodayFacMouseEntered

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
            java.util.logging.Logger.getLogger(FacultySys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultySys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultySys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultySys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultySys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BIDReturnFac;
    private javax.swing.JPanel BookBorrowFac;
    private javax.swing.JPanel BookFac;
    private javax.swing.JButton BookReq;
    private javax.swing.JButton BookReturnFac;
    private javax.swing.JPanel BooksFac;
    private javax.swing.JLabel BooksFacIcon;
    private javax.swing.JLabel BooksReturnFac;
    private javax.swing.JLabel BorrowBooksFac;
    private javax.swing.JPanel BorrowFac;
    private javax.swing.JTextField BrrwsrchID;
    private javax.swing.JTextField BrrwsrchTitle;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JButton ClearFacSrch;
    private javax.swing.JButton ClicBookStud;
    private javax.swing.JButton ClickBorrowStud;
    private javax.swing.JLabel ClickHereStud;
    private javax.swing.JButton ClickReturnStud;
    private javax.swing.JButton ClickSearchStud;
    private javax.swing.JTextField DateTodayFac;
    private javax.swing.JTextField EnterBIDFac;
    private javax.swing.JTextField EnterIDNoFac;
    private javax.swing.JLabel Fac;
    private javax.swing.JTextField FacBorrow;
    private javax.swing.JButton FacBorrowBook;
    private javax.swing.JButton FacCancelBorrow;
    private javax.swing.JTextField FacCurrentDate;
    private javax.swing.JTextField FacReturn;
    private javax.swing.JTextField FacReturnDate;
    private javax.swing.JPanel FacSearch;
    private javax.swing.JPanel FacultyFooter;
    private javax.swing.JPanel FacultyHeader;
    private javax.swing.JPanel FacultyHomePage;
    private javax.swing.JPanel FacultyMenu;
    private javax.swing.JPanel FacultySystem;
    private javax.swing.JPanel HomeFac;
    private javax.persistence.EntityManager LibrarySystemPUEntityManager;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel ReturnBooksFac;
    private javax.swing.JPanel ReturnFac;
    private javax.swing.JLabel SearchBooksFac;
    private javax.swing.JPanel SearchFac;
    private javax.swing.JButton SearchID;
    private javax.swing.JButton SearchTitle;
    private javax.swing.JLabel StudentWP;
    private javax.swing.JTextField TitleFac;
    private javax.swing.JTextField TitleReturnFac;
    private javax.swing.JPanel TransparentAdmin5;
    private javax.swing.JPanel TransparentAdmin7;
    private javax.swing.JPanel TransparentAdmin8;
    private javax.swing.JPanel TransparentFac;
    private javax.swing.JPanel TransparentStudBook;
    private javax.swing.JTextField UIDReturnFac;
    private javax.swing.JButton ViewBorrowFac;
    private javax.swing.JTable addlibrarian4;
    private javax.swing.JTextField bookid;
    private java.util.List<LibrarySystemForms.Books> booksList;
    private java.util.List<LibrarySystemForms.Books> booksList1;
    private javax.persistence.Query booksQuery;
    private javax.persistence.Query booksQuery1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel logoutfac;
    private javax.swing.JLabel logouticon;
    private javax.swing.JTextField srchstatus;
    private javax.swing.JLabel welcometext;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
