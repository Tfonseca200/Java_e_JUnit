package br.com.teste.pessoa;

import org.junit.jupiter.api.*;

// colocando teste em ordenação
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTeste {

    @Order(4)
    @Test
    void validarFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validarFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validarFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validarFluxoD(){
        Assertions.assertTrue(true);
    }

}
