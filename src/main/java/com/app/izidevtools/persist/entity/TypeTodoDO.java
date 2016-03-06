/**
 *
 */
package com.app.izidevtools.persist.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Flow
 *
 */
@Entity
@Table(name = "typetodo")
@NamedQueries(value = { @NamedQuery(name = TypeTodoDO.GET_TYPES_ACTIFS, query = "select type from TypeTodoDO type "
		+ "where dateFin is null ") })
public class TypeTodoDO implements Serializable {

	private static final long serialVersionUID = 7181959884664488209L;

	public static final String GET_TYPES_ACTIFS = "TypeTodoDO.GET_TYPES_ACTIFS";

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String libelle;

	@Column(nullable = false)
	private Date dateCreation;

	@Column
	private Date dateFin;

	@Column
	private String commentaireFermeture;

	@OneToMany(mappedBy = "typeTodo", fetch = FetchType.LAZY)
	private List<TodoDO> todos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCreateur", nullable = false)
	private UtilisateurDO createur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUtilisateurFin")
	private UtilisateurDO utilisateurFin;

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

	/**
	 * @return the commentaireFermeture
	 */
	public String getCommentaireFermeture() {
		return commentaireFermeture;
	}

	/**
	 * @param commentaireFermeture
	 *            the commentaireFermeture to set
	 */
	public void setCommentaireFermeture(final String commentaireFermeture) {
		this.commentaireFermeture = commentaireFermeture;
	}

	/**
	 * @return the createur
	 */
	public UtilisateurDO getCreateur() {
		return createur;
	}

	/**
	 * @param createur
	 *            the createur to set
	 */
	public void setCreateur(final UtilisateurDO createur) {
		this.createur = createur;
	}

	/**
	 * @return the utilisateurFin
	 */
	public UtilisateurDO getUtilisateurFin() {
		return utilisateurFin;
	}

	/**
	 * @param utilisateurFin
	 *            the utilisateurFin to set
	 */
	public void setUtilisateurFin(final UtilisateurDO utilisateurFin) {
		this.utilisateurFin = utilisateurFin;
	}

}
