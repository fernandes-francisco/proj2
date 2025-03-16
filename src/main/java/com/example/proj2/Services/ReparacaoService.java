package com.example.proj2.Services;

import com.example.proj2.Repo.ReparacaoRepository;
import com.example.proj2.Tables.Reparacao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ReparacaoService {

    @Autowired
    private ReparacaoRepository reparacaoRepository;

    public BigDecimal save(ReparacaoVO vO) {
        Reparacao bean = new Reparacao();
        BeanUtils.copyProperties(vO, bean);
        bean = reparacaoRepository.save(bean);
        return bean.getIdReparacao();
    }

    public void delete(BigDecimal id) {
        reparacaoRepository.deleteById(id);
    }

    public void update(BigDecimal id, ReparacaoUpdateVO vO) {
        Reparacao bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        reparacaoRepository.save(bean);
    }

    public ReparacaoDTO getById(BigDecimal id) {
        Reparacao original = requireOne(id);
        return toDTO(original);
    }

    public Page<ReparacaoDTO> query(ReparacaoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private ReparacaoDTO toDTO(Reparacao original) {
        ReparacaoDTO bean = new ReparacaoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Reparacao requireOne(BigDecimal id) {
        return reparacaoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
