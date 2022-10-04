package br.com.jpg.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.jpg.model.Manager;
import br.com.jpg.service.ManagerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/manager")
public class ManagerController extends VagaController{
    
    private ManagerService managersercive;

    public ManagerController(ManagerService managerservice){
        this.managersercive = managerservice;
    }

    @GetMapping
    public ResponseEntity<List<Manager>> Lista_Manager(){
        return ResponseEntity.status(200).body(managersercive.listManager());
    }
    
    @PutMapping
    private ResponseEntity<Manager> editeManager (@RequestBody Manager manager){
        return ResponseEntity.status(200).body(managersercive.editManager(manager));
    }

}

