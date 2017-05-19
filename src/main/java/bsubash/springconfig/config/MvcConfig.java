/**
 * 
 */
package bsubash.springconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 SpringConfig
 * @author Subash Bhattarai
 * @since May 18, 2017
 *@version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("bsubash.springconfig")
public class MvcConfig extends WebMvcConfigurerAdapter{
    
    @Bean(name="viewResolver")
    public InternalResourceViewResolver viewResolverr(){
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setViewClass(JstlView.class);
	resolver.setPrefix("/WEB-INF/JSP/");
	resolver.setSuffix(".jsp");
	return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

}
