
package LibrarySystemForms;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class LibConnect extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;
    
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    Date thisDate = new Date();
    DefaultTableModel model = new DefaultTableModel();
    
    //USERS LOGIN/REGISTRATION
    int newID, id, temp_user, curRow, result, lastid; 
    String newPASS, newUSERTYPE, user, pass, memtyp, temp_pass, temp_usertype;
    String fn, mn, ln, bdate, gender, crs, yrlvl, email, pw, contact;
    String x, y, confirm_pass, query;
    
    //BOOKS
    int bookID, newbookID, temp_bid, bookresult, BID, newbid;
    String title, author, publisher, i, newtitle,newauthor,newpub, status, curdate, redate;
    int newIDno, booksrch, duefine;;
    String s, Idno, Borrowsearch, srchstatus, bookquery, sbid;
    int row, click;
    String value, selectbooks, str_status, selectusers, selectborrowers, value1, rdate, fdate;
    String bidissue, uidissue, returndate, borrowdate, bidreturn, uidreturn, bookreturn;
    String dateissue, datereturn, viewbooks, days, srchbook, copyright,rsl2a;
    

    //USERS DISPLAY
    int  UID, newuserID, userID,temp_uid, newuid;
    String fname, mname, sname, passw, mt, gndr, suid, bdte, crse, yrlevel, eml, scntct, userquery,  cntct;
    String str_uid, str_bid, btitle, issuedate, returnbookissue, srchuid, srchbid, fetch_uid, fine,srhbidf;
    
    //STUDENT BORROW
   
    int IDNo, BookID, Bbid, BBbid, Uuid;
    String BUID,Bsuid,Bfname,Bmname,Bsname,Bpassw,Bbsuid,Btitle,Bauthor,duedate,borrowd,borrow,UUsuid;
    
    //FACULTY BORROW
    int  Fbid,Fabid;
    String FFsuid,Facsuid,Ftitle,Fdate,borrowf,fdater, retdate;
                 
    
    public void DoConnectUsers(){
        try{
            //CONNECT TO THE DATABASE
            String host = "jdbc:derby://localhost:1527/LibrarySystem";
            String uName = "G1LibSystem";
            String uPass = "12345";
            con = DriverManager.getConnection(host, uName, uPass);
            
            //EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM G1LIBSYSTEM.USERS";
            
            pst = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            con.commit(); 
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(LibConnect.this, err.getMessage());
        }
    }
    
public void RefreshUsers(){
        try{
            stmt.close();
            rs.close();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM G1LIBSYSTEM.USERS";
            rs = stmt.executeQuery(sql);
        }catch(SQLException ex) {
            Logger.getLogger(LibConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
}public void DoConnectBooks(){
        try {
            String url = "jdbc:derby://localhost:1527/LibrarySystem";
            String uName = "G1LibSystem";
            String uPass = "12345";
            con = DriverManager.getConnection(url, uName ,uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE); 
            String sql ="SELECT * FROM G1LIBSYSTEM.BOOKS";
            rs =stmt.executeQuery(sql);
            pst = con.prepareStatement(sql);
            rs.next();
            con.commit();
        
        }catch (SQLException err){
           JOptionPane.showMessageDialog(LibConnect.this, err.getMessage());
        }
        
} public void RefreshBooks(){
         try{
             stmt.close();
             rs.close();
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_UPDATABLE);
             String sql ="SELECT * FROM G1LIBSYSTEM.BOOKS";
             rs =stmt.executeQuery(sql);
         }catch (SQLException ex){
             Logger.getLogger(LibConnect2.class.getName()).log(Level.SEVERE, null, ex);
         }
         
}    public void DoConnectIssueBooks(){
        try{
            //CONNECT TO THE DATABASE
            String host = "jdbc:derby://localhost:1527/LibrarySystem";
            String uName = "G1LibSystem";
            String uPass = "12345";
            con = DriverManager.getConnection(host, uName, uPass);
            
            //EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM G1LIBSYSTEM.BOOK_ISSUE";
            
            pst = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            con.commit(); 
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(LibConnect.this, err.getMessage());
        }
    }
        public void DoConnectBorrowersBooks(){
        try{
            //CONNECT TO THE DATABASE
            String host = "jdbc:derby://localhost:1527/LibrarySystem";
            String uName = "G1LibSystem";
            String uPass = "12345";
            con = DriverManager.getConnection(host, uName, uPass);
            
            //EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM G1LIBSYSTEM.BORROW_BOOKS";
            
            pst = con.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            con.commit(); 
            
        }catch(SQLException err){
            JOptionPane.showMessageDialog(LibConnect.this, err.getMessage());
        }
        }public void DoConnectReturnBooks(){
        try {
            String url = "jdbc:derby://localhost:1527/LibrarySystem";
            String uName = "G1LibSystem";
            String uPass = "12345";
            con = DriverManager.getConnection(url, uName ,uPass);
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE); 
            String sql ="SELECT * FROM G1LIBSYSTEM.RETURN_BOOKS";
            rs =stmt.executeQuery(sql);
            pst = con.prepareStatement(sql);
            rs.next();
            con.commit();
        
        }catch (SQLException err){
           JOptionPane.showMessageDialog(LibConnect.this, err.getMessage());
        }
}
}


  

    
