package br.com.jpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpg.model.HR;

public interface IHr extends JpaRepository<HR, Integer>{
    
}
