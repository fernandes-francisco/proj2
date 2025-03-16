package com.example.proj2.Services;

import com.example.proj2.Repo.LinhaEncFornecedorRepository;
import com.example.proj2.Tables.LinhaEncFornecedor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LinhaEncFornecedorService {

    @Autowired
    private LinhaEncFornecedorRepository linhaEncFornecedorRepository;

    public BigDecimal save(LinhaEncFornecedorVO vO) {
        LinhaEncFornecedor bean = new LinhaEncFornecedor();
        BeanUtils.copyProperties(vO, bean);
        bean = linhaEncFornecedorRepository.save(bean);
        return bean.getIdPeca();
    }

    public void delete(BigDecimal id) {
        linhaEncFornecedorRepository.deleteById(id);
    }

    public void update(BigDecimal id, LinhaEncFornecedorUpdateVO vO) {
        LinhaEncFornecedor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        linhaEncFornecedorRepository.save(bean);
    }

    public LinhaEncFornecedorDTO getById(BigDecimal id) {
        LinhaEncFornecedor original = requireOne(id);
        return toDTO(original);
    }

    public Page<LinhaEncFornecedorDTO> query(LinhaEncFornecedorQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private LinhaEncFornecedorDTO toDTO(LinhaEncFornecedor original) {
        LinhaEncFornecedorDTO bean = new LinhaEncFornecedorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private LinhaEncFornecedor requireOne(BigDecimal id) {
        return linhaEncFornecedorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
