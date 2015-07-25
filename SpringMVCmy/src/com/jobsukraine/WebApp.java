package com.jobsukraine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration	// for AppConfig show him that it is a conf class
@EnableWebMvc	// initialization mvc
@ComponentScan (basePackages="com.jobsukraine") // show folder of controller
public class WebApp {
	
	@Bean // 
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
