package com.restapi.projeto.service;

import com.restapi.projeto.model.Pet;
import com.restapi.projeto.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService{
    @Autowired
    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet findById(Long id) {
        return petRepository.findById(id).get();
    }

    public Pet create(Pet pet) {
        petRepository.save(pet);
        return pet;
    }

    public Pet delete(Long id) {
        petRepository.deleteById(id);
        System.out.println("Pet deleted");
        return petRepository.findById(id).get();
    }

}
