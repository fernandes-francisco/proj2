package com.example.proj2.Services;

import com.example.proj2.Repo.CodPostalRepository;
import com.example.proj2.Tables.CodPostal;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CodPostalService {

    @Autowired
    private CodPostalRepository codPostalRepository;

    public String save(CodPostalVO vO) {
        CodPostal bean = new CodPostal();
        BeanUtils.copyProperties(vO, bean);
        bean = codPostalRepository.save(bean);
        return bean.getCodPostal();
    }

    public void delete(String id) {
        codPostalRepository.deleteById(id);
    }

    public void update(String id, CodPostalUpdateVO vO) {
        CodPostal bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        codPostalRepository.save(bean);
    }

    public CodPostalDTO getById(String id) {
        CodPostal original = requireOne(id);
        return toDTO(original);
    }

    public Page<CodPostalDTO> query(CodPostalQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private CodPostalDTO toDTO(CodPostal original) {
        CodPostalDTO bean = new CodPostalDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private CodPostal requireOne(String id) {
        return codPostalRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
