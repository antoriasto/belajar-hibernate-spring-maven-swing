/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.service;

import inc.cygnus.model.Customer;
import java.util.List;

/**
 *
 * @author TA planning
 */
public interface CustomerService {
    Customer save(Customer customer);
    Customer delete(Customer customer);
    Customer findById(Long id);
    Long countAllData(String search);
    List<Customer> findAllData(String customerName, String orderBy, int start, int size);
}
