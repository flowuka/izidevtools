/**
 *
 */
package com.app.izidevtools.vue.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;

import com.app.izidevtools.metier.bean.UtilisateurDTO;

/**
 * @author Flow
 *
 */
public abstract class AbstractLoggedController {

	protected UtilisateurDTO utilisateurConnecte;

	/**
	 * Test s'il existe bien un utilisateur en session.
	 *
	 * @param session
	 *            sur laquelle la recherche est effectué
	 * @return true si ok sinon false
	 */
	protected boolean isUserLogged(final HttpSession session, final ModelMap modelMap, final String pageName) {
		boolean output = false;
		if (session != null && session.getAttribute(LoginCtrl.SESSION_UTILISATEUR_CONNECTE) != null) {
			utilisateurConnecte = (UtilisateurDTO) session.getAttribute(LoginCtrl.SESSION_UTILISATEUR_CONNECTE);
			modelMap.put("utilisateurConnecte", utilisateurConnecte);
			modelMap.put("pageName", pageName);
			output = true;
		}
		return output;
	}

	/**
	 * @return the utilisateurConnecte
	 */
	public UtilisateurDTO getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	/**
	 * @param utilisateurConnecte
	 *            the utilisateurConnecte to set
	 */
	public void setUtilisateurConnecte(final UtilisateurDTO utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

}
