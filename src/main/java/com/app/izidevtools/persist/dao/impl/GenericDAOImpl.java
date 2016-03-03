package com.app.izidevtools.persist.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.izidevtools.persist.dao.GenericDAO;

/**
 * @author frus64150
 * 
 */
public class GenericDAOImpl<T> implements GenericDAO<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> type;

    public T persist(final T entity) {
	sessionFactory.getCurrentSession().persist(entity);
	return entity;
    }

    public void delete(final T entity) {
	sessionFactory.getCurrentSession().delete(entity);
    }

    public void merge(final T entity) {
	sessionFactory.getCurrentSession().saveOrUpdate(entity);
    }

    @SuppressWarnings("unchecked")
    public T read(final Long entityId) {
	return (T) sessionFactory.getCurrentSession().get(type, entityId);
    }

    public GenericDAOImpl(final Class<T> type) {
	this.type = type;
    }

}
