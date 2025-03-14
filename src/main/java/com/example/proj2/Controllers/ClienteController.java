package com.example.proj2.Controllers;

import com.example.proj2.Servicos.ClienteService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public String save(@Valid @RequestBody ClienteVO vO) {
        return clienteService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        clienteService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody ClienteUpdateVO vO) {
        clienteService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ClienteDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return clienteService.getById(id);
    }

    @GetMapping
    public Page<ClienteDTO> query(@Valid ClienteQueryVO vO) {
        return clienteService.query(vO);
    }
}
