package com.example.proj2.Servicos;

import com.example.proj2.Repo.FuncionarioRepository;
import com.example.proj2.Tables.Funcionario;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public BigDecimal save(FuncionarioVO vO) {
        Funcionario bean = new Funcionario();
        BeanUtils.copyProperties(vO, bean);
        bean = funcionarioRepository.save(bean);
        return bean.getIdFuncionario();
    }

    public void delete(BigDecimal id) {
        funcionarioRepository.deleteById(id);
    }

    public void update(BigDecimal id, FuncionarioUpdateVO vO) {
        Funcionario bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        funcionarioRepository.save(bean);
    }

    public FuncionarioDTO getById(BigDecimal id) {
        Funcionario original = requireOne(id);
        return toDTO(original);
    }

    public Page<FuncionarioDTO> query(FuncionarioQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private FuncionarioDTO toDTO(Funcionario original) {
        FuncionarioDTO bean = new FuncionarioDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Funcionario requireOne(BigDecimal id) {
        return funcionarioRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
