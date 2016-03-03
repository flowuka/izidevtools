/**
 *
 */
package com.app.izidevtools.metier.bean;

import java.io.Serializable;

/**
 * Bean de l'entité Utilisateur.
 *
 * @author Flow
 */
public class UtilisateurDTO implements Serializable {

	private static final long serialVersionUID = 6548861565301190291L;

	private Long id;

	private String login;

	private String motDePasse;

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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(final String login) {
		this.login = login;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse
	 *            the motDePasse to set
	 */
	public void setMotDePasse(final String motDePasse) {
		this.motDePasse = motDePasse;
	}

}
