/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordify;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author golan
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.usersPK.id = :id"),
    @NamedQuery(name = "Users.findByFirstName", query = "SELECT u FROM Users u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Users.findByLasName", query = "SELECT u FROM Users u WHERE u.lasName = :lasName"),
    @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.usersPK.email = :email"),
    @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password"),
    @NamedQuery(name = "Users.findByDtype", query = "SELECT u FROM Users u WHERE u.dtype = :dtype")})
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersPK usersPK;
    @Size(max = 255)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 255)
    @Column(name = "LAS_NAME")
    private String lasName;
    @Size(max = 255)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 50)
    @Column(name = "DTYPE")
    private String dtype;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "email")
    private Collection<PersonGroups> personGroupsCollection;

    public Users() {
    }

    public Users(UsersPK usersPK) {
        this.usersPK = usersPK;
    }

    public Users(int id, String email) {
        this.usersPK = new UsersPK(id, email);
    }

    public UsersPK getUsersPK() {
        return usersPK;
    }

    public void setUsersPK(UsersPK usersPK) {
        this.usersPK = usersPK;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    @XmlTransient
    public Collection<PersonGroups> getPersonGroupsCollection() {
        return personGroupsCollection;
    }

    public void setPersonGroupsCollection(Collection<PersonGroups> personGroupsCollection) {
        this.personGroupsCollection = personGroupsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersPK != null ? usersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.usersPK == null && other.usersPK != null) || (this.usersPK != null && !this.usersPK.equals(other.usersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.wordify.Users[ usersPK=" + usersPK + " ]";
    }
    
}
