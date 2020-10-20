package com.groupg4.global.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import com.groupg4.global.model.FuncionarioModel;
import com.groupg4.global.repository.FuncionarioRepository;

@Service
public class UserDetailsServiceFuncionario implements UserDetailsService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<FuncionarioModel> user = funcionarioRepository.findByLoginFuncionarioModel(userName);
	user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));
	return user.map(UserDetailsFuncionario::new).get();
	}

}
