package br.com.jpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpg.model.Manager;

public interface IManager extends JpaRepository<Manager, Integer> {
    
}
