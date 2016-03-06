/**
 *
 */
package com.app.izidevtools.persist.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.izidevtools.persist.dao.TodoDAO;
import com.app.izidevtools.persist.entity.TodoDO;

/**
 * @author Flow
 *
 */
@Repository
public class TodoDAOImpl extends GenericDAOImpl<TodoDO> implements TodoDAO {

	public TodoDAOImpl() {
		super(TodoDO.class);
	}

}
