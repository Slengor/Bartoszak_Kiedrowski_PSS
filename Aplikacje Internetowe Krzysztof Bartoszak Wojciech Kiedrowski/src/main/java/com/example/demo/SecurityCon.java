package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@ComponentScan(basePackages = { "com.baeldung.security" })
@EnableWebSecurity
public class SecurityCon extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("zalogowany").authorizeRequests().antMatchers("niezalogowany").permitAll().and().oauth2Login();
	}

	public void ConfigureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		builder.authenticationProvider(authProvider());
	}

	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}

	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public DaoAuthenticationProvider authProvider() {
	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(userDetailsService);
	    authProvider.setPasswordEncoder(encoder());
	    return authProvider;
	}
}
