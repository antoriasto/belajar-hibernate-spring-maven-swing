/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.service;

import inc.cygnus.model.Product;
import java.util.List;

/**
 *
 * @author TA planning
 */
public interface ProductService {
    Product save(Product product);
    Product delete(Product product);
    Product findById(Long id);
    Long countAllData(String search);
    List<Product> findAllData(String customerName, String orderBy, int start, int size);
}
