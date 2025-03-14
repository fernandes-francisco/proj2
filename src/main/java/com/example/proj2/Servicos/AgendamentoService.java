package com.example.proj2.Servicos;

import com.example.proj2.Repo.AgendamentoRepository;
import com.example.proj2.Tables.Agendamento;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public BigDecimal save(AgendamentoVO vO) {
        Agendamento bean = new Agendamento();
        BeanUtils.copyProperties(vO, bean);
        bean = agendamentoRepository.save(bean);
        return bean.getIdAgendamento();
    }

    public void delete(BigDecimal id) {
        agendamentoRepository.deleteById(id);
    }

    public void update(BigDecimal id, AgendamentoUpdateVO vO) {
        Agendamento bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        agendamentoRepository.save(bean);
    }

    public AgendamentoDTO getById(BigDecimal id) {
        Agendamento original = requireOne(id);
        return toDTO(original);
    }

    public Page<AgendamentoDTO> query(AgendamentoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private AgendamentoDTO toDTO(Agendamento original) {
        AgendamentoDTO bean = new AgendamentoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Agendamento requireOne(BigDecimal id) {
        return agendamentoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
