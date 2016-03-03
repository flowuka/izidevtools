/**
 *
 */
package com.app.izidevtools.vue.ctrl.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.app.izidevtools.metier.bean.UtilisateurDTO;

/**
 * @author frus64150
 *
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserDataSession {

	private UtilisateurDTO utilisateurConnecte;

	public UtilisateurDTO getUtilisateurConnecte() {
		return utilisateurConnecte;
	}

	public void setUtilisateurConnecte(final UtilisateurDTO utilisateurConnecte) {
		this.utilisateurConnecte = utilisateurConnecte;
	}

}
