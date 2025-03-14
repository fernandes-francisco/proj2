package com.example.proj2.Controllers;

import com.example.proj2.Servicos.EncomendaFornecedorService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/encomendaFornecedor")
public class EncomendaFornecedorController {

    @Autowired
    private EncomendaFornecedorService encomendaFornecedorService;

    @PostMapping
    public String save(@Valid @RequestBody EncomendaFornecedorVO vO) {
        return encomendaFornecedorService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        encomendaFornecedorService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody EncomendaFornecedorUpdateVO vO) {
        encomendaFornecedorService.update(id, vO);
    }

    @GetMapping("/{id}")
    public EncomendaFornecedorDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return encomendaFornecedorService.getById(id);
    }

    @GetMapping
    public Page<EncomendaFornecedorDTO> query(@Valid EncomendaFornecedorQueryVO vO) {
        return encomendaFornecedorService.query(vO);
    }
}
