/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.service.impl;

import inc.cygnus.dao.PurchaseDao;
import inc.cygnus.model.Purchase;
import inc.cygnus.service.PurchaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TA planning
 */
@Service("purchaseService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    PurchaseDao purchaseDao;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Purchase save(Purchase purchase) {
        return purchaseDao.saveBase(purchase);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Purchase delete(Purchase purchase) {
        return purchaseDao.deleteBase(purchase);
    }

    @Override
    @Transactional
    public Purchase findById(Long id) {
        return purchaseDao.getByIdBase(id);
    }

    @Override
    @Transactional
    public Long countAllData(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public List<Purchase> findAllData(String search, String orderBy, int start, int size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
