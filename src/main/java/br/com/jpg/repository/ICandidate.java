package br.com.jpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jpg.model.Candidate;

public interface ICandidate extends JpaRepository<Candidate, Integer> {
    
}