package com.mandiri.antasena.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/*
	 * @Bean public UserDetailsService UserDetailsService() { return
	 * super.userDetailsService(); }
	 * 
	 */
    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
    	System.out.println("----ini manager-----");
        return authenticationManager();
    }
    
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser(
		 * "user")
		 * .password(passwordEncoder.encode("123456")).roles("USER").and().withUser(
		 * "admin") .password(passwordEncoder.encode("123456")).roles("USER", "ADMIN");
		 */
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
		///auth.authenticationProvider(authenticationProvider());
		
	
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
	    DaoAuthenticationProvider authProvider  = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(userDetailsService);
	    authProvider.setPasswordEncoder(passwordEncoder());
	    return authProvider;
	}
	

	  
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login.html").permitAll().antMatchers("/**").hasAnyRole("ADMIN", "USER")
				.and().formLogin().loginPage("/login.html").defaultSuccessUrl("/").failureUrl("/login.html?error=true")
				.permitAll().and().logout().logoutSuccessUrl("/login.html?logout=true").invalidateHttpSession(true)
				.permitAll().and().csrf().disable();
	}
}
