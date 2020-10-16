package com.groupg4.global.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.groupg4.global.repository.UsuarioRepository;

import generation.org.blogPessoal.model.Usuario;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired// beans é o
	private UsuarioRepository userRepository;
	
	
	@Override //sobrescrevendo 
	public UserDetails loadUserByloginUsuario(String loginUsuario) throws loginUsuarioNotFoundExcepetion {
		Optional<Usuario> user = userRepository.findByUsuario(loginUsuario);
		user.orElseThrow(() -> new loginUsuarioNotFoundExcepetion(loginUsuario+ "Não encontrado!"));
		return user.map(UserDetailsImpl::new).get();
	}
	

}