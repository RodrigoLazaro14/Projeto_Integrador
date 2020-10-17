package com.groupg4.global.seguranca;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.groupg4.global.model.FuncionarioModel;


public class UserDetailsFuncionario implements UserDetails {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private List<GrantedAuthority> authorities;

	public UserDetailsFuncionario(FuncionarioModel user) {
		this.userName = user.getLoginFuncionario();
		this.password = user.getSenhaFuncionario();		
	}

	public UserDetailsFuncionario() {}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}