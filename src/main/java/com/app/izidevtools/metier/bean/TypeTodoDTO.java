/**
 *
 */
package com.app.izidevtools.metier.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Flow
 *
 */
public class TypeTodoDTO implements Serializable {

	private static final long serialVersionUID = -6699412270097441101L;

	private Long id;

	private String libelle;

	private Date dateCreation;

	private Date dateFin;

	private String commentaireFermeture;

	private final List<TodoDTO> listeTodos = new ArrayList<TodoDTO>();

	private UtilisateurDTO createurDTO;

	private UtilisateurDTO utilisateurFinDTO;

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
	 * @return the listeTodos
	 */
	public List<TodoDTO> getListeTodos() {
		return listeTodos;
	}

	/**
	 * @return the createurDTO
	 */
	public UtilisateurDTO getCreateurDTO() {
		return createurDTO;
	}

	/**
	 * @param createurDTO
	 *            the createurDTO to set
	 */
	public void setCreateurDTO(final UtilisateurDTO createurDTO) {
		this.createurDTO = createurDTO;
	}

	/**
	 * @return the utilisateurFinDTO
	 */
	public UtilisateurDTO getUtilisateurFinDTO() {
		return utilisateurFinDTO;
	}

	/**
	 * @param utilisateurFinDTO
	 *            the utilisateurFinDTO to set
	 */
	public void setUtilisateurFinDTO(final UtilisateurDTO utilisateurFinDTO) {
		this.utilisateurFinDTO = utilisateurFinDTO;
	}
}
