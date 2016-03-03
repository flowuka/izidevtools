package com.app.izidevtools.persist.dao;

import com.app.izidevtools.persist.entity.UtilisateurDO;

/**
 * @author Flow
 *
 */
public interface UtilisateurDAO extends GenericDAO<UtilisateurDO>{

	/**
	 * Renvoie l'utilisateur si trouvé sinon null
	 *
	 * @param login
	 *            a tester
	 * @param motDePasse
	 *            a tester
	 * @return l'utilisateur si trouve sinon null
	 */
	UtilisateurDO getUserByLoginEtMotDePasse(final String login, final String motDePasse);

}
