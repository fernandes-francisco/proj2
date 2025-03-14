package com.example.proj2.Controllers;

import com.example.proj2.Servicos.LinhaReparacaoService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/linhaReparacao")
public class LinhaReparacaoController {

    @Autowired
    private LinhaReparacaoService linhaReparacaoService;

    @PostMapping
    public String save(@Valid @RequestBody LinhaReparacaoVO vO) {
        return linhaReparacaoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        linhaReparacaoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody LinhaReparacaoUpdateVO vO) {
        linhaReparacaoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public LinhaReparacaoDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return linhaReparacaoService.getById(id);
    }

    @GetMapping
    public Page<LinhaReparacaoDTO> query(@Valid LinhaReparacaoQueryVO vO) {
        return linhaReparacaoService.query(vO);
    }
}
