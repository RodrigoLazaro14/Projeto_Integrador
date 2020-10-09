package com.groupg4.global.controller;
import java.util.List;
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
import com.groupg4.global.model.HospitalModel;
import com.groupg4.global.repository.HospitalRepository;

@RestController
@RequestMapping("/hospitais")
@CrossOrigin("*")
public class HospitalController {
	
	@Autowired
	private HospitalRepository repository;
	@GetMapping
	public ResponseEntity<List<HospitalModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<HospitalModel> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/hospitais/{nome}")
	public ResponseEntity<List<HospitalModel>> getByName(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findAllBynomeHospitalContainingIgnoreCase(nome));
	}
	@PostMapping
	public ResponseEntity<HospitalModel> post(@RequestBody HospitalModel nome) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(nome));
	}
	@PutMapping
	public ResponseEntity<HospitalModel> put(@RequestBody HospitalModel nome) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(nome));
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}