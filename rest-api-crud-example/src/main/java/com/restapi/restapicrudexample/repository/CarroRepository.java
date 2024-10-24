package com.restapi.restapicrudexample.repository;

import com.restapi.restapicrudexample.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

