package com.example.proj2.Servicos;

import com.example.proj2.Repo.EncomendaFornecedorRepository;
import com.example.proj2.Tables.EncomendaFornecedor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class EncomendaFornecedorService {

    @Autowired
    private EncomendaFornecedorRepository encomendaFornecedorRepository;

    public BigDecimal save(EncomendaFornecedorVO vO) {
        EncomendaFornecedor bean = new EncomendaFornecedor();
        BeanUtils.copyProperties(vO, bean);
        bean = encomendaFornecedorRepository.save(bean);
        return bean.getIdEncFornecedor();
    }

    public void delete(BigDecimal id) {
        encomendaFornecedorRepository.deleteById(id);
    }

    public void update(BigDecimal id, EncomendaFornecedorUpdateVO vO) {
        EncomendaFornecedor bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        encomendaFornecedorRepository.save(bean);
    }

    public EncomendaFornecedorDTO getById(BigDecimal id) {
        EncomendaFornecedor original = requireOne(id);
        return toDTO(original);
    }

    public Page<EncomendaFornecedorDTO> query(EncomendaFornecedorQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private EncomendaFornecedorDTO toDTO(EncomendaFornecedor original) {
        EncomendaFornecedorDTO bean = new EncomendaFornecedorDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private EncomendaFornecedor requireOne(BigDecimal id) {
        return encomendaFornecedorRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
