/**
 *
 */
package com.app.izidevtools.persist.dao.impl;

import org.springframework.stereotype.Repository;

import com.app.izidevtools.persist.dao.UtilisateurDAO;
import com.app.izidevtools.persist.entity.UtilisateurDO;

/**
 * @author Flow
 * 
 */
@Repository
public class UtilisateurDAOImpl extends GenericDAOImpl<UtilisateurDO> implements UtilisateurDAO {

    public UtilisateurDAOImpl() {
	super(UtilisateurDO.class);
    }

    public UtilisateurDO getUserByLoginEtMotDePasse(final String login, final String motDePasse) {
	return (UtilisateurDO) sessionFactory.getCurrentSession()
		.getNamedQuery(UtilisateurDO.GET_UTILISATEUR_BY_LOGIN_MDP).setParameter("login", login)
		.setParameter("mdp", motDePasse).uniqueResult();
    }

}
