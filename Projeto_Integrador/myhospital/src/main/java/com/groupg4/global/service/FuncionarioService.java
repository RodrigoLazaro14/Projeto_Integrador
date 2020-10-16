package com.groupg4.global.service;

import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.groupg4.global.model.FuncionarioModel;
import com.groupg4.global.repository.FuncionarioRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;

	public FuncionarioModel CadastrarFuncionario(FuncionarioModel funcionario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(funcionario.getSenhaFuncionario());
		funcionario.setSenhaFuncionario(senhaEncoder);

		return repository.save(funcionario);
	}

	public Optional<FuncionarioLogin> Logar(Optional<FuncionarioLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<FuncionarioModel> funcionario = repository.findByFuncionario(user.get().getFuncionario());
		if(funcionario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), funcionario.get().getSenha())){
				String auth = user.get().getFuncionario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
			
				user.get().setToken(authHeader);
				user.get().setNome(funcionario.get().getNome());
			
				return user;
			}
		}
		
		return null;
	}
}
