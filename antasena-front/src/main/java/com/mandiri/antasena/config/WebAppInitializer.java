package com.mandiri.antasena.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
	   @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] { JpaConfiguration.class, SecurityConfiguration.class };
	   }
	 
	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { MvcConfiguration.class };
	   }
	 
	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }
	}
