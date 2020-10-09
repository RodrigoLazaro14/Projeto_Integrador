package com.groupg4.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupg4.global.model.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {

}
