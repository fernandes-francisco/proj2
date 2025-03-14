package com.example.proj2.Controllers;

import com.example.proj2.Servicos.LinhaEncFornecedorService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/linhaEncFornecedor")
public class LinhaEncFornecedorController {

    @Autowired
    private LinhaEncFornecedorService linhaEncFornecedorService;

    @PostMapping
    public String save(@Valid @RequestBody LinhaEncFornecedorVO vO) {
        return linhaEncFornecedorService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        linhaEncFornecedorService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody LinhaEncFornecedorUpdateVO vO) {
        linhaEncFornecedorService.update(id, vO);
    }

    @GetMapping("/{id}")
    public LinhaEncFornecedorDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return linhaEncFornecedorService.getById(id);
    }

    @GetMapping
    public Page<LinhaEncFornecedorDTO> query(@Valid LinhaEncFornecedorQueryVO vO) {
        return linhaEncFornecedorService.query(vO);
    }
}
