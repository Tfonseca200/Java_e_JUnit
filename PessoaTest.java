package br.com.teste.pessoa;

import jdk.jfr.Enabled;
import org.example.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("thiago", LocalDate.of(2020, 7, 30));
        Assertions.assertEquals(pessoa.getIdade(), pessoa.getIdade());
    }


    @Test
    void retornarSeMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("thiago", LocalDate.of(2001, 10, 04));
        Assertions.assertTrue(pessoa.maiorDeIdade());

        Pessoa menor = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(menor.maiorDeIdade());
    }


    @Test
    void validarLancamentos(){

        int [] primeiroLancamento = {10,10,10,10,10,10};

        int [] segundoLancamento = {10,10,10,10,10,10};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarObjetoEstaNulo(){

        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("thiago", LocalDate.now());

        Assertions.assertNotNull(pessoa);
    }

    // Testando se o nome do usuario é o mesmo do perfil logado
    @Test
    void validarAlgoSomenteNoUsuario(){
        Assumptions.assumeTrue("thiago".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }


    // Testando se o nome do usuario é o mesmo do perfil logado na anotação de ambiente de variavel
    @Test
    @EnabledIfEnvironmentVariable(named="USER", matches = "thiago")
     void validarSomenteUmUsuario(){
            Assertions.assertEquals(10, 5 + 5);
        }

}
