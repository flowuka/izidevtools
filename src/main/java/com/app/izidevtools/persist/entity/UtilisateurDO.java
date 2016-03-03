/**
 *
 */
package com.app.izidevtools.persist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Flow
 *
 */
@Entity
@Table(name = "Utilisateur")
@NamedQueries(value = {
		@NamedQuery(name = UtilisateurDO.GET_UTILISATEUR_BY_LOGIN_MDP,
				query = "select user from UtilisateurDO user "
						+ "where user.login = :login "
						+ "and user.motDePasse = :mdp")
})
public class UtilisateurDO {
	
	public static final String GET_UTILISATEUR_BY_LOGIN_MDP = "UtilisateurDO.GET_UTILISATEUR_BY_LOGIN_MDP";

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
