package br.com.desafio.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.springbootapi.entity.Aluno;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Integer> { }
