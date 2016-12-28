package org.jv.spr.bookstrore.loja.conf;

import org.jv.spr.bookstrore.loja.controllers.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver inResolver = new InternalResourceViewResolver();
		
		inResolver.setPrefix("WEB-INF/views/");
		inResolver.setSuffix(".jsp");
		
		return inResolver;
	}
}
