/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystemForms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Julianne
 */
@Entity
@Table(name = "BOOK_ISSUE", catalog = "", schema = "G1LIBSYSTEM")
@NamedQueries({
    @NamedQuery(name = "BookIssue.findAll", query = "SELECT b FROM BookIssue b")
    , @NamedQuery(name = "BookIssue.findByIdno", query = "SELECT b FROM BookIssue b WHERE b.idno = :idno")
    , @NamedQuery(name = "BookIssue.findByBookid", query = "SELECT b FROM BookIssue b WHERE b.bookid = :bookid")
    , @NamedQuery(name = "BookIssue.findByBorroweddate", query = "SELECT b FROM BookIssue b WHERE b.borroweddate = :borroweddate")
    , @NamedQuery(name = "BookIssue.findByReturndate", query = "SELECT b FROM BookIssue b WHERE b.returndate = :returndate")})
public class BookIssue implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDNO")
    private BigDecimal idno;
    @Column(name = "BOOKID")
    private String bookid;
    @Column(name = "BORROWEDDATE")
    private String borroweddate;
    @Column(name = "RETURNDATE")
    private String returndate;

    public BookIssue() {
    }

    public BookIssue(BigDecimal idno) {
        this.idno = idno;
    }

    public BigDecimal getIdno() {
        return idno;
    }

    public void setIdno(BigDecimal idno) {
        BigDecimal oldIdno = this.idno;
        this.idno = idno;
        changeSupport.firePropertyChange("idno", oldIdno, idno);
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        String oldBookid = this.bookid;
        this.bookid = bookid;
        changeSupport.firePropertyChange("bookid", oldBookid, bookid);
    }

    public String getBorroweddate() {
        return borroweddate;
    }

    public void setBorroweddate(String borroweddate) {
        String oldBorroweddate = this.borroweddate;
        this.borroweddate = borroweddate;
        changeSupport.firePropertyChange("borroweddate", oldBorroweddate, borroweddate);
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        String oldReturndate = this.returndate;
        this.returndate = returndate;
        changeSupport.firePropertyChange("returndate", oldReturndate, returndate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idno != null ? idno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookIssue)) {
            return false;
        }
        BookIssue other = (BookIssue) object;
        if ((this.idno == null && other.idno != null) || (this.idno != null && !this.idno.equals(other.idno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibrarySystemForms.BookIssue[ idno=" + idno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
