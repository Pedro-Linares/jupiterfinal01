package br.com.jpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpg.model.Vaga;

public interface IVaga extends JpaRepository<Vaga, Integer> {
}
