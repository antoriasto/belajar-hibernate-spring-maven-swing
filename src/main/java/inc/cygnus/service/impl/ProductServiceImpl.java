/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.service.impl;

import inc.cygnus.dao.ProductDao;
import inc.cygnus.model.Product;
import inc.cygnus.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author TA planning
 */
@Service("productService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;
    
    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Product save(Product product) {
        return productDao.saveBase(product);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public Product delete(Product product) {
        return productDao.deleteBase(product);
    }

    @Override
    @Transactional
    public Product findById(Long id) {
        return productDao.getByIdBase(id);
    }

    @Override
    @Transactional
    public Long countAllData(String search) {
        return productDao.countBase();
    }

    @Override
    @Transactional
    public List<Product> findAllData(String productName, String orderBy, int start, int size) {
        return productDao.findAllData(productName, orderBy, start, size);
    }
    
}
