/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name="purchase_detail")
public class PurchaseDetail implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="PURCHASE_ID",nullable=false)
    private Purchase purchase;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    
    public PurchaseDetail() {
    }

    public PurchaseDetail(Long id, Purchase purchase) {
        this.id = id;
        this.purchase = purchase;
    }

    public PurchaseDetail(Long id, Purchase purchase, Product product) {
        this.id = id;
        this.purchase = purchase;
        this.product = product;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
