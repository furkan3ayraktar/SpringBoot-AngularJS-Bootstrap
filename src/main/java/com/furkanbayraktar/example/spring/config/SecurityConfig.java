package com.furkanbayraktar.example.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: Furkan Bayraktar
 * Date: 7/11/14
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /*
    // Enable Basic Authentication
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER");
	}
	*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

//		http.httpBasic(); // Enable Basic Authentication
    }
}
