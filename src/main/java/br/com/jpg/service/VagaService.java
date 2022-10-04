package br.com.jpg.service;

import br.com.jpg.model.Vaga;
import br.com.jpg.repository.IVaga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import br.com.jpg.service.exception.*;

import java.util.List;
import java.util.Optional;

@Service
public class VagaService {

    @Autowired
    private IVaga repository;

    public VagaService(IVaga repository){
        this.repository = repository;
    }

    public List<Vaga> listVaga(){
        List<Vaga> list = repository.findAll();
        return list;
    }

	public Optional<Vaga> listVaga(int id){
		Optional<Vaga> list = repository.findById(id);
		return list;
	}

    public Vaga createVaga(Vaga vaga){
        Vaga newVaga = repository.save(vaga);
        return newVaga;
    }
   
    public Vaga editVaga(Vaga vaga){
        Vaga newVaga= repository.save(vaga);
        return newVaga;
    }

    public void deleteVaga(Integer id){
      try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new  ControllerNotFoundException(id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}	
	}
}
	
	/*public Vaga update(Integer id, Vaga obj) {
		try {
		Vaga entity = dao.getOne(id);
		updateData(entity, obj);
		return dao.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ControllerNotFoundException(id);
		}
	}/*

	/*private void updateData(Vaga entity, Vaga obj) {
		entity.setExp_Year(obj.getExp_Year());
		entity.setCustm_Info(obj.getCustm_Info());
		entity.setDescript(obj.getDescript());
		entity.setDoj(obj.getDoj());
		entity.setLkdin_url(obj.getLkdin_url());
		entity.setMin_Exp_Year(obj.getMin_Exp_Year());
		entity.setOwner(obj.getOwner());
		entity.setPending_Hr(obj.getPending_Hr());
		entity.setRate_Target(obj.getRate_Target());
		entity.setReq(obj.getReq());
		entity.setRGS(obj.getRGS());
		entity.setRole_ID(obj.getRole_ID());
		entity.setTitle(obj.getTitle());
		entity.setWon(obj.getWon());
		entity.setApprvd_Can_Name(obj.getApprvd_Can_Name());		
	}*/
