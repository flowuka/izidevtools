package com.app.izidevtools.vue.ctrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.izidevtools.metier.bean.UtilisateurDTO;
import com.app.izidevtools.metier.service.UtilisateurService;
import com.app.izidevtools.util.apptools.CryptageUtils;
import com.app.izidevtools.vue.bean.LoginBean;
import com.app.izidevtools.vue.ctrl.comp.UserDataSession;

/**
 * Controler de la page de login.
 *
 * @author Flow
 */
@Controller
@RequestMapping("/login")
public class LoginCtrl {

	// @ALL
	public static final String PAGE_NAME = "login";

	// @HERE
	private static final String LOGIN_BEAN = "loginBean";

	@Autowired
	private UserDataSession session;

	@Autowired
	private UtilisateurService utilisateurService;

	/**
	 * Méthode d'initialisation de la page.
	 *
	 * @return la vue
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initLogin(final ModelMap modelMap) {
		final ModelAndView model = new ModelAndView(PAGE_NAME);
		model.addObject(LOGIN_BEAN, new LoginBean());
		return model;
	}

	/**
	 * Méthode de validation du login/mdp.
	 *
	 * @param model
	 *            à alimenter
	 * @return la vue
	 */
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validationLogin(@Valid @ModelAttribute(LOGIN_BEAN) final LoginBean login,
			final BindingResult bindingResult, final ModelMap modelMap) {

		if (bindingResult.hasErrors()) {
			return PAGE_NAME;
		} else {

			final UtilisateurDTO userDTO = utilisateurService.getUtilisateurByLoginEtMotDePasse(login.getLogin(),
					CryptageUtils.crypterMotDePasse(login.getMotDePasse()));

			if (userDTO == null) {
				bindingResult.rejectValue(null, "page.login.error.couple.non.trouve");
				return PAGE_NAME;
			} else {
				session.setUtilisateurConnecte(userDTO);
			}
		}

		return "redirect:/" + AccueilCtrl.PAGE_NAME;
	}

}
