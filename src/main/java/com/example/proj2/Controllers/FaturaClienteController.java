package com.example.proj2.Controllers;

import com.example.proj2.Servicos.FaturaClienteService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/faturaCliente")
public class FaturaClienteController {

    @Autowired
    private FaturaClienteService faturaClienteService;

    @PostMapping
    public String save(@Valid @RequestBody FaturaClienteVO vO) {
        return faturaClienteService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        faturaClienteService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody FaturaClienteUpdateVO vO) {
        faturaClienteService.update(id, vO);
    }

    @GetMapping("/{id}")
    public FaturaClienteDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return faturaClienteService.getById(id);
    }

    @GetMapping
    public Page<FaturaClienteDTO> query(@Valid FaturaClienteQueryVO vO) {
        return faturaClienteService.query(vO);
    }
}
