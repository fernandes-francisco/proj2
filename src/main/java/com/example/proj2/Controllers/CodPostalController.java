package com.example.proj2.Controllers;

import com.example.proj2.Servicos.CodPostalService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/codPostal")
public class CodPostalController {

    @Autowired
    private CodPostalService codPostalService;

    @PostMapping
    public String save(@Valid @RequestBody CodPostalVO vO) {
        return codPostalService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") String id) {
        codPostalService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") String id,
                       @Valid @RequestBody CodPostalUpdateVO vO) {
        codPostalService.update(id, vO);
    }

    @GetMapping("/{id}")
    public CodPostalDTO getById(@Valid @NotNull @PathVariable("id") String id) {
        return codPostalService.getById(id);
    }

    @GetMapping
    public Page<CodPostalDTO> query(@Valid CodPostalQueryVO vO) {
        return codPostalService.query(vO);
    }
}
