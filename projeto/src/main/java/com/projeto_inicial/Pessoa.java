package com.projeto_inicial;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Teste com Junit!
 *
 */

public class Pessoa {
    
    private LocalDateTime dataNascimento;
    private String nome;
    
    public Pessoa (String nome, LocalDateTime nascimento){
        this.nome = nome;
        this.dataNascimento = nascimento;
        
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now());
    }

}
