/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordify;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author golan
 */
@Entity
@Table(name = "person_groups")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonGroups.findAll", query = "SELECT p FROM PersonGroups p"),
    @NamedQuery(name = "PersonGroups.findById", query = "SELECT p FROM PersonGroups p WHERE p.id = :id")})
public class PersonGroups implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Groups groups;
    @JoinColumn(name = "EMAIL", referencedColumnName = "EMAIL")
    @ManyToOne(optional = false)
    private Users email;

    public PersonGroups() {
    }

    public PersonGroups(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Users getEmail() {
        return email;
    }

    public void setEmail(Users email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonGroups)) {
            return false;
        }
        PersonGroups other = (PersonGroups) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.wordify.PersonGroups[ id=" + id + " ]";
    }
    
}
