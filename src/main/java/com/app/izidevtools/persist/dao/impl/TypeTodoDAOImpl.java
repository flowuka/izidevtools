/**
 *
 */
package com.app.izidevtools.persist.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.izidevtools.persist.dao.TypeTodoDAO;
import com.app.izidevtools.persist.entity.TypeTodoDO;

/**
 * @author Flow
 *
 */
@Repository
public class TypeTodoDAOImpl extends GenericDAOImpl<TypeTodoDO> implements TypeTodoDAO {

	public TypeTodoDAOImpl() {
		super(TypeTodoDO.class);
	}

	@SuppressWarnings("unchecked")
	public List<TypeTodoDO> getAllTypesActifs() {
		return sessionFactory.getCurrentSession().getNamedQuery(TypeTodoDO.GET_TYPES_ACTIFS).list();
	}

}
