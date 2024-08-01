
package LibrarySystemForms;

public class Borrowers {
    private int bookID;
    private int userID;
    private String curdate;
    private String returndate;
   
    public Borrowers(int BID, int UID, String CurDate, String RetDate)
    {
        this.bookID = BID;
        this.userID = UID;
        this.curdate = CurDate;
        this.returndate = RetDate;
    }
    
    public int getBID()
    {
        return bookID;
    }
    
    public int getUID()
    {
        return userID;
    }
    
    public String getCurDate()
    {
        return curdate;
    }
    
    public String getRetDate()
    {
        return returndate;
    }

}
