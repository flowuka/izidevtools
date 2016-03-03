/**
 *
 */
package com.app.izidevtools.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author Flow
 *
 */
public class InitAppUtils implements WebApplicationInitializer {

	public void onStartup(final ServletContext servletContext) throws ServletException {

		final AnnotationConfigWebApplicationContext mvcContext = new AnnotationConfigWebApplicationContext();
		mvcContext.register(WebSpringMvcConfigUtils.class);

		final ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet",
				new DispatcherServlet(mvcContext));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");

		final AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfigUtils.class);

		servletContext.addListener(new ContextLoaderListener(rootContext));
		servletContext.setInitParameter("defaultHtmlEscape", "true");

	}

}
