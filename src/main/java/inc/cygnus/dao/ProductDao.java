/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inc.cygnus.dao;

import inc.cygnus.model.Product;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TA planning
 */
@Repository
public class ProductDao extends BaseDaoHibernate<Product> {
    
    public List<Product> findAllData(String search, String orderBy, int start, int size) {

        StringBuilder stringBuilderCustomer = new StringBuilder(
                "from Product c where c.name like :search");

        if (!search.equals("%")) {
            search = "%" + search + "%";
        }

        if (orderBy != null) {
            stringBuilderCustomer.append(" order by name ").append(orderBy);
        }

        return (List<Product>) sessionFactory.getCurrentSession()
                .createQuery(stringBuilderCustomer.toString())
                .setString("search", search)
                .setFirstResult(start)
                .setMaxResults(size)
                .list();
    }
}
