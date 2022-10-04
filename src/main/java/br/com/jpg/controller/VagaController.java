package br.com.jpg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.jpg.model.Vaga;
import br.com.jpg.service.VagaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/vagas")
public class VagaController {

    @Autowired
    private VagaService vagaService;

    @GetMapping
    public ResponseEntity<List<Vaga>>  vagaList(){
        return ResponseEntity.status(200).body(vagaService.listVaga());
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Vaga>> VagaPorId(@PathVariable Integer id){
        return ResponseEntity.status(200).body(vagaService.listVaga(id));
    }

    @PostMapping
    public ResponseEntity<Vaga> criarVaga(@RequestBody Vaga vaga){
        return ResponseEntity.status(201).body(vagaService.createVaga(vaga));
    }

    @PutMapping
    public ResponseEntity<Vaga> editaVaga(@RequestBody Vaga vaga){
        return ResponseEntity.status(200).body(vagaService.editVaga(vaga));
    }

    /*@PutMapping(value ="/{id}")
    public Vaga atualizarVaga(@RequestBody Vaga vaga,@PathVariable Integer id){
        Vaga vagaNova = vagaService.update(id, vaga);
        return ResponseEntity.status(201).body(vagaNova).getBody();
    } */

    @DeleteMapping(value ="/{id}")
    public ResponseEntity<Void> deleteVaga(@PathVariable Integer id){
        vagaService.deleteVaga(id);
        return ResponseEntity.status(204).build();
    }
}
