/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.cygnus.dao;

import inc.cygnus.model.Customer;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TA planning
 */
@Repository("customerDao")
public class CustomerDao extends BaseDaoHibernate<Customer> {

    public List<Customer> findAllData(String search, String orderBy, int start, int size) {

        StringBuilder stringBuilderCustomer = new StringBuilder(
                "from Customer c where c.name like :search");

        if (!search.equals("%")) {
            search = "%" + search + "%";
        }

        if (orderBy != null) {
            stringBuilderCustomer.append(" order by name ").append(orderBy);
        }

        return (List<Customer>) sessionFactory.getCurrentSession()
                .createQuery(stringBuilderCustomer.toString())
                .setString("search", search)
                .setFirstResult(start)
                .setMaxResults(size)
                .list();
    }
}
