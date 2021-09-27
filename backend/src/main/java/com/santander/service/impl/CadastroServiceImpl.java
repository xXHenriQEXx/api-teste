package com.santander.service.impl;


import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.santander.cadastro.model.Cadastro;
import com.santander.repository.CadastroRepository;
import com.santander.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired
    CadastroRepository repository;


    @Override
    public Cadastro create(Cadastro a) {
        return repository.save(a);
    }

    @Override
    public List<Cadastro> findAll() {
        return repository.findAll();
    }

    @Override
    public Cadastro update(Cadastro a) {
        return repository.save(a);
    }

    @Override
    public List<Cadastro> findByName(String nome) {
        return repository.findByNome(nome);
    }



}
