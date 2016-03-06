/**
 *
 */
package com.app.izidevtools.persist.dao;

import java.util.List;

import com.app.izidevtools.persist.entity.TypeTodoDO;

/**
 * @author Flow
 *
 */
public interface TypeTodoDAO extends GenericDAO<TypeTodoDO> {

	/**
	 * R�cup�re les types actifs de TODO.
	 *
	 * @return liste de TypeTodo
	 */
	List<TypeTodoDO> getAllTypesActifs();

}
