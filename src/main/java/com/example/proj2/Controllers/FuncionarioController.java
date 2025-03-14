package com.example.proj2.Controllers;

import com.example.proj2.Servicos.FuncionarioService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public String save(@Valid @RequestBody FuncionarioVO vO) {
        return funcionarioService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        funcionarioService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody FuncionarioUpdateVO vO) {
        funcionarioService.update(id, vO);
    }

    @GetMapping("/{id}")
    public FuncionarioDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return funcionarioService.getById(id);
    }

    @GetMapping
    public Page<FuncionarioDTO> query(@Valid FuncionarioQueryVO vO) {
        return funcionarioService.query(vO);
    }
}
