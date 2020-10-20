package com.groupg4.global.service;

import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.groupg4.global.model.FuncionarioLogin;
import com.groupg4.global.model.FuncionarioModel;
import com.groupg4.global.repository.FuncionarioRepository;

import java.util.Optional;
@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	public FuncionarioModel CadastrarFuncionario(FuncionarioModel funcionario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(funcionario.getSenhaFuncionarioModel());
		funcionario.setSenhaFuncionarioModel(senhaEncoder);

		return repository.save(funcionario);
	}

	public Optional<FuncionarioLogin> Logar(Optional<FuncionarioLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<FuncionarioModel> funcionario = repository.findByLoginFuncionarioModel(user.get().getLoginFuncionarioLogin());
		if(funcionario.isPresent()) {
			if(encoder.matches(user.get().getSenhaFuncionarioLogin(), funcionario.get().getSenhaFuncionarioModel())){
				String auth = user.get().getLoginFuncionarioLogin() + ":" + user.get().getSenhaFuncionarioLogin();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
			
				user.get().setTokenFuncionarioLogin(authHeader);
				user.get().setNomeFuncionarioLogin(funcionario.get().getNomeFuncionarioModel());
			
				return user;
			}
		}
		
		return null;
	}
}
