/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.service;

import inc.cygnus.model.Product;
import inc.cygnus.model.Purchase;
import java.util.List;

/**
 *
 * @author TA planning
 */
public interface PurchaseService {
    Purchase save(Purchase purchase);
    Purchase delete(Purchase purchase);
    Purchase findById(Long id);
    Long countAllData(String search);
    List<Purchase> findAllData(String search, String orderBy, int start, int size);
}
