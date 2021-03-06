package com.app.izidevtools.vue.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author flow
 *
 */
@Controller
@RequestMapping("/accueil")
public class AccueilCtrl extends AbstractLoggedController {

	// @ALL
	public static final String PAGE_NAME = "accueil";

	/**
	 * M�thode d'initialisation de la page.
	 *
	 * @return la vue
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String initAccueil(final ModelMap modelMap, final HttpSession session) {

		if (isUserLogged(session, modelMap, PAGE_NAME)) {
			return PAGE_NAME;
		} else {
			return "redirect:/" + LoginCtrl.PAGE_NAME;
		}

	}

}
