package br.com.jpg.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.jpg.model.Admin;
import br.com.jpg.model.HR;
import br.com.jpg.model.Manager;
import br.com.jpg.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class AdminController {
   
    private AdminService adminservice;

    @GetMapping
    public ResponseEntity<List<Admin>> Lista_Admins(){
        return ResponseEntity.status(200).body(adminservice.listAdmin()); 
    }

    @GetMapping("/admin/hr")
    public ResponseEntity<List<HR>> Lista_HR(){
        return ResponseEntity.status(200).body(adminservice.listHR()); 
    }

    @GetMapping("/admin/manager")
    public ResponseEntity<List<Manager>> Lista_Manager(){
        return ResponseEntity.status(200).body(adminservice.listManager()); 
    }
    
    @PostMapping
    private ResponseEntity<Admin> criaAdmin(@RequestBody Admin admin){
        return ResponseEntity.status(201).body(adminservice.creatAdmin(admin));
    } 

    @PostMapping("/admin/hr")
    private ResponseEntity<HR> criaHr(@RequestBody HR hr){
        return ResponseEntity.status(201).body(adminservice.creatHR(hr));
    }
     
    @PostMapping("/admin/manager")
    private ResponseEntity<Manager> criaManager(@RequestBody Manager manager){
       return ResponseEntity.status(201).body(adminservice.creatManager(manager));
    } 
   
    @PutMapping
    private ResponseEntity<Admin> editaAdmin(@RequestBody Admin admin){   
        return ResponseEntity.status(200).body(adminservice.editAdmin(admin));
    } 

    @PutMapping("/admin/hr")
    private ResponseEntity<HR> editaHr(@RequestBody HR hr){
        return ResponseEntity.status(200).body(adminservice.editHR(hr));
    }
     
    @PutMapping("/admin/manager")
    private ResponseEntity<Manager> editaManager(@RequestBody Manager manager){
        return ResponseEntity.status(200).body(adminservice.editManager(manager));
    }
    
    @DeleteMapping("/{id}")
    private ResponseEntity<?> excluirAdmin(@PathVariable Integer id){
        adminservice.deletAdmin(id);
        return ResponseEntity.status(204).build();
    }
    
    @DeleteMapping("/admin/hr/{id}")
    private ResponseEntity<?> excluirHr(@PathVariable Integer id){
        adminservice.deleteHR(id);
        return ResponseEntity.status(204).build();
    }

    @DeleteMapping("/admin/manager/{id}")
    private ResponseEntity<?> excluirManager(@PathVariable Integer id){
        adminservice.deleteManager(id);
        return ResponseEntity.status(204).build();
    }

}