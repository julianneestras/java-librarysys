
package LibrarySystemForms;

public class ReturnBooklist {
    private int userID;
    private int bookID;
    private String borroweddate;
    private String duedate;
    private String datetoday;
   
    public ReturnBooklist(int UserID, int BookID, String BorrDate, String DueDate, String DateToday)
    {
        this.userID = UserID;
        this.bookID = BookID;
        this.borroweddate = BorrDate;
        this.duedate = DueDate;
        this.datetoday = DateToday;
    }
    
    public int getUserID()
    {
        return userID;
    }
    
    public int getBookID()
    {
        return bookID;
    }
    
    public String getBorrowedDate()
    {
        return borroweddate;
    }
    
    public String getReturnDate()
    {
        return duedate;
    }
    public String getDateToday()
    {
        return datetoday;
    }


}

    

    
