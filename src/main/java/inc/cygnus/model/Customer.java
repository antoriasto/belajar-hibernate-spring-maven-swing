/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.cygnus.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author TA planning
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false, length = 35)
    private String name;

    @Column(name = "PASSWORD", length = 10)
    private String password;

    @Column(name = "DATE_CREATED")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreated;

    @Column(name = "DATE_MODIFIED")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateModified;

    @Lob
    @Column(name= "FOTO")
    private byte[] foto;
    
    /*
     * Constructor
     */
    public Customer() {

    }

    public Customer(Long id) {
        super();
        this.id = id;
    }
    
    public Customer(Long id, String name, Date dateCreated, Date dateModified) {
        super();
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public Customer(Long id, String name, String password, Date dateCreated, Date dateModified) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    /*
     * Getter And Setter
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModifed(Date dateModified) {
        this.dateModified = dateModified;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

}
