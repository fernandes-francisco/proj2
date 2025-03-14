package com.example.proj2.Controllers;

import com.example.proj2.Servicos.FaturaFornecedorService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/faturaFornecedor")
public class FaturaFornecedorController {

    @Autowired
    private FaturaFornecedorService faturaFornecedorService;

    @PostMapping
    public String save(@Valid @RequestBody FaturaFornecedorVO vO) {
        return faturaFornecedorService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        faturaFornecedorService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody FaturaFornecedorUpdateVO vO) {
        faturaFornecedorService.update(id, vO);
    }

    @GetMapping("/{id}")
    public FaturaFornecedorDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return faturaFornecedorService.getById(id);
    }

    @GetMapping
    public Page<FaturaFornecedorDTO> query(@Valid FaturaFornecedorQueryVO vO) {
        return faturaFornecedorService.query(vO);
    }
}
