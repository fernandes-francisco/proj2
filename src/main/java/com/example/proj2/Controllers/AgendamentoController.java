package com.example.proj2.Controllers;

import com.example.proj2.Servicos.AgendamentoService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public String save(@Valid @RequestBody AgendamentoVO vO) {
        return agendamentoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        agendamentoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody AgendamentoUpdateVO vO) {
        agendamentoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public AgendamentoDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return agendamentoService.getById(id);
    }

    @GetMapping
    public Page<AgendamentoDTO> query(@Valid AgendamentoQueryVO vO) {
        return agendamentoService.query(vO);
    }
}
