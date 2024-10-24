package com.restapi.restapicrudexample.controller;

import com.restapi.restapicrudexample.model.Carro;
import com.restapi.restapicrudexample.repository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository carroRepository;

    @GetMapping("/carro")
    public List getAllCarros() {
        return carroRepository.findAll();
    }

    @GetMapping("/carro{id}")
    public Carro getCarroById(@PathVariable Long id) {
        return (Carro) carroRepository.findById(id).get();
    }

    @PostMapping("/carro")
        public Carro addCarro(@RequestBody Carro carro) {
        carroRepository.save(carro);
        return carro;
    }

    @DeleteMapping("/{id}")
    public void deleteCarro(@PathVariable Long id) {
        carroRepository.deleteById(id);
    }

}
