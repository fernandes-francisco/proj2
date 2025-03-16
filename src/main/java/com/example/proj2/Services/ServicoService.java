package com.example.proj2.Services;

import com.example.proj2.Repo.ServicoRepository;
import com.example.proj2.Tables.Servico;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public BigDecimal save(ServicoVO vO) {
        Servico bean = new Servico();
        BeanUtils.copyProperties(vO, bean);
        bean = servicoRepository.save(bean);
        return bean.getIdServico();
    }

    public void delete(BigDecimal id) {
        servicoRepository.deleteById(id);
    }

    public void update(BigDecimal id, ServicoUpdateVO vO) {
        Servico bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        servicoRepository.save(bean);
    }

    public ServicoDTO getById(BigDecimal id) {
        Servico original = requireOne(id);
        return toDTO(original);
    }

    public Page<ServicoDTO> query(ServicoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private ServicoDTO toDTO(Servico original) {
        ServicoDTO bean = new ServicoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Servico requireOne(BigDecimal id) {
        return servicoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
