/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author TA planning
 */
public class User {
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    private Long id;

    @OneToOne(mappedBy = "person")
    private Customer customer;

    @Column(name="NAME",unique=true,length=100)
    private String name;

    @Column(name="PASSWORD",length=200)
    private String password;
    
}
