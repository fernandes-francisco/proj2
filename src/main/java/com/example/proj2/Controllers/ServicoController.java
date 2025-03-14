package com.example.proj2.Controllers;

import com.example.proj2.Servicos.ServicoService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    public String save(@Valid @RequestBody ServicoVO vO) {
        return servicoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        servicoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody ServicoUpdateVO vO) {
        servicoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ServicoDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return servicoService.getById(id);
    }

    @GetMapping
    public Page<ServicoDTO> query(@Valid ServicoQueryVO vO) {
        return servicoService.query(vO);
    }
}
