/**
 *
 */
package com.app.izidevtools.vue.bean;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Bean de login de l'utilisateur.
 *
 * @author Flow
 */
public class LoginBean {

	@NotEmpty
	private String login;

	@Size(min = 6)
	private String motDePasse;

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
