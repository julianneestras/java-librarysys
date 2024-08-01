
package LibrarySystemForms;
public class BorrowersRecord {
    private int userID;
    private int bookID;
    private String dateborrowed;
    private String returndate;
    
      public BorrowersRecord(int BID, int UID, String borrdate, String retdate)
    {
        this.bookID = BID;
        this.userID = UID;
        this.dateborrowed = borrdate;
        this.returndate = retdate;
    }
    
    public int getBookID()
    {
        return bookID;
    }
    
    public int getUserID()
    {
        return userID;
    }
    
    public String getBorrowDate()
    {
        return dateborrowed;
    }
    
    public String getReturnDate()
    {
        return returndate;
    }
    
} 