package com.groupg4.global.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

import com.groupg4.global.model.CategoriaModel;
import com.groupg4.global.model.HospitalModel;
import com.groupg4.global.repository.CategoriaRepository;
import com.groupg4.global.service.UsuarioService;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	@Autowired 
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> findAllCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{idCategoria}")
	public ResponseEntity<CategoriaModel> findByIdCategoria(@PathVariable long idCategoria){
		return repository.findById(idCategoria).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<CategoriaModel>> findByNomeCategoria(@PathVariable String nome){
		return ResponseEntity.ok(repository.findByNomeCategoriaContainingIgnoreCase(nome));
	}
	
	
	@PostMapping
	public ResponseEntity<List <CategoriaModel>> postCategoria(@RequestBody HospitalModel hospital, HttpServletRequest request){
		String token = request.getHeader("Authorization");
		System.out.println(token);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvarCategoriaHospital(hospital));
	}
	
	@PutMapping("/{idCategoria}")
	public ResponseEntity<CategoriaModel> putCategoria(@PathVariable long idCategoria, @RequestBody CategoriaModel categoria){
		categoria.setIdCategoria(idCategoria);
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{idCategoria}")
	public void deleteCategoria(@PathVariable long idCategoria){
		repository.deleteById(idCategoria);
	}
}
