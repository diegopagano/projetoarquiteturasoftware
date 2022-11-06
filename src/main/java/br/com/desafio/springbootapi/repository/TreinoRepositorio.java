package br.com.desafio.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.springbootapi.entity.Treino;

@Repository
public interface TreinoRepositorio extends JpaRepository<Treino, Integer> { }
