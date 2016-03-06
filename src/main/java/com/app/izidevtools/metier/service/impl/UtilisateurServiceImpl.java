/**
 *
 */
package com.app.izidevtools.metier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.izidevtools.metier.bean.UtilisateurDTO;
import com.app.izidevtools.metier.service.UtilisateurService;
import com.app.izidevtools.persist.dao.UtilisateurDAO;
import com.app.izidevtools.persist.entity.UtilisateurDO;

/**
 * @author Flow
 *
 */
@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurDAO utilisateurDAO;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.app.izidevtools.metier.service.UtilisateurService#
	 * getUtilisateurByLoginEtMotDePasse(java.lang.String, java.lang.String)
	 */
	public UtilisateurDTO getUtilisateurByLoginEtMotDePasse(final String login, final String motDePasse) {
		UtilisateurDTO output = null;
		final UtilisateurDO userRecup = utilisateurDAO.getUserByLoginEtMotDePasse(login, motDePasse);
		if (userRecup != null) {
			output = new UtilisateurDTO();
			output.setId(userRecup.getId());
			output.setLogin(userRecup.getLogin());
		}
		return output;
	}

}
