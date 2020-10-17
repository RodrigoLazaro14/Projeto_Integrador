package com.groupg4.global.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupg4.global.model.FuncionarioLogin;
import com.groupg4.global.model.FuncionarioModel;
import com.groupg4.global.repository.FuncionarioRepository;
import com.groupg4.global.service.FuncionarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/funcionarios")
public class FuncionarioController {
	@Autowired
	private FuncionarioRepository repository;

	@Autowired
	private FuncionarioService funcionarioService;
	
	@GetMapping
	public ResponseEntity<List<FuncionarioModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<FuncionarioModel> getById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<FuncionarioModel>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllByNomeFuncionarioContainingIgnoreCase(nome));
	}

	@PostMapping
	public ResponseEntity<FuncionarioModel> post(@RequestBody FuncionarioModel funcionario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(funcionario));
	}

	@PutMapping("/{id}")
	public ResponseEntity<FuncionarioModel> put(@PathVariable long id, @RequestBody FuncionarioModel funcionario) {
		funcionario.setIdFuncionario(id);
		return ResponseEntity.ok(repository.save(funcionario));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}

	@PostMapping("/logar")
	public ResponseEntity<FuncionarioLogin> Autentication(@RequestBody Optional<FuncionarioLogin> user) {
		return funcionarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	@PostMapping("/cadastrar")
	public ResponseEntity<FuncionarioModel> Post(@RequestBody FuncionarioModel emailFuncionario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(funcionarioService.CadastrarFuncionario(emailFuncionario));
	}

}