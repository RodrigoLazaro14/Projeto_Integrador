package com.groupg4.global.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetailsService;

@EnableWebSecurity
public class SecurityConfigFuncionario extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsServiceFuncionario userDetailsServiceFuncionario;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsServiceFuncionario);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/funcionarios/logar").permitAll()// funcionario logar
				.antMatchers("/funcionarios/cadastrar").permitAll()// funcionario se cadastrar (gerar login e senha)
				.antMatchers(HttpMethod.GET, "/hospital").permitAll()
				.antMatchers("/hospital/porId/{id}").permitAll()
				.antMatchers(HttpMethod.GET, "/funcionarios").permitAll()
				.anyRequest().authenticated()
				.and().httpBasic()
				.and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				.and().cors().and()
				.csrf().disable();
	}
}