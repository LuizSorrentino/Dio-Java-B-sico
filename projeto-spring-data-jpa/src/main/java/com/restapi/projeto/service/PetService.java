package com.restapi.projeto.service;

import com.restapi.projeto.model.Pet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface PetService {
    Pet findById(Long id);

    Pet create(Pet pet);

    Pet delete(Long id);
}
