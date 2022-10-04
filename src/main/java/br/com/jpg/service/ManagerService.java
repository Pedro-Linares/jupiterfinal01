package br.com.jpg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jpg.model.Manager;
import br.com.jpg.repository.IManager;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jpg.service.exception.*;

@Service
public class ManagerService {
    
    @Autowired
    private IManager repository;

    public ManagerService(IManager repository){
        this.repository = repository;
    }

    public List<Manager> listManager(){
        List<Manager> list = repository.findAll();
        return list;
    }

    public Manager createManager(Manager manager){
        Manager newManager = repository.save(manager);
        return newManager;
    }
   
    public Manager editManager(Manager manager){
        Manager editedManager = repository.save(manager);
        return editedManager;
    }

    public void deleteManager(Integer id){
      try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
}
