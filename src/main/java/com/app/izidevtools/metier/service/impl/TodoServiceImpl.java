/**
 *
 */
package com.app.izidevtools.metier.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.app.izidevtools.metier.bean.TodoDTO;
import com.app.izidevtools.metier.bean.TypeTodoDTO;
import com.app.izidevtools.metier.service.TodoService;
import com.app.izidevtools.persist.dao.TodoDAO;
import com.app.izidevtools.persist.dao.TypeTodoDAO;
import com.app.izidevtools.persist.entity.TodoDO;
import com.app.izidevtools.persist.entity.TypeTodoDO;
import com.app.izidevtools.vue.bean.TodoBean;

/**
 * @author Flow
 *
 */
@Service
@Transactional
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDAO todoDAO;

	@Autowired
	private TypeTodoDAO typeTodoDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.app.izidevtools.metier.service.TodoService#chargerDonnesPageTodo(java
	 * .lang.Long)
	 */
	public TodoBean chargerDonnesPageTodo(final Long idUtilisateur) {
		final TodoBean todoBean = new TodoBean();

		final List<TypeTodoDO> listeTypeActifs = typeTodoDAO.getAllTypesActifs();
		if (!CollectionUtils.isEmpty(listeTypeActifs)) {
			for (final TypeTodoDO typeDO : listeTypeActifs) {
				final TypeTodoDTO typeDTO = new TypeTodoDTO();
				BeanUtils.copyProperties(typeDO, typeDTO);
				for (final TodoDO todoDO : typeDO.getTodos()) {
					final TodoDTO todoDTO = new TodoDTO();
					BeanUtils.copyProperties(todoDO, todoDTO);
					typeDTO.getListeTodos().add(todoDTO);
				}
				todoBean.getListeTypeTodos().add(typeDTO);
			}
		}

		return todoBean;
	}

}
