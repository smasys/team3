/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.smasys.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author student
 */
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger log = LoggerFactory.getLogger(SecurityConfig.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        try {
            auth.jdbcAuthentication().dataSource(dataSource)
                    .usersByUsernameQuery(
                            "select username,password, enabled from users where username=?")
                    .authoritiesByUsernameQuery(
                            "select username, authority from authorities where username=?");
            log.info("Config authentication complete");
        } catch (Exception e) {
            log.error("Unable to config authentication to '" + auth + "': " + e.getMessage());
        }

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        try{
        http
                .authorizeRequests().antMatchers("/createuser", "/create_user").permitAll()
                .anyRequest().authenticated();
        http.formLogin()
                .loginPage("/")
                .usernameParameter("username").passwordParameter("password")
                .defaultSuccessUrl("/success")
                .permitAll();

        http.csrf()
                .csrfTokenRepository(csrfTokenRepository());
           log.info("http security configuration complete");
        } catch (Exception e) {
            log.error("Unable to config http security  '" + http + "': " + e.getMessage());
        }

    }

    private CsrfTokenRepository csrfTokenRepository() {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setSessionAttributeName("_csrf");
        return repository;
    }

    @Override
    public void configure(WebSecurity security) {
        security.ignoring().antMatchers("/css/**", "/fonts/**", "/libs/**");
    }
}
