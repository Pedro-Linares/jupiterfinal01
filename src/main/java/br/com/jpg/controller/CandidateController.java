package br.com.jpg.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.jpg.model.Candidate;
import br.com.jpg.service.CandidateService;

@RestController
@CrossOrigin("*")
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    public ResponseEntity<List<Candidate>>  listCandidate(){
        List<Candidate> candidate = candidateService.findALL();
        return ResponseEntity.status(200).body(candidate);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Candidate> LisIdCandidate(@PathVariable Integer id){
    	Candidate obj = candidateService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Candidate> criarCandidate(@RequestBody Candidate candidate){
        Candidate candidateNew = candidateService.insert(candidate);
        return ResponseEntity.status(201).body(candidateNew);
    }

    @PutMapping
    private ResponseEntity<Candidate> editaCandidate(@RequestBody Candidate candidate){
        return ResponseEntity.status(201).body(candidateService.editCandidate(candidate));
    }

    @DeleteMapping(value ="/{id}")
    public ResponseEntity<Void> deleteCandidate(@PathVariable Integer id){
        candidateService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
