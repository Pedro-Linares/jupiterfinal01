package br.com.jpg.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.jpg.model.HR;
import br.com.jpg.service.HRService;

@RestController
@CrossOrigin("*")
@RequestMapping("/hr")
public class HRController extends CandidateController{
   
    private HRService hrservice;
   
    @GetMapping
    public ResponseEntity<List<HR>> Lista_HR(){
        return ResponseEntity.status(200).body(hrservice.listHR());
    }

    @PutMapping
    private ResponseEntity<HR> editaHr(@RequestBody HR hr){
        return ResponseEntity.status(201).body(hrservice.editHR(hr));
    }

}
