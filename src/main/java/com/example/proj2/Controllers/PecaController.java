package com.example.proj2.Controllers;

import com.example.proj2.Servicos.PecaService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/peca")
public class PecaController {

    @Autowired
    private PecaService pecaService;

    @PostMapping
    public String save(@Valid @RequestBody PecaVO vO) {
        return pecaService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        pecaService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody PecaUpdateVO vO) {
        pecaService.update(id, vO);
    }

    @GetMapping("/{id}")
    public PecaDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return pecaService.getById(id);
    }

    @GetMapping
    public Page<PecaDTO> query(@Valid PecaQueryVO vO) {
        return pecaService.query(vO);
    }
}
