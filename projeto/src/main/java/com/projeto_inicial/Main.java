package com.projeto_inicial;

import java.time.LocalDateTime;

public class Main {
    
    public static void main(String[] args) throws Exception{
        Pessoa pessoa = new Pessoa("Luiz", LocalDateTime.of(2000, 1, 1, 15, 1, 1));
        System.out.println(pessoa.ehMaiorDeIdade());
    } 
}
