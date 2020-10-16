package com.groupg4.global.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.groupg4.global.model.UsuarioModel;
import com.groupg4.global.repository.UsuarioRepository;

@Service
public class UserServiceUsuario {

	@Autowired
	private UsuarioRepository repository;

	public UsuarioModel CadastrarUsuario(UsuarioModel usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenhaUsuario());
		usuario.setSenhaUsuario(senhaEncoder);

		return repository.save(usuario);
	}

	public Optional<UsuarioLogin> Logar(Optional<UsuarioLogin> user) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<UsuarioModel> usuario = repository.findByUsuario(user.get().getLoginUsuario());

		if (usuario.isPresent()) {
			if (encoder.matches(user.get().getSenhaUsuario(), usuario.get().getSenhaUsuario())) {

				String auth = user.get().getLoginUsuario() + ":" + user.get().getSenhaUsuario();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);

				user.get().setToken(authHeader);				
				user.get().setNome(usuario.get().getNomeUsuario());

				return user;

			}
		}
		return null;
	}

}
