package com.restapi.projeto.controller;

import com.restapi.projeto.model.Pet;
import com.restapi.projeto.repository.PetRepository;
import com.restapi.projeto.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.NoSuchElementException;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    private PetService petService;
    @Autowired
    private PetRepository petRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Pet> create(@RequestBody Pet pet) {
        var petCreated = petService.create(pet);
        return ResponseEntity.ok(pet);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Pet> findById(@PathVariable Long id) {
        var pet = petService.findById(id);
        if (!petRepository.existsById(id)) {
            throw new NoSuchElementException("Pet not found");
        }
        return ResponseEntity.ok(pet);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        if (!petRepository.existsById(id)) {
            throw new NoSuchElementException("Pet not found");
        }
        petRepository.deleteById(id);
    }
}
