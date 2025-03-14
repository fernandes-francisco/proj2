package com.example.proj2.Servicos;

import com.example.proj2.Repo.LinhaReparacaoRepository;
import com.example.proj2.Tables.LinhaReparacao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class LinhaReparacaoService {

    @Autowired
    private LinhaReparacaoRepository linhaReparacaoRepository;

    public BigDecimal save(LinhaReparacaoVO vO) {
        LinhaReparacao bean = new LinhaReparacao();
        BeanUtils.copyProperties(vO, bean);
        bean = linhaReparacaoRepository.save(bean);
        return bean.getIdReparacao();
    }

    public void delete(BigDecimal id) {
        linhaReparacaoRepository.deleteById(id);
    }

    public void update(BigDecimal id, LinhaReparacaoUpdateVO vO) {
        LinhaReparacao bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        linhaReparacaoRepository.save(bean);
    }

    public LinhaReparacaoDTO getById(BigDecimal id) {
        LinhaReparacao original = requireOne(id);
        return toDTO(original);
    }

    public Page<LinhaReparacaoDTO> query(LinhaReparacaoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private LinhaReparacaoDTO toDTO(LinhaReparacao original) {
        LinhaReparacaoDTO bean = new LinhaReparacaoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private LinhaReparacao requireOne(BigDecimal id) {
        return linhaReparacaoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
