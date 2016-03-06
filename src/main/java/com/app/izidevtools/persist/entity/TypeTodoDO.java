/**
 *
 */
package com.app.izidevtools.persist.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Flow
 *
 */
@Entity
@Table(name = "todo")
public class TypeTodoDO {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String libelle;

	@Column
	private Date dateCreation;

	@Column
	private Date dateFin;

	@OneToMany(mappedBy = "todo", fetch = FetchType.LAZY)
	private List<TodoDO> todos;

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation
	 *            the dateCreation to set
	 */
	public void setDateCreation(final Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(final Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the todos
	 */
	public List<TodoDO> getTodos() {
		return todos;
	}

	/**
	 * @param todos
	 *            the todos to set
	 */
	public void setTodos(final List<TodoDO> todos) {
		this.todos = todos;
	}

}
