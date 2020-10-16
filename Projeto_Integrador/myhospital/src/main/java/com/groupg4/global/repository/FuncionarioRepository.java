package com.groupg4.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupg4.global.model.FuncionarioModel;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
	
	public List<FuncionarioModel> findAllByNomeFuncionarioContainingIgnoreCase( String nome);

	public Optional<FuncionarioModel> findByLoginFuncionario(String funcionario); 
	
}