package com.example.proj2.Controllers;

import com.example.proj2.Servicos.FornecedorService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public String save(@Valid @RequestBody FornecedorVO vO) {
        return fornecedorService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        fornecedorService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody FornecedorUpdateVO vO) {
        fornecedorService.update(id, vO);
    }

    @GetMapping("/{id}")
    public FornecedorDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return fornecedorService.getById(id);
    }

    @GetMapping
    public Page<FornecedorDTO> query(@Valid FornecedorQueryVO vO) {
        return fornecedorService.query(vO);
    }
}
