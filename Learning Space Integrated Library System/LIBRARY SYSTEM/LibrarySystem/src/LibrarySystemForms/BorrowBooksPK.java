/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystemForms;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Julianne
 */
@Embeddable
public class BorrowBooksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDNO")
    private BigInteger idno;
    @Basic(optional = false)
    @Column(name = "BOOKID")
    private BigInteger bookid;

    public BorrowBooksPK() {
    }

    public BorrowBooksPK(BigInteger idno, BigInteger bookid) {
        this.idno = idno;
        this.bookid = bookid;
    }

    public BigInteger getIdno() {
        return idno;
    }

    public void setIdno(BigInteger idno) {
        this.idno = idno;
    }

    public BigInteger getBookid() {
        return bookid;
    }

    public void setBookid(BigInteger bookid) {
        this.bookid = bookid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idno != null ? idno.hashCode() : 0);
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BorrowBooksPK)) {
            return false;
        }
        BorrowBooksPK other = (BorrowBooksPK) object;
        if ((this.idno == null && other.idno != null) || (this.idno != null && !this.idno.equals(other.idno))) {
            return false;
        }
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibrarySystemForms.BorrowBooksPK[ idno=" + idno + ", bookid=" + bookid + " ]";
    }
    
}
