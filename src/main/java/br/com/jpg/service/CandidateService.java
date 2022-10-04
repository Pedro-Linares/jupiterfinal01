package br.com.jpg.service;

import br.com.jpg.model.Candidate;
import br.com.jpg.repository.ICandidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import br.com.jpg.service.exception.*;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    @Autowired
    private ICandidate repository;

   public List<Candidate> findALL(){
		return repository.findAll();
	}

    public Candidate findById(Integer id) {
		Optional<Candidate> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ControllerNotFoundException(id));
	}

	public Candidate editCandidate(Candidate candidate){
        Candidate newCandidate = repository.save(candidate);
        return newCandidate;
    }
	
	public Candidate insert(Candidate obj) {
		return repository.save(obj);
	}
	
    public Candidate createCandidate(Candidate candidate){
        Candidate newCandidate = repository.save(candidate);
        return newCandidate;
    }

	public void delete(Integer id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
}	