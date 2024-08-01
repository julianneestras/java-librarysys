
package LibrarySystemForms;


public class ClassUsers {
    private int userID;
    private String pass;
    private String fName;
    private String mName;
    private String sName;
    private String memtype;
    private String gender;
    private String birthdate;
    private String course;
    private String yrlvl;
    private String email;
    private String contactno;
    
    
    public ClassUsers(int UID, String password, String firstname, String middlename, String surname, String
            membertype, String gender, String birthdate, String course, String yrlvl, String email, String contact)
    {
        this.userID = UID;
        this.pass = password;
        this.fName = firstname;
        this.mName = middlename;
        this.sName = surname;
        this.memtype = membertype;
        this.gender = gender;
        this.birthdate = birthdate;
        this.course = course;
        this.yrlvl = yrlvl;
        this.email = email;
        this.contactno = contact;
    }
    
    public int getUID()
    {
        return userID;
    }
    
    public String getFNAME()
    {
        return fName;
    }
    
    public String getMNAME()
    {
        return mName;
    }
    public String getSNAME()
    {
        return sName;
    }
    public String getPASS()
    {
        return pass;
    }
    
    public String getMEMTYPE()
    {
        return memtype;
    }
    
    public String getGENDER()
    {
        return gender;
    }    
    public String getBIRTHDATE()
    {
        return birthdate;
    }
    
    public String getCOURSE()
    {
        return course;
    }
    
    public String getYRLEVEL()
    {
        return yrlvl;
    }
    public String getEMAIL()
    {
        return email;
    }
    
    public String getCONTACT()
    {
        return contactno;
    }
}

