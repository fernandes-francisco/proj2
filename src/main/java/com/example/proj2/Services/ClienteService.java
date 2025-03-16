package com.example.proj2.Services;

import com.example.proj2.Repo.ClienteRepository;
import com.example.proj2.Tables.Cliente;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public BigDecimal save(ClienteVO vO) {
        Cliente bean = new Cliente();
        BeanUtils.copyProperties(vO, bean);
        bean = clienteRepository.save(bean);
        return bean.getIdCliente();
    }

    public void delete(BigDecimal id) {
        clienteRepository.deleteById(id);
    }

    public void update(BigDecimal id, ClienteUpdateVO vO) {
        Cliente bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        clienteRepository.save(bean);
    }

    public ClienteDTO getById(BigDecimal id) {
        Cliente original = requireOne(id);
        return toDTO(original);
    }

    public Page<ClienteDTO> query(ClienteQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private ClienteDTO toDTO(Cliente original) {
        ClienteDTO bean = new ClienteDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Cliente requireOne(BigDecimal id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
