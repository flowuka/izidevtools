package com.app.izidevtools.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Classe permetant la configuration de certaine propriétés de spring.
 *
 * @author Flow
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app.izidevtools.vue.ctrl")
public class WebSpringMvcConfigUtils extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
