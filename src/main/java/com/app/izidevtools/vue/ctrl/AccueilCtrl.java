package com.app.izidevtools.vue.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.izidevtools.vue.ctrl.comp.UserDataSession;

/**
 * @author flow
 * 
 */
@Controller
@RequestMapping("/accueil")
public class AccueilCtrl {

    // @ALL
    public static final String PAGE_NAME = "accueil";

    @Autowired
    private UserDataSession session;

    /**
     * Méthode d'initialisation de la page.
     * 
     * @return la vue
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView initAccueil(final ModelMap modelMap) {
	final ModelAndView model = new ModelAndView(PAGE_NAME);
	return model;
    }

}
