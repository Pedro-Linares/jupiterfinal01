package br.com.jpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpg.model.Admin;

public interface IAdmin extends JpaRepository<Admin, Integer>{
    
}
