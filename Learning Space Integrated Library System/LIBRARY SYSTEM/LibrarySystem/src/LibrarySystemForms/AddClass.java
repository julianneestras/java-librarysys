
package LibrarySystemForms;
public class AddClass {
    private int bookID;
    private String title;
    private String author;
    private String status;
    private String copyright;
    
    
    public AddClass(int BID, String Title, String Author, String Status, String Copydate)
    {
        this.bookID = BID;
        this.title = Title;
        this.author = Author;
        this.status = Status;
        this.copyright = Copydate;
    }
    
    public int getBID()
    {
        return bookID;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getStatus()
    {
        return status;
    }
    public String getCopyrightDate() {
        return copyright;
    }
}

    
