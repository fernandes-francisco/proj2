package com.example.proj2.Services;

import com.example.proj2.Repo.FaturaClienteRepository;
import com.example.proj2.Tables.FaturaCliente;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class FaturaClienteService {

    @Autowired
    private FaturaClienteRepository faturaClienteRepository;

    public BigDecimal save(FaturaClienteVO vO) {
        FaturaCliente bean = new FaturaCliente();
        BeanUtils.copyProperties(vO, bean);
        bean = faturaClienteRepository.save(bean);
        return bean.getNFatura();
    }

    public void delete(BigDecimal id) {
        faturaClienteRepository.deleteById(id);
    }

    public void update(BigDecimal id, FaturaClienteUpdateVO vO) {
        FaturaCliente bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        faturaClienteRepository.save(bean);
    }

    public FaturaClienteDTO getById(BigDecimal id) {
        FaturaCliente original = requireOne(id);
        return toDTO(original);
    }

    public Page<FaturaClienteDTO> query(FaturaClienteQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private FaturaClienteDTO toDTO(FaturaCliente original) {
        FaturaClienteDTO bean = new FaturaClienteDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private FaturaCliente requireOne(BigDecimal id) {
        return faturaClienteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
