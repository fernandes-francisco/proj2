package com.example.proj2.Servicos;

import com.example.proj2.Repo.FaturaFornecedorRepository;
import com.example.proj2.Tables.FaturaFornecedor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@Service
public class FaturaFornecedorService {

    @Autowired
    private FaturaFornecedorRepository faturaFornecedorRepository;

    public BigDecimal save(FaturaFornecedorVO vO) {
        FaturaFornecedor bean = new FaturaFornecedor();
        BeanUtils.copyProperties(vO, bean);
        bean = faturaFornecedorRepository.save(bean);
        return bean.getIdFaturaFornecedor();
    }

    public void delete(BigDecimal id) {
        faturaFornecedorRepository.deleteById(id);
    }

    public void update(BigDecimal id, FaturaFornecedorUpdateVO vO) {
        FaturaFornecedor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        faturaFornecedorRepository.save(bean);
    }

    public FaturaFornecedorDTO getById(BigDecimal id) {
        FaturaFornecedor original = requireOne(id);
        return toDTO(original);
    }

    public Page<FaturaFornecedorDTO> query(FaturaFornecedorQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private FaturaFornecedorDTO toDTO(FaturaFornecedor original) {
        FaturaFornecedorDTO bean = new FaturaFornecedorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private FaturaFornecedor requireOne(BigDecimal id) {
        return faturaFornecedorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
