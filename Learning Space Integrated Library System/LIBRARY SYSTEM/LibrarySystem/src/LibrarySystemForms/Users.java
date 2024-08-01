/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystemForms;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "USERS", catalog = "", schema = "G1LIBSYSTEM")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByIdno", query = "SELECT u FROM Users u WHERE u.idno = :idno")
    , @NamedQuery(name = "Users.findByFirstname", query = "SELECT u FROM Users u WHERE u.firstname = :firstname")
    , @NamedQuery(name = "Users.findByMiddlename", query = "SELECT u FROM Users u WHERE u.middlename = :middlename")
    , @NamedQuery(name = "Users.findBySurname", query = "SELECT u FROM Users u WHERE u.surname = :surname")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByMembertype", query = "SELECT u FROM Users u WHERE u.membertype = :membertype")})
public class Users implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDNO")
    private Integer idno;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "MIDDLENAME")
    private String middlename;
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "MEMBERTYPE")
    private String membertype;

    public Users() {
    }

    public Users(Integer idno) {
        this.idno = idno;
    }

    public Users(Integer idno, String password) {
        this.idno = idno;
        this.password = password;
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        Integer oldIdno = this.idno;
        this.idno = idno;
        changeSupport.firePropertyChange("idno", oldIdno, idno);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        String oldMiddlename = this.middlename;
        this.middlename = middlename;
        changeSupport.firePropertyChange("middlename", oldMiddlename, middlename);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        String oldMembertype = this.membertype;
        this.membertype = membertype;
        changeSupport.firePropertyChange("membertype", oldMembertype, membertype);
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.idno == null && other.idno != null) || (this.idno != null && !this.idno.equals(other.idno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LibrarySystemForms.Users[ idno=" + idno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
