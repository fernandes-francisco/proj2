package com.example.proj2.Controllers;

import com.example.proj2.Servicos.TipoFuncionarioService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/tipoFuncionario")
public class TipoFuncionarioController {

    @Autowired
    private TipoFuncionarioService tipoFuncionarioService;

    @PostMapping
    public String save(@Valid @RequestBody TipoFuncionarioVO vO) {
        return tipoFuncionarioService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        tipoFuncionarioService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody TipoFuncionarioUpdateVO vO) {
        tipoFuncionarioService.update(id, vO);
    }

    @GetMapping("/{id}")
    public TipoFuncionarioDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return tipoFuncionarioService.getById(id);
    }

    @GetMapping
    public Page<TipoFuncionarioDTO> query(@Valid TipoFuncionarioQueryVO vO) {
        return tipoFuncionarioService.query(vO);
    }
}
