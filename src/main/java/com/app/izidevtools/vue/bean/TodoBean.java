/**
 *
 */
package com.app.izidevtools.vue.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.app.izidevtools.metier.bean.TypeTodoDTO;

/**
 * @author Flow
 *
 */
public class TodoBean implements Serializable {

	private static final long serialVersionUID = 5741064475958323862L;

	private final List<TypeTodoDTO> listeTypeTodos = new ArrayList<TypeTodoDTO>();

	/**
	 * @return the listeTypeTodos
	 */
	public List<TypeTodoDTO> getListeTypeTodos() {
		return listeTypeTodos;
	}

}
