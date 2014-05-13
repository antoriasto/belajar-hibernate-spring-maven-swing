/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inc.cygnus.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author TA planning
 */
public class BaseDaoHibernate<T> {

    @SuppressWarnings("rawtypes")
    protected Class domainClass;

    @Autowired
    protected SessionFactory sessionFactory;

    public BaseDaoHibernate() {
        this.domainClass = (Class<?>) ((ParameterizedType) getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public T saveBase(T domain) {
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
        return domain;
    }

    @SuppressWarnings("unchecked")
    public T getByIdBase(Long id) {
        return (T) sessionFactory.getCurrentSession().get(domainClass, id);
    }

    public T deleteBase(T domain) {
        sessionFactory.getCurrentSession().delete(domain);
        return domain;
    }

    public Long countBase() {
        return (Long) sessionFactory.getCurrentSession().createQuery(
                "select count(*) from " + domainClass.getName() + " x").uniqueResult();
    }

    @SuppressWarnings("unchecked")
    public List<T> getAllBase() {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName())
                .list();
    }

    @SuppressWarnings("unchecked")
    public List<T> getAllBase(int start, int num) {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName())
                .setFirstResult(start).setMaxResults(num)
                .list();
    }
}
