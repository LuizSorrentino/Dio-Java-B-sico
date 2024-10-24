package com.restapi.projeto.repository;

import com.restapi.projeto.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
