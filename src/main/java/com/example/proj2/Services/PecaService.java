package com.example.proj2.Services;

import com.example.proj2.Repo.PecaRepository;
import com.example.proj2.Tables.Peca;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    public BigDecimal save(PecaVO vO) {
        Peca bean = new Peca();
        BeanUtils.copyProperties(vO, bean);
        bean = pecaRepository.save(bean);
        return bean.getIdPeca();
    }

    public void delete(BigDecimal id) {
        pecaRepository.deleteById(id);
    }

    public void update(BigDecimal id, PecaUpdateVO vO) {
        Peca bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        pecaRepository.save(bean);
    }

    public PecaDTO getById(BigDecimal id) {
        Peca original = requireOne(id);
        return toDTO(original);
    }

    public Page<PecaDTO> query(PecaQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private PecaDTO toDTO(Peca original) {
        PecaDTO bean = new PecaDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Peca requireOne(BigDecimal id) {
        return pecaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
