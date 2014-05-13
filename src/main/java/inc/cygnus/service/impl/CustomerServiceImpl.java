/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.cygnus.service.impl;

import inc.cygnus.dao.CustomerDao;
import inc.cygnus.model.Customer;
import inc.cygnus.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TA planning
 */
@Service("customerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Customer save(Customer customer) {
        return customerDao.saveBase(customer);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Customer delete(Customer customer) {
        return customerDao.deleteBase(customer);
    }

    @Override
    public Customer findById(Long id) {
        return (Customer) customerDao.getByIdBase(id);
    }

    @Override
    public Long countAllData(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findAllData(String customerName, String orderBy, int start, int size) {
        return customerDao.findAllData(customerName, orderBy, start, size);
    }

}
