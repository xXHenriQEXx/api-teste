package com.santander.service;

import com.santander.cadastro.model.Cadastro;
import com.santander.cadastro.model.Endereco;

import java.util.List;

public interface CadastroService {

    /**
     * @param a Cria o cadastro de um novo colaborador
     * @return O novo colaborador cadastrado com todas suas informações
     */

    public Cadastro create(Cadastro a);

    /**
     * Busca todos colaboradores
     *
     * @return todos colaboradores
     */
    public List<Cadastro> findAll();


    /**
     * @param a Edita colaborador
     * @return faz a edição do colaborador
     */
    public Cadastro update(Cadastro a);

    /**
     * @param nome Procura colaborador pelo nome
     * @return colaborador
     */

    public List<Cadastro> findByName(String nome);

}

