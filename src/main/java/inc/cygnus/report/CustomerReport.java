/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.report;


import java.awt.Image;
import java.util.Date;

/**
 *
 * @author TA planning
 */
public class CustomerReport {
    
    private Long id;
    private String name;
    private String password;
    private Date dateCreated;
    private Date dateModified;
    
    private Image foto;

    
    /*
     * Constructor
     */
    public CustomerReport() {
        
    }

    public CustomerReport(Long id) {
        super();
        this.id = id;
    }

    public CustomerReport(Long id, String name, Image foto) {
        this.id = id;
        this.name = name;
        this.foto = foto;
    }
    
    
    
    public CustomerReport(Long id, String name, Date dateCreated, Date dateModified) {
        super();
        this.id = id;
        this.name = name;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public CustomerReport(Long id, String name, String password, Date dateCreated, Date dateModified) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public CustomerReport(Long id, String name, String password, Date dateCreated, Date dateModified, Image foto) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.foto = foto;
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

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

}
