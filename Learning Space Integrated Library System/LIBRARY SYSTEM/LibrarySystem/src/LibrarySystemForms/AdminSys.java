package LibrarySystemForms;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class AdminSys extends LibConnect{
        DefaultTableModel model = new DefaultTableModel();
        int ctr=0;
    public AdminSys() {
        initComponents();
        DoConnectUsers();
        DoConnectBooks();
        DoConnectBorrowersBooks();
        BookDisplay();
        UserDisplay();
        UserDisabled();
        showAll();
        showAllUserButtons();
        
        BookIDAdmin.setEnabled(false);
        BookTitleAdmin.setEnabled(false);
        BookAuthorAdmin.setEnabled(false);
        CurrentStatusAdmin.setEnabled(false);
        BookCDAdmin.setEnabled(false);
        
        TransparentAdmin.setBackground(new Color(236, 240, 241, 90));
        
        AdminHomePage.setVisible(true);
        Books.setVisible(false);
        DisplayRec.setVisible(false);
        Users.setVisible(false); 
        IssueBooks.setVisible(false);
        
        
    }
    void GetBookRecords(){
            try {
                bookID = rs.getInt("BOOKID");
                title = rs.getString("TITLE");
                author = rs.getString("AUTHOR");
                status = rs.getString("STATUS");
                copyright = rs.getString("COPYRIGHTDATE");
                
                BookIDAdmin.setText(String.valueOf(bookID));
                BookTitleAdmin.setText(title);
                BookAuthorAdmin.setText(author);
                CurrentStatusAdmin.setText(status);
                BookCDAdmin.setText(copyright);
                
                
            }catch (SQLException err){
                JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
        }
    }
        void showAll(){
            try{
                BookIDAdmin.setEnabled(true);
                BookTitleAdmin.setEnabled(true);
                BookAuthorAdmin.setEnabled(true);
                bookdelete.setEnabled(true);
                booksearch.setEnabled(true);
                booksupdate.setEnabled(false);
                booksave.setEnabled(false);
                bookedit.setEnabled(true);
                bookadd.setEnabled(true);
                bookcancel.setEnabled(true);
                rs.first();
                GetBookRecords();
            }catch (SQLException e){
                System.out.println(e); 
            }
        }
        
    void CancelBtn () {
        AdminHomePage.setVisible(true);
        Books.setVisible(false);
        DisplayRec.setVisible(false);
        Users.setVisible(false); 
        IssueBooks.setVisible(false);

// LIST FOR BOOKS
     } public ArrayList<AddClass> listbooks(){
        ArrayList<AddClass> listbooks = new ArrayList<>();
        try{
            selectbooks = "SELECT * FROM BOOKS"; 
            stmt = con.createStatement();
            //pst = con.prepareStatement(selectbooks);
            rs = stmt.executeQuery(selectbooks);

            AddClass books;
            while(rs.next()) {
                books = new AddClass(rs.getInt("BOOKID"), rs.getString("TITLE"), rs.getString("AUTHOR"), 
                rs.getString("STATUS"), rs.getString("COPYRIGHTDATE"));
                listbooks.add(books);
            }
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
    }return listbooks;
    
    
    // BOOKS TABLE DISPLAY
    } public void BookDisplay(){
       ArrayList<AddClass> list = listbooks();
        model = (DefaultTableModel)booktableadmin.getModel();
       Object[] row = new Object[5];
       for(int ctr = 0; ctr < list.size(); ctr++){
           row[0] = list.get(ctr).getBID();
           row[1] = list.get(ctr).getTitle();
           row[2] = list.get(ctr).getAuthor();
           row[3] = list.get(ctr).getStatus();
           row[4] = list.get(ctr).getCopyrightDate();
           
           model.addRow(row); {
           
       }
       }
       
       // LIST FOR USERS
     }public ArrayList<ClassUsers> listusers(){
        ArrayList<ClassUsers> listusers = new ArrayList<>();
        try{
            selectusers = "SELECT * FROM USERS"; 
            stmt = con.createStatement();
            //pst = con.prepareStatement(selectbooks);
            rs = stmt.executeQuery(selectusers);

            ClassUsers users;
            while(rs.next()) {
                users = new ClassUsers(rs.getInt("IDNO"), rs.getString("FIRSTNAME"), rs.getString("MIDDLENAME"), rs.getString("SURNAME"),
                rs.getString("PASSWORD"), rs.getString("MEMBERTYPE"), rs.getString("GENDER"), rs.getString("BIRTHDATE"), 
                rs.getString("COURSE"), rs.getString("YEARLEVEL"), rs.getString("EMAIL"), rs.getString("CONTACT"));
                
                listusers.add(users);
            }
    }catch(Exception e) {
        JOptionPane.showMessageDialog(null, e);
        
    }return listusers;
     
    // USERS TABLE DISPLAY
    } public void UserDisplay(){
       ArrayList<ClassUsers> list = listusers();
       DefaultTableModel model = (DefaultTableModel)userstableadmin.getModel();
       Object[] row = new Object[12];
       for(int ctr = 0; ctr < list.size(); ctr++){
           row[0] = list.get(ctr).getUID();
           row[1] = list.get(ctr).getFNAME();
           row[2] = list.get(ctr).getMNAME();
           row[3] = list.get(ctr).getSNAME();
           row[4] = list.get(ctr).getPASS();
           row[5] = list.get(ctr).getMEMTYPE();
           row[6] = list.get(ctr).getGENDER();
           row[7] = list.get(ctr).getBIRTHDATE();
           row[8] = list.get(ctr).getCOURSE();
           row[9] = list.get(ctr).getYRLEVEL();
           row[10] = list.get(ctr).getEMAIL();
           row[11] = list.get(ctr).getCONTACT();   
           
           model.addRow(row); {
           
       }
       }
   
}
    void GetUserRecords(){
            try {
                userID = rs.getInt("IDNO");
                fname = rs.getString("FIRSTNAME");
                mname = rs.getString("MIDDLENAME");
                sname = rs.getString("SURNAME");
                passw = rs.getString("PASSWORD");
                mt = rs.getString("MEMBERTYPE");
                gender = rs.getString("GENDER");
                bdate = rs.getString("BIRTHDATE");
                crse = rs.getString("COURSE");
                yrlvl = rs.getString("YEARLEVEL");
                email = rs.getString("EMAIL");
                cntct = rs.getString("CONTACT");
                
                UserIDAdmin.setText(String.valueOf(userID));
                FnameUserAdmin.setText(fname);
                MnameUserAdmin.setText(mname);
                SnameUserAdmin.setText(sname);
                PassUserAdmin.setText(String.valueOf(passw));
                MTUserAdmin.setText(mt);
                GenderUserAdmin.setText(gender);
                BdateUserAdmin.setText(bdate);
                CourseUserAdmin.setText(crse);
                YrlvlUserAdmin.setText(yrlvl);
                EmailUserAdmin.setText(email);
                ContactUserAdmin.setText(String.valueOf(cntct));
                
                
            }catch (SQLException err){
                JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
    }
            
    }public void UserDisabled() {
        UserIDAdmin.setEnabled(false);
        FnameUserAdmin.setEnabled(false);
        MnameUserAdmin.setEnabled(false);
        SnameUserAdmin.setEnabled(false);
        PassUserAdmin.setEnabled(false);
        MTUserAdmin.setEnabled(false);
        GenderUserAdmin.setEnabled(false);
        CourseUserAdmin.setEnabled(false);
        YrlvlUserAdmin.setEnabled(false);
        BdateUserAdmin.setEnabled(false);
        EmailUserAdmin.setEnabled(false);
        ContactUserAdmin.setEnabled(false);

    } public void showAllUserButtons() {
        UserAdd.setEnabled(true);
        UserEdit.setEnabled(true);
        UserDelete.setEnabled(true);
        UserSearch.setEnabled(true);
        UserSave.setEnabled(false);
        UserUpdate.setEnabled(false);
        UserCancel.setEnabled(true);
        
    } private void getInfo() {
        try{
//        FNissue.setText(rs.getString("FIRSTNAME"));
//        MNissue.setText(rs.getString("MIDDLENAME"));
//        SNissue.setText(rs.getString("SURNAME"));
        }catch(Exception e) {
    JOptionPane.showMessageDialog(rootPane, e);
}
    } public void BookDisabled() {
      BookIDAdmin.setEnabled(false);  
      BookTitleAdmin.setEnabled(false);  
      BookAuthorAdmin.setEnabled(false);  
      CurrentStatusAdmin.setEnabled(false);  
      BookAvail.setEnabled(false);  
      BookNotAvail.setEnabled(false);  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel3 = new javax.swing.JLabel();
        BookStatusAdmin = new javax.swing.ButtonGroup();
        LibrarySystemPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("LibrarySystemPU").createEntityManager();
        usersQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery.getResultList();
        usersQuery1 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery1.getResultList();
        usersQuery2 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery2.getResultList();
        usersQuery3 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery3.getResultList();
        usersQuery4 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery4.getResultList();
        usersQuery5 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery5.getResultList();
        usersQuery6 = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT u FROM Users u");
        usersList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usersQuery6.getResultList();
        booksQuery = java.beans.Beans.isDesignTime() ? null : LibrarySystemPUEntityManager.createQuery("SELECT b FROM Books b");
        booksList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : booksQuery.getResultList();
        AdminSystem = new javax.swing.JPanel();
        AdminHeader = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        AdminFooter = new javax.swing.JPanel();
        AdminMenu = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        homeadmin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        booksadmin = new javax.swing.JPanel();
        booksadminicon = new javax.swing.JLabel();
        records = new javax.swing.JPanel();
        recordsicon = new javax.swing.JLabel();
        logoutadmin = new javax.swing.JPanel();
        logouticon = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        usersadmin = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        issuebook = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AdminHomePage = new javax.swing.JPanel();
        welcometext = new javax.swing.JLabel();
        addadmin = new javax.swing.JButton();
        TransparentAdmin = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LoginAdmin = new javax.swing.JTable();
        ClickRecords = new javax.swing.JButton();
        ClickUsers = new javax.swing.JButton();
        BorrowersList = new javax.swing.JButton();
        IssuedListHomePage = new javax.swing.JButton();
        AdminWP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Books = new javax.swing.JPanel();
        TransparentAdmin4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        booktableadmin = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookedit = new javax.swing.JButton();
        bookadd = new javax.swing.JButton();
        bookdelete = new javax.swing.JButton();
        booksearch = new javax.swing.JButton();
        bookcancel = new javax.swing.JButton();
        booksave = new javax.swing.JButton();
        booksupdate = new javax.swing.JButton();
        BookIDAdmin = new javax.swing.JTextField();
        BookTitleAdmin = new javax.swing.JTextField();
        BookAuthorAdmin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CurrentStatusAdmin = new javax.swing.JTextField();
        BookNotAvail = new javax.swing.JRadioButton();
        BookAvail = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BookCDAdmin = new javax.swing.JTextField();
        IssueBooks = new javax.swing.JPanel();
        TransparentAdmin5 = new javax.swing.JPanel();
        btn_issue_cancel = new javax.swing.JButton();
        IssueAdmin = new javax.swing.JButton();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        BookIDissue = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        Titleissue = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        SNissue = new javax.swing.JTextField();
        IDNoissue = new javax.swing.JTextField();
        FNissue = new javax.swing.JTextField();
        MNissue = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        MTissue = new javax.swing.JTextField();
        BookList = new javax.swing.JButton();
        ReturnDate = new javax.swing.JTextField();
        IssueDate = new javax.swing.JTextField();
        IssuedList = new javax.swing.JButton();
        DisplayRec = new javax.swing.JPanel();
        TransparentAdmin7 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        IDNRecordsAdmin = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        FNRecordsAdmin = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        MNRecordsAdmin = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        SNRecordsAdmin = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        MTRecordsAdmin = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        BIDRecordsAdmin = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        TitleRecordsAdmin = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        AuthorRecordsAdmin = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        BorrDateRecordsAdmin = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DuedateAdmin = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        ReturnRecordsAdmin = new javax.swing.JTextField();
        Users = new javax.swing.JPanel();
        TransparentAdmin8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        userstableadmin = new javax.swing.JTable();
        PassUserAdmin = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        SnameUserAdmin = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        MnameUserAdmin = new javax.swing.JTextField();
        FnameUserAdmin = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        MTUserAdmin = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        GenderUserAdmin = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        BdateUserAdmin = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        CourseUserAdmin = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        YrlvlUserAdmin = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        ContactUserAdmin = new javax.swing.JTextField();
        UserAdd = new javax.swing.JButton();
        UserUpdate = new javax.swing.JButton();
        UserDelete = new javax.swing.JButton();
        UserIDAdmin = new javax.swing.JTextField();
        UserSave = new javax.swing.JButton();
        UserCancel = new javax.swing.JButton();
        UserSearch = new javax.swing.JButton();
        UserEdit = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        EmailUserAdmin = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN LIBRARY SYSTEM");

        AdminSystem.setBackground(new java.awt.Color(212, 200, 190));
        AdminSystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminHeader.setBackground(new java.awt.Color(109, 25, 25));
        AdminHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 231, 218));
        jLabel1.setText("LEARNING SPACE INTEGRATED LIBRARY SYSTEM");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/logoo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 231, 218));
        jLabel2.setText("ADMIN");

        javax.swing.GroupLayout AdminHeaderLayout = new javax.swing.GroupLayout(AdminHeader);
        AdminHeader.setLayout(AdminHeaderLayout);
        AdminHeaderLayout.setHorizontalGroup(
            AdminHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminHeaderLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AdminHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminHeaderLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Logo))
                    .addGroup(AdminHeaderLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AdminHeaderLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel2)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        AdminHeaderLayout.setVerticalGroup(
            AdminHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminHeaderLayout.createSequentialGroup()
                .addGroup(AdminHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo)
                    .addGroup(AdminHeaderLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminSystem.add(AdminHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 750, 80));

        AdminFooter.setBackground(new java.awt.Color(109, 25, 25));
        AdminFooter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, null, java.awt.Color.white));

        javax.swing.GroupLayout AdminFooterLayout = new javax.swing.GroupLayout(AdminFooter);
        AdminFooter.setLayout(AdminFooterLayout);
        AdminFooterLayout.setHorizontalGroup(
            AdminFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        AdminFooterLayout.setVerticalGroup(
            AdminFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        AdminSystem.add(AdminFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 750, 30));

        AdminMenu.setBackground(new java.awt.Color(109, 25, 25));
        AdminMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.white, java.awt.Color.white));

        homeadmin.setBackground(new java.awt.Color(109, 25, 25));
        homeadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeadminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeadminMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 231, 218));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/home (7).png"))); // NOI18N
        jLabel4.setText(">> Home");

        javax.swing.GroupLayout homeadminLayout = new javax.swing.GroupLayout(homeadmin);
        homeadmin.setLayout(homeadminLayout);
        homeadminLayout.setHorizontalGroup(
            homeadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeadminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        homeadminLayout.setVerticalGroup(
            homeadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        booksadmin.setBackground(new java.awt.Color(109, 25, 25));
        booksadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booksadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booksadminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                booksadminMousePressed(evt);
            }
        });

        booksadminicon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        booksadminicon.setForeground(new java.awt.Color(240, 231, 218));
        booksadminicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/book-with-white-bookmark (1).png"))); // NOI18N
        booksadminicon.setText(">> Books");

        javax.swing.GroupLayout booksadminLayout = new javax.swing.GroupLayout(booksadmin);
        booksadmin.setLayout(booksadminLayout);
        booksadminLayout.setHorizontalGroup(
            booksadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, booksadminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(booksadminicon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        booksadminLayout.setVerticalGroup(
            booksadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(booksadminicon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        records.setBackground(new java.awt.Color(109, 25, 25));
        records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recordsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recordsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recordsMousePressed(evt);
            }
        });

        recordsicon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        recordsicon.setForeground(new java.awt.Color(240, 231, 218));
        recordsicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/records.png"))); // NOI18N
        recordsicon.setText(">> Records");

        javax.swing.GroupLayout recordsLayout = new javax.swing.GroupLayout(records);
        records.setLayout(recordsLayout);
        recordsLayout.setHorizontalGroup(
            recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recordsicon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        recordsLayout.setVerticalGroup(
            recordsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recordsicon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        logoutadmin.setBackground(new java.awt.Color(109, 25, 25));
        logoutadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutadminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutadminMousePressed(evt);
            }
        });

        logouticon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logouticon.setForeground(new java.awt.Color(240, 231, 218));
        logouticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/exit-logout-2857 (1).png"))); // NOI18N
        logouticon.setText(">> Logout");

        javax.swing.GroupLayout logoutadminLayout = new javax.swing.GroupLayout(logoutadmin);
        logoutadmin.setLayout(logoutadminLayout);
        logoutadminLayout.setHorizontalGroup(
            logoutadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoutadminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logouticon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        logoutadminLayout.setVerticalGroup(
            logoutadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logouticon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        usersadmin.setBackground(new java.awt.Color(109, 25, 25));
        usersadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersadminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usersadminMousePressed(evt);
            }
        });

        users.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        users.setForeground(new java.awt.Color(240, 231, 218));
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/users.png"))); // NOI18N
        users.setText(">> Users");

        javax.swing.GroupLayout usersadminLayout = new javax.swing.GroupLayout(usersadmin);
        usersadmin.setLayout(usersadminLayout);
        usersadminLayout.setHorizontalGroup(
            usersadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usersadminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(users, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        usersadminLayout.setVerticalGroup(
            usersadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        issuebook.setBackground(new java.awt.Color(109, 25, 25));
        issuebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuebookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issuebookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issuebookMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 231, 218));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/borrow-icon-10 (1).png"))); // NOI18N
        jLabel5.setText(">> Issue Books");

        javax.swing.GroupLayout issuebookLayout = new javax.swing.GroupLayout(issuebook);
        issuebook.setLayout(issuebookLayout);
        issuebookLayout.setHorizontalGroup(
            issuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issuebookLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        issuebookLayout.setVerticalGroup(
            issuebookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AdminMenuLayout = new javax.swing.GroupLayout(AdminMenu);
        AdminMenu.setLayout(AdminMenuLayout);
        AdminMenuLayout.setHorizontalGroup(
            AdminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(records, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(usersadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AdminMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(issuebook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(booksadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homeadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(AdminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        AdminMenuLayout.setVerticalGroup(
            AdminMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(homeadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(booksadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(issuebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(records, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        AdminSystem.add(AdminMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        AdminHomePage.setBackground(new java.awt.Color(212, 200, 190));
        AdminHomePage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcometext.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        welcometext.setForeground(new java.awt.Color(240, 231, 218));
        welcometext.setText("Welcome to Learning Space library system! What would you like to do?");
        AdminHomePage.add(welcometext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 700, -1));

        addadmin.setBackground(new java.awt.Color(240, 231, 218));
        addadmin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addadmin.setForeground(new java.awt.Color(109, 25, 25));
        addadmin.setText("Add Librarian +");
        addadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addadminActionPerformed(evt);
            }
        });
        AdminHomePage.add(addadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        TransparentAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usersList2, LoginAdmin);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idno}"));
        columnBinding.setColumnName("USER ID NO");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstname}"));
        columnBinding.setColumnName("FIRST NAME");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${middlename}"));
        columnBinding.setColumnName("MIDDLE NAME");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${surname}"));
        columnBinding.setColumnName("SURNAME");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(LoginAdmin);

        ClickRecords.setBackground(new java.awt.Color(109, 25, 25));
        ClickRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/records2 (10).png"))); // NOI18N
        ClickRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickRecordsActionPerformed(evt);
            }
        });

        ClickUsers.setBackground(new java.awt.Color(109, 25, 25));
        ClickUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/usersss.png"))); // NOI18N
        ClickUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickUsersActionPerformed(evt);
            }
        });

        BorrowersList.setBackground(new java.awt.Color(240, 231, 218));
        BorrowersList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BorrowersList.setForeground(new java.awt.Color(109, 25, 25));
        BorrowersList.setText("View Borrowers");
        BorrowersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowersListActionPerformed(evt);
            }
        });

        IssuedListHomePage.setBackground(new java.awt.Color(240, 231, 218));
        IssuedListHomePage.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        IssuedListHomePage.setForeground(new java.awt.Color(109, 25, 25));
        IssuedListHomePage.setText("View Issued List");
        IssuedListHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuedListHomePageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransparentAdminLayout = new javax.swing.GroupLayout(TransparentAdmin);
        TransparentAdmin.setLayout(TransparentAdminLayout);
        TransparentAdminLayout.setHorizontalGroup(
            TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransparentAdminLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClickRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IssuedListHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClickUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BorrowersList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TransparentAdminLayout.setVerticalGroup(
            TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .addGroup(TransparentAdminLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BorrowersList)
                    .addComponent(IssuedListHomePage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransparentAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClickRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClickUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminHomePage.add(TransparentAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 690, 270));
        AdminHomePage.add(AdminWP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySystemForms/adminwallpaper (5).jpg"))); // NOI18N
        AdminHomePage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        AdminSystem.add(AdminHomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        Books.setBackground(new java.awt.Color(212, 200, 190));
        Books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin4.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin4.setForeground(new java.awt.Color(109, 25, 25));
        TransparentAdmin4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        booktableadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK ID", "TITLE", "AUTHOR", "STATUS", "COPYRIGHT DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booktableadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booktableadminMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(booktableadmin);

        TransparentAdmin4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 2, 342, 336));

        jLabel9.setText("Book ID:");
        TransparentAdmin4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel10.setText("Title:");
        TransparentAdmin4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel11.setText("Author");
        TransparentAdmin4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel12.setText("Current Status:");
        TransparentAdmin4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        bookedit.setBackground(new java.awt.Color(109, 25, 25));
        bookedit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookedit.setForeground(new java.awt.Color(212, 200, 190));
        bookedit.setText("EDIT");
        bookedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookeditActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(bookedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 70, -1));

        bookadd.setBackground(new java.awt.Color(109, 25, 25));
        bookadd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookadd.setForeground(new java.awt.Color(212, 200, 190));
        bookadd.setText("ADD");
        bookadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookaddActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(bookadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, -1));

        bookdelete.setBackground(new java.awt.Color(109, 25, 25));
        bookdelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookdelete.setForeground(new java.awt.Color(212, 200, 190));
        bookdelete.setText("DELETE");
        bookdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookdeleteActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(bookdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        booksearch.setBackground(new java.awt.Color(109, 25, 25));
        booksearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        booksearch.setForeground(new java.awt.Color(212, 200, 190));
        booksearch.setText("SEARCH");
        booksearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksearchActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(booksearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        bookcancel.setBackground(new java.awt.Color(109, 25, 25));
        bookcancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bookcancel.setForeground(new java.awt.Color(212, 200, 190));
        bookcancel.setText("CANCEL");
        bookcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookcancelActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(bookcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        booksave.setBackground(new java.awt.Color(109, 25, 25));
        booksave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        booksave.setForeground(new java.awt.Color(212, 200, 190));
        booksave.setText("SAVE");
        booksave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksaveActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(booksave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, -1));

        booksupdate.setBackground(new java.awt.Color(109, 25, 25));
        booksupdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        booksupdate.setForeground(new java.awt.Color(212, 200, 190));
        booksupdate.setText("UPDATE");
        booksupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksupdateActionPerformed(evt);
            }
        });
        TransparentAdmin4.add(booksupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 90, -1));
        TransparentAdmin4.add(BookIDAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 220, -1));
        TransparentAdmin4.add(BookTitleAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 220, -1));
        TransparentAdmin4.add(BookAuthorAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 220, -1));
        TransparentAdmin4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        CurrentStatusAdmin.setEditable(false);
        TransparentAdmin4.add(CurrentStatusAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, -1));

        BookNotAvail.setText("Unavailable");
        BookNotAvail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BookNotAvailItemStateChanged(evt);
            }
        });
        TransparentAdmin4.add(BookNotAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, -1));

        BookAvail.setText("Available");
        BookAvail.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BookAvailItemStateChanged(evt);
            }
        });
        TransparentAdmin4.add(BookAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, -1));

        jLabel14.setText("Status:");
        TransparentAdmin4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel16.setText("Copyright Date:");
        TransparentAdmin4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        TransparentAdmin4.add(BookCDAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, -1));

        Books.add(TransparentAdmin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 340));

        AdminSystem.add(Books, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        IssueBooks.setBackground(new java.awt.Color(212, 200, 190));
        IssueBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin5.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin5.setForeground(new java.awt.Color(109, 25, 25));
        TransparentAdmin5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_issue_cancel.setBackground(new java.awt.Color(109, 25, 25));
        btn_issue_cancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_issue_cancel.setForeground(new java.awt.Color(212, 200, 190));
        btn_issue_cancel.setText("CANCEL");
        btn_issue_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issue_cancelActionPerformed(evt);
            }
        });
        TransparentAdmin5.add(btn_issue_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 269, -1, -1));

        IssueAdmin.setBackground(new java.awt.Color(109, 25, 25));
        IssueAdmin.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        IssueAdmin.setForeground(new java.awt.Color(212, 200, 190));
        IssueAdmin.setText("ISSUE");
        IssueAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueAdminActionPerformed(evt);
            }
        });
        TransparentAdmin5.add(IssueAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 269, 70, -1));

        jLabel78.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel78.setText("ID Number:");
        TransparentAdmin5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel79.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel79.setText("First Name:");
        TransparentAdmin5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel80.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel80.setText("Middle Name:");
        TransparentAdmin5.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel81.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel81.setText("Surname:");
        TransparentAdmin5.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel82.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel82.setText("Book ID:");
        TransparentAdmin5.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        BookIDissue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BookIDissueKeyReleased(evt);
            }
        });
        TransparentAdmin5.add(BookIDissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 160, -1));

        jLabel83.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel83.setText("Title:");
        TransparentAdmin5.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        Titleissue.setEditable(false);
        TransparentAdmin5.add(Titleissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, -1));

        jLabel84.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel84.setText("Date Borrowed:");
        TransparentAdmin5.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 20));

        jLabel85.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel85.setText("Due Date:");
        TransparentAdmin5.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 30));

        SNissue.setEditable(false);
        TransparentAdmin5.add(SNissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 190, -1));

        IDNoissue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDNoissueKeyReleased(evt);
            }
        });
        TransparentAdmin5.add(IDNoissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, -1));

        FNissue.setEditable(false);
        TransparentAdmin5.add(FNissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));

        MNissue.setEditable(false);
        TransparentAdmin5.add(MNissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 190, -1));

        jLabel86.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel86.setText("Member Type:");
        TransparentAdmin5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        MTissue.setEditable(false);
        TransparentAdmin5.add(MTissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, -1));

        BookList.setBackground(new java.awt.Color(109, 25, 25));
        BookList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BookList.setForeground(new java.awt.Color(240, 231, 218));
        BookList.setText("View Borrowers");
        BookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookListActionPerformed(evt);
            }
        });
        TransparentAdmin5.add(BookList, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        ReturnDate.setEditable(false);
        TransparentAdmin5.add(ReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 160, -1));

        IssueDate.setEditable(false);
        TransparentAdmin5.add(IssueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 160, -1));

        IssuedList.setBackground(new java.awt.Color(109, 25, 25));
        IssuedList.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        IssuedList.setForeground(new java.awt.Color(240, 231, 218));
        IssuedList.setText("View Issued List");
        IssuedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssuedListActionPerformed(evt);
            }
        });
        TransparentAdmin5.add(IssuedList, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        IssueBooks.add(TransparentAdmin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 710, 340));

        AdminSystem.add(IssueBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        DisplayRec.setBackground(new java.awt.Color(212, 200, 190));
        DisplayRec.setPreferredSize(new java.awt.Dimension(720, 410));
        DisplayRec.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin7.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin7.setForeground(new java.awt.Color(109, 25, 25));
        TransparentAdmin7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel43.setText("Enter ID No");
        TransparentAdmin7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        IDNRecordsAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IDNRecordsAdminKeyReleased(evt);
            }
        });
        TransparentAdmin7.add(IDNRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 110, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel44.setText("First Name:");
        TransparentAdmin7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        FNRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(FNRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 187, -1));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel45.setText("Middle Name:");
        TransparentAdmin7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        MNRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(MNRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 187, -1));

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel46.setText("Surname:");
        TransparentAdmin7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        SNRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(SNRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 187, -1));

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel47.setText("Member Type:");
        TransparentAdmin7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        MTRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(MTRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 187, -1));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel48.setText("Book ID:");
        TransparentAdmin7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        BIDRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(BIDRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 150, -1));

        jLabel70.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel70.setText("Title:");
        TransparentAdmin7.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        TitleRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(TitleRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 150, -1));

        jLabel71.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel71.setText("Author:");
        TransparentAdmin7.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        AuthorRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(AuthorRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 150, -1));

        jLabel72.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel72.setText("Date Borrowed:");
        TransparentAdmin7.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        BorrDateRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(BorrDateRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 150, -1));

        jLabel73.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel73.setText("Date Returned:");
        TransparentAdmin7.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, 30));

        jPanel1.setBackground(new java.awt.Color(109, 25, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 230, 218));
        jLabel7.setText("BORROWERS RECORD DISPLAY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(30, 30, 30))
        );

        TransparentAdmin7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 650, 90));

        DuedateAdmin.setEditable(false);
        TransparentAdmin7.add(DuedateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 150, -1));

        jLabel76.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel76.setText("Due Date:");
        TransparentAdmin7.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, 30));

        ReturnRecordsAdmin.setEditable(false);
        TransparentAdmin7.add(ReturnRecordsAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 150, -1));

        DisplayRec.add(TransparentAdmin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 670, 360));

        AdminSystem.add(DisplayRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        Users.setBackground(new java.awt.Color(212, 200, 190));
        Users.setPreferredSize(new java.awt.Dimension(720, 410));
        Users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransparentAdmin8.setBackground(new java.awt.Color(240, 231, 218));
        TransparentAdmin8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 25, 25), 2));
        TransparentAdmin8.setForeground(new java.awt.Color(109, 25, 25));
        TransparentAdmin8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userstableadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NO", "FIRST NAME", "MIDDLE NAME", "SURNAME", "PASSWORD", "MEMBERTYE", "GENDER", "BIRTHDATE", "COURSE", "YEARLEVEL", "EMAIL", "CONTACT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userstableadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userstableadminMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(userstableadmin);

        TransparentAdmin8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 665, 110));
        TransparentAdmin8.add(PassUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 190, -1));

        jLabel54.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel54.setText("Password:");
        TransparentAdmin8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel55.setText("Surname:");
        TransparentAdmin8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));
        TransparentAdmin8.add(SnameUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, -1));

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel56.setText("Middle Name:");
        TransparentAdmin8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));
        TransparentAdmin8.add(MnameUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, -1));
        TransparentAdmin8.add(FnameUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, -1));

        jLabel57.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel57.setText("First Name:");
        TransparentAdmin8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel58.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel58.setText("ID Number:");
        TransparentAdmin8.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel59.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel59.setText("Member Type:");
        TransparentAdmin8.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, -1));
        TransparentAdmin8.add(MTUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, -1));

        jLabel60.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel60.setText("Gender:");
        TransparentAdmin8.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));
        TransparentAdmin8.add(GenderUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 130, 120, -1));

        jLabel61.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel61.setText("Birthdate:");
        TransparentAdmin8.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));
        TransparentAdmin8.add(BdateUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 160, 120, -1));

        jLabel62.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel62.setText("Course:");
        TransparentAdmin8.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));
        TransparentAdmin8.add(CourseUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 190, 120, -1));

        jLabel63.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel63.setText("Year Level:");
        TransparentAdmin8.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        TransparentAdmin8.add(YrlvlUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 220, 120, -1));

        jLabel64.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel64.setText("Contact:");
        TransparentAdmin8.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 60, -1));
        TransparentAdmin8.add(ContactUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 280, 120, -1));

        UserAdd.setBackground(new java.awt.Color(109, 25, 25));
        UserAdd.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserAdd.setForeground(new java.awt.Color(212, 200, 190));
        UserAdd.setText("ADD");
        UserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAddActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 99, -1));

        UserUpdate.setBackground(new java.awt.Color(109, 25, 25));
        UserUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserUpdate.setForeground(new java.awt.Color(212, 200, 190));
        UserUpdate.setText("UPDATE");
        UserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserUpdateActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 99, -1));

        UserDelete.setBackground(new java.awt.Color(109, 25, 25));
        UserDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserDelete.setForeground(new java.awt.Color(212, 200, 190));
        UserDelete.setText("DELETE");
        UserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserDeleteActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 99, -1));
        TransparentAdmin8.add(UserIDAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, -1));

        UserSave.setBackground(new java.awt.Color(109, 25, 25));
        UserSave.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserSave.setForeground(new java.awt.Color(212, 200, 190));
        UserSave.setText("SAVE");
        UserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSaveActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 75, -1));

        UserCancel.setBackground(new java.awt.Color(109, 25, 25));
        UserCancel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserCancel.setForeground(new java.awt.Color(212, 200, 190));
        UserCancel.setText("CANCEL");
        UserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserCancelActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 85, -1));

        UserSearch.setBackground(new java.awt.Color(109, 25, 25));
        UserSearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserSearch.setForeground(new java.awt.Color(212, 200, 190));
        UserSearch.setText("SEARCH");
        UserSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserSearchActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 99, -1));

        UserEdit.setBackground(new java.awt.Color(109, 25, 25));
        UserEdit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserEdit.setForeground(new java.awt.Color(212, 200, 190));
        UserEdit.setText("EDIT");
        UserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserEditActionPerformed(evt);
            }
        });
        TransparentAdmin8.add(UserEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 99, -1));

        jLabel65.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel65.setText("Email:");
        TransparentAdmin8.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));
        TransparentAdmin8.add(EmailUserAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 250, 120, -1));

        Users.add(TransparentAdmin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 670, 360));

        AdminSystem.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 750, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminSystem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void homeadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeadminMouseEntered
       homeadmin.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_homeadminMouseEntered

    private void homeadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeadminMouseExited
      homeadmin.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_homeadminMouseExited

    private void booksadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksadminMouseEntered

    booksadmin.setBackground(new Color(80, 25, 25, 255));    }//GEN-LAST:event_booksadminMouseEntered
      
    private void booksadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksadminMouseExited


    booksadmin.setBackground(new Color(109, 25, 25));    }//GEN-LAST:event_booksadminMouseExited

    private void logoutadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutadminMouseEntered
        logoutadmin.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_logoutadminMouseEntered

    private void logoutadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutadminMouseExited
        logoutadmin.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_logoutadminMouseExited

    private void usersadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersadminMouseEntered
        usersadmin.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_usersadminMouseEntered

    private void usersadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersadminMouseExited
        usersadmin.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_usersadminMouseExited

    private void addadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addadminActionPerformed
        LibrarianAdd addlib = new LibrarianAdd();
        addlib.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addadminActionPerformed

    private void logoutadminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutadminMousePressed
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Select Option", JOptionPane.YES_NO_OPTION);
        if(response == 0) {
            LoginFormNew logout = new LoginFormNew();
            logout.setVisible(true);
            this.dispose();
        }else{
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_logoutadminMousePressed

    private void homeadminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeadminMousePressed
        AdminSys admin = new AdminSys();
        admin.setVisible(true);
        this.dispose();
        Books.setVisible(false);
    }//GEN-LAST:event_homeadminMousePressed

    private void booksadminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksadminMousePressed
        Books.setVisible(true);
        Users.setVisible(false);
        DisplayRec.setVisible(false);
        AdminHomePage.setVisible(false);
    }//GEN-LAST:event_booksadminMousePressed

    private void recordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsMousePressed
        DisplayRec.setVisible(true);
        Users.setVisible(false);
        Books.setVisible(false);
        AdminHomePage.setVisible(false);
        IssueBooks.setVisible(false);        
    }//GEN-LAST:event_recordsMousePressed

    private void recordsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsMouseExited
        records.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_recordsMouseExited

    private void recordsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsMouseEntered
        records.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_recordsMouseEntered

    private void usersadminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersadminMousePressed
        Users.setVisible(true);
        DisplayRec.setVisible(false);
        Books.setVisible(false);
        AdminHomePage.setVisible(false);
        IssueBooks.setVisible(false);
    }//GEN-LAST:event_usersadminMousePressed

    private void ClickRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickRecordsActionPerformed
        Users.setVisible(false);
        DisplayRec.setVisible(true);
        Books.setVisible(false);
        AdminHomePage.setVisible(false);
        IssueBooks.setVisible(false);
    }//GEN-LAST:event_ClickRecordsActionPerformed

    private void ClickUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClickUsersActionPerformed
        Users.setVisible(true);
        DisplayRec.setVisible(false);
        Books.setVisible(false);
        AdminHomePage.setVisible(false);
        IssueBooks.setVisible(false);
    }//GEN-LAST:event_ClickUsersActionPerformed

    private void issuebookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebookMouseEntered
        issuebook.setBackground(new Color(80, 25, 25, 255));
    }//GEN-LAST:event_issuebookMouseEntered

    private void issuebookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebookMouseExited
       issuebook.setBackground(new Color(109, 25, 25));
    }//GEN-LAST:event_issuebookMouseExited

    private void issuebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebookMouseClicked
        IssueBooks.setVisible(true);
        Users.setVisible(false);
        DisplayRec.setVisible(false);
        Books.setVisible(false);
        AdminHomePage.setVisible(false);
    }//GEN-LAST:event_issuebookMouseClicked

    private void bookcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookcancelActionPerformed
         CancelBtn();
         showAll();
         BookDisabled();
         BookTitleAdmin.setText("");
         BookIDAdmin.setText("");
         BookAuthorAdmin.setText("");
         CurrentStatusAdmin.setText("");
    }//GEN-LAST:event_bookcancelActionPerformed

    private void booksaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksaveActionPerformed
      
            bookID = Integer.parseInt(BookIDAdmin.getText());
            sbid = String.valueOf(bookID);
            title = BookTitleAdmin.getText();
            author = BookAuthorAdmin.getText();
            copyright = BookCDAdmin.getText();

            try {
            bookquery = "INSERT INTO BOOKS VALUES(?,?,?,?,?)";                   

            pst = con.prepareStatement(bookquery);
            pst.setString(1, sbid);
            pst.setString(2, title);
            pst.setString(3, author);
            pst.setString(5, copyright);
            
            if(BookAvail.isSelected()) {
                status = "Available";
                BookNotAvail.setSelected(false);
            }
            if(BookNotAvail.isSelected()) {
                status = "Unavailable";
                BookAvail.setSelected(false);
            }
            
            pst.setString(4, status);
               
                    pst.executeUpdate();
                    
                    DefaultTableModel model = (DefaultTableModel)booktableadmin.getModel();
                    model.setRowCount(0);
                    
                    BookDisplay();
                    showAll();
                    
                    BookIDAdmin.setText("");
                    BookTitleAdmin.setText("");
                    BookAuthorAdmin.setText("");
                    CurrentStatusAdmin.setText("");
                    BookCDAdmin.setText("");
                    
                    BookIDAdmin.setEnabled(false);
                    BookTitleAdmin.setEnabled(false);
                    BookAuthorAdmin.setEnabled(false);
                    CurrentStatusAdmin.setEnabled(false);
                    BookAvail.setSelected(false);
                    BookNotAvail.setSelected(false);
                    BookCDAdmin.setEnabled(false);
                    
                    JOptionPane.showMessageDialog(AdminSys.this, "Record has been saved!");
                    
            }catch(SQLException ex){
             Logger.getLogger(AdminSys.class.getName()).log(Level.SEVERE, null, ex);

        } 
  
            
    }//GEN-LAST:event_booksaveActionPerformed
     
    private void booksupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksupdateActionPerformed
            bookID = Integer.parseInt(BookIDAdmin.getText());
            sbid = String.valueOf(bookID);
            title = BookTitleAdmin.getText();
            author = BookAuthorAdmin.getText();
            copyright = BookCDAdmin.getText();

            try {
            row = booktableadmin.getSelectedRow();
            value  = (booktableadmin.getModel().getValueAt(row, 0).toString());
            bookquery = "UPDATE BOOKS SET BOOKID=?, TITLE=?, AUTHOR=?, STATUS=?, COPYRIGHTDATE=? where BOOKID="+value;             

            pst = con.prepareStatement(bookquery);
            pst.setString(1, sbid);
            pst.setString(2, title);
            pst.setString(3, author);
            pst.setString(5, copyright);
            if(BookAvail.isSelected()) {
                status = "Available";
                
            }
            if(BookNotAvail.isSelected()) {
                status = "Unavailable";
            }
            pst.setString(4, status);
               
            pst.executeUpdate();
            showAll();
            
            BookIDAdmin.setText("");
            BookTitleAdmin.setText("");
            BookAuthorAdmin.setText("");
            CurrentStatusAdmin.setText("");
            BookCDAdmin.setText("");

            BookIDAdmin.setEnabled(false);
            BookTitleAdmin.setEnabled(false);
            BookAuthorAdmin.setEnabled(false);
            CurrentStatusAdmin.setEnabled(false);
            BookAvail.setSelected(false);
            BookNotAvail.setSelected(false);
            BookCDAdmin.setEnabled(false);                                

            DefaultTableModel model = (DefaultTableModel)booktableadmin.getModel();
            model.setRowCount(0);
            
            BookDisplay();
            JOptionPane.showMessageDialog(AdminSys.this, "Updated record!");
                     
                      }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);

        } 
    }//GEN-LAST:event_booksupdateActionPerformed

    private void bookaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookaddActionPerformed
        try{
            curRow =rs.getRow();
            BookIDAdmin.setEnabled(true);
            BookTitleAdmin.setEnabled(true);
            BookAuthorAdmin.setEnabled(true);
            BookCDAdmin.setEnabled(true);
        
            BookIDAdmin.setText(null);
            BookTitleAdmin.setText(null);
            BookAuthorAdmin.setText(null);
            BookCDAdmin.setText(null);
        
            bookadd.setEnabled(false);
            bookedit.setEnabled(false);
            bookdelete.setEnabled(false);
            booksearch.setEnabled(false);
            booksave.setEnabled(true);
            booksupdate.setEnabled(true);
            bookcancel.setEnabled(true);
       
            booksupdate.setVisible(true);
            booksave.setVisible(true);
           
            
            if(BookAvail.isSelected()) {
                status = "Available";
                BookNotAvail.setSelected(false);
            }
            if(BookNotAvail.isSelected()) {
                status = "Unavailable";
                BookAvail.setSelected(false);
            }

            CurrentStatusAdmin.setText("");
            
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
        }
    }//GEN-LAST:event_bookaddActionPerformed

    private void booksearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksearchActionPerformed
        i = JOptionPane.showInputDialog(null,"Enter Book ID: ","Records",JOptionPane.QUESTION_MESSAGE);  
        newbookID = Integer.parseInt(i);
        try{
            RefreshBooks();
            while(rs.next()){
                bookID =rs.getInt("BOOKID");
                if(newbookID == bookID){
                    temp_bid = newbookID;
                    GetBookRecords();    
                }
            }
            if(newbookID != temp_bid){
                showAll();
                GetBookRecords();
                JOptionPane.showMessageDialog(null,"Book not Found.");
            }
        }catch (SQLException err){
            JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
        }
    }//GEN-LAST:event_booksearchActionPerformed

    private void bookdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookdeleteActionPerformed
        JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?",
                "Select Option", JOptionPane.YES_NO_OPTION);
        
        try {
            row = booktableadmin.getSelectedRow();
            value  = (booktableadmin.getModel().getValueAt(row, 0).toString());
            
            bookquery = "DELETE FROM BOOKS WHERE BOOKID="+value;
            pst = con.prepareStatement(bookquery);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)booktableadmin.getModel();
            model.setRowCount(0);

            BookDisplay();
            
            BookIDAdmin.setText("");
            BookTitleAdmin.setText("");
            BookAuthorAdmin.setText("");
            CurrentStatusAdmin.setText("");
            BookCDAdmin.setText("");
         
            JOptionPane.showMessageDialog(null, "Record deleted!");

}catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
}
    }//GEN-LAST:event_bookdeleteActionPerformed

    private void btn_issue_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issue_cancelActionPerformed
        CancelBtn();  
    }//GEN-LAST:event_btn_issue_cancelActionPerformed

    private void bookeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookeditActionPerformed
        BookIDAdmin.setEnabled(true);
        BookTitleAdmin.setEnabled(true);
        BookAuthorAdmin.setEnabled(true);
        BookCDAdmin.setEnabled(true);

        bookdelete.setEnabled(false);
        booksearch.setEnabled(false);
        booksupdate.setEnabled(true);
        bookedit.setEnabled(false);
        bookadd.setEnabled(false);
        booksave.setEnabled(false);
                
    }//GEN-LAST:event_bookeditActionPerformed

    private void booktableadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booktableadminMouseClicked
        click = booktableadmin.getSelectedRow();
        TableModel model = booktableadmin.getModel();
        
        BookIDAdmin.setText(model.getValueAt(click, 0).toString());
        BookTitleAdmin.setText(model.getValueAt(click, 1).toString());
        BookAuthorAdmin.setText(model.getValueAt(click, 2).toString());
        BookCDAdmin.setText(model.getValueAt(click, 4).toString());
        str_status = model.getValueAt(click, 3).toString();
        
        if(BookAvail.equals(true)){
            CurrentStatusAdmin.setText(model.getValueAt(click, 3).toString());
            
        }else{
            CurrentStatusAdmin.setText(model.getValueAt(click, 3).toString());
        }
    }//GEN-LAST:event_booktableadminMouseClicked

    private void UserSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSaveActionPerformed

            UID = Integer.parseInt(UserIDAdmin.getText());
            suid = String.valueOf(UID);
            fname = FnameUserAdmin.getText();
            mname = MnameUserAdmin.getText();
            sname = SnameUserAdmin.getText();
            passw = PassUserAdmin.getText();
            mt = MTUserAdmin.getText();
            gndr = GenderUserAdmin.getText();
            bdte = BdateUserAdmin.getText();
            crse = CourseUserAdmin.getText();
            yrlevel = YrlvlUserAdmin.getText();
            eml = EmailUserAdmin.getText();
            cntct = ContactUserAdmin.getText();


            try {
            userquery = "INSERT INTO USERS VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";                   

            pst = con.prepareStatement(userquery);
            pst.setString(1, suid);
            pst.setString(2, fname);
            pst.setString(3, mname);
            pst.setString(4, sname);
            pst.setString(5, passw);
            pst.setString(6, mt);
            pst.setString(7, gndr);
            pst.setString(8, bdate);
            pst.setString(9, crse);
            pst.setString(10, yrlvl);
            pst.setString(11, eml);
            pst.setString(12, cntct);
               
                    pst.executeUpdate();
                    showAllUserButtons();
                    
                    DefaultTableModel model = (DefaultTableModel)userstableadmin.getModel();
                    model.setRowCount(0);
                    
                    UserDisplay();
                    JOptionPane.showMessageDialog(AdminSys.this, "Record has been saved!");
                     
            }catch(SQLException ex){
             Logger.getLogger(AdminSys.class.getName()).log(Level.SEVERE, null, ex);

        } 
                        
            UserIDAdmin.setText("");
            FnameUserAdmin.setText("");
            MnameUserAdmin.setText("");
            SnameUserAdmin.setText("");
            PassUserAdmin.setText("");
            MTUserAdmin.setText("");
            GenderUserAdmin.setText("");
            BdateUserAdmin.setText("");
            CourseUserAdmin.setText("");
            YrlvlUserAdmin.setText("");
            EmailUserAdmin.setText("");
            ContactUserAdmin.setText("");
            

            
            
    }//GEN-LAST:event_UserSaveActionPerformed

    private void UserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserCancelActionPerformed
         CancelBtn();
         UserDisabled();
         showAllUserButtons();
        UserIDAdmin.setText("");
        FnameUserAdmin.setText("");
        MnameUserAdmin.setText("");
        SnameUserAdmin.setText("");
        PassUserAdmin.setText("");
        MTUserAdmin.setText("");
        GenderUserAdmin.setText("");
        BdateUserAdmin.setText("");
        CourseUserAdmin.setText("");
        YrlvlUserAdmin.setText("");
        EmailUserAdmin.setText("");
        ContactUserAdmin.setText("");
    }//GEN-LAST:event_UserCancelActionPerformed

    private void UserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAddActionPerformed
        //aayusin    
        
        try{
            curRow =rs.getRow();
            UserIDAdmin.setEnabled(true);
            FnameUserAdmin.setEnabled(true);
            MnameUserAdmin.setEnabled(true);
            SnameUserAdmin.setEnabled(true);
            PassUserAdmin.setEnabled(true);
            MTUserAdmin.setEnabled(true);
            GenderUserAdmin.setEnabled(true);
            BdateUserAdmin.setEnabled(true);
            CourseUserAdmin.setEnabled(true);
            YrlvlUserAdmin.setEnabled(true);
            EmailUserAdmin.setEnabled(true);
            ContactUserAdmin.setEnabled(true);
            BookTitleAdmin.setEnabled(true);
            BookAuthorAdmin.setEnabled(true);
          
            UserAdd.setEnabled(true);
            UserEdit.setEnabled(false);
            UserDelete.setEnabled(false);
            UserSearch.setEnabled(false);
            UserSave.setEnabled(true);
            UserUpdate.setEnabled(false);
            UserCancel.setEnabled(true);
        
            UserUpdate.setVisible(true);
            UserSave.setVisible(true);
            
            
    }catch(SQLException err){
            JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
        }
    }//GEN-LAST:event_UserAddActionPerformed

    private void userstableadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userstableadminMouseClicked
        click = userstableadmin.getSelectedRow();
        TableModel model = userstableadmin.getModel();
        UserIDAdmin.setText(model.getValueAt(click, 0).toString());
        FnameUserAdmin.setText(model.getValueAt(click, 1).toString());
        MnameUserAdmin.setText(model.getValueAt(click, 2).toString());
        SnameUserAdmin.setText(model.getValueAt(click, 3).toString());
        PassUserAdmin.setText(model.getValueAt(click, 4).toString());
        MTUserAdmin.setText(model.getValueAt(click, 5).toString());
        GenderUserAdmin.setText(model.getValueAt(click, 6).toString());
        BdateUserAdmin.setText(model.getValueAt(click, 7).toString());
        CourseUserAdmin.setText(model.getValueAt(click, 8).toString());
        YrlvlUserAdmin.setText(model.getValueAt(click, 9).toString());
        EmailUserAdmin.setText(model.getValueAt(click, 10).toString());
        ContactUserAdmin.setText(model.getValueAt(click, 11).toString());
       
    }//GEN-LAST:event_userstableadminMouseClicked

    private void UserSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserSearchActionPerformed
        i = JOptionPane.showInputDialog(null,"Enter User ID: ","Records",JOptionPane.QUESTION_MESSAGE);  
        newuserID = Integer.parseInt(i);
        try{
            RefreshUsers();
            while(rs.next()){
                userID =rs.getInt("IDNO");
                if(newuserID == userID){
                    temp_uid = newuserID;
                    GetUserRecords();   
                }
            }
            if(newuserID != temp_uid){
                showAll();
                GetUserRecords();
                JOptionPane.showMessageDialog(null,"User not Found.");
            }
        }catch (SQLException err){
            JOptionPane.showMessageDialog(AdminSys.this, err.getMessage());
        }
    }//GEN-LAST:event_UserSearchActionPerformed

    private void BookAvailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BookAvailItemStateChanged
        if(BookAvail.isSelected()){
            BookNotAvail.setSelected(false);
        }
    }//GEN-LAST:event_BookAvailItemStateChanged

    private void BookNotAvailItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BookNotAvailItemStateChanged
        if(BookNotAvail.isSelected()){
            BookAvail.setSelected(false);
        }
    }//GEN-LAST:event_BookNotAvailItemStateChanged

    private void UserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserDeleteActionPerformed
            JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?",
        "Select Option", JOptionPane.YES_NO_OPTION);
            
        try {
            row = userstableadmin.getSelectedRow();
            value  = (userstableadmin.getModel().getValueAt(row, 0).toString());
            
            userquery = "DELETE FROM USERS WHERE IDNO="+value;
            
            pst = con.prepareStatement(userquery);
            pst.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel)userstableadmin.getModel();
            model.setRowCount(0);

            JOptionPane.showMessageDialog(null, "Record deleted!");
            UserDisplay();

            UserIDAdmin.setText("");
            FnameUserAdmin.setText("");
            MnameUserAdmin.setText("");
            SnameUserAdmin.setText("");
            PassUserAdmin.setText("");
            MTUserAdmin.setText("");
            GenderUserAdmin.setText("");
            BdateUserAdmin.setText("");
            CourseUserAdmin.setText("");
            YrlvlUserAdmin.setText("");
            EmailUserAdmin.setText("");
            ContactUserAdmin.setText("");
       
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UserDeleteActionPerformed

    private void UserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserUpdateActionPerformed
            UID = Integer.parseInt(UserIDAdmin.getText());
            suid = String.valueOf(bookID);
            fname = FnameUserAdmin.getText();
            mname = MnameUserAdmin.getText();
            sname = SnameUserAdmin.getText();
            passw = PassUserAdmin.getText();
            mt = MTUserAdmin.getText();
            gndr = GenderUserAdmin.getText();
            bdte = BdateUserAdmin.getText();
            crse = CourseUserAdmin.getText();
            yrlevel = YrlvlUserAdmin.getText();
            eml = EmailUserAdmin.getText();
            cntct = ContactUserAdmin.getText();

            try {
            row = userstableadmin.getSelectedRow();
            value  = (userstableadmin.getModel().getValueAt(row, 0).toString());
            userquery = "UPDATE USERS SET IDNO=?, FIRSTNAME=?, MIDDLENAME=?, SURNAME=?, PASSWORD=?,"
                    + "MEMBERTYPE=?, GENDER=?, BIRTHDATE=?, COURSE=?, YEARLEVEL=?, EMAIL=?, "
                    + "CONTACT=? where IDNO="+value;             

            pst = con.prepareStatement(userquery);
            pst.setString(1, suid);
            pst.setString(2, fname);
            pst.setString(3, mname);
            pst.setString(4, sname);
            pst.setString(5, passw);
            pst.setString(6, mt);
            pst.setString(7, gndr);
            pst.setString(8, bdte);
            pst.setString(9, crse);
            pst.setString(10, yrlevel);
            pst.setString(11, eml);
            pst.setString(12, scntct);
               
                    pst.executeUpdate();
                    showAllUserButtons();
                    
                    DefaultTableModel model = (DefaultTableModel)userstableadmin.getModel();
                    model.setRowCount(0);
                    UserDisplay();
                    
                    JOptionPane.showMessageDialog(AdminSys.this, "Record has been updated!");
                     
            }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);

        } 

    }//GEN-LAST:event_UserUpdateActionPerformed

    private void UserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserEditActionPerformed
        UserIDAdmin.setEnabled(true);
        FnameUserAdmin.setEnabled(true);
        MnameUserAdmin.setEnabled(true);
        SnameUserAdmin.setEnabled(true);
        PassUserAdmin.setEnabled(true);
        MTUserAdmin.setEnabled(true);
        GenderUserAdmin.setEnabled(true);
        CourseUserAdmin.setEnabled(true);
        YrlvlUserAdmin.setEnabled(true);
        EmailUserAdmin.setEnabled(true);
        ContactUserAdmin.setEnabled(true);
        BdateUserAdmin.setEnabled(true);

        UserDelete.setEnabled(false);
        UserSearch.setEnabled(false);
        UserUpdate.setEnabled(true);
        UserEdit.setEnabled(true);
        UserAdd.setEnabled(false);
        UserSave.setEnabled(false);

    }//GEN-LAST:event_UserEditActionPerformed

    private void IssueAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueAdminActionPerformed
         UID = Integer.parseInt(IDNoissue.getText());
         uidissue = String.valueOf(UID);
         BID = Integer.parseInt(BookIDissue.getText());
         bidissue = String.valueOf(BID);
         issuedate = IssueDate.getText();
         returnbookissue = ReturnDate.getText();
        
        try {
           stmt = con.createStatement();
           rs = stmt.executeQuery("SELECT TITLE FROM BOOKS WHERE BOOKID ="+bidissue+"");
        if(rs.next()) {
                ResultSet rsl = stmt.executeQuery("SELECT * FROM BORROW_BOOKS WHERE IDNO="+uidissue+"");
                if(rsl.next()) {
                    stmt.executeUpdate("INSERT INTO BOOK_ISSUE VALUES("+uidissue+",'"+bidissue+"', '"+issuedate+"', "
                            + "'"+returnbookissue+"')");
                   
                    JOptionPane.showMessageDialog(null, "Book issued successfully!");
                    IDNoissue.setText("");
                    FNissue.setText("");
                    MNissue.setText("");
                    SNissue.setText("");
                    MTissue.setText("");
                    BookIDissue.setText("");
                    Titleissue.setText("");
                    IssueDate.setText("");
                    ReturnDate.setText("");
                      
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect ID Number!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect BookID!");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Book already issued to the student.");
        }
    }//GEN-LAST:event_IssueAdminActionPerformed

    private void IDNRecordsAdminKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDNRecordsAdminKeyReleased
           //SCREENSHOT
        srchbid = "SELECT BOOK_ISSUE.IDNO, USERS.FIRSTNAME, USERS.MIDDLENAME, USERS.SURNAME, "
        + "BORROW_BOOKS.BOOKID, BORROW_BOOKS.TITLE, RETURN_BOOKS.BORROWEDDATE, RETURN_BOOKS.DUEDATE, "
        + "USERS.MEMBERTYPE, BOOKS.AUTHOR, RETURN_BOOKS.RETURNDATE"
                + " FROM BOOKS, BORROW_BOOKS, BOOK_ISSUE, RETURN_BOOKS,"
                + "USERS WHERE RETURN_BOOKS.IDNO="+IDNRecordsAdmin.getText()+" AND USERS.IDNO="+IDNRecordsAdmin.getText()+"";
        try{
            pst = con.prepareStatement(srchbid);
            rs = pst.executeQuery();

            if(rs.next()) { 
                //IDNRecordsAdmin.setText(rs.getString("IDNO"));
                FNRecordsAdmin.setText(rs.getString("FIRSTNAME"));
                MNRecordsAdmin.setText(rs.getString("MIDDLENAME"));
                SNRecordsAdmin.setText(rs.getString("SURNAME"));
                MTRecordsAdmin.setText(rs.getString("MEMBERTYPE"));              
                BIDRecordsAdmin.setText(rs.getString("BOOKID"));
                TitleRecordsAdmin.setText(rs.getString("TITLE"));
                AuthorRecordsAdmin.setText(rs.getString("AUTHOR"));
                BorrDateRecordsAdmin.setText(rs.getString("BORROWEDDATE"));
                DuedateAdmin.setText(rs.getString("DUEDATE"));               
                ReturnRecordsAdmin.setText(rs.getString("RETURNDATE"));
                
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_IDNRecordsAdminKeyReleased

    private void BorrowersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowersListActionPerformed
        BorrowerList list = new BorrowerList();
        list.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_BorrowersListActionPerformed

    private void IDNoissueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDNoissueKeyReleased
        srchuid = "SELECT USERS.IDNO, USERS.FIRSTNAME, USERS.MIDDLENAME, USERS.SURNAME,"
                + "USERS.MEMBERTYPE, BORROW_BOOKS.CURRENTDATE, BORROW_BOOKS.RETURNDATE, "
                + "BORROW_BOOKS.BOOKID, BORROW_BOOKS.TITLE FROM USERS, BORROW_BOOKS, BOOKS WHERE BORROW_BOOKS.IDNO=? AND USERS.IDNO=?";
        try{
            pst = con.prepareStatement(srchuid);
            pst.setString(1, IDNoissue.getText().trim());
            pst.setString(2, IDNoissue.getText().trim());
            rs = pst.executeQuery();

            if(rs.next()) {
                FNissue.setText(rs.getString("FIRSTNAME"));
                MNissue.setText(rs.getString("MIDDLENAME"));
                SNissue.setText(rs.getString("SURNAME"));
                MTissue.setText(rs.getString("MEMBERTYPE"));
                IssueDate.setText(rs.getString("CURRENTDATE"));
                ReturnDate.setText(rs.getString("RETURNDATE"));

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_IDNoissueKeyReleased

    private void BookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookListActionPerformed
        BorrowerList brwrlist = new BorrowerList();
        brwrlist.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_BookListActionPerformed

    private void IssuedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuedListActionPerformed
        IssuedReturnList issued = new IssuedReturnList();
        issued.setVisible(true);
        this.dispose();   
    }//GEN-LAST:event_IssuedListActionPerformed

    private void IssuedListHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssuedListHomePageActionPerformed
        IssuedReturnList issued = new IssuedReturnList();
        issued.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IssuedListHomePageActionPerformed

    private void BookIDissueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BookIDissueKeyReleased
srchuid = "SELECT BORROW_BOOKS.BOOKID, BORROW_BOOKS.TITLE FROM  BORROW_BOOKS WHERE BORROW_BOOKS.BOOKID=?";
        try{
            pst = con.prepareStatement(srchuid);
            pst.setString(1, BookIDissue.getText().trim());
            rs = pst.executeQuery();

            if(rs.next()) {
                BookIDissue.setText(rs.getString("BOOKID"));
                Titleissue.setText(rs.getString("TITLE"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BookIDissueKeyReleased

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
            java.util.logging.Logger.getLogger(AdminSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSys().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminFooter;
    private javax.swing.JPanel AdminHeader;
    private javax.swing.JPanel AdminHomePage;
    private javax.swing.JPanel AdminMenu;
    private javax.swing.JPanel AdminSystem;
    private javax.swing.JLabel AdminWP;
    private javax.swing.JTextField AuthorRecordsAdmin;
    private javax.swing.JTextField BIDRecordsAdmin;
    private javax.swing.JTextField BdateUserAdmin;
    private javax.swing.JTextField BookAuthorAdmin;
    private javax.swing.JRadioButton BookAvail;
    private javax.swing.JTextField BookCDAdmin;
    private javax.swing.JTextField BookIDAdmin;
    private javax.swing.JTextField BookIDissue;
    private javax.swing.JButton BookList;
    private javax.swing.JRadioButton BookNotAvail;
    private javax.swing.ButtonGroup BookStatusAdmin;
    private javax.swing.JTextField BookTitleAdmin;
    private javax.swing.JPanel Books;
    private javax.swing.JTextField BorrDateRecordsAdmin;
    private javax.swing.JButton BorrowersList;
    private javax.swing.JButton ClickRecords;
    private javax.swing.JButton ClickUsers;
    private javax.swing.JTextField ContactUserAdmin;
    private javax.swing.JTextField CourseUserAdmin;
    private javax.swing.JTextField CurrentStatusAdmin;
    private javax.swing.JPanel DisplayRec;
    private javax.swing.JTextField DuedateAdmin;
    private javax.swing.JTextField EmailUserAdmin;
    private javax.swing.JTextField FNRecordsAdmin;
    private javax.swing.JTextField FNissue;
    private javax.swing.JTextField FnameUserAdmin;
    private javax.swing.JTextField GenderUserAdmin;
    private javax.swing.JTextField IDNRecordsAdmin;
    private javax.swing.JTextField IDNoissue;
    private javax.swing.JButton IssueAdmin;
    private javax.swing.JPanel IssueBooks;
    private javax.swing.JTextField IssueDate;
    private javax.swing.JButton IssuedList;
    private javax.swing.JButton IssuedListHomePage;
    private javax.persistence.EntityManager LibrarySystemPUEntityManager;
    private javax.swing.JTable LoginAdmin;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField MNRecordsAdmin;
    private javax.swing.JTextField MNissue;
    private javax.swing.JTextField MTRecordsAdmin;
    private javax.swing.JTextField MTUserAdmin;
    private javax.swing.JTextField MTissue;
    private javax.swing.JTextField MnameUserAdmin;
    private javax.swing.JTextField PassUserAdmin;
    private javax.swing.JTextField ReturnDate;
    private javax.swing.JTextField ReturnRecordsAdmin;
    private javax.swing.JTextField SNRecordsAdmin;
    private javax.swing.JTextField SNissue;
    private javax.swing.JTextField SnameUserAdmin;
    private javax.swing.JTextField TitleRecordsAdmin;
    private javax.swing.JTextField Titleissue;
    private javax.swing.JPanel TransparentAdmin;
    private javax.swing.JPanel TransparentAdmin4;
    private javax.swing.JPanel TransparentAdmin5;
    private javax.swing.JPanel TransparentAdmin7;
    private javax.swing.JPanel TransparentAdmin8;
    private javax.swing.JButton UserAdd;
    private javax.swing.JButton UserCancel;
    private javax.swing.JButton UserDelete;
    private javax.swing.JButton UserEdit;
    private javax.swing.JTextField UserIDAdmin;
    private javax.swing.JButton UserSave;
    private javax.swing.JButton UserSearch;
    private javax.swing.JButton UserUpdate;
    private javax.swing.JPanel Users;
    private javax.swing.JTextField YrlvlUserAdmin;
    private javax.swing.JButton addadmin;
    private javax.swing.JButton bookadd;
    private javax.swing.JButton bookcancel;
    private javax.swing.JButton bookdelete;
    private javax.swing.JButton bookedit;
    private java.util.List<LibrarySystemForms.Books> booksList;
    private javax.persistence.Query booksQuery;
    private javax.swing.JPanel booksadmin;
    private javax.swing.JLabel booksadminicon;
    private javax.swing.JButton booksave;
    private javax.swing.JButton booksearch;
    private javax.swing.JButton booksupdate;
    private javax.swing.JTable booktableadmin;
    private javax.swing.JButton btn_issue_cancel;
    private javax.swing.JPanel homeadmin;
    private javax.swing.JPanel issuebook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel logoutadmin;
    private javax.swing.JLabel logouticon;
    private javax.swing.JPanel records;
    private javax.swing.JLabel recordsicon;
    private javax.swing.JLabel users;
    private java.util.List<LibrarySystemForms.Users> usersList;
    private java.util.List<LibrarySystemForms.Users> usersList1;
    private java.util.List<LibrarySystemForms.Users> usersList2;
    private java.util.List<LibrarySystemForms.Users> usersList3;
    private java.util.List<LibrarySystemForms.Users> usersList4;
    private java.util.List<LibrarySystemForms.Users> usersList5;
    private java.util.List<LibrarySystemForms.Users> usersList6;
    private javax.persistence.Query usersQuery;
    private javax.persistence.Query usersQuery1;
    private javax.persistence.Query usersQuery2;
    private javax.persistence.Query usersQuery3;
    private javax.persistence.Query usersQuery4;
    private javax.persistence.Query usersQuery5;
    private javax.persistence.Query usersQuery6;
    private javax.swing.JPanel usersadmin;
    private javax.swing.JTable userstableadmin;
    private javax.swing.JLabel welcometext;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
