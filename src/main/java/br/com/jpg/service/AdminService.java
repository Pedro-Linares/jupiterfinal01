package br.com.jpg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jpg.model.Admin;
import br.com.jpg.model.HR;
import br.com.jpg.model.Manager;
import br.com.jpg.repository.IAdmin;
import br.com.jpg.repository.IHr;
import br.com.jpg.repository.IManager;
import br.com.jpg.service.exception.*;

@Service
public class AdminService {
   
    @Autowired
    private IManager repositoryManager;
     @Autowired
    private IAdmin repositoryAdmin;
     @Autowired
    private IHr repositoryHR;

    public List<Admin> listAdmin(){
        List<Admin> list = repositoryAdmin.findAll();
        return list;
    }
   
    public List<Manager> listManager(){
        List<Manager> list = repositoryManager.findAll();
        return list;
    }
    
    public List<HR> listHR(){
        List<HR> list = repositoryHR.findAll();
        return list;
    }
   
    //###########################################################    

    public Admin creatAdmin(Admin admin){
        Admin newAdmin = repositoryAdmin.save(admin);
        return newAdmin;
    }

    public HR creatHR(HR hr){
        HR newHr= repositoryHR.save(hr);
        return newHr;
    }

    public Manager creatManager(Manager manager){
        Manager newManager= repositoryManager.save(manager);
        return newManager;
    }

    //###########################################################    

    public Admin editAdmin(Admin admin){
        Admin editedAdmin = repositoryAdmin.save(admin);
        return editedAdmin;
    }

    public HR editHR(HR hr){
        HR editedHr = repositoryHR.save(hr);
        return editedHr;
   
    }
    
    public Manager editManager(Manager manager){
        Manager editedManager = repositoryManager.save(manager);
        return editedManager;
    }

    //###########################################################    

    public void deletAdmin(Integer id){
     try {
			repositoryAdmin.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
    
    public void deleteHR(Integer id){
       try {
			repositoryHR.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
    
    public void deleteManager(Integer id){
      try {
			repositoryManager.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
}
