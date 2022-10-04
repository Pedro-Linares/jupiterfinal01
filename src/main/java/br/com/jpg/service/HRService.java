package br.com.jpg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jpg.model.HR;
import br.com.jpg.repository.IHr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import br.com.jpg.service.exception.*;

@Service
public class HRService {

    @Autowired
    private IHr repository;

    public HRService(IHr repository){
        this.repository = repository;
    }

    public List<HR> listHR(){
        List<HR> list = repository.findAll();
        return list;
    }
    
    public HR editHR(HR hr){
        HR editedHr = repository.save(hr);
        return editedHr;
    }

    public void deleteCandidate(Integer id){
     try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
}