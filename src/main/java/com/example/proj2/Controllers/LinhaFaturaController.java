package com.example.proj2.Controllers;

import com.example.proj2.Servicos.LinhaFaturaService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/linhaFatura")
public class LinhaFaturaController {

    @Autowired
    private LinhaFaturaService linhaFaturaService;

    @PostMapping
    public String save(@Valid @RequestBody LinhaFaturaVO vO) {
        return linhaFaturaService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        linhaFaturaService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody LinhaFaturaUpdateVO vO) {
        linhaFaturaService.update(id, vO);
    }

    @GetMapping("/{id}")
    public LinhaFaturaDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return linhaFaturaService.getById(id);
    }

    @GetMapping
    public Page<LinhaFaturaDTO> query(@Valid LinhaFaturaQueryVO vO) {
        return linhaFaturaService.query(vO);
    }
}
