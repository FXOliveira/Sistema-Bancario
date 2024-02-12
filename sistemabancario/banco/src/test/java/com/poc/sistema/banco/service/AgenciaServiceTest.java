package com.poc.sistema.banco.service;

import com.poc.sistema.banco.model.Agencia;
import com.poc.sistema.banco.model.Endereco;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyLong;

@SpringBootTest
class AgenciaServiceTest {

    @MockBean
    private AgenciaService agenciaService;
    @BeforeEach
    void setUp() {
        Agencia agencia = new Agencia();
        agencia.setId(1L);
        agencia.setNome("Agencia X");
        agencia.setTelefone("12121212");

        Mockito.when(agenciaService.getById(anyLong())).thenReturn(agencia);

    }

    @Test
    void whenFound_then_ReturnAgencia(){
        Long id = 1L;
        Agencia foundAgencia = agenciaService.getById(id);
        Assertions.assertEquals(id,foundAgencia.getId());
    }

}