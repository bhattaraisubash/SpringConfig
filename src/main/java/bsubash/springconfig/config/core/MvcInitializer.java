/**
 * 
 */
package bsubash.springconfig.config.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import bsubash.springconfig.config.MvcConfig;

/**
 SpringConfig
 * @author Subash Bhattarai
 * @since May 18, 2017
 *@version 1.0
 */
public class MvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
	return new Class[]{MvcConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
	return null;
    }

    @Override
    protected String[] getServletMappings() {
	return new String[]{"/"};
    }

}
