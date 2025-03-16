package com.example.proj2.Services;

import com.example.proj2.Repo.TipoFuncionarioRepository;
import com.example.proj2.Tables.TipoFuncionario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class TipoFuncionarioService {

    @Autowired
    private TipoFuncionarioRepository tipoFuncionarioRepository;

    public BigDecimal save(TipoFuncionarioVO vO) {
        TipoFuncionario bean = new TipoFuncionario();
        BeanUtils.copyProperties(vO, bean);
        bean = tipoFuncionarioRepository.save(bean);
        return bean.getIdTipo();
    }

    public void delete(BigDecimal id) {
        tipoFuncionarioRepository.deleteById(id);
    }

    public void update(BigDecimal id, TipoFuncionarioUpdateVO vO) {
        TipoFuncionario bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        tipoFuncionarioRepository.save(bean);
    }

    public TipoFuncionarioDTO getById(BigDecimal id) {
        TipoFuncionario original = requireOne(id);
        return toDTO(original);
    }

    public Page<TipoFuncionarioDTO> query(TipoFuncionarioQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private TipoFuncionarioDTO toDTO(TipoFuncionario original) {
        TipoFuncionarioDTO bean = new TipoFuncionarioDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private TipoFuncionario requireOne(BigDecimal id) {
        return tipoFuncionarioRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
