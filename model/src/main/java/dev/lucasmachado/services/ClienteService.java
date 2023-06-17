package dev.lucasmachado.services;

import dev.lucasmachado.entities.Cliente;
import dev.lucasmachado.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    public Optional<Cliente> findById(Long id) { return clienteRepository.findById(id); }
}
