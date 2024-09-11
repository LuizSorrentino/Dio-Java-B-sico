package com.projeto_inicial;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PessoaTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calcularIdade(){
        Pessoa pessoa = new Pessoa("Luiz", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assert.assertEquals(24, pessoa.getIdade());;
    }

    @Test
    public void calcularMaioridade(){
        Pessoa pessoa = new Pessoa("Jose", LocalDateTime.now());
        Assert.assertFalse(pessoa.ehMaiorDeIdade());
    }
}
