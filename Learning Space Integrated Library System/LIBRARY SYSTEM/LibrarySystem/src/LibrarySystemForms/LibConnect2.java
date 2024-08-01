
package LibrarySystemForms;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
public class LibConnect2 extends javax.swing.JFrame{
    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;

    DefaultTableModel LoginModel = new DefaultTableModel(); 
//    int bookID, newbookID, temp_bid,result,curRow;
//    String title, author, publisher, i, newtitle,newauthor,newpub, status;
//    int newIDno, booksrch;
//    String s, Idno, Borrowsearch, srchstatus, bookquery, sbid;
//    
    
    public void DoConnectBooks(){
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
           JOptionPane.showMessageDialog(LibConnect2.this, err.getMessage());
        }
     }
     
     public void Refresh_RS_STMT(){
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
         }
     public void DoConnectUsers(){
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
           JOptionPane.showMessageDialog(LibConnect2.this, err.getMessage());
        }
     }
}
