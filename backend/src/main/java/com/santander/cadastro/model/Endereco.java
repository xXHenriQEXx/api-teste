package com.santander.cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "COLABORADOR_LOGRADOURO", length = 100)
    private String logradouro;

    @Column (name = "COLABORADOR_NUMERO", length = 100)
    private String numero;

    @Column (name = "COLABORADOR_BAIRRO", length = 100)
    private String bairro;

    @Column (name = "COLABORADOR_CEP", length = 100)
    private String cep;

    @Column (name = "COLABORADOR_CIDADE", length = 100)
    private String cidade;

    @Column (name = "COLABORADOR_ESTADO", length = 100)
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
