/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author student
 */
@Configuration
public class ApplicationConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        
        registry.addViewController("/posts/login").setViewName("login");
        registry.addViewController("/posts/list").setViewName("posts");
        registry.addViewController("/teststudent").setViewName("student");
        

       // registry.addViewController("/posts/login").setViewName("login"); 
    }
    
}
