package com.example.proj2.Servicos;

import com.example.proj2.Repo.FornecedorRepository;
import com.example.proj2.Tables.Fornecedor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public BigDecimal save(FornecedorVO vO) {
        Fornecedor bean = new Fornecedor();
        BeanUtils.copyProperties(vO, bean);
        bean = fornecedorRepository.save(bean);
        return bean.getIdFornecedor();
    }

    public void delete(BigDecimal id) {
        fornecedorRepository.deleteById(id);
    }

    public void update(BigDecimal id, FornecedorUpdateVO vO) {
        Fornecedor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        fornecedorRepository.save(bean);
    }

    public FornecedorDTO getById(BigDecimal id) {
        Fornecedor original = requireOne(id);
        return toDTO(original);
    }

    public Page<FornecedorDTO> query(FornecedorQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private FornecedorDTO toDTO(Fornecedor original) {
        FornecedorDTO bean = new FornecedorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Fornecedor requireOne(BigDecimal id) {
        return fornecedorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
