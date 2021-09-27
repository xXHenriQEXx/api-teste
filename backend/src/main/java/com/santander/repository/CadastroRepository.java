package com.santander.repository;

import com.santander.cadastro.model.Cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long > {

    @Query("SELECT c FROM Cadastro c WHERE c.nome = ?1")
    List<Cadastro> findByNome(String nome);
}
