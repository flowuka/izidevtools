/**
 *
 */
package com.app.izidevtools.metier.bean;

import java.io.Serializable;
import java.util.Date;

import com.app.izidevtools.persist.entity.UtilisateurDO;

/**
 * @author Flow
 *
 */
public class TodoDTO implements Serializable {

	private static final long serialVersionUID = 6858198095152953336L;

	private Long id;

	private String libelle;

	private String description;

	private Date dateCreation;

	private Date dateFin;

	private String commentaireFermeture;

	private TypeTodoDTO listeTypeTodo;

	private UtilisateurDO createurDTO;

	private UtilisateurDO utilisateurFinDTO;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

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
	 * @return the listeTypeTodo
	 */
	public TypeTodoDTO getListeTypeTodo() {
		return listeTypeTodo;
	}

	/**
	 * @param listeTypeTodo
	 *            the listeTypeTodo to set
	 */
	public void setListeTypeTodo(final TypeTodoDTO listeTypeTodo) {
		this.listeTypeTodo = listeTypeTodo;
	}

	/**
	 * @return the createurDTO
	 */
	public UtilisateurDO getCreateurDTO() {
		return createurDTO;
	}

	/**
	 * @param createurDTO
	 *            the createurDTO to set
	 */
	public void setCreateurDTO(final UtilisateurDO createurDTO) {
		this.createurDTO = createurDTO;
	}

	/**
	 * @return the utilisateurFinDTO
	 */
	public UtilisateurDO getUtilisateurFinDTO() {
		return utilisateurFinDTO;
	}

	/**
	 * @param utilisateurFinDTO
	 *            the utilisateurFinDTO to set
	 */
	public void setUtilisateurFinDTO(final UtilisateurDO utilisateurFinDTO) {
		this.utilisateurFinDTO = utilisateurFinDTO;
	}

}
