package com.app.izidevtools.metier.service;

import com.app.izidevtools.metier.bean.UtilisateurDTO;

/**
 * Service pour les utilisateurs de l'application.
 *
 * @author Flow
 */
public interface UtilisateurService {

	/**
	 * Renvoie l'utilisateur s'il existe sinon null.
	 *
	 * @param login
	 *            � tester
	 * @param motDePasse
	 *            a tester
	 * @return utilisateur si trouv� sinon null
	 */
	UtilisateurDTO getUtilisateurByLoginEtMotDePasse(final String login, final String motDePasse);

}
