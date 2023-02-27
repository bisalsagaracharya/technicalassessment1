package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.httpBasic().and().authorizeRequests()
			.antMatchers(HttpMethod.GET, "/books/**").hasRole("USER")
			.antMatchers(HttpMethod.POST, "/book").hasRole("ADMIN")
			.antMatchers(HttpMethod.PUT, "/book/**").hasRole("ADMIN")
			.antMatchers(HttpMethod.PATCH, "/book/**").hasRole("ADMIN")
			.antMatchers(HttpMethod.DELETE, "/book/**").hasRole("ADMIN")
			.and().csrf().disable()
			.formLogin().disable();

		return http.build();
	}
	// inMemoryAuthentication()
	@Bean
	public UserDetailsService userDetailsService(@Autowired BCryptPasswordEncoder encoder) {
		
		UserDetails user = User.withUsername("user").password(encoder.encode("password1")).roles("USER").build();
		UserDetails admin = User.withUsername("admin").password(encoder.encode("password2")).roles("USER", "ADMIN").build();

		return new InMemoryUserDetailsManager(user, admin);
	}

	@Bean
	public  BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
