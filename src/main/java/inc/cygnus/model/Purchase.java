/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.joda.time.DateTime;

/**
 *
 * @author TA planning
 */
@Entity
@Table(name = "purchase")
public class Purchase implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;
    @Column(name="DATE")
    private DateTime date;
    @Column(name="CUSTOMER_ID")
    private Long customerId;
    @Column(name="TOTAL_PURCHASE")
    private BigDecimal totalPurchase;

    public Purchase() {
        
    }

    public Purchase(Long id, DateTime date, Long customerId, BigDecimal totalPurchase) {
        this.id = id;
        this.date = date;
        this.customerId = customerId;
        this.totalPurchase = totalPurchase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(BigDecimal totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

}
