package com.santander.service;

import com.santander.cadastro.model.Cadastro;
import com.santander.cadastro.model.Endereco;

import java.util.List;

public interface EnderecoService {

    /**
     * @param e Cria o cadastro de um novo colaborador
     * @return O novo colaborador cadastrado com todas suas informações
     */

    public void create(Endereco e);


    /**
     * Busca todos colaboradores
     *
     * @return todos colaboradores
     */
    public List<Endereco> findAll();


}