package com.santander.cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Cadastro")
public class Cadastro {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column (name = "COLABORADOR_NOME", length = 100)
    private String nome;


    @OneToOne
    private Endereco endereco;

    @Column (name = "COLABORADOR_SOBRENOME", length = 100)
    private String sobreNome;

    @Column (name = "COLABORADOR_SEXO", length = 100)
    private String sexo;

    @Column (name = "COLABORADOR_CARGO", length = 100)
    private String cargo;

    @Column (name = "COLABORADOR_DNASCIMENTO", length = 100 )
    private String dNascimento;

  public Cadastro(CadastroDTO dto)
    {

        /*this.id = Long.parseLong(dto.getId());*/
        this.nome = dto.getFirstname();
        this.sobreNome = dto.getLastname();
        this.sexo = dto.getSex();
        this.cargo = dto.getOffice();
        this.dNascimento = dto.getDateofbirth();
        this.endereco = new Endereco();
        this.endereco.setLogradouro(dto.getAddress());
        this.endereco.setNumero(dto.getNumber());
        this.endereco.setBairro(dto.getDistrict());
        this.endereco.setCep(dto.getZip());
        this.endereco.setCidade(dto.getCity());
        this.endereco.setEstado(dto.getState());


    }

}
