package com.example.proj2.Servicos;

import com.example.proj2.Repo.VeiculoRepository;
import com.example.proj2.Tables.Veiculo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public BigDecimal save(VeiculoVO vO) {
        Veiculo bean = new Veiculo();
        BeanUtils.copyProperties(vO, bean);
        bean = veiculoRepository.save(bean);
        return bean.getIdVeiculo();
    }

    public void delete(BigDecimal id) {
        veiculoRepository.deleteById(id);
    }

    public void update(BigDecimal id, VeiculoUpdateVO vO) {
        Veiculo bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        veiculoRepository.save(bean);
    }

    public VeiculoDTO getById(BigDecimal id) {
        Veiculo original = requireOne(id);
        return toDTO(original);
    }

    public Page<VeiculoDTO> query(VeiculoQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private VeiculoDTO toDTO(Veiculo original) {
        VeiculoDTO bean = new VeiculoDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Veiculo requireOne(BigDecimal id) {
        return veiculoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
