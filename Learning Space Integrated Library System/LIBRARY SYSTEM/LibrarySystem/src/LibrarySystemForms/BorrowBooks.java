/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystemForms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Julianne
 */
@Entity
@Table(name = "BORROW_BOOKS", catalog = "", schema = "G1LIBSYSTEM")
@NamedQueries({
    @NamedQuery(name = "BorrowBooks.findAll", query = "SELECT b FROM BorrowBooks b")
    , @NamedQuery(name = "BorrowBooks.findByIdno", query = "SELECT b FROM BorrowBooks b WHERE b.borrowBooksPK.idno = :idno")
    , @NamedQuery(name = "BorrowBooks.findByBookid", query = "SELECT b FROM BorrowBooks b WHERE b.borrowBooksPK.bookid = :bookid")
    , @NamedQuery(name = "BorrowBooks.findByCurrentdate", query = "SELECT b FROM BorrowBooks b WHERE b.currentdate = :currentdate")
    , @NamedQuery(name = "BorrowBooks.findByReturndate", query = "SELECT b FROM BorrowBooks b WHERE b.returndate = :returndate")})
public class BorrowBooks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected BorrowBooksPK borrowBooksPK;
    @Column(name = "CURRENTDATE")
    private String currentdate;
    @Column(name = "RETURNDATE")
    private String returndate;

    public BorrowBooks() {
    }

    public BorrowBooks(BorrowBooksPK borrowBooksPK) {
        this.borrowBooksPK = borrowBooksPK;
    }

    public BorrowBooks(BigInteger idno, BigInteger bookid) {
        this.borrowBooksPK = new BorrowBooksPK(idno, bookid);
    }

    public BorrowBooksPK getBorrowBooksPK() {
        return borrowBooksPK;
    }

    public void setBorrowBooksPK(BorrowBooksPK borrowBooksPK) {
        this.borrowBooksPK = borrowBooksPK;
    }

    public String getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(String currentdate) {
        String oldCurrentdate = this.currentdate;
        this.currentdate = currentdate;
        changeSupport.firePropertyChange("currentdate", oldCurrentdate, currentdate);
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
        hash += (borrowBooksPK != null ? borrowBooksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BorrowBooks)) {
            return false;
        }
        BorrowBooks other = (BorrowBooks) object;
        if ((this.borrowBooksPK == null && other.borrowBooksPK != null) || (this.borrowBooksPK != null && !this.borrowBooksPK.equals(other.borrowBooksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibrarySystemForms.BorrowBooks[ borrowBooksPK=" + borrowBooksPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
