package com.example.proj2.Controllers;

import com.example.proj2.Servicos.VeiculoService;
import jakarta.persistence.NotNull;
import jakarta.persistence.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public String save(@Valid @RequestBody VeiculoVO vO) {
        return veiculoService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        veiculoService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") BigDecimal id,
                       @Valid @RequestBody VeiculoUpdateVO vO) {
        veiculoService.update(id, vO);
    }

    @GetMapping("/{id}")
    public VeiculoDTO getById(@Valid @NotNull @PathVariable("id") BigDecimal id) {
        return veiculoService.getById(id);
    }

    @GetMapping
    public Page<VeiculoDTO> query(@Valid VeiculoQueryVO vO) {
        return veiculoService.query(vO);
    }
}
