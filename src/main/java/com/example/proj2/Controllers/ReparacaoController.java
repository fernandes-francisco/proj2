package com.example.proj2.Controllers;

import com.example.proj2.Servicos.ReparacaoService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/reparacao")
public class ReparacaoController {

    @Autowired
    private ReparacaoService reparacaoService;

    @PostMapping
    public String save(@Valid @RequestBody ReparacaoVO vO) {
        return reparacaoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        reparacaoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody ReparacaoUpdateVO vO) {
        reparacaoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public ReparacaoDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return reparacaoService.getById(id);
    }

    @GetMapping
    public Page<ReparacaoDTO> query(@Valid ReparacaoQueryVO vO) {
        return reparacaoService.query(vO);
    }
}
