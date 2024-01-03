package com.poc.sistema.banco.service;

import ch.qos.logback.core.net.server.Client;
import com.poc.sistema.banco.model.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;

@SpringBootTest
class ClienteServiceTest {
    @MockBean
    private ClienteService clienteService;
    @BeforeEach
    void setUp() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("fulano");
        cliente.setCpf("123456");
        cliente.setTelefone("123456789");

        Mockito.when(clienteService.getById(anyLong())).thenReturn(cliente);

    }
    @Test
    void whenFound_then_ReturnCliente(){
        Long id = 1L;
        Cliente foundClient = clienteService.getById(id);
        Assertions.assertEquals(id,foundClient.getId());
    }

}