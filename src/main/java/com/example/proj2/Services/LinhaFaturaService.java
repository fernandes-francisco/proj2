package com.example.proj2.Services;

import com.example.proj2.Repo.LinhaFaturaRepository;
import com.example.proj2.Tables.LinhaFatura;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LinhaFaturaService {

    @Autowired
    private LinhaFaturaRepository linhaFaturaRepository;

    public BigDecimal save(LinhaFaturaVO vO) {
        LinhaFatura bean = new LinhaFatura();
        BeanUtils.copyProperties(vO, bean);
        bean = linhaFaturaRepository.save(bean);
        return bean.getNFatura();
    }

    public void delete(BigDecimal id) {
        linhaFaturaRepository.deleteById(id);
    }

    public void update(BigDecimal id, LinhaFaturaUpdateVO vO) {
        LinhaFatura bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        linhaFaturaRepository.save(bean);
    }

    public LinhaFaturaDTO getById(BigDecimal id) {
        LinhaFatura original = requireOne(id);
        return toDTO(original);
    }

    public Page<LinhaFaturaDTO> query(LinhaFaturaQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private LinhaFaturaDTO toDTO(LinhaFatura original) {
        LinhaFaturaDTO bean = new LinhaFaturaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private LinhaFatura requireOne(BigDecimal id) {
        return linhaFaturaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
