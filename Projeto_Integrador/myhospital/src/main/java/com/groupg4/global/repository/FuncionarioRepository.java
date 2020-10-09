package com.groupg4.global.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.groupg4.global.model.FuncionarioModel;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
	
	public List<FuncionarioModel> findAllByNomeFuncionarioContainingIgnoreCase( String nome);
}