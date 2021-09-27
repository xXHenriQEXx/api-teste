package com.santander.service.impl;


import com.santander.cadastro.model.Endereco;
import com.santander.repository.EnderecoRepository;
import com.santander.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    @Autowired
    EnderecoRepository repository;


    @Override
    public void create(Endereco e) {
         repository.save(e);
    }

    @Override
    public List<Endereco> findAll() {
        return findAll();
    }

//    @Override
//    public Endereco update(Endereco e) {
//        return repository.save(e);
//    }
}
